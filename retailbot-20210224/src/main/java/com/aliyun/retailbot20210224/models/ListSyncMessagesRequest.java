// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSyncMessagesRequest extends TeaModel {
    // 人人数据DTO
    @NameInMap("MessageDTOList")
    public java.util.List<ListSyncMessagesRequestMessageDTOList> messageDTOList;

    public static ListSyncMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyncMessagesRequest self = new ListSyncMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListSyncMessagesRequest setMessageDTOList(java.util.List<ListSyncMessagesRequestMessageDTOList> messageDTOList) {
        this.messageDTOList = messageDTOList;
        return this;
    }
    public java.util.List<ListSyncMessagesRequestMessageDTOList> getMessageDTOList() {
        return this.messageDTOList;
    }

    public static class ListSyncMessagesRequestMessageDTOList extends TeaModel {
        // 机器人code
        @NameInMap("RobotCode")
        public String robotCode;

        // 买家nick
        @NameInMap("UserNick")
        public String userNick;

        // 买家ID
        @NameInMap("UserId")
        public String userId;

        // 卖家小二nick
        @NameInMap("StaffNick")
        public String staffNick;

        // 卖家小二ID
        @NameInMap("StaffId")
        public String staffId;

        // 卖家nick
        @NameInMap("SellerNick")
        public String sellerNick;

        // 卖家ID
        @NameInMap("SellerId")
        public String sellerId;

        // 消息发送方向
        @NameInMap("Direction")
        public String direction;

        // 消息内容
        @NameInMap("Content")
        public String content;

        // 消息ID
        @NameInMap("MessageId")
        public String messageId;

        // 消息发送时间戳
        @NameInMap("SendTime")
        public Long sendTime;

        // 消息来源
        @NameInMap("Source")
        public String source;

        // 消息类型
        @NameInMap("ContentType")
        public String contentType;

        // 对话sessionId
        @NameInMap("SessionId")
        public String sessionId;

        // 对话chatId
        @NameInMap("ChatId")
        public String chatId;

        public static ListSyncMessagesRequestMessageDTOList build(java.util.Map<String, ?> map) throws Exception {
            ListSyncMessagesRequestMessageDTOList self = new ListSyncMessagesRequestMessageDTOList();
            return TeaModel.build(map, self);
        }

        public ListSyncMessagesRequestMessageDTOList setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public ListSyncMessagesRequestMessageDTOList setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public ListSyncMessagesRequestMessageDTOList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListSyncMessagesRequestMessageDTOList setStaffNick(String staffNick) {
            this.staffNick = staffNick;
            return this;
        }
        public String getStaffNick() {
            return this.staffNick;
        }

        public ListSyncMessagesRequestMessageDTOList setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }
        public String getStaffId() {
            return this.staffId;
        }

        public ListSyncMessagesRequestMessageDTOList setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public ListSyncMessagesRequestMessageDTOList setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public ListSyncMessagesRequestMessageDTOList setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListSyncMessagesRequestMessageDTOList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListSyncMessagesRequestMessageDTOList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListSyncMessagesRequestMessageDTOList setSendTime(Long sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Long getSendTime() {
            return this.sendTime;
        }

        public ListSyncMessagesRequestMessageDTOList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListSyncMessagesRequestMessageDTOList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListSyncMessagesRequestMessageDTOList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSyncMessagesRequestMessageDTOList setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

    }

}
