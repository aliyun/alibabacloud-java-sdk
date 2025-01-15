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

    public static class RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResultUsage extends TeaModel {
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
        /**
         * <strong>example:</strong>
         * <p>http://</p>
         */
        @NameInMap("resultJsonFileUrl")
        public String resultJsonFileUrl;

        @NameInMap("videoAnalysisResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoAnalysisResult videoAnalysisResult;

        @NameInMap("videoCaptionResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoCaptionResult videoCaptionResult;

        @NameInMap("videoGenerateResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoGenerateResult videoGenerateResult;

        @NameInMap("videoMindMappingGenerateResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult videoMindMappingGenerateResult;

        @NameInMap("videoShotSnapshotResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoShotSnapshotResult videoShotSnapshotResult;

        @NameInMap("videoTitleGenerateResult")
        public RunVideoAnalysisResponseBodyPayloadOutputVideoTitleGenerateResult videoTitleGenerateResult;

        public static RunVideoAnalysisResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunVideoAnalysisResponseBodyPayloadOutput self = new RunVideoAnalysisResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
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

        public RunVideoAnalysisResponseBodyPayloadOutput setVideoMindMappingGenerateResult(RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult videoMindMappingGenerateResult) {
            this.videoMindMappingGenerateResult = videoMindMappingGenerateResult;
            return this;
        }
        public RunVideoAnalysisResponseBodyPayloadOutputVideoMindMappingGenerateResult getVideoMindMappingGenerateResult() {
            return this.videoMindMappingGenerateResult;
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
