// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsResponseBody extends TeaModel {
    @NameInMap("MediaRefreshJobs")
    public java.util.List<GetMediaRefreshJobsResponseBodyMediaRefreshJobs> mediaRefreshJobs;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaRefreshJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaRefreshJobsResponseBody self = new GetMediaRefreshJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaRefreshJobsResponseBody setMediaRefreshJobs(java.util.List<GetMediaRefreshJobsResponseBodyMediaRefreshJobs> mediaRefreshJobs) {
        this.mediaRefreshJobs = mediaRefreshJobs;
        return this;
    }
    public java.util.List<GetMediaRefreshJobsResponseBodyMediaRefreshJobs> getMediaRefreshJobs() {
        return this.mediaRefreshJobs;
    }

    public GetMediaRefreshJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaRefreshJobsResponseBodyMediaRefreshJobs extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FilterPolicy")
        public String filterPolicy;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaRefreshJobId")
        public String mediaRefreshJobId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuccessPlayUrls")
        public String successPlayUrls;

        @NameInMap("TaskIds")
        public String taskIds;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("UserData")
        public String userData;

        public static GetMediaRefreshJobsResponseBodyMediaRefreshJobs build(java.util.Map<String, ?> map) throws Exception {
            GetMediaRefreshJobsResponseBodyMediaRefreshJobs self = new GetMediaRefreshJobsResponseBodyMediaRefreshJobs();
            return TeaModel.build(map, self);
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setFilterPolicy(String filterPolicy) {
            this.filterPolicy = filterPolicy;
            return this;
        }
        public String getFilterPolicy() {
            return this.filterPolicy;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setMediaRefreshJobId(String mediaRefreshJobId) {
            this.mediaRefreshJobId = mediaRefreshJobId;
            return this;
        }
        public String getMediaRefreshJobId() {
            return this.mediaRefreshJobId;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setSuccessPlayUrls(String successPlayUrls) {
            this.successPlayUrls = successPlayUrls;
            return this;
        }
        public String getSuccessPlayUrls() {
            return this.successPlayUrls;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setTaskIds(String taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public String getTaskIds() {
            return this.taskIds;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
