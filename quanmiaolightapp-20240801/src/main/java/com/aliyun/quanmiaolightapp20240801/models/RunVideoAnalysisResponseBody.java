// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunVideoAnalysisResponseBody extends TeaModel {
    @NameInMap("header")
    public RunVideoAnalysisResponseBodyHeader header;

    @NameInMap("payload")
    public RunVideoAnalysisResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunVideoAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunVideoAnalysisResponseBody self = new RunVideoAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunVideoAnalysisResponseBody setHeader(RunVideoAnalysisResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunVideoAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunVideoAnalysisResponseBody setPayload(RunVideoAnalysisResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunVideoAnalysisResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunVideoAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunVideoAnalysisResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InvalidParam</p>
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
         * <p>task-progress-start-generating</p>
         */
        @NameInMap("event")
        public String event;

        @NameInMap("eventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2150432017236011824686132ecdbc</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunVideoAnalysisResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyHeader self = new RunVideoAnalysisResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunVideoAnalysisResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunVideoAnalysisResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunVideoAnalysisResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunVideoAnalysisResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunVideoAnalysisResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunVideoAnalysisResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult extends TeaModel {
        @NameInMap("docId")
        public String docId;

        @NameInMap("docUuid")
        public String docUuid;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("status")
        public Long status;

        @NameInMap("title")
        public String title;

        public static RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult self = new RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage extends TeaModel {
        @NameInMap("imageTokens")
        public Long imageTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage self = new RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage setImageTokens(Long imageTokens) {
            this.imageTokens = imageTokens;
            return this;
        }
        public Long getImageTokens() {
            return this.imageTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("text")
        public String text;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults self = new RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("modelId")
        public String modelId;

        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage usage;

        @NameInMap("videoShotAnalysisResults")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults> videoShotAnalysisResults;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult setUsage(RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage getUsage() {
            return this.usage;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult setVideoShotAnalysisResults(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults> videoShotAnalysisResults) {
            this.videoShotAnalysisResults = videoShotAnalysisResults;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultVideoShotAnalysisResults> getVideoShotAnalysisResults() {
            return this.videoShotAnalysisResults;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems extends TeaModel {
        @NameInMap("inputExpense")
        public Double inputExpense;

        @NameInMap("inputToken")
        public Long inputToken;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("outputExpense")
        public Double outputExpense;

        @NameInMap("outputToken")
        public Long outputToken;

        @NameInMap("time")
        public Long time;

        @NameInMap("timeExpense")
        public Double timeExpense;

        @NameInMap("totalExpense")
        public Double totalExpense;

        @NameInMap("type")
        public String type;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems self = new RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setInputExpense(Double inputExpense) {
            this.inputExpense = inputExpense;
            return this;
        }
        public Double getInputExpense() {
            return this.inputExpense;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setInputToken(Long inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Long getInputToken() {
            return this.inputToken;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setOutputExpense(Double outputExpense) {
            this.outputExpense = outputExpense;
            return this;
        }
        public Double getOutputExpense() {
            return this.outputExpense;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setOutputToken(Long outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public Long getOutputToken() {
            return this.outputToken;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setTimeExpense(Double timeExpense) {
            this.timeExpense = timeExpense;
            return this;
        }
        public Double getTimeExpense() {
            return this.timeExpense;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setTotalExpense(Double totalExpense) {
            this.totalExpense = totalExpense;
            return this;
        }
        public Double getTotalExpense() {
            return this.totalExpense;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult extends TeaModel {
        @NameInMap("items")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems> items;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult setItems(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResultItems> getItems() {
            return this.items;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>00:01</p>
         */
        @NameInMap("endTimeFormat")
        public String endTimeFormat;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("speaker")
        public String speaker;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>00:01</p>
         */
        @NameInMap("startTimeFormat")
        public String startTimeFormat;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("text")
        public String text;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions self = new RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions setEndTimeFormat(String endTimeFormat) {
            this.endTimeFormat = endTimeFormat;
            return this;
        }
        public String getEndTimeFormat() {
            return this.endTimeFormat;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions setStartTimeFormat(String startTimeFormat) {
            this.startTimeFormat = startTimeFormat;
            return this;
        }
        public String getStartTimeFormat() {
            return this.startTimeFormat;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        @NameInMap("videoCaptions")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions> videoCaptions;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult setVideoCaptions(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions> videoCaptions) {
            this.videoCaptions = videoCaptions;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResultVideoCaptions> getVideoCaptions() {
            return this.videoCaptions;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage self = new RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        @NameInMap("index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelId")
        public String modelId;

        @NameInMap("modelReduce")
        public Boolean modelReduce;

        @NameInMap("reasonText")
        public String reasonText;

        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage usage;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult setModelReduce(Boolean modelReduce) {
            this.modelReduce = modelReduce;
            return this;
        }
        public Boolean getModelReduce() {
            return this.modelReduce;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult setReasonText(String reasonText) {
            this.reasonText = reasonText;
            return this;
        }
        public String getReasonText() {
            return this.reasonText;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult setUsage(RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultUsage getUsage() {
            return this.usage;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage extends TeaModel {
        @NameInMap("inputTokens")
        public Long inputTokens;

        @NameInMap("outputTokens")
        public Long outputTokens;

        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage self = new RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults extends TeaModel {
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        @NameInMap("index")
        public Integer index;

        @NameInMap("modelId")
        public String modelId;

        @NameInMap("reasonText")
        public String reasonText;

        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage usage;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults self = new RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults setReasonText(String reasonText) {
            this.reasonText = reasonText;
            return this;
        }
        public String getReasonText() {
            return this.reasonText;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults setUsage(RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResultsUsage getUsage() {
            return this.usage;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage self = new RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes extends TeaModel {
        @NameInMap("name")
        public String name;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes self = new RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes extends TeaModel {
        @NameInMap("childNodes")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes> childNodes;

        @NameInMap("name")
        public String name;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes self = new RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes setChildNodes(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes> childNodes) {
            this.childNodes = childNodes;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes> getChildNodes() {
            return this.childNodes;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings extends TeaModel {
        @NameInMap("childNodes")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes> childNodes;

        @NameInMap("name")
        public String name;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings self = new RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings setChildNodes(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes> childNodes) {
            this.childNodes = childNodes;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes> getChildNodes() {
            return this.childNodes;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("modelId")
        public String modelId;

        @NameInMap("modelReduce")
        public Boolean modelReduce;

        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage usage;

        @NameInMap("videoMindMappings")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings> videoMindMappings;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult setModelReduce(Boolean modelReduce) {
            this.modelReduce = modelReduce;
            return this;
        }
        public Boolean getModelReduce() {
            return this.modelReduce;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult setUsage(RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultUsage getUsage() {
            return this.usage;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult setVideoMindMappings(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings> videoMindMappings) {
            this.videoMindMappings = videoMindMappings;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResultVideoMindMappings> getVideoMindMappings() {
            return this.videoMindMappings;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("url")
        public String url;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals self = new RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles extends TeaModel {
        @NameInMap("isAutoRecognition")
        public Boolean isAutoRecognition;

        @NameInMap("ratio")
        public Float ratio;

        @NameInMap("roleInfo")
        public String roleInfo;

        @NameInMap("roleName")
        public String roleName;

        @NameInMap("timeIntervals")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals> timeIntervals;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles self = new RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles setIsAutoRecognition(Boolean isAutoRecognition) {
            this.isAutoRecognition = isAutoRecognition;
            return this;
        }
        public Boolean getIsAutoRecognition() {
            return this.isAutoRecognition;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles setRatio(Float ratio) {
            this.ratio = ratio;
            return this;
        }
        public Float getRatio() {
            return this.ratio;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles setRoleInfo(String roleInfo) {
            this.roleInfo = roleInfo;
            return this;
        }
        public String getRoleInfo() {
            return this.roleInfo;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles setTimeIntervals(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals> timeIntervals) {
            this.timeIntervals = timeIntervals;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals> getTimeIntervals() {
            return this.timeIntervals;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult extends TeaModel {
        @NameInMap("videoRoles")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles> videoRoles;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult setVideoRoles(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles> videoRoles) {
            this.videoRoles = videoRoles;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResultVideoRoles> getVideoRoles() {
            return this.videoRoles;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots extends TeaModel {
        @NameInMap("url")
        public String url;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots self = new RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("endTimeFormat")
        public String endTimeFormat;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("startTimeFormat")
        public String startTimeFormat;

        @NameInMap("videoSnapshots")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots> videoSnapshots;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots self = new RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots setEndTimeFormat(String endTimeFormat) {
            this.endTimeFormat = endTimeFormat;
            return this;
        }
        public String getEndTimeFormat() {
            return this.endTimeFormat;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots setStartTimeFormat(String startTimeFormat) {
            this.startTimeFormat = startTimeFormat;
            return this;
        }
        public String getStartTimeFormat() {
            return this.startTimeFormat;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots setVideoSnapshots(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots> videoSnapshots) {
            this.videoSnapshots = videoSnapshots;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShotsVideoSnapshots> getVideoSnapshots() {
            return this.videoSnapshots;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult extends TeaModel {
        @NameInMap("videoShots")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots> videoShots;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult setVideoShots(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots> videoShots) {
            this.videoShots = videoShots;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResultVideoShots> getVideoShots() {
            return this.videoShots;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage self = new RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelId")
        public String modelId;

        @NameInMap("modelReduce")
        public Boolean modelReduce;

        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage usage;

        public static RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult self = new RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult setModelReduce(Boolean modelReduce) {
            this.modelReduce = modelReduce;
            return this;
        }
        public Boolean getModelReduce() {
            return this.modelReduce;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult setUsage(RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResultUsage getUsage() {
            return this.usage;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("addDatasetDocumentsResult")
        public RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult addDatasetDocumentsResult;

        /**
         * <strong>example:</strong>
         * <p>http://</p>
         */
        @NameInMap("resultJsonFileUrl")
        public String resultJsonFileUrl;

        @NameInMap("videoAnalysisResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult videoAnalysisResult;

        @NameInMap("videoCalculatorResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult videoCalculatorResult;

        @NameInMap("videoCaptionResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult videoCaptionResult;

        @NameInMap("videoGenerateResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult videoGenerateResult;

        @NameInMap("videoGenerateResults")
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults> videoGenerateResults;

        @NameInMap("videoMindMappingGenerateResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult videoMindMappingGenerateResult;

        @NameInMap("videoRoleRecognitionResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult videoRoleRecognitionResult;

        @NameInMap("videoShotSnapshotResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult videoShotSnapshotResult;

        @NameInMap("videoTitleGenerateResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult videoTitleGenerateResult;

        public static RunVideoAnalysisResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutput self = new RunVideoAnalysisResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setAddDatasetDocumentsResult(RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult addDatasetDocumentsResult) {
            this.addDatasetDocumentsResult = addDatasetDocumentsResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputAddDatasetDocumentsResult getAddDatasetDocumentsResult() {
            return this.addDatasetDocumentsResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setResultJsonFileUrl(String resultJsonFileUrl) {
            this.resultJsonFileUrl = resultJsonFileUrl;
            return this;
        }
        public String getResultJsonFileUrl() {
            return this.resultJsonFileUrl;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoAnalysisResult(RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult videoAnalysisResult) {
            this.videoAnalysisResult = videoAnalysisResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult getVideoAnalysisResult() {
            return this.videoAnalysisResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoCalculatorResult(RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult videoCalculatorResult) {
            this.videoCalculatorResult = videoCalculatorResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoCalculatorResult getVideoCalculatorResult() {
            return this.videoCalculatorResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoCaptionResult(RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult videoCaptionResult) {
            this.videoCaptionResult = videoCaptionResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult getVideoCaptionResult() {
            return this.videoCaptionResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoGenerateResult(RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult videoGenerateResult) {
            this.videoGenerateResult = videoGenerateResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult getVideoGenerateResult() {
            return this.videoGenerateResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoGenerateResults(java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults> videoGenerateResults) {
            this.videoGenerateResults = videoGenerateResults;
            return this;
        }
        public java.util.List<RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResults> getVideoGenerateResults() {
            return this.videoGenerateResults;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoMindMappingGenerateResult(RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult videoMindMappingGenerateResult) {
            this.videoMindMappingGenerateResult = videoMindMappingGenerateResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult getVideoMindMappingGenerateResult() {
            return this.videoMindMappingGenerateResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoRoleRecognitionResult(RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult videoRoleRecognitionResult) {
            this.videoRoleRecognitionResult = videoRoleRecognitionResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoRoleRecognitionResult getVideoRoleRecognitionResult() {
            return this.videoRoleRecognitionResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoShotSnapshotResult(RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult videoShotSnapshotResult) {
            this.videoShotSnapshotResult = videoShotSnapshotResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult getVideoShotSnapshotResult() {
            return this.videoShotSnapshotResult;
        }

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoTitleGenerateResult(RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult videoTitleGenerateResult) {
            this.videoTitleGenerateResult = videoTitleGenerateResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult getVideoTitleGenerateResult() {
            return this.videoTitleGenerateResult;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayloadUsage extends TeaModel {
        @NameInMap("inputTokens")
        public Long inputTokens;

        @NameInMap("outputTokens")
        public Long outputTokens;

        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunVideoAnalysisResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadUsage self = new RunVideoAnalysisResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoAnalysisResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoAnalysisResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunVideoAnalysisResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunVideoAnalysisResponseBodyPayloadUsage usage;

        public static RunVideoAnalysisResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayload self = new RunVideoAnalysisResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunVideoAnalysisResponseBodyPayload setOutput(RunVideoAnalysisResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunVideoAnalysisResponseBodyPayload setUsage(RunVideoAnalysisResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
