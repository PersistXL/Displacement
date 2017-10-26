package cn.persist.dao;

import cn.persist.bean.UserInfo;

/**
 * Created by ACER on 2017/10/26.
 */
public interface UserDao {
    void add(UserInfo userInfo);
    UserInfo refer(UserInfo userInfo);
}
