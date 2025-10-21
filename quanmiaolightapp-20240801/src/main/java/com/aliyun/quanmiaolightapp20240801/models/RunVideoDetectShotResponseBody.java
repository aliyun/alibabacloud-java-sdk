// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunVideoDetectShotResponseBody extends TeaModel {
    @NameInMap("header")
    public RunVideoDetectShotResponseBodyHeader header;

    @NameInMap("payload")
    public RunVideoDetectShotResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>58868FD6-53D7-5ACD-80F7-854C8EA256EF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunVideoDetectShotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunVideoDetectShotResponseBody self = new RunVideoDetectShotResponseBody();
        return TeaModel.build(map, self);
    }

    public RunVideoDetectShotResponseBody setHeader(RunVideoDetectShotResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunVideoDetectShotResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunVideoDetectShotResponseBody setPayload(RunVideoDetectShotResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunVideoDetectShotResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunVideoDetectShotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunVideoDetectShotResponseBodyHeader extends TeaModel {
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
         * <p>task-finished</p>
         */
        @NameInMap("event")
        public String event;

        @NameInMap("eventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>14d15c78c4c34d428212f4d923d4ede1</p>
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
         * <p>3b5287b317477940746851672dca0c</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunVideoDetectShotResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunVideoDetectShotResponseBodyHeader self = new RunVideoDetectShotResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunVideoDetectShotResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunVideoDetectShotResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunVideoDetectShotResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunVideoDetectShotResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunVideoDetectShotResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunVideoDetectShotResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunVideoDetectShotResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("asr")
        public String asr;

        /**
         * <strong>example:</strong>
         * <p>1755742611000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ocr")
        public String ocr;

        /**
         * <strong>example:</strong>
         * <p>1756433675000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("vl")
        public String vl;

        public static RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult self = new RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult();
            return TeaModel.build(map, self);
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult setAsr(String asr) {
            this.asr = asr;
            return this;
        }
        public String getAsr() {
            return this.asr;
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult setOcr(String ocr) {
            this.ocr = ocr;
            return this;
        }
        public String getOcr() {
            return this.ocr;
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult setVl(String vl) {
            this.vl = vl;
            return this;
        }
        public String getVl() {
            return this.vl;
        }

    }

    public static class RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("reasonText")
        public String reasonText;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("text")
        public String text;

        @NameInMap("videoParts")
        public java.util.List<java.util.Map<String, String>> videoParts;

        @NameInMap("videoRecognitionResult")
        public java.util.List<RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult> videoRecognitionResult;

        public static RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult build(java.util.Map<String, ?> map) throws Exception {
            RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult self = new RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult();
            return TeaModel.build(map, self);
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult setReasonText(String reasonText) {
            this.reasonText = reasonText;
            return this;
        }
        public String getReasonText() {
            return this.reasonText;
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult setVideoParts(java.util.List<java.util.Map<String, String>> videoParts) {
            this.videoParts = videoParts;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getVideoParts() {
            return this.videoParts;
        }

        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult setVideoRecognitionResult(java.util.List<RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult> videoRecognitionResult) {
            this.videoRecognitionResult = videoRecognitionResult;
            return this;
        }
        public java.util.List<RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResultVideoRecognitionResult> getVideoRecognitionResult() {
            return this.videoRecognitionResult;
        }

    }

    public static class RunVideoDetectShotResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("videoSplitResult")
        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult videoSplitResult;

        public static RunVideoDetectShotResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunVideoDetectShotResponseBodyPayloadOutput self = new RunVideoDetectShotResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunVideoDetectShotResponseBodyPayloadOutput setVideoSplitResult(RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult videoSplitResult) {
            this.videoSplitResult = videoSplitResult;
            return this;
        }
        public RunVideoDetectShotResponseBodyPayloadOutputVideoSplitResult getVideoSplitResult() {
            return this.videoSplitResult;
        }

    }

    public static class RunVideoDetectShotResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4546</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>820</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>5366</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunVideoDetectShotResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoDetectShotResponseBodyPayloadUsage self = new RunVideoDetectShotResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoDetectShotResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoDetectShotResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoDetectShotResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoDetectShotResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunVideoDetectShotResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunVideoDetectShotResponseBodyPayloadUsage usage;

        public static RunVideoDetectShotResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunVideoDetectShotResponseBodyPayload self = new RunVideoDetectShotResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunVideoDetectShotResponseBodyPayload setOutput(RunVideoDetectShotResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunVideoDetectShotResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunVideoDetectShotResponseBodyPayload setUsage(RunVideoDetectShotResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoDetectShotResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
