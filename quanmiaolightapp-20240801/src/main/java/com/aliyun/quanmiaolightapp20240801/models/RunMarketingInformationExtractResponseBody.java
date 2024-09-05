// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationExtractResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;TimeZone\&quot;: \&quot;Asia/Shanghai\&quot;, \&quot;DateTime\&quot;: \&quot;2024-03-07T17:00:09+08:00\&quot;}</p>
     */
    @NameInMap("end")
    public Boolean end;

    @NameInMap("header")
    public RunMarketingInformationExtractResponseBodyHeader header;

    @NameInMap("payload")
    public RunMarketingInformationExtractResponseBodyPayload payload;

    public static RunMarketingInformationExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationExtractResponseBody self = new RunMarketingInformationExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationExtractResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunMarketingInformationExtractResponseBody setHeader(RunMarketingInformationExtractResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunMarketingInformationExtractResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunMarketingInformationExtractResponseBody setPayload(RunMarketingInformationExtractResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunMarketingInformationExtractResponseBodyPayload getPayload() {
        return this.payload;
    }

    public static class RunMarketingInformationExtractResponseBodyHeader extends TeaModel {
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
         * <p>F08C71C0-9399-548C-838B-1DA01DE211B0</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>121dlsga4o7golrl1hojazg0u9lvytjc17ebgzzj2u4zukgh122tfg7wj1e6a1vcowy1ewzinauxriai9atcr6r323mm9ddbr0bg5m61ij8hxnf8664tstlfkfol6m8luc4shs3gums7l46uauyy0xndqmhdjtdon6coyhb4x17bo762bg9e3tb2geufg2</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>12826092918145</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2150432017236011824686132ecdbc</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunMarketingInformationExtractResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationExtractResponseBodyHeader self = new RunMarketingInformationExtractResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationExtractResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunMarketingInformationExtractResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunMarketingInformationExtractResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunMarketingInformationExtractResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunMarketingInformationExtractResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunMarketingInformationExtractResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunMarketingInformationExtractResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("text")
        public String text;

        public static RunMarketingInformationExtractResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationExtractResponseBodyPayloadOutput self = new RunMarketingInformationExtractResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationExtractResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunMarketingInformationExtractResponseBodyPayloadUsage extends TeaModel {
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

        public static RunMarketingInformationExtractResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationExtractResponseBodyPayloadUsage self = new RunMarketingInformationExtractResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationExtractResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunMarketingInformationExtractResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunMarketingInformationExtractResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunMarketingInformationExtractResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunMarketingInformationExtractResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunMarketingInformationExtractResponseBodyPayloadUsage usage;

        public static RunMarketingInformationExtractResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunMarketingInformationExtractResponseBodyPayload self = new RunMarketingInformationExtractResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunMarketingInformationExtractResponseBodyPayload setOutput(RunMarketingInformationExtractResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunMarketingInformationExtractResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunMarketingInformationExtractResponseBodyPayload setUsage(RunMarketingInformationExtractResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunMarketingInformationExtractResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
