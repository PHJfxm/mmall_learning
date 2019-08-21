package com.phjmmall.controller.backend;

import com.phjmmall.common.Const;
import com.phjmmall.common.ServerResponse;
import com.phjmmall.pojo.User;
import com.phjmmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * @program: phjmmall
 * @description:
 * @author: Panhuijuan
 * @create: 2019-08-16 23:21
 **/
@Controller
@RequestMapping("/manage/user")
public class UserManageController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session){
        ServerResponse<User> response = iUserService.login(username, password);
        if (response.isSuccess() ) {
            User user = response.getData();
            if(user.getRole() == Const.Role.ROLE_ADMIN){
                //
                session.setAttribute(Const.CURRENT_USER, user);
                return response;
            }else {
                return ServerResponse.createByErrorMessage("不是管理员，无法登录");
            }
        }
        return response;
    }

}
