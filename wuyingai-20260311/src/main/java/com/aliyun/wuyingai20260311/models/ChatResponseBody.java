// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Content")
    public java.util.List<ChatResponseBodyContent> content;

    /**
     * <strong>example:</strong>
     * <p>1773380609</p>
     */
    @NameInMap("Created")
    public String created;

    /**
     * <strong>example:</strong>
     * <p>1773380609</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>msg_xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>response</p>
     */
    @NameInMap("Object")
    public String object;

    /**
     * <strong>example:</strong>
     * <p>EA12****-<strong><strong>-</strong></strong>-****-****E5C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SequenceNumber")
    public String sequenceNumber;

    /**
     * <strong>example:</strong>
     * <p>176405663****961</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>in_progress</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>&quot;hello&quot;</p>
     */
    @NameInMap("Text")
    public String text;

    /**
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

    public ChatResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ChatResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;call_id&quot;:&quot;call_xxx&quot;,&quot;name&quot;:&quot;get_weather&quot;,&quot;arguments&quot;:&quot;{&quot;city&quot;:&quot;Beijing&quot;}&quot;}</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <strong>example:</strong>
         * <p>您好</p>
         */
        @NameInMap("Text")
        public String text;

        /**
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
