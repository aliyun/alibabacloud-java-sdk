// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class GetChatResponseBody extends TeaModel {
    @NameInMap("Answer")
    public ChatDetail answer;

    /**
     * <strong>example:</strong>
     * <p>chat-jkd******</p>
     */
    @NameInMap("ChatId")
    public String chatId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;solutionDetail&quot;:{&quot;formValues&quot;:{&quot;params&quot;:{&quot;InstanceId&quot;:&quot;dsw-g54******qg9&quot;},&quot;content&quot;:{&quot;EcsSpec&quot;:&quot;ecs.gn6i-c8g1.2xlarge&quot;}},&quot;success&quot;:true}}</p>
     */
    @NameInMap("ExtraData")
    public String extraData;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-01T17:52:05+08:00</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>how to ******</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1500******860</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Question")
    public ChatDetail question;

    /**
     * <strong>example:</strong>
     * <p>44553E9A-******-37ADC33FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>se-dss******</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>how to ******</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>2100******360</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatResponseBody self = new GetChatResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatResponseBody setAnswer(ChatDetail answer) {
        this.answer = answer;
        return this;
    }
    public ChatDetail getAnswer() {
        return this.answer;
    }

    public GetChatResponseBody setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public GetChatResponseBody setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public GetChatResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetChatResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetChatResponseBody setQuestion(ChatDetail question) {
        this.question = question;
        return this;
    }
    public ChatDetail getQuestion() {
        return this.question;
    }

    public GetChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChatResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetChatResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetChatResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetChatResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
