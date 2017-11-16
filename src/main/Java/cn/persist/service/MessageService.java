package cn.persist.service;

import cn.persist.bean.MessageInfo;

import java.util.List;

/**
 * Created by ACER on 2017/11/15.
 */
public interface MessageService {
    MessageInfo refers(MessageInfo messageInfo);

    List<MessageInfo> query();
}
