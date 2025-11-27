// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class Feedback extends TeaModel {
    @NameInMap("ChatId")
    public String chatId;

    @NameInMap("FeedbackAction")
    public String feedbackAction;

    @NameInMap("FeedbackId")
    public String feedbackId;

    @NameInMap("FeedbackMessage")
    public String feedbackMessage;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("UserId")
    public String userId;

    public static Feedback build(java.util.Map<String, ?> map) throws Exception {
        Feedback self = new Feedback();
        return TeaModel.build(map, self);
    }

    public Feedback setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public Feedback setFeedbackAction(String feedbackAction) {
        this.feedbackAction = feedbackAction;
        return this;
    }
    public String getFeedbackAction() {
        return this.feedbackAction;
    }

    public Feedback setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
        return this;
    }
    public String getFeedbackId() {
        return this.feedbackId;
    }

    public Feedback setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
        return this;
    }
    public String getFeedbackMessage() {
        return this.feedbackMessage;
    }

    public Feedback setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Feedback setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Feedback setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Feedback setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public Feedback setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
