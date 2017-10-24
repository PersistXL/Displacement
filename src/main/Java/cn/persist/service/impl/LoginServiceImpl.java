package cn.persist.service.impl;

import cn.persist.bean.UserBean;
import cn.persist.bean.UserInfo;
import cn.persist.dao.LoginDao;
import cn.persist.dao.impl.LoginDaoImpl;
import cn.persist.service.LoginService;

/**
 * Created by ACER on 2017/10/24.
 */
public class LoginServiceImpl implements LoginService{
    LoginDao loginDao = new LoginDaoImpl();
    public boolean Login(UserInfo userInfo) {
        return loginDao.Login(userInfo);
    }
}
