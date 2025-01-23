// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunNetworkContentAuditResponseBody extends TeaModel {
    @NameInMap("header")
    public RunNetworkContentAuditResponseBodyHeader header;

    @NameInMap("payload")
    public RunNetworkContentAuditResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5D0E915E-655D-59A8-894F-93873F73AAE5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunNetworkContentAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunNetworkContentAuditResponseBody self = new RunNetworkContentAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public RunNetworkContentAuditResponseBody setHeader(RunNetworkContentAuditResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunNetworkContentAuditResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunNetworkContentAuditResponseBody setPayload(RunNetworkContentAuditResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunNetworkContentAuditResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunNetworkContentAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunNetworkContentAuditResponseBodyHeader extends TeaModel {
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

        public static RunNetworkContentAuditResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunNetworkContentAuditResponseBodyHeader self = new RunNetworkContentAuditResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunNetworkContentAuditResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunNetworkContentAuditResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunNetworkContentAuditResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunNetworkContentAuditResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunNetworkContentAuditResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunNetworkContentAuditResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunNetworkContentAuditResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("text")
        public String text;

        public static RunNetworkContentAuditResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunNetworkContentAuditResponseBodyPayloadOutput self = new RunNetworkContentAuditResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunNetworkContentAuditResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunNetworkContentAuditResponseBodyPayloadUsage extends TeaModel {
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

        public static RunNetworkContentAuditResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunNetworkContentAuditResponseBodyPayloadUsage self = new RunNetworkContentAuditResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunNetworkContentAuditResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunNetworkContentAuditResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunNetworkContentAuditResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunNetworkContentAuditResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunNetworkContentAuditResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunNetworkContentAuditResponseBodyPayloadUsage usage;

        public static RunNetworkContentAuditResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunNetworkContentAuditResponseBodyPayload self = new RunNetworkContentAuditResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunNetworkContentAuditResponseBodyPayload setOutput(RunNetworkContentAuditResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunNetworkContentAuditResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunNetworkContentAuditResponseBodyPayload setUsage(RunNetworkContentAuditResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunNetworkContentAuditResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
