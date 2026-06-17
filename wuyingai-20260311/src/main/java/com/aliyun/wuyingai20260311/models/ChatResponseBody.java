// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The content block list (included only when Status is completed).</p>
     */
    @NameInMap("Content")
    public java.util.List<ChatResponseBodyContent> content;

    /**
     * <p>（已废弃）创建时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>1773380609</p>
     */
    @NameInMap("Created")
    public String created;

    /**
     * <p>The creation timestamp (Unix seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1773380609</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The unique message identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>msg_xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The error details (returned on failure).</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The event object type.</p>
     * 
     * <strong>example:</strong>
     * <p>response</p>
     */
    @NameInMap("Object")
    public String object;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EA12****-<strong><strong>-</strong></strong>-****-****E5C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The role (user / assistant / system / tool).</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The event sequence number (an incrementing integer in string format, used to guarantee ordering). Note: When StreamOptions filters out certain event types, the filtered events still consume sequence numbers. Therefore, the sequence numbers received by the client may not be contiguous.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SequenceNumber")
    public String sequenceNumber;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>176405663****961</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The reply status (created / in_progress / completed).</p>
     * 
     * <strong>example:</strong>
     * <p>in_progress</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The incremental text content (included in Object=content events).
     * <a href="Deprecated">_single.resp.200.props.Created.desc</a> The creation timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;hello&quot;</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>0a1b2c3d4e5f6a7b8c9d0e1f2a3b4c5d</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>The message type (reasoning (model thinking process) / message (formal reply)).</p>
     * 
     * <strong>example:</strong>
     * <p>message / text</p>
     */
    @NameInMap("Type")
    public String type;

    public static ChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatResponseBody self = new ChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChatResponseBody setContent(java.util.List<ChatResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ChatResponseBodyContent> getContent() {
        return this.content;
    }

    public ChatResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public ChatResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ChatResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ChatResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public ChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ChatResponseBody setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public ChatResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ChatResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ChatResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ChatResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ChatResponseBodyContent extends TeaModel {
        /**
         * <p>The structured data (such as tool invocation). Example: {&quot;call_id&quot;:&quot;call_xxx&quot;,&quot;name&quot;:&quot;get_weather&quot;, &quot;output&quot;:&quot;Tool output details in text format&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;call_id&quot;:&quot;call_xxx&quot;,&quot;name&quot;:&quot;get_weather&quot;,&quot;arguments&quot;:&quot;{&quot;city&quot;:&quot;Beijing&quot;}&quot;}</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>The object type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>您好</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The content type (&quot;text&quot; / &quot;data&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        public static ChatResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyContent self = new ChatResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyContent setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public ChatResponseBodyContent setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public ChatResponseBodyContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ChatResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
