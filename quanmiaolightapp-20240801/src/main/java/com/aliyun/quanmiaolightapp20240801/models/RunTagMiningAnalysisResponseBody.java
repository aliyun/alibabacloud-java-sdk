// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunTagMiningAnalysisResponseBody extends TeaModel {
    @NameInMap("header")
    public RunTagMiningAnalysisResponseBodyHeader header;

    @NameInMap("payload")
    public RunTagMiningAnalysisResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>085BE2D2-BB7E-59A6-B688-F2CB32124E7F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunTagMiningAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunTagMiningAnalysisResponseBody self = new RunTagMiningAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunTagMiningAnalysisResponseBody setHeader(RunTagMiningAnalysisResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunTagMiningAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunTagMiningAnalysisResponseBody setPayload(RunTagMiningAnalysisResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunTagMiningAnalysisResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunTagMiningAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunTagMiningAnalysisResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccessForbidden</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-finished</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunTagMiningAnalysisResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunTagMiningAnalysisResponseBodyHeader self = new RunTagMiningAnalysisResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunTagMiningAnalysisResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunTagMiningAnalysisResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunTagMiningAnalysisResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunTagMiningAnalysisResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunTagMiningAnalysisResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunTagMiningAnalysisResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunTagMiningAnalysisResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("text")
        public String text;

        public static RunTagMiningAnalysisResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunTagMiningAnalysisResponseBodyPayloadOutput self = new RunTagMiningAnalysisResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunTagMiningAnalysisResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunTagMiningAnalysisResponseBodyPayloadUsage extends TeaModel {
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

        public static RunTagMiningAnalysisResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunTagMiningAnalysisResponseBodyPayloadUsage self = new RunTagMiningAnalysisResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunTagMiningAnalysisResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunTagMiningAnalysisResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunTagMiningAnalysisResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunTagMiningAnalysisResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunTagMiningAnalysisResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunTagMiningAnalysisResponseBodyPayloadUsage usage;

        public static RunTagMiningAnalysisResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunTagMiningAnalysisResponseBodyPayload self = new RunTagMiningAnalysisResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunTagMiningAnalysisResponseBodyPayload setOutput(RunTagMiningAnalysisResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunTagMiningAnalysisResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunTagMiningAnalysisResponseBodyPayload setUsage(RunTagMiningAnalysisResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunTagMiningAnalysisResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
