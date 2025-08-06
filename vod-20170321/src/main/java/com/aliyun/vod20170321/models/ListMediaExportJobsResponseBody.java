// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaExportJobsResponseBody extends TeaModel {
    @NameInMap("MediaExportJobList")
    public java.util.List<ListMediaExportJobsResponseBodyMediaExportJobList> mediaExportJobList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListMediaExportJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaExportJobsResponseBody self = new ListMediaExportJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaExportJobsResponseBody setMediaExportJobList(java.util.List<ListMediaExportJobsResponseBodyMediaExportJobList> mediaExportJobList) {
        this.mediaExportJobList = mediaExportJobList;
        return this;
    }
    public java.util.List<ListMediaExportJobsResponseBodyMediaExportJobList> getMediaExportJobList() {
        return this.mediaExportJobList;
    }

    public ListMediaExportJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaExportJobsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListMediaExportJobsResponseBodyMediaExportJobList extends TeaModel {
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

        public static ListMediaExportJobsResponseBodyMediaExportJobList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaExportJobsResponseBodyMediaExportJobList self = new ListMediaExportJobsResponseBodyMediaExportJobList();
            return TeaModel.build(map, self);
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setSortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        public String getSortBy() {
            return this.sortBy;
        }

        public ListMediaExportJobsResponseBodyMediaExportJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
