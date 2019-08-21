package com.phjmmall.common;

/**
 * @program: phjmmall
 * @description:
 * @author: Panhuijuan
 * @create: 2019-08-16 16:19
 **/
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1; //管理员
    }
}
