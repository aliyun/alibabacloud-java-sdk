// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendWorkItemMessageResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. Other values indicate backend error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the assistant message. The reply is generated asynchronously in the background.</p>
     * 
     * <strong>example:</strong>
     * <p>23456789-abcd-4ef0-8123-456789abcdef</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the existing topic session.</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89ab-4def-8123-456789abcdef</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The ID of the user message.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-9abc-4def-8123-456789abcdef</p>
     */
    @NameInMap("userMessageId")
    public String userMessageId;

    /**
     * <p>The work item ID in the request. If only conversationId is specified, a compatible ID in the legacy-topic:<conversationId> format is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>wi_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static SendWorkItemMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendWorkItemMessageResponseBody self = new SendWorkItemMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendWorkItemMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendWorkItemMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendWorkItemMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SendWorkItemMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendWorkItemMessageResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendWorkItemMessageResponseBody setUserMessageId(String userMessageId) {
        this.userMessageId = userMessageId;
        return this;
    }
    public String getUserMessageId() {
        return this.userMessageId;
    }

    public SendWorkItemMessageResponseBody setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
