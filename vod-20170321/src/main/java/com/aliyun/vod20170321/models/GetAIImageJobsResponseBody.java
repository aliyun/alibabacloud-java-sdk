// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIImageJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AIImageJobList")
    public java.util.List<GetAIImageJobsResponseBodyAIImageJobList> AIImageJobList;

    public static GetAIImageJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIImageJobsResponseBody self = new GetAIImageJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIImageJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIImageJobsResponseBody setAIImageJobList(java.util.List<GetAIImageJobsResponseBodyAIImageJobList> AIImageJobList) {
        this.AIImageJobList = AIImageJobList;
        return this;
    }
    public java.util.List<GetAIImageJobsResponseBodyAIImageJobList> getAIImageJobList() {
        return this.AIImageJobList;
    }

    public static class GetAIImageJobsResponseBodyAIImageJobList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("AIImageResult")
        public String AIImageResult;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetAIImageJobsResponseBodyAIImageJobList build(java.util.Map<String, ?> map) throws Exception {
            GetAIImageJobsResponseBodyAIImageJobList self = new GetAIImageJobsResponseBodyAIImageJobList();
            return TeaModel.build(map, self);
        }

        public GetAIImageJobsResponseBodyAIImageJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setAIImageResult(String AIImageResult) {
            this.AIImageResult = AIImageResult;
            return this;
        }
        public String getAIImageResult() {
            return this.AIImageResult;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
