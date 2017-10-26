package cn.persist.service.impl;

import cn.persist.bean.UserInfo;
import cn.persist.dao.UserDao;
import cn.persist.dao.impl.UserDaoImpl;
import cn.persist.service.UserService;

/**
 * Created by ACER on 2017/10/26.
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    public void add(UserInfo userInfo) {
        userDao.add(userInfo);
    }
    public UserInfo refer(UserInfo userInfo){
        userDao.refer(userInfo);
        return userInfo;
    }

}
