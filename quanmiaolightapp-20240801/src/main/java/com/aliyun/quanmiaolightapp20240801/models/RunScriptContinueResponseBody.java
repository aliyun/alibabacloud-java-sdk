// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptContinueResponseBody extends TeaModel {
    @NameInMap("end")
    public Boolean end;

    @NameInMap("header")
    public RunScriptContinueResponseBodyHeader header;

    @NameInMap("payload")
    public RunScriptContinueResponseBodyPayload payload;

    public static RunScriptContinueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunScriptContinueResponseBody self = new RunScriptContinueResponseBody();
        return TeaModel.build(map, self);
    }

    public RunScriptContinueResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunScriptContinueResponseBody setHeader(RunScriptContinueResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunScriptContinueResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunScriptContinueResponseBody setPayload(RunScriptContinueResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunScriptContinueResponseBodyPayload getPayload() {
        return this.payload;
    }

    public static class RunScriptContinueResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Pop sign mismatch, please check.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>result-generated</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>模型生成事件</p>
         */
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

        public static RunScriptContinueResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunScriptContinueResponseBodyHeader self = new RunScriptContinueResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunScriptContinueResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunScriptContinueResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunScriptContinueResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunScriptContinueResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunScriptContinueResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunScriptContinueResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunScriptContinueResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunScriptContinueResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunScriptContinueResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是测试输出</p>
         */
        @NameInMap("text")
        public String text;

        public static RunScriptContinueResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunScriptContinueResponseBodyPayloadOutput self = new RunScriptContinueResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunScriptContinueResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunScriptContinueResponseBodyPayloadUsage extends TeaModel {
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

        public static RunScriptContinueResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunScriptContinueResponseBodyPayloadUsage self = new RunScriptContinueResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunScriptContinueResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunScriptContinueResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunScriptContinueResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunScriptContinueResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunScriptContinueResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunScriptContinueResponseBodyPayloadUsage usage;

        public static RunScriptContinueResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunScriptContinueResponseBodyPayload self = new RunScriptContinueResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunScriptContinueResponseBodyPayload setOutput(RunScriptContinueResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunScriptContinueResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunScriptContinueResponseBodyPayload setUsage(RunScriptContinueResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunScriptContinueResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
