// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptPlanningResponseBody extends TeaModel {
    @NameInMap("end")
    public Boolean end;

    @NameInMap("header")
    public RunScriptPlanningResponseBodyHeader header;

    @NameInMap("payload")
    public RunScriptPlanningResponseBodyPayload payload;

    public static RunScriptPlanningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunScriptPlanningResponseBody self = new RunScriptPlanningResponseBody();
        return TeaModel.build(map, self);
    }

    public RunScriptPlanningResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunScriptPlanningResponseBody setHeader(RunScriptPlanningResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunScriptPlanningResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunScriptPlanningResponseBody setPayload(RunScriptPlanningResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunScriptPlanningResponseBodyPayload getPayload() {
        return this.payload;
    }

    public static class RunScriptPlanningResponseBodyHeader extends TeaModel {
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

        public static RunScriptPlanningResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunScriptPlanningResponseBodyHeader self = new RunScriptPlanningResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunScriptPlanningResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunScriptPlanningResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunScriptPlanningResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunScriptPlanningResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunScriptPlanningResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunScriptPlanningResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunScriptPlanningResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunScriptPlanningResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunScriptPlanningResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是测试输出</p>
         */
        @NameInMap("text")
        public String text;

        public static RunScriptPlanningResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunScriptPlanningResponseBodyPayloadOutput self = new RunScriptPlanningResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunScriptPlanningResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunScriptPlanningResponseBodyPayloadUsage extends TeaModel {
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

        public static RunScriptPlanningResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunScriptPlanningResponseBodyPayloadUsage self = new RunScriptPlanningResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunScriptPlanningResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunScriptPlanningResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunScriptPlanningResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunScriptPlanningResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunScriptPlanningResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunScriptPlanningResponseBodyPayloadUsage usage;

        public static RunScriptPlanningResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunScriptPlanningResponseBodyPayload self = new RunScriptPlanningResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunScriptPlanningResponseBodyPayload setOutput(RunScriptPlanningResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunScriptPlanningResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunScriptPlanningResponseBodyPayload setUsage(RunScriptPlanningResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunScriptPlanningResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
