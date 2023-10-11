// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryDigitalHumanProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryDigitalHumanProjectResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDigitalHumanProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalHumanProjectResponseBody self = new QueryDigitalHumanProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDigitalHumanProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDigitalHumanProjectResponseBody setData(java.util.List<QueryDigitalHumanProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDigitalHumanProjectResponseBodyData> getData() {
        return this.data;
    }

    public QueryDigitalHumanProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDigitalHumanProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDigitalHumanProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDigitalHumanProjectResponseBodyData extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EstimatedDuration")
        public Integer estimatedDuration;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("RunningTime")
        public String runningTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubtitleUrl")
        public String subtitleUrl;

        @NameInMap("Title")
        public String title;

        @NameInMap("VideoLength")
        public Integer videoLength;

        @NameInMap("WaitingTime")
        public Integer waitingTime;

        public static QueryDigitalHumanProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalHumanProjectResponseBodyData self = new QueryDigitalHumanProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDigitalHumanProjectResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryDigitalHumanProjectResponseBodyData setEstimatedDuration(Integer estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Integer getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public QueryDigitalHumanProjectResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public QueryDigitalHumanProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDigitalHumanProjectResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public QueryDigitalHumanProjectResponseBodyData setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public QueryDigitalHumanProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDigitalHumanProjectResponseBodyData setSubtitleUrl(String subtitleUrl) {
            this.subtitleUrl = subtitleUrl;
            return this;
        }
        public String getSubtitleUrl() {
            return this.subtitleUrl;
        }

        public QueryDigitalHumanProjectResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryDigitalHumanProjectResponseBodyData setVideoLength(Integer videoLength) {
            this.videoLength = videoLength;
            return this;
        }
        public Integer getVideoLength() {
            return this.videoLength;
        }

        public QueryDigitalHumanProjectResponseBodyData setWaitingTime(Integer waitingTime) {
            this.waitingTime = waitingTime;
            return this;
        }
        public Integer getWaitingTime() {
            return this.waitingTime;
        }

    }

}
