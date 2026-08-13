// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendAsyncChatMessageResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>助手消息ID；用于随后调用 streamChatMessage 订阅生成结果</p>
     * 
     * <strong>example:</strong>
     * <p>3cf84d92-f273-4bb7-ab3c-52646d25ec30</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>本次调用是否新建了会话</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("sessionCreated")
    public Boolean sessionCreated;

    /**
     * <p>会话ID；续写会话时与入参一致，新建会话时为服务端生成值</p>
     * 
     * <strong>example:</strong>
     * <p>bd772dcc-afab-44ad-9fb8-bca716726201</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

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

}
