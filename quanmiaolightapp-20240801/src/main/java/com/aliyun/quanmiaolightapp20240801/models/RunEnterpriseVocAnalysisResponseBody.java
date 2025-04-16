// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEnterpriseVocAnalysisResponseBody extends TeaModel {
    @NameInMap("header")
    public RunEnterpriseVocAnalysisResponseBodyHeader header;

    @NameInMap("payload")
    public RunEnterpriseVocAnalysisResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>49483FFC-0CB9-5163-8D3E-234E276E6DA8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunEnterpriseVocAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunEnterpriseVocAnalysisResponseBody self = new RunEnterpriseVocAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunEnterpriseVocAnalysisResponseBody setHeader(RunEnterpriseVocAnalysisResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunEnterpriseVocAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunEnterpriseVocAnalysisResponseBody setPayload(RunEnterpriseVocAnalysisResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunEnterpriseVocAnalysisResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunEnterpriseVocAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunEnterpriseVocAnalysisResponseBodyHeader extends TeaModel {
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

        public static RunEnterpriseVocAnalysisResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisResponseBodyHeader self = new RunEnterpriseVocAnalysisResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunEnterpriseVocAnalysisResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunEnterpriseVocAnalysisResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunEnterpriseVocAnalysisResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunEnterpriseVocAnalysisResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunEnterpriseVocAnalysisResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hit")
        public Boolean hit;

        @NameInMap("tagName")
        public String tagName;

        @NameInMap("tagValue")
        public String tagValue;

        public static RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults self = new RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults setHit(Boolean hit) {
            this.hit = hit;
            return this;
        }
        public Boolean getHit() {
            return this.hit;
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult extends TeaModel {
        @NameInMap("filterResults")
        public java.util.List<RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults> filterResults;

        public static RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult self = new RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult setFilterResults(java.util.List<RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults> filterResults) {
            this.filterResults = filterResults;
            return this;
        }
        public java.util.List<RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResultFilterResults> getFilterResults() {
            return this.filterResults;
        }

    }

    public static class RunEnterpriseVocAnalysisResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("filterResult")
        public RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult filterResult;

        @NameInMap("text")
        public String text;

        public static RunEnterpriseVocAnalysisResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisResponseBodyPayloadOutput self = new RunEnterpriseVocAnalysisResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadOutput setFilterResult(RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult filterResult) {
            this.filterResult = filterResult;
            return this;
        }
        public RunEnterpriseVocAnalysisResponseBodyPayloadOutputFilterResult getFilterResult() {
            return this.filterResult;
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunEnterpriseVocAnalysisResponseBodyPayloadUsage extends TeaModel {
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

        public static RunEnterpriseVocAnalysisResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisResponseBodyPayloadUsage self = new RunEnterpriseVocAnalysisResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunEnterpriseVocAnalysisResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunEnterpriseVocAnalysisResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunEnterpriseVocAnalysisResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunEnterpriseVocAnalysisResponseBodyPayloadUsage usage;

        public static RunEnterpriseVocAnalysisResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunEnterpriseVocAnalysisResponseBodyPayload self = new RunEnterpriseVocAnalysisResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunEnterpriseVocAnalysisResponseBodyPayload setOutput(RunEnterpriseVocAnalysisResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunEnterpriseVocAnalysisResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunEnterpriseVocAnalysisResponseBodyPayload setUsage(RunEnterpriseVocAnalysisResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunEnterpriseVocAnalysisResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
