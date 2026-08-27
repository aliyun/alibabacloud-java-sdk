// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateChatResponseBody extends TeaModel {
    /**
     * <p>The list of messages in the session.</p>
     */
    @NameInMap("messages")
    public java.util.List<CreateChatResponseBodyMessages> messages;

    /**
     * <p>The ID data of the current message request. The first request ID in the root data.</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-XXXX-XXXX-XXXX-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID data of the current message request. The first trace ID in the root data.</p>
     * 
     * <strong>example:</strong>
     * <p>21504600000008405622576e3b48</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CreateChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatResponseBody self = new CreateChatResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatResponseBody setMessages(java.util.List<CreateChatResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CreateChatResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public CreateChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChatResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateChatResponseBodyMessages extends TeaModel {
        /**
         * <p>The list of invoked agents.</p>
         */
        @NameInMap("agents")
        public java.util.List<java.util.Map<String, ?>> agents;

        /**
         * <p>The artifact output information.</p>
         */
        @NameInMap("artifacts")
        public java.util.List<java.util.Map<String, ?>> artifacts;

        /**
         * <p>The current execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>call_search_001</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The content information.</p>
         */
        @NameInMap("contents")
        public java.util.List<java.util.Map<String, ?>> contents;

        /**
         * <p>The message details.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The list of events.</p>
         */
        @NameInMap("events")
        public java.util.List<java.util.Map<String, ?>> events;

        /**
         * <p>The execution ID of the parent level.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_abc123</p>
         */
        @NameInMap("parentCallId")
        public String parentCallId;

        /**
         * <p>The role that initiated the message.</p>
         * 
         * <strong>example:</strong>
         * <p>tool</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The sequence number of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("seq")
        public Integer seq;

        /**
         * <p>The timestamp in nanoseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765000005</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        /**
         * <p>The list of tools used.</p>
         */
        @NameInMap("tools")
        public java.util.List<java.util.Map<String, ?>> tools;

        /**
         * <p>The specific type of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>done</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.1.0</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateChatResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateChatResponseBodyMessages self = new CreateChatResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public CreateChatResponseBodyMessages setAgents(java.util.List<java.util.Map<String, ?>> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAgents() {
            return this.agents;
        }

        public CreateChatResponseBodyMessages setArtifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getArtifacts() {
            return this.artifacts;
        }

        public CreateChatResponseBodyMessages setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CreateChatResponseBodyMessages setContents(java.util.List<java.util.Map<String, ?>> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getContents() {
            return this.contents;
        }

        public CreateChatResponseBodyMessages setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateChatResponseBodyMessages setEvents(java.util.List<java.util.Map<String, ?>> events) {
            this.events = events;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getEvents() {
            return this.events;
        }

        public CreateChatResponseBodyMessages setParentCallId(String parentCallId) {
            this.parentCallId = parentCallId;
            return this;
        }
        public String getParentCallId() {
            return this.parentCallId;
        }

        public CreateChatResponseBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateChatResponseBodyMessages setSeq(Integer seq) {
            this.seq = seq;
            return this;
        }
        public Integer getSeq() {
            return this.seq;
        }

        public CreateChatResponseBodyMessages setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public CreateChatResponseBodyMessages setTools(java.util.List<java.util.Map<String, ?>> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTools() {
            return this.tools;
        }

        public CreateChatResponseBodyMessages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateChatResponseBodyMessages setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
