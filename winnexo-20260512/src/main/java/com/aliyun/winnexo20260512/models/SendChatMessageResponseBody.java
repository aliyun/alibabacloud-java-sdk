// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendChatMessageResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    @Deprecated
    public String code;

    /**
     * <p>The streaming response content.</p>
     * 
     * <strong>example:</strong>
     * <p>yes，i\&quot;m ready</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The Server-Sent Events (SSE) event stream payload. If the request is successful, the response is the raw frame of text/event-stream, which must be consumed frame by frame in a streaming manner.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    @Deprecated
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    @Deprecated
    public String requestId;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>think</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The session work mode. Valid values: ask (quick Q&amp;A, which trims tools, skills, and connectors for single-turn direct answers), work (deep work, which is the default value), and direct (direct connection mode at the request level, which does not start the sandbox and prevents context pollution, equivalent to directChat=true). The ask and work modes are at the session level. The mode is fixed when a new session is created. Subsequent chats inherit the session mode by default. If the explicitly passed value is inconsistent with the session mode, a parameter error is returned. To switch the mode, create a new session or fork the session. If ask is passed in the multi-digital employee or task execution scenario, it takes effect as work. If directChat is set to true, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("workMode")
    public String workMode;

    public static SendChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendChatMessageResponseBody self = new SendChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public SendChatMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendChatMessageResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendChatMessageResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    @Deprecated
    public SendChatMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    @Deprecated
    public SendChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendChatMessageResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SendChatMessageResponseBody setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
