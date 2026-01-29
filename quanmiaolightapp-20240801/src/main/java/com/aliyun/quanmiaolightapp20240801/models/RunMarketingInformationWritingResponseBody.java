// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationWritingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-06-21T10:29:52+08:00</p>
     */
    @NameInMap("end")
    public Boolean end;

    @NameInMap("header")
    public RunMarketingInformationWritingResponseBodyHeader header;

    @NameInMap("payload")
    public RunMarketingInformationWritingResponseBodyPayload payload;

    public static RunMarketingInformationWritingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationWritingResponseBody self = new RunMarketingInformationWritingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationWritingResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunMarketingInformationWritingResponseBody setHeader(RunMarketingInformationWritingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunMarketingInformationWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunMarketingInformationWritingResponseBody setPayload(RunMarketingInformationWritingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunMarketingInformationWritingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public static class RunMarketingInformationWritingResponseBodyHeader extends TeaModel {
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>result-generated</p>
         */
        @NameInMap("event")
        public String event;

        @NameInMap("eventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>436BC5AE-0573-59D8-9803-6B5FDCD3BBA1</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>uqubxgqzlnf4exfektij032lgb3yvix678p232n56387aqxdo4uutdt9wstqzovvz6j3ho7wnbgye785u79yn5q3euqmsvzmqdn3nmfq2826oscjvsi43kof8b8uxufpp1x97jjukk6jd3183hy8ni6hqpskuhuascpd</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>13312125943232</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>213e20e517049392478441155e8b2a</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunMarketingInformationWritingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationWritingResponseBodyHeader self = new RunMarketingInformationWritingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationWritingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunMarketingInformationWritingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunMarketingInformationWritingResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunMarketingInformationWritingResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunMarketingInformationWritingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunMarketingInformationWritingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunMarketingInformationWritingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunMarketingInformationWritingResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>推理内容</p>
         */
        @NameInMap("reasonContent")
        public String reasonContent;

        @NameInMap("text")
        public String text;

        public static RunMarketingInformationWritingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationWritingResponseBodyPayloadOutput self = new RunMarketingInformationWritingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationWritingResponseBodyPayloadOutput setReasonContent(String reasonContent) {
            this.reasonContent = reasonContent;
            return this;
        }
        public String getReasonContent() {
            return this.reasonContent;
        }

        public RunMarketingInformationWritingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunMarketingInformationWritingResponseBodyPayloadUsage extends TeaModel {
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

        public static RunMarketingInformationWritingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationWritingResponseBodyPayloadUsage self = new RunMarketingInformationWritingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationWritingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunMarketingInformationWritingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunMarketingInformationWritingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunMarketingInformationWritingResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunMarketingInformationWritingResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunMarketingInformationWritingResponseBodyPayloadUsage usage;

        public static RunMarketingInformationWritingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationWritingResponseBodyPayload self = new RunMarketingInformationWritingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationWritingResponseBodyPayload setOutput(RunMarketingInformationWritingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunMarketingInformationWritingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunMarketingInformationWritingResponseBodyPayload setUsage(RunMarketingInformationWritingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunMarketingInformationWritingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
