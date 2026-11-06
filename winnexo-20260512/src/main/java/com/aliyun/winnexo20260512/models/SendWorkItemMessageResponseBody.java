// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendWorkItemMessageResponseBody extends TeaModel {
    /**
     * <p>公共业务状态码；成功为200，失败为后端错误码。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>公共状态说明；成功时为success，失败时描述具体原因。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>本轮助手消息ID；回复在后台异步生成，取得该ID不表示AI已开始或已完成回复。</p>
     * 
     * <strong>example:</strong>
     * <p>23456789-abcd-4ef0-8123-456789abcdef</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>请求追踪ID，可用于定位本次调用及排查失败原因。</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>本次消息发送到的已有话题会话ID，不是新建会话ID。</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89ab-4def-8123-456789abcdef</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>本次提交的用户消息ID。</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-9abc-4def-8123-456789abcdef</p>
     */
    @NameInMap("userMessageId")
    public String userMessageId;

    /**
     * <p>请求传入的工作项ID；仅传conversationId时返回legacy-topic:<conversationId>形式的兼容ID。</p>
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
