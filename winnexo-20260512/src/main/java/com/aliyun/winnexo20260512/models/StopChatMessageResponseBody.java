// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class StopChatMessageResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>结束原因</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("finishReason")
    public String finishReason;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>助手消息ID，由 sendAsyncChatMessage 返回；不属于当前租户时返回 404</p>
     * 
     * <strong>example:</strong>
     * <p>exampleMessageId</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>已生成的部分内容</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("partialContent")
    public String partialContent;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>会话 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>消息最终状态</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    public static StopChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopChatMessageResponseBody self = new StopChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public StopChatMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopChatMessageResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public StopChatMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopChatMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public StopChatMessageResponseBody setPartialContent(String partialContent) {
        this.partialContent = partialContent;
        return this;
    }
    public String getPartialContent() {
        return this.partialContent;
    }

    public StopChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopChatMessageResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StopChatMessageResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
