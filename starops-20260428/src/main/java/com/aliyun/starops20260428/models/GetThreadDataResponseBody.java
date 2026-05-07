// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetThreadDataResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetThreadDataResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>thread_id01</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static GetThreadDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThreadDataResponseBody self = new GetThreadDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThreadDataResponseBody setData(java.util.List<GetThreadDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetThreadDataResponseBodyData> getData() {
        return this.data;
    }

    public GetThreadDataResponseBody setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public GetThreadDataResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetThreadDataResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetThreadDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThreadDataResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class GetThreadDataResponseBodyDataMessages extends TeaModel {
        @NameInMap("agents")
        public java.util.List<java.util.Map<String, ?>> agents;

        @NameInMap("artifacts")
        public java.util.List<java.util.Map<String, ?>> artifacts;

        /**
         * <strong>example:</strong>
         * <p>3b5287b7176360</p>
         */
        @NameInMap("callId")
        public String callId;

        @NameInMap("contents")
        public java.util.List<java.util.Map<String, ?>> contents;

        /**
         * <strong>example:</strong>
         * <p>context of model exceed</p>
         */
        @NameInMap("detail")
        public String detail;

        @NameInMap("events")
        public java.util.List<java.util.Map<String, ?>> events;

        /**
         * <strong>example:</strong>
         * <p>3b5287b7176360</p>
         */
        @NameInMap("parentCallId")
        public String parentCallId;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("seq")
        public Integer seq;

        /**
         * <strong>example:</strong>
         * <p>1768702985000000000</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        @NameInMap("tools")
        public java.util.List<java.util.Map<String, ?>> tools;

        /**
         * <strong>example:</strong>
         * <p>task_finished</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>v0.1.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetThreadDataResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            GetThreadDataResponseBodyDataMessages self = new GetThreadDataResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public GetThreadDataResponseBodyDataMessages setAgents(java.util.List<java.util.Map<String, ?>> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAgents() {
            return this.agents;
        }

        public GetThreadDataResponseBodyDataMessages setArtifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getArtifacts() {
            return this.artifacts;
        }

        public GetThreadDataResponseBodyDataMessages setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetThreadDataResponseBodyDataMessages setContents(java.util.List<java.util.Map<String, ?>> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getContents() {
            return this.contents;
        }

        public GetThreadDataResponseBodyDataMessages setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetThreadDataResponseBodyDataMessages setEvents(java.util.List<java.util.Map<String, ?>> events) {
            this.events = events;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getEvents() {
            return this.events;
        }

        public GetThreadDataResponseBodyDataMessages setParentCallId(String parentCallId) {
            this.parentCallId = parentCallId;
            return this;
        }
        public String getParentCallId() {
            return this.parentCallId;
        }

        public GetThreadDataResponseBodyDataMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetThreadDataResponseBodyDataMessages setSeq(Integer seq) {
            this.seq = seq;
            return this;
        }
        public Integer getSeq() {
            return this.seq;
        }

        public GetThreadDataResponseBodyDataMessages setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetThreadDataResponseBodyDataMessages setTools(java.util.List<java.util.Map<String, ?>> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTools() {
            return this.tools;
        }

        public GetThreadDataResponseBodyDataMessages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetThreadDataResponseBodyDataMessages setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetThreadDataResponseBodyData extends TeaModel {
        @NameInMap("messages")
        public java.util.List<GetThreadDataResponseBodyDataMessages> messages;

        /**
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>3b5287b717636040171772050d0095</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static GetThreadDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThreadDataResponseBodyData self = new GetThreadDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThreadDataResponseBodyData setMessages(java.util.List<GetThreadDataResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<GetThreadDataResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public GetThreadDataResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetThreadDataResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
