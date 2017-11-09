package cn.persist.dao;

import cn.persist.bean.UserInfo;

/**
 * Created by ACER on 2017/10/23.
 */
public interface LoginDao {
    UserInfo Login(UserInfo userInfo);
}
