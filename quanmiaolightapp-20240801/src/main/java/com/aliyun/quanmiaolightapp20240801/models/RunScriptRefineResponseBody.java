// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptRefineResponseBody extends TeaModel {
    @NameInMap("end")
    public Boolean end;

    @NameInMap("header")
    public RunScriptRefineResponseBodyHeader header;

    @NameInMap("payload")
    public RunScriptRefineResponseBodyPayload payload;

    public static RunScriptRefineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunScriptRefineResponseBody self = new RunScriptRefineResponseBody();
        return TeaModel.build(map, self);
    }

    public RunScriptRefineResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunScriptRefineResponseBody setHeader(RunScriptRefineResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunScriptRefineResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunScriptRefineResponseBody setPayload(RunScriptRefineResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunScriptRefineResponseBodyPayload getPayload() {
        return this.payload;
    }

    public static class RunScriptRefineResponseBodyHeader extends TeaModel {
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
         * <p>17dc8bcd-f34a-46d1-a7a3-0fa3d1ce3824</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>14356391-6c6c-40d5-b80a-8ecd03b69d72</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2150432017236011824686132ecdbc</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunScriptRefineResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunScriptRefineResponseBodyHeader self = new RunScriptRefineResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunScriptRefineResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunScriptRefineResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunScriptRefineResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunScriptRefineResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunScriptRefineResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunScriptRefineResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunScriptRefineResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunScriptRefineResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunScriptRefineResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("content")
        public java.util.List<java.util.Map<String, String>> content;

        @NameInMap("outline")
        public String outline;

        @NameInMap("role")
        public String role;

        @NameInMap("scene")
        public String scene;

        @NameInMap("summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("text")
        public String text;

        public static RunScriptRefineResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunScriptRefineResponseBodyPayloadOutput self = new RunScriptRefineResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunScriptRefineResponseBodyPayloadOutput setContent(java.util.List<java.util.Map<String, String>> content) {
            this.content = content;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getContent() {
            return this.content;
        }

        public RunScriptRefineResponseBodyPayloadOutput setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public RunScriptRefineResponseBodyPayloadOutput setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public RunScriptRefineResponseBodyPayloadOutput setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public RunScriptRefineResponseBodyPayloadOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunScriptRefineResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunScriptRefineResponseBodyPayloadUsage extends TeaModel {
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

        public static RunScriptRefineResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunScriptRefineResponseBodyPayloadUsage self = new RunScriptRefineResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunScriptRefineResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunScriptRefineResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunScriptRefineResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunScriptRefineResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunScriptRefineResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunScriptRefineResponseBodyPayloadUsage usage;

        public static RunScriptRefineResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunScriptRefineResponseBodyPayload self = new RunScriptRefineResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunScriptRefineResponseBodyPayload setOutput(RunScriptRefineResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunScriptRefineResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunScriptRefineResponseBodyPayload setUsage(RunScriptRefineResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunScriptRefineResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
