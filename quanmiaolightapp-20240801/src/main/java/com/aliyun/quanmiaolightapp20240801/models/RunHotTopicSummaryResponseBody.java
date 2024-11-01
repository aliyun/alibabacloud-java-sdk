// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicSummaryResponseBody extends TeaModel {
    @NameInMap("header")
    public RunHotTopicSummaryResponseBodyHeader header;

    @NameInMap("payload")
    public RunHotTopicSummaryResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5D0E915E-655D-59A8-894F-93873F73AAE5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunHotTopicSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicSummaryResponseBody self = new RunHotTopicSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public RunHotTopicSummaryResponseBody setHeader(RunHotTopicSummaryResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunHotTopicSummaryResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunHotTopicSummaryResponseBody setPayload(RunHotTopicSummaryResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunHotTopicSummaryResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunHotTopicSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunHotTopicSummaryResponseBodyHeader extends TeaModel {
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

        public static RunHotTopicSummaryResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicSummaryResponseBodyHeader self = new RunHotTopicSummaryResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunHotTopicSummaryResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunHotTopicSummaryResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunHotTopicSummaryResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunHotTopicSummaryResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunHotTopicSummaryResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunHotTopicSummaryResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunHotTopicSummaryResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("text")
        public String text;

        @NameInMap("topicId")
        public String topicId;

        public static RunHotTopicSummaryResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicSummaryResponseBodyPayloadOutput self = new RunHotTopicSummaryResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunHotTopicSummaryResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunHotTopicSummaryResponseBodyPayloadOutput setTopicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
        public String getTopicId() {
            return this.topicId;
        }

    }

    public static class RunHotTopicSummaryResponseBodyPayloadUsage extends TeaModel {
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

        public static RunHotTopicSummaryResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicSummaryResponseBodyPayloadUsage self = new RunHotTopicSummaryResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunHotTopicSummaryResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunHotTopicSummaryResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunHotTopicSummaryResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunHotTopicSummaryResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunHotTopicSummaryResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunHotTopicSummaryResponseBodyPayloadUsage usage;

        public static RunHotTopicSummaryResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicSummaryResponseBodyPayload self = new RunHotTopicSummaryResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunHotTopicSummaryResponseBodyPayload setOutput(RunHotTopicSummaryResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunHotTopicSummaryResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunHotTopicSummaryResponseBodyPayload setUsage(RunHotTopicSummaryResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunHotTopicSummaryResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
