// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ReplyMessageApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>消息内容</p>
     */
    @NameInMap("MsgContent")
    public String msgContent;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("MsgType")
    public String msgType;

    /**
     * <strong>example:</strong>
     * <p>cid+lUpHxTIXt7DYqJDcpVxlA==</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E2012312421</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>用户名</p>
     */
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
