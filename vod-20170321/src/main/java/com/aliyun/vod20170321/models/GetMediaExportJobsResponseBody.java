// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaExportJobsResponseBody extends TeaModel {
    @NameInMap("FailedJobIds")
    public java.util.List<String> failedJobIds;

    @NameInMap("MediaExportJobList")
    public java.util.List<GetMediaExportJobsResponseBodyMediaExportJobList> mediaExportJobList;

    @NameInMap("NonExistJobIds")
    public java.util.List<String> nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaExportJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaExportJobsResponseBody self = new GetMediaExportJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaExportJobsResponseBody setFailedJobIds(java.util.List<String> failedJobIds) {
        this.failedJobIds = failedJobIds;
        return this;
    }
    public java.util.List<String> getFailedJobIds() {
        return this.failedJobIds;
    }

    public GetMediaExportJobsResponseBody setMediaExportJobList(java.util.List<GetMediaExportJobsResponseBodyMediaExportJobList> mediaExportJobList) {
        this.mediaExportJobList = mediaExportJobList;
        return this;
    }
    public java.util.List<GetMediaExportJobsResponseBodyMediaExportJobList> getMediaExportJobList() {
        return this.mediaExportJobList;
    }

    public GetMediaExportJobsResponseBody setNonExistJobIds(java.util.List<String> nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public java.util.List<String> getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public GetMediaExportJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaExportJobsResponseBodyMediaExportJobList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Match")
        public String match;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("SortBy")
        public String sortBy;

        @NameInMap("Status")
        public String status;

        public static GetMediaExportJobsResponseBodyMediaExportJobList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaExportJobsResponseBodyMediaExportJobList self = new GetMediaExportJobsResponseBodyMediaExportJobList();
            return TeaModel.build(map, self);
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setSortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        public String getSortBy() {
            return this.sortBy;
        }

        public GetMediaExportJobsResponseBodyMediaExportJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
