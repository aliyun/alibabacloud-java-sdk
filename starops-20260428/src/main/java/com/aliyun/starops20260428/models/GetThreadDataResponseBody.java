// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetThreadDataResponseBody extends TeaModel {
    /**
     * <p>The message data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetThreadDataResponseBodyData> data;

    /**
     * <p>The name of the current digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The token to retrieve the next page of results. If this parameter is not returned, there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique ID for this GetThreadData API request.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The unique ID of the thread.</p>
     * 
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
        /**
         * <p>A list of called agents.</p>
         */
        @NameInMap("agents")
        public java.util.List<java.util.Map<String, ?>> agents;

        /**
         * <p>A list of generated artifacts.</p>
         */
        @NameInMap("artifacts")
        public java.util.List<java.util.Map<String, ?>> artifacts;

        /**
         * <p>The current call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3b5287b7176360</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The contents of the message.</p>
         */
        @NameInMap("contents")
        public java.util.List<java.util.Map<String, ?>> contents;

        /**
         * <p>The message details.</p>
         * 
         * <strong>example:</strong>
         * <p>context of model exceed</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>A list of events.</p>
         */
        @NameInMap("events")
        public java.util.List<java.util.Map<String, ?>> events;

        /**
         * <p>The parent call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3b5287b7176360</p>
         */
        @NameInMap("parentCallId")
        public String parentCallId;

        /**
         * <p>The role that initiates the message.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The sequence number of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("seq")
        public Integer seq;

        /**
         * <p>The message creation time in nanoseconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1768702985000000000</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        /**
         * <p>A list of tools used to generate the message.</p>
         */
        @NameInMap("tools")
        public java.util.List<java.util.Map<String, ?>> tools;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>task_finished</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The message data version.</p>
         * 
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
        /**
         * <p>A list of messages in the thread.</p>
         */
        @NameInMap("messages")
        public java.util.List<GetThreadDataResponseBodyDataMessages> messages;

        /**
         * <p>The ID of the original request that generated this message.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The unique ID that identifies the entire trace of a request.</p>
         * 
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
