// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendAsyncChatMessageResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* or InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description. This is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The assistant message ID. Use this ID to call streamChatMessage to subscribe to the generation results.</p>
     * 
     * <strong>example:</strong>
     * <p>3cf84d92-f273-4bb7-ab3c-52646d25ec30</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether a new session was created by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("sessionCreated")
    public Boolean sessionCreated;

    /**
     * <p>The session ID. For continued sessions, this matches the input value. For new sessions, this is a server-generated value.</p>
     * 
     * <strong>example:</strong>
     * <p>bd772dcc-afab-44ad-9fb8-bca716726201</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The user message ID. Use this ID to establish a pairing relationship with the assistant message in this turn.</p>
     * 
     * <strong>example:</strong>
     * <p>60756cc6-8c53-4d1f-8db8-b8c09b81a5cb</p>
     */
    @NameInMap("userMessageId")
    public String userMessageId;

    public static SendAsyncChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncChatMessageResponseBody self = new SendAsyncChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendAsyncChatMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendAsyncChatMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendAsyncChatMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SendAsyncChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendAsyncChatMessageResponseBody setSessionCreated(Boolean sessionCreated) {
        this.sessionCreated = sessionCreated;
        return this;
    }
    public Boolean getSessionCreated() {
        return this.sessionCreated;
    }

    public SendAsyncChatMessageResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendAsyncChatMessageResponseBody setUserMessageId(String userMessageId) {
        this.userMessageId = userMessageId;
        return this;
    }
    public String getUserMessageId() {
        return this.userMessageId;
    }

}
