package cn.persist.service;

import cn.persist.bean.UserInfo;

/**
 * Created by ACER on 2017/10/24.
 */
public interface LoginService {
    UserInfo Login(UserInfo userInfo);
}
