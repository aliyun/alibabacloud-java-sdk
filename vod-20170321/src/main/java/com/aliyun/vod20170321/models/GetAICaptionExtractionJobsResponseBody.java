// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAICaptionExtractionJobsResponseBody extends TeaModel {
    @NameInMap("AICaptionExtractionJobList")
    public java.util.List<GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList> AICaptionExtractionJobList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAICaptionExtractionJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICaptionExtractionJobsResponseBody self = new GetAICaptionExtractionJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICaptionExtractionJobsResponseBody setAICaptionExtractionJobList(java.util.List<GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList> AICaptionExtractionJobList) {
        this.AICaptionExtractionJobList = AICaptionExtractionJobList;
        return this;
    }
    public java.util.List<GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList> getAICaptionExtractionJobList() {
        return this.AICaptionExtractionJobList;
    }

    public GetAICaptionExtractionJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList extends TeaModel {
        @NameInMap("AICaptionExtractionResult")
        public String AICaptionExtractionResult;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VideoId")
        public String videoId;

        public static GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList build(java.util.Map<String, ?> map) throws Exception {
            GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList self = new GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList();
            return TeaModel.build(map, self);
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setAICaptionExtractionResult(String AICaptionExtractionResult) {
            this.AICaptionExtractionResult = AICaptionExtractionResult;
            return this;
        }
        public String getAICaptionExtractionResult() {
            return this.AICaptionExtractionResult;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetAICaptionExtractionJobsResponseBodyAICaptionExtractionJobList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
