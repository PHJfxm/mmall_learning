package com.phjmmall.common;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

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

    public interface ProductListOrderBy{
        Set<String> PRICE_ACS_DESC = Sets.newHashSet("price_desc","price_acs");
    }

    public interface Cart{
        int CHECKED = 1;    //购物车选中状态
        int UN_CHECKED = 0; //购物车未选中状态

        String LIMIT_NUM_FFAIL = "LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCSEE = "LIMIT_NUM_SUCCSEE";
    }

    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1; //管理员
    }

    public enum ProductStatusEnum{
        ON_SALE(1,"在线");
        private String value;
        private int code;
        ProductStatusEnum(int code,String value){
            this.code = code;
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        public int getCode() {
            return code;
        }

    }
}
