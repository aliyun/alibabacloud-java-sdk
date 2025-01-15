// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("end")
    public Boolean end;

    @NameInMap("header")
    public RunScriptChatResponseBodyHeader header;

    @NameInMap("payload")
    public RunScriptChatResponseBodyPayload payload;

    public static RunScriptChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunScriptChatResponseBody self = new RunScriptChatResponseBody();
        return TeaModel.build(map, self);
    }

    public RunScriptChatResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunScriptChatResponseBody setHeader(RunScriptChatResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunScriptChatResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunScriptChatResponseBody setPayload(RunScriptChatResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunScriptChatResponseBodyPayload getPayload() {
        return this.payload;
    }

    public static class RunScriptChatResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Pop sign mismatch, please check log.</p>
         */
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
         * <p>F8A35034-EDCF-5C50-95A5-1044316F36E3</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>147648697127_914847410985_1730600302167</p>
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
         * <p>2150432017236011824686132ecdbc</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunScriptChatResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunScriptChatResponseBodyHeader self = new RunScriptChatResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunScriptChatResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunScriptChatResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunScriptChatResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunScriptChatResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunScriptChatResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunScriptChatResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunScriptChatResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunScriptChatResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunScriptChatResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("text")
        public String text;

        public static RunScriptChatResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunScriptChatResponseBodyPayloadOutput self = new RunScriptChatResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunScriptChatResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunScriptChatResponseBodyPayloadUsage extends TeaModel {
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

        public static RunScriptChatResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunScriptChatResponseBodyPayloadUsage self = new RunScriptChatResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunScriptChatResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunScriptChatResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunScriptChatResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunScriptChatResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunScriptChatResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunScriptChatResponseBodyPayloadUsage usage;

        public static RunScriptChatResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunScriptChatResponseBodyPayload self = new RunScriptChatResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunScriptChatResponseBodyPayload setOutput(RunScriptChatResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunScriptChatResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunScriptChatResponseBodyPayload setUsage(RunScriptChatResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunScriptChatResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
