// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunStyleWritingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("end")
    public Boolean end;

    /**
     * <strong>example:</strong>
     * <p>{&quot;event&quot;:&quot;task-progress-start-generating&quot;,&quot;sessionId&quot;:&quot;3cd10828-0e42-471c-8f1a-931cde20b035&quot;,&quot;taskId&quot;:&quot;d3be9981-ca2d-4e17-bf31-1c0a628e9f99&quot;,&quot;traceId&quot;:&quot;66bef4a7f5d61ff3c43f3b710574e175&quot;}</p>
     */
    @NameInMap("header")
    public RunStyleWritingResponseBodyHeader header;

    @NameInMap("payload")
    public RunStyleWritingResponseBodyPayload payload;

    public static RunStyleWritingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunStyleWritingResponseBody self = new RunStyleWritingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunStyleWritingResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunStyleWritingResponseBody setHeader(RunStyleWritingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunStyleWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunStyleWritingResponseBody setPayload(RunStyleWritingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunStyleWritingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public static class RunStyleWritingResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Pop sign mismatch, please check log.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-progress-start-generating</p>
         */
        @NameInMap("event")
        public String event;

        @NameInMap("eventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>0EB27AE3-CA53-5FAE-83C6-EE66CA4DF5DF</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>3cd10828-0e42-471c-8f1a-931cde20b035</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2150451a17191950923411783e2927</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunStyleWritingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunStyleWritingResponseBodyHeader self = new RunStyleWritingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunStyleWritingResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunStyleWritingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunStyleWritingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunStyleWritingResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunStyleWritingResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunStyleWritingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunStyleWritingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunStyleWritingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunStyleWritingResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("text")
        public String text;

        public static RunStyleWritingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunStyleWritingResponseBodyPayloadOutput self = new RunStyleWritingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunStyleWritingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunStyleWritingResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunStyleWritingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunStyleWritingResponseBodyPayloadUsage self = new RunStyleWritingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunStyleWritingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunStyleWritingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunStyleWritingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunStyleWritingResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunStyleWritingResponseBodyPayloadOutput output;

        /**
         * <strong>example:</strong>
         * <p>{
         *         &quot;inputTokens&quot;: 1816,
         *         &quot;outputTokens&quot;: 96,
         *         &quot;totalTokens&quot;: 1912
         *     }</p>
         */
        @NameInMap("usage")
        public RunStyleWritingResponseBodyPayloadUsage usage;

        public static RunStyleWritingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunStyleWritingResponseBodyPayload self = new RunStyleWritingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunStyleWritingResponseBodyPayload setOutput(RunStyleWritingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunStyleWritingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunStyleWritingResponseBodyPayload setUsage(RunStyleWritingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunStyleWritingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
