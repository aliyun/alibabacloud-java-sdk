// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class GetTaskInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTaskInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>35124E1C-AE99-5D6C-A52E-BD689D8D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInfoResponseBody self = new GetTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskInfoResponseBody setData(GetTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTaskInfoResponseBodyDataResult extends TeaModel {
        @NameInMap("AutoChapters")
        public String autoChapters;

        @NameInMap("ContentExtraction")
        public String contentExtraction;

        @NameInMap("CustomPrompt")
        public String customPrompt;

        @NameInMap("IdentityRecognition")
        public String identityRecognition;

        @NameInMap("MeetingAssistance")
        public String meetingAssistance;

        @NameInMap("PptExtraction")
        public String pptExtraction;

        @NameInMap("ServiceInspection")
        public String serviceInspection;

        @NameInMap("Summarization")
        public String summarization;

        @NameInMap("TextPolish")
        public String textPolish;

        @NameInMap("Transcription")
        public String transcription;

        @NameInMap("Translation")
        public String translation;

        public static GetTaskInfoResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInfoResponseBodyDataResult self = new GetTaskInfoResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetTaskInfoResponseBodyDataResult setAutoChapters(String autoChapters) {
            this.autoChapters = autoChapters;
            return this;
        }
        public String getAutoChapters() {
            return this.autoChapters;
        }

        public GetTaskInfoResponseBodyDataResult setContentExtraction(String contentExtraction) {
            this.contentExtraction = contentExtraction;
            return this;
        }
        public String getContentExtraction() {
            return this.contentExtraction;
        }

        public GetTaskInfoResponseBodyDataResult setCustomPrompt(String customPrompt) {
            this.customPrompt = customPrompt;
            return this;
        }
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        public GetTaskInfoResponseBodyDataResult setIdentityRecognition(String identityRecognition) {
            this.identityRecognition = identityRecognition;
            return this;
        }
        public String getIdentityRecognition() {
            return this.identityRecognition;
        }

        public GetTaskInfoResponseBodyDataResult setMeetingAssistance(String meetingAssistance) {
            this.meetingAssistance = meetingAssistance;
            return this;
        }
        public String getMeetingAssistance() {
            return this.meetingAssistance;
        }

        public GetTaskInfoResponseBodyDataResult setPptExtraction(String pptExtraction) {
            this.pptExtraction = pptExtraction;
            return this;
        }
        public String getPptExtraction() {
            return this.pptExtraction;
        }

        public GetTaskInfoResponseBodyDataResult setServiceInspection(String serviceInspection) {
            this.serviceInspection = serviceInspection;
            return this;
        }
        public String getServiceInspection() {
            return this.serviceInspection;
        }

        public GetTaskInfoResponseBodyDataResult setSummarization(String summarization) {
            this.summarization = summarization;
            return this;
        }
        public String getSummarization() {
            return this.summarization;
        }

        public GetTaskInfoResponseBodyDataResult setTextPolish(String textPolish) {
            this.textPolish = textPolish;
            return this;
        }
        public String getTextPolish() {
            return this.textPolish;
        }

        public GetTaskInfoResponseBodyDataResult setTranscription(String transcription) {
            this.transcription = transcription;
            return this;
        }
        public String getTranscription() {
            return this.transcription;
        }

        public GetTaskInfoResponseBodyDataResult setTranslation(String translation) {
            this.translation = translation;
            return this;
        }
        public String getTranslation() {
            return this.translation;
        }

    }

    public static class GetTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("OutputMp3Path")
        public String outputMp3Path;

        @NameInMap("OutputMp4Path")
        public String outputMp4Path;

        @NameInMap("OutputSpectrumPath")
        public String outputSpectrumPath;

        @NameInMap("OutputThumbnailPath")
        public String outputThumbnailPath;

        @NameInMap("Result")
        public GetTaskInfoResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>c5394c6ee0fb474899d42215a3925c7e</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>task_tingwu_123</p>
         */
        @NameInMap("TaskKey")
        public String taskKey;

        /**
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInfoResponseBodyData self = new GetTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskInfoResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTaskInfoResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTaskInfoResponseBodyData setOutputMp3Path(String outputMp3Path) {
            this.outputMp3Path = outputMp3Path;
            return this;
        }
        public String getOutputMp3Path() {
            return this.outputMp3Path;
        }

        public GetTaskInfoResponseBodyData setOutputMp4Path(String outputMp4Path) {
            this.outputMp4Path = outputMp4Path;
            return this;
        }
        public String getOutputMp4Path() {
            return this.outputMp4Path;
        }

        public GetTaskInfoResponseBodyData setOutputSpectrumPath(String outputSpectrumPath) {
            this.outputSpectrumPath = outputSpectrumPath;
            return this;
        }
        public String getOutputSpectrumPath() {
            return this.outputSpectrumPath;
        }

        public GetTaskInfoResponseBodyData setOutputThumbnailPath(String outputThumbnailPath) {
            this.outputThumbnailPath = outputThumbnailPath;
            return this;
        }
        public String getOutputThumbnailPath() {
            return this.outputThumbnailPath;
        }

        public GetTaskInfoResponseBodyData setResult(GetTaskInfoResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GetTaskInfoResponseBodyDataResult getResult() {
            return this.result;
        }

        public GetTaskInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskInfoResponseBodyData setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

        public GetTaskInfoResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
