// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class GetTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTaskInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

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

        @NameInMap("MeetingAssistance")
        public String meetingAssistance;

        @NameInMap("PptExtraction")
        public String pptExtraction;

        @NameInMap("Summarization")
        public String summarization;

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

        public GetTaskInfoResponseBodyDataResult setSummarization(String summarization) {
            this.summarization = summarization;
            return this;
        }
        public String getSummarization() {
            return this.summarization;
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

        @NameInMap("Result")
        public GetTaskInfoResponseBodyDataResult result;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskKey")
        public String taskKey;

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
