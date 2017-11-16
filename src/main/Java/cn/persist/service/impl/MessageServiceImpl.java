package cn.persist.service.impl;

import cn.persist.bean.MessageInfo;
import cn.persist.dao.MessageDao;
import cn.persist.dao.impl.MessageDaoImpl;
import cn.persist.service.MessageService;

import java.util.List;

/**
 * Created by ACER on 2017/11/15.
 */
public class MessageServiceImpl implements MessageService{
    MessageDao messageDao = new MessageDaoImpl();
    public MessageInfo refers(MessageInfo messageInfo) {
        return messageDao.refers(messageInfo);
    }

    public List<MessageInfo> query() {

        return messageDao.query();
    }
}
