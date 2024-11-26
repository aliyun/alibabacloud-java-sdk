// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationResponseBody extends TeaModel {
    @NameInMap("end")
    public Boolean end;

    @NameInMap("header")
    public RunCommentGenerationResponseBodyHeader header;

    @NameInMap("payload")
    public RunCommentGenerationResponseBodyPayload payload;

    @NameInMap("requestId")
    public String requestId;

    public static RunCommentGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationResponseBody self = new RunCommentGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunCommentGenerationResponseBody setHeader(RunCommentGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunCommentGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunCommentGenerationResponseBody setPayload(RunCommentGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunCommentGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunCommentGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunCommentGenerationResponseBodyHeader extends TeaModel {
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
         * <p>F8A35034-EDCF-5C50-95A5-1044316F36E3</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>tcm9xac9dsfbfgm8hf5k94l3cqybwh9o3mn0iuyytdgd9qoejxf1crxsdvuvr8fu0zuhbe8anhdaoeif2wbkmebagnezh23cuhkiazx2tmjh4eml791eak7t95sshvtkz14bh2lnbktzvdhialzd8reoaem0pktw41slinwyoabe75xlnxsqb5eo1i6ly70</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>task-fu1918oghtodbis3chgpfr</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>21507c3517074446017046500ed5f1</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunCommentGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyHeader self = new RunCommentGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunCommentGenerationResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunCommentGenerationResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunCommentGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunCommentGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunCommentGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunCommentGenerationResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("text")
        public String text;

        public static RunCommentGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyPayloadOutput self = new RunCommentGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunCommentGenerationResponseBodyPayloadUsage extends TeaModel {
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

        public static RunCommentGenerationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyPayloadUsage self = new RunCommentGenerationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunCommentGenerationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunCommentGenerationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunCommentGenerationResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunCommentGenerationResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunCommentGenerationResponseBodyPayloadUsage usage;

        public static RunCommentGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyPayload self = new RunCommentGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyPayload setOutput(RunCommentGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunCommentGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunCommentGenerationResponseBodyPayload setUsage(RunCommentGenerationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunCommentGenerationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
