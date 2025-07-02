// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunOcrParseResponseBody extends TeaModel {
    @NameInMap("header")
    public RunOcrParseResponseBodyHeader header;

    @NameInMap("payload")
    public RunOcrParseResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunOcrParseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunOcrParseResponseBody self = new RunOcrParseResponseBody();
        return TeaModel.build(map, self);
    }

    public RunOcrParseResponseBody setHeader(RunOcrParseResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunOcrParseResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunOcrParseResponseBody setPayload(RunOcrParseResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunOcrParseResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunOcrParseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunOcrParseResponseBodyHeader extends TeaModel {
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

        public static RunOcrParseResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunOcrParseResponseBodyHeader self = new RunOcrParseResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunOcrParseResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunOcrParseResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunOcrParseResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunOcrParseResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunOcrParseResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunOcrParseResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunOcrParseResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("text")
        public String text;

        public static RunOcrParseResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunOcrParseResponseBodyPayloadOutput self = new RunOcrParseResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunOcrParseResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunOcrParseResponseBodyPayloadUsage extends TeaModel {
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

        public static RunOcrParseResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunOcrParseResponseBodyPayloadUsage self = new RunOcrParseResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunOcrParseResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunOcrParseResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunOcrParseResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunOcrParseResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunOcrParseResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunOcrParseResponseBodyPayloadUsage usage;

        public static RunOcrParseResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunOcrParseResponseBodyPayload self = new RunOcrParseResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunOcrParseResponseBodyPayload setOutput(RunOcrParseResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunOcrParseResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunOcrParseResponseBodyPayload setUsage(RunOcrParseResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunOcrParseResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
