// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class CreateChatResponseBody extends TeaModel {
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
     * <p>2187322</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Stream error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

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

    public static CreateChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatResponseBody self = new CreateChatResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatResponseBody setAnswer(ChatDetail answer) {
        this.answer = answer;
        return this;
    }
    public ChatDetail getAnswer() {
        return this.answer;
    }

    public CreateChatResponseBody setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreateChatResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateChatResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateChatResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public CreateChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChatResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateChatResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
