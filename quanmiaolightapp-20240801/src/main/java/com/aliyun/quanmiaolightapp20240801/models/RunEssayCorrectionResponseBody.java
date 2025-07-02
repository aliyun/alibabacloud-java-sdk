// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEssayCorrectionResponseBody extends TeaModel {
    @NameInMap("header")
    public RunEssayCorrectionResponseBodyHeader header;

    @NameInMap("payload")
    public RunEssayCorrectionResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunEssayCorrectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunEssayCorrectionResponseBody self = new RunEssayCorrectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunEssayCorrectionResponseBody setHeader(RunEssayCorrectionResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunEssayCorrectionResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunEssayCorrectionResponseBody setPayload(RunEssayCorrectionResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunEssayCorrectionResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunEssayCorrectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunEssayCorrectionResponseBodyHeader extends TeaModel {
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

        public static RunEssayCorrectionResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunEssayCorrectionResponseBodyHeader self = new RunEssayCorrectionResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunEssayCorrectionResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunEssayCorrectionResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunEssayCorrectionResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunEssayCorrectionResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunEssayCorrectionResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunEssayCorrectionResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunEssayCorrectionResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("score")
        public Integer score;

        @NameInMap("text")
        public String text;

        public static RunEssayCorrectionResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunEssayCorrectionResponseBodyPayloadOutput self = new RunEssayCorrectionResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunEssayCorrectionResponseBodyPayloadOutput setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public RunEssayCorrectionResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunEssayCorrectionResponseBodyPayloadUsage extends TeaModel {
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

        public static RunEssayCorrectionResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunEssayCorrectionResponseBodyPayloadUsage self = new RunEssayCorrectionResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunEssayCorrectionResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunEssayCorrectionResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunEssayCorrectionResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunEssayCorrectionResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunEssayCorrectionResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunEssayCorrectionResponseBodyPayloadUsage usage;

        public static RunEssayCorrectionResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunEssayCorrectionResponseBodyPayload self = new RunEssayCorrectionResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunEssayCorrectionResponseBodyPayload setOutput(RunEssayCorrectionResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunEssayCorrectionResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunEssayCorrectionResponseBodyPayload setUsage(RunEssayCorrectionResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunEssayCorrectionResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
