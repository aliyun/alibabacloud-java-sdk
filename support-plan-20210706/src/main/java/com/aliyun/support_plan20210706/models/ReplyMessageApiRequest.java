// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ReplyMessageApiRequest extends TeaModel {
    // 消息内容
    @NameInMap("MsgContent")
    public String msgContent;

    // 消息类型
    @NameInMap("MsgType")
    public String msgType;

    // 群Id
    @NameInMap("OpenGroupId")
    public String openGroupId;

    // 任务单Id
    @NameInMap("OrderId")
    public String orderId;

    // 消息发送人Id
    @NameInMap("UserId")
    public String userId;

    // 消息发送人
    @NameInMap("UserName")
    public String userName;

    public static ReplyMessageApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplyMessageApiRequest self = new ReplyMessageApiRequest();
        return TeaModel.build(map, self);
    }

    public ReplyMessageApiRequest setMsgContent(String msgContent) {
        this.msgContent = msgContent;
        return this;
    }
    public String getMsgContent() {
        return this.msgContent;
    }

    public ReplyMessageApiRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

    public ReplyMessageApiRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public ReplyMessageApiRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ReplyMessageApiRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ReplyMessageApiRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
