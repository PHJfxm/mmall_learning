package com.phjmmall.service;

import com.phjmmall.common.ServerResponse;
import com.phjmmall.pojo.User;

/**
 * @author: Panhuijuan
 * @create: 2019-08-16 14:57
 **/
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetRestPassword(String username, String passwordNew, String forgetToken);

    ServerResponse<String> restPassword(String passwordOld, String passwordNew, User user);

    ServerResponse<User> getInformation(Integer userId);

    ServerResponse<User> updateInfomation(User user);

    ServerResponse checkAdminRole(User user);
}
