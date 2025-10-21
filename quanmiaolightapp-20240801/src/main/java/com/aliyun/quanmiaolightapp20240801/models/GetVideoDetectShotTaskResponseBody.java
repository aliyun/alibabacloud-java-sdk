// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoDetectShotTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetVideoDetectShotTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetVideoDetectShotTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDetectShotTaskResponseBody self = new GetVideoDetectShotTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoDetectShotTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoDetectShotTaskResponseBody setData(GetVideoDetectShotTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVideoDetectShotTaskResponseBodyData getData() {
        return this.data;
    }

    public GetVideoDetectShotTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVideoDetectShotTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoDetectShotTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoDetectShotTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVideoDetectShotTaskResponseBodyDataHeader extends TeaModel {
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

        public static GetVideoDetectShotTaskResponseBodyDataHeader build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyDataHeader self = new GetVideoDetectShotTaskResponseBodyDataHeader();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyDataHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetVideoDetectShotTaskResponseBodyDataHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoDetectShotTaskResponseBodyDataHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetVideoDetectShotTaskResponseBodyDataHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public GetVideoDetectShotTaskResponseBodyDataHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetVideoDetectShotTaskResponseBodyDataHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVideoDetectShotTaskResponseBodyDataHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("asr")
        public String asr;

        /**
         * <strong>example:</strong>
         * <p>1748483740000</p>
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
         * <p>1758108425000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("vl")
        public String vl;

        public static GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult self = new GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult setAsr(String asr) {
            this.asr = asr;
            return this;
        }
        public String getAsr() {
            return this.asr;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult setOcr(String ocr) {
            this.ocr = ocr;
            return this;
        }
        public String getOcr() {
            return this.ocr;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult setVl(String vl) {
            this.vl = vl;
            return this;
        }
        public String getVl() {
            return this.vl;
        }

    }

    public static class GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult extends TeaModel {
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
        public java.util.List<GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult> videoRecognitionResult;

        public static GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult self = new GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult setReasonText(String reasonText) {
            this.reasonText = reasonText;
            return this;
        }
        public String getReasonText() {
            return this.reasonText;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult setVideoParts(java.util.List<java.util.Map<String, String>> videoParts) {
            this.videoParts = videoParts;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getVideoParts() {
            return this.videoParts;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult setVideoRecognitionResult(java.util.List<GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult> videoRecognitionResult) {
            this.videoRecognitionResult = videoRecognitionResult;
            return this;
        }
        public java.util.List<GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResultVideoRecognitionResult> getVideoRecognitionResult() {
            return this.videoRecognitionResult;
        }

    }

    public static class GetVideoDetectShotTaskResponseBodyDataPayloadOutput extends TeaModel {
        @NameInMap("videoSplitResult")
        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult videoSplitResult;

        public static GetVideoDetectShotTaskResponseBodyDataPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyDataPayloadOutput self = new GetVideoDetectShotTaskResponseBodyDataPayloadOutput();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadOutput setVideoSplitResult(GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult videoSplitResult) {
            this.videoSplitResult = videoSplitResult;
            return this;
        }
        public GetVideoDetectShotTaskResponseBodyDataPayloadOutputVideoSplitResult getVideoSplitResult() {
            return this.videoSplitResult;
        }

    }

    public static class GetVideoDetectShotTaskResponseBodyDataPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetVideoDetectShotTaskResponseBodyDataPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyDataPayloadUsage self = new GetVideoDetectShotTaskResponseBodyDataPayloadUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetVideoDetectShotTaskResponseBodyDataPayload extends TeaModel {
        @NameInMap("output")
        public GetVideoDetectShotTaskResponseBodyDataPayloadOutput output;

        @NameInMap("usage")
        public GetVideoDetectShotTaskResponseBodyDataPayloadUsage usage;

        public static GetVideoDetectShotTaskResponseBodyDataPayload build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyDataPayload self = new GetVideoDetectShotTaskResponseBodyDataPayload();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyDataPayload setOutput(GetVideoDetectShotTaskResponseBodyDataPayloadOutput output) {
            this.output = output;
            return this;
        }
        public GetVideoDetectShotTaskResponseBodyDataPayloadOutput getOutput() {
            return this.output;
        }

        public GetVideoDetectShotTaskResponseBodyDataPayload setUsage(GetVideoDetectShotTaskResponseBodyDataPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetVideoDetectShotTaskResponseBodyDataPayloadUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetVideoDetectShotTaskResponseBodyDataTaskRunInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("concurrentChargeEnable")
        public Boolean concurrentChargeEnable;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("responseTime")
        public Long responseTime;

        public static GetVideoDetectShotTaskResponseBodyDataTaskRunInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyDataTaskRunInfo self = new GetVideoDetectShotTaskResponseBodyDataTaskRunInfo();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyDataTaskRunInfo setConcurrentChargeEnable(Boolean concurrentChargeEnable) {
            this.concurrentChargeEnable = concurrentChargeEnable;
            return this;
        }
        public Boolean getConcurrentChargeEnable() {
            return this.concurrentChargeEnable;
        }

        public GetVideoDetectShotTaskResponseBodyDataTaskRunInfo setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

    }

    public static class GetVideoDetectShotTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Failed to proxy flink ui request, message: An error occurred: Invalid UUID string: jobsn.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("header")
        public GetVideoDetectShotTaskResponseBodyDataHeader header;

        @NameInMap("payload")
        public GetVideoDetectShotTaskResponseBodyDataPayload payload;

        /**
         * <strong>example:</strong>
         * <p>3feb69ed02d9b1a17d0f1a942675d300</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskRunInfo")
        public GetVideoDetectShotTaskResponseBodyDataTaskRunInfo taskRunInfo;

        /**
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static GetVideoDetectShotTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotTaskResponseBodyData self = new GetVideoDetectShotTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoDetectShotTaskResponseBodyData setHeader(GetVideoDetectShotTaskResponseBodyDataHeader header) {
            this.header = header;
            return this;
        }
        public GetVideoDetectShotTaskResponseBodyDataHeader getHeader() {
            return this.header;
        }

        public GetVideoDetectShotTaskResponseBodyData setPayload(GetVideoDetectShotTaskResponseBodyDataPayload payload) {
            this.payload = payload;
            return this;
        }
        public GetVideoDetectShotTaskResponseBodyDataPayload getPayload() {
            return this.payload;
        }

        public GetVideoDetectShotTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVideoDetectShotTaskResponseBodyData setTaskRunInfo(GetVideoDetectShotTaskResponseBodyDataTaskRunInfo taskRunInfo) {
            this.taskRunInfo = taskRunInfo;
            return this;
        }
        public GetVideoDetectShotTaskResponseBodyDataTaskRunInfo getTaskRunInfo() {
            return this.taskRunInfo;
        }

        public GetVideoDetectShotTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
