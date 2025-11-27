// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class Chat extends TeaModel {
    @NameInMap("Answer")
    public ChatDetail answer;

    @NameInMap("ChatId")
    public String chatId;

    @NameInMap("ExtraData")
    public String extraData;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Message")
    public String message;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Question")
    public ChatDetail question;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserId")
    public String userId;

    public static Chat build(java.util.Map<String, ?> map) throws Exception {
        Chat self = new Chat();
        return TeaModel.build(map, self);
    }

    public Chat setAnswer(ChatDetail answer) {
        this.answer = answer;
        return this;
    }
    public ChatDetail getAnswer() {
        return this.answer;
    }

    public Chat setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public Chat setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public Chat setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Chat setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Chat setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Chat setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Chat setQuestion(ChatDetail question) {
        this.question = question;
        return this;
    }
    public ChatDetail getQuestion() {
        return this.question;
    }

    public Chat setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public Chat setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Chat setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Chat setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
