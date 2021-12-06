// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncMessageRequest extends TeaModel {
    // 对话chatId
    @NameInMap("ChatId")
    public String chatId;

    // 消息内容
    @NameInMap("Content")
    public String content;

    // 消息类型
    @NameInMap("ContentType")
    public String contentType;

    // 消息发送方向
    @NameInMap("Direction")
    public String direction;

    // 消息ID
    @NameInMap("MessageId")
    public String messageId;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 卖家ID
    @NameInMap("SellerId")
    public String sellerId;

    // 卖家nick
    @NameInMap("SellerNick")
    public String sellerNick;

    // 消息发送时间戳
    @NameInMap("SendTime")
    public Long sendTime;

    // 对话sessionId
    @NameInMap("SessionId")
    public String sessionId;

    // 消息来源
    @NameInMap("Source")
    public String source;

    // 卖家小二ID
    @NameInMap("StaffId")
    public String staffId;

    // 卖家小二nick
    @NameInMap("StaffNick")
    public String staffNick;

    // 买家ID
    @NameInMap("UserId")
    public String userId;

    // 买家nick
    @NameInMap("UserNick")
    public String userNick;

    public static SyncMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMessageRequest self = new SyncMessageRequest();
        return TeaModel.build(map, self);
    }

    public SyncMessageRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public SyncMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SyncMessageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SyncMessageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public SyncMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SyncMessageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public SyncMessageRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public SyncMessageRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public SyncMessageRequest setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

    public SyncMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SyncMessageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SyncMessageRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public SyncMessageRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public SyncMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SyncMessageRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
