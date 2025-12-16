// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetVideoAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5D0E915E-655D-59A8-894F-93873F73AAE5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetVideoAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAnalysisTaskResponseBody self = new GetVideoAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoAnalysisTaskResponseBody setData(GetVideoAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVideoAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetVideoAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVideoAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVideoAnalysisTaskResponseBodyDataHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Deduct task already success,Please do not resubmit.token \&quot;369e8f2c-d283-424a-96c4-c83efe08c89e\&quot;</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>TIMEOUT_CLOSE_ORDER</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("eventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>d5c38cf6-a4bf-4a57-a697-9f449926f0c9</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>6e223291-729b-4e84-9271-c13ada1a776b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>215045f817272303448235204efdef</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static GetVideoAnalysisTaskResponseBodyDataHeader build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataHeader self = new GetVideoAnalysisTaskResponseBodyDataHeader();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetVideoAnalysisTaskResponseBodyDataHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoAnalysisTaskResponseBodyDataHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetVideoAnalysisTaskResponseBodyDataHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public GetVideoAnalysisTaskResponseBodyDataHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetVideoAnalysisTaskResponseBodyDataHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVideoAnalysisTaskResponseBodyDataHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult extends TeaModel {
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

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage extends TeaModel {
        @NameInMap("imageTokens")
        public Long imageTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage setImageTokens(Long imageTokens) {
            this.imageTokens = imageTokens;
            return this;
        }
        public Long getImageTokens() {
            return this.imageTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-05 06:22:00</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("text")
        public String text;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage usage;

        @NameInMap("videoShotAnalysisResults")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults> videoShotAnalysisResults;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult setUsage(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultUsage getUsage() {
            return this.usage;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult setVideoShotAnalysisResults(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults> videoShotAnalysisResults) {
            this.videoShotAnalysisResults = videoShotAnalysisResults;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResultVideoShotAnalysisResults> getVideoShotAnalysisResults() {
            return this.videoShotAnalysisResults;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>0.098</p>
         */
        @NameInMap("totalExpense")
        public Double totalExpense;

        @NameInMap("type")
        public String type;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setInputExpense(Double inputExpense) {
            this.inputExpense = inputExpense;
            return this;
        }
        public Double getInputExpense() {
            return this.inputExpense;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setInputToken(Long inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Long getInputToken() {
            return this.inputToken;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setOutputExpense(Double outputExpense) {
            this.outputExpense = outputExpense;
            return this;
        }
        public Double getOutputExpense() {
            return this.outputExpense;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setOutputToken(Long outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public Long getOutputToken() {
            return this.outputToken;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setTimeExpense(Double timeExpense) {
            this.timeExpense = timeExpense;
            return this;
        }
        public Double getTimeExpense() {
            return this.timeExpense;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setTotalExpense(Double totalExpense) {
            this.totalExpense = totalExpense;
            return this;
        }
        public Double getTotalExpense() {
            return this.totalExpense;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult extends TeaModel {
        @NameInMap("items")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems> items;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult setItems(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResultItems> getItems() {
            return this.items;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1736129678000</p>
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
         * <p>00:01</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-07 11:52:06</p>
         */
        @NameInMap("startTimeFormat")
        public String startTimeFormat;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("text")
        public String text;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions setEndTimeFormat(String endTimeFormat) {
            this.endTimeFormat = endTimeFormat;
            return this;
        }
        public String getEndTimeFormat() {
            return this.endTimeFormat;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions setStartTimeFormat(String startTimeFormat) {
            this.startTimeFormat = startTimeFormat;
            return this;
        }
        public String getStartTimeFormat() {
            return this.startTimeFormat;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        @NameInMap("videoCaptions")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions> videoCaptions;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult setVideoCaptions(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions> videoCaptions) {
            this.videoCaptions = videoCaptions;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResultVideoCaptions> getVideoCaptions() {
            return this.videoCaptions;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage extends TeaModel {
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

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        @NameInMap("index")
        public Integer index;

        @NameInMap("modelId")
        public String modelId;

        @NameInMap("modelReduce")
        public Boolean modelReduce;

        @NameInMap("reasonText")
        public String reasonText;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage usage;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult setModelReduce(Boolean modelReduce) {
            this.modelReduce = modelReduce;
            return this;
        }
        public Boolean getModelReduce() {
            return this.modelReduce;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult setReasonText(String reasonText) {
            this.reasonText = reasonText;
            return this;
        }
        public String getReasonText() {
            return this.reasonText;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult setUsage(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage extends TeaModel {
        @NameInMap("inputTokens")
        public Long inputTokens;

        @NameInMap("outputTokens")
        public Long outputTokens;

        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults extends TeaModel {
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
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage usage;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults setReasonText(String reasonText) {
            this.reasonText = reasonText;
            return this;
        }
        public String getReasonText() {
            return this.reasonText;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults setUsage(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResultsUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage extends TeaModel {
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

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes extends TeaModel {
        @NameInMap("name")
        public String name;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes extends TeaModel {
        @NameInMap("childNodes")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes> childNodes;

        @NameInMap("name")
        public String name;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes setChildNodes(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes> childNodes) {
            this.childNodes = childNodes;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodesChildNodes> getChildNodes() {
            return this.childNodes;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings extends TeaModel {
        @NameInMap("childNodes")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes> childNodes;

        @NameInMap("name")
        public String name;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings setChildNodes(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes> childNodes) {
            this.childNodes = childNodes;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappingsChildNodes> getChildNodes() {
            return this.childNodes;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage usage;

        @NameInMap("videoMindMappings")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings> videoMindMappings;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult setUsage(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultUsage getUsage() {
            return this.usage;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult setVideoMindMappings(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings> videoMindMappings) {
            this.videoMindMappings = videoMindMappings;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResultVideoMindMappings> getVideoMindMappings() {
            return this.videoMindMappings;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("url")
        public String url;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles extends TeaModel {
        @NameInMap("isAutoRecognition")
        public Boolean isAutoRecognition;

        @NameInMap("ratio")
        public Float ratio;

        @NameInMap("roleInfo")
        public String roleInfo;

        @NameInMap("roleName")
        public String roleName;

        @NameInMap("timeIntervals")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals> timeIntervals;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles setIsAutoRecognition(Boolean isAutoRecognition) {
            this.isAutoRecognition = isAutoRecognition;
            return this;
        }
        public Boolean getIsAutoRecognition() {
            return this.isAutoRecognition;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles setRatio(Float ratio) {
            this.ratio = ratio;
            return this;
        }
        public Float getRatio() {
            return this.ratio;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles setRoleInfo(String roleInfo) {
            this.roleInfo = roleInfo;
            return this;
        }
        public String getRoleInfo() {
            return this.roleInfo;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles setTimeIntervals(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals> timeIntervals) {
            this.timeIntervals = timeIntervals;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRolesTimeIntervals> getTimeIntervals() {
            return this.timeIntervals;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult extends TeaModel {
        @NameInMap("videoRoles")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles> videoRoles;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult setVideoRoles(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles> videoRoles) {
            this.videoRoles = videoRoles;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResultVideoRoles> getVideoRoles() {
            return this.videoRoles;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("generateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage usage;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult setUsage(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResultUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadOutput extends TeaModel {
        @NameInMap("addDatasetDocumentsResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult addDatasetDocumentsResult;

        @NameInMap("resultJsonFileUrl")
        public String resultJsonFileUrl;

        @NameInMap("videoAnalysisResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult videoAnalysisResult;

        @NameInMap("videoCalculatorResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult videoCalculatorResult;

        @NameInMap("videoCaptionResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult videoCaptionResult;

        @NameInMap("videoGenerateResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult videoGenerateResult;

        @NameInMap("videoGenerateResults")
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults> videoGenerateResults;

        @NameInMap("videoMindMappingGenerateResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult videoMindMappingGenerateResult;

        @NameInMap("videoRoleRecognitionResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult videoRoleRecognitionResult;

        @NameInMap("videoTitleGenerateResult")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult videoTitleGenerateResult;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadOutput self = new GetVideoAnalysisTaskResponseBodyDataPayloadOutput();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setAddDatasetDocumentsResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult addDatasetDocumentsResult) {
            this.addDatasetDocumentsResult = addDatasetDocumentsResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputAddDatasetDocumentsResult getAddDatasetDocumentsResult() {
            return this.addDatasetDocumentsResult;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setResultJsonFileUrl(String resultJsonFileUrl) {
            this.resultJsonFileUrl = resultJsonFileUrl;
            return this;
        }
        public String getResultJsonFileUrl() {
            return this.resultJsonFileUrl;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoAnalysisResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult videoAnalysisResult) {
            this.videoAnalysisResult = videoAnalysisResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoAnalysisResult getVideoAnalysisResult() {
            return this.videoAnalysisResult;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoCalculatorResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult videoCalculatorResult) {
            this.videoCalculatorResult = videoCalculatorResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCalculatorResult getVideoCalculatorResult() {
            return this.videoCalculatorResult;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoCaptionResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult videoCaptionResult) {
            this.videoCaptionResult = videoCaptionResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoCaptionResult getVideoCaptionResult() {
            return this.videoCaptionResult;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoGenerateResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult videoGenerateResult) {
            this.videoGenerateResult = videoGenerateResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResult getVideoGenerateResult() {
            return this.videoGenerateResult;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoGenerateResults(java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults> videoGenerateResults) {
            this.videoGenerateResults = videoGenerateResults;
            return this;
        }
        public java.util.List<GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoGenerateResults> getVideoGenerateResults() {
            return this.videoGenerateResults;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoMindMappingGenerateResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult videoMindMappingGenerateResult) {
            this.videoMindMappingGenerateResult = videoMindMappingGenerateResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoMindMappingGenerateResult getVideoMindMappingGenerateResult() {
            return this.videoMindMappingGenerateResult;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoRoleRecognitionResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult videoRoleRecognitionResult) {
            this.videoRoleRecognitionResult = videoRoleRecognitionResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoRoleRecognitionResult getVideoRoleRecognitionResult() {
            return this.videoRoleRecognitionResult;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput setVideoTitleGenerateResult(GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult videoTitleGenerateResult) {
            this.videoTitleGenerateResult = videoTitleGenerateResult;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutputVideoTitleGenerateResult getVideoTitleGenerateResult() {
            return this.videoTitleGenerateResult;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetVideoAnalysisTaskResponseBodyDataPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayloadUsage self = new GetVideoAnalysisTaskResponseBodyDataPayloadUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataPayload extends TeaModel {
        @NameInMap("output")
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput output;

        @NameInMap("usage")
        public GetVideoAnalysisTaskResponseBodyDataPayloadUsage usage;

        public static GetVideoAnalysisTaskResponseBodyDataPayload build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataPayload self = new GetVideoAnalysisTaskResponseBodyDataPayload();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataPayload setOutput(GetVideoAnalysisTaskResponseBodyDataPayloadOutput output) {
            this.output = output;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadOutput getOutput() {
            return this.output;
        }

        public GetVideoAnalysisTaskResponseBodyDataPayload setUsage(GetVideoAnalysisTaskResponseBodyDataPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayloadUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyDataTaskRunInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("concurrentChargeEnable")
        public Boolean concurrentChargeEnable;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("responseTime")
        public Long responseTime;

        public static GetVideoAnalysisTaskResponseBodyDataTaskRunInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyDataTaskRunInfo self = new GetVideoAnalysisTaskResponseBodyDataTaskRunInfo();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyDataTaskRunInfo setConcurrentChargeEnable(Boolean concurrentChargeEnable) {
            this.concurrentChargeEnable = concurrentChargeEnable;
            return this;
        }
        public Boolean getConcurrentChargeEnable() {
            return this.concurrentChargeEnable;
        }

        public GetVideoAnalysisTaskResponseBodyDataTaskRunInfo setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

    }

    public static class GetVideoAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Access was denied, message: No such namespace namespaces/mjp-test-default.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("header")
        public GetVideoAnalysisTaskResponseBodyDataHeader header;

        @NameInMap("payload")
        public GetVideoAnalysisTaskResponseBodyDataPayload payload;

        /**
         * <strong>example:</strong>
         * <p>3feb69ed02d9b1a17d0f1a942675d300</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskRunInfo")
        public GetVideoAnalysisTaskResponseBodyDataTaskRunInfo taskRunInfo;

        /**
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static GetVideoAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisTaskResponseBodyData self = new GetVideoAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoAnalysisTaskResponseBodyData setHeader(GetVideoAnalysisTaskResponseBodyDataHeader header) {
            this.header = header;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataHeader getHeader() {
            return this.header;
        }

        public GetVideoAnalysisTaskResponseBodyData setPayload(GetVideoAnalysisTaskResponseBodyDataPayload payload) {
            this.payload = payload;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataPayload getPayload() {
            return this.payload;
        }

        public GetVideoAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVideoAnalysisTaskResponseBodyData setTaskRunInfo(GetVideoAnalysisTaskResponseBodyDataTaskRunInfo taskRunInfo) {
            this.taskRunInfo = taskRunInfo;
            return this;
        }
        public GetVideoAnalysisTaskResponseBodyDataTaskRunInfo getTaskRunInfo() {
            return this.taskRunInfo;
        }

        public GetVideoAnalysisTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
