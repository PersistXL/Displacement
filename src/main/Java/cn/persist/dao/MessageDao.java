package cn.persist.dao;

import cn.persist.bean.MessageInfo;

import java.util.List;

/**
 * Created by ACER on 2017/11/15.
 */
public interface MessageDao {
    MessageInfo refers(MessageInfo messageInfo);

    List<MessageInfo> query();
}
