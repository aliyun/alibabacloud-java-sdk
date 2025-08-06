// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoCategoryJobResponseBody extends TeaModel {
    @NameInMap("AIVideoCategoryJobList")
    public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList AIVideoCategoryJobList;

    @NameInMap("NonExistAIVideoCategoryJobIds")
    public ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds nonExistAIVideoCategoryJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoCategoryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCategoryJobResponseBody self = new ListAIVideoCategoryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoCategoryJobResponseBody setAIVideoCategoryJobList(ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList AIVideoCategoryJobList) {
        this.AIVideoCategoryJobList = AIVideoCategoryJobList;
        return this;
    }
    public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList getAIVideoCategoryJobList() {
        return this.AIVideoCategoryJobList;
    }

    public ListAIVideoCategoryJobResponseBody setNonExistAIVideoCategoryJobIds(ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds nonExistAIVideoCategoryJobIds) {
        this.nonExistAIVideoCategoryJobIds = nonExistAIVideoCategoryJobIds;
        return this;
    }
    public ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds getNonExistAIVideoCategoryJobIds() {
        return this.nonExistAIVideoCategoryJobIds;
    }

    public ListAIVideoCategoryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Data")
        public String data;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        public static ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob self = new ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList extends TeaModel {
        @NameInMap("AIVideoCategoryJob")
        public java.util.List<ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob> AIVideoCategoryJob;

        public static ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList self = new ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobList setAIVideoCategoryJob(java.util.List<ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob> AIVideoCategoryJob) {
            this.AIVideoCategoryJob = AIVideoCategoryJob;
            return this;
        }
        public java.util.List<ListAIVideoCategoryJobResponseBodyAIVideoCategoryJobListAIVideoCategoryJob> getAIVideoCategoryJob() {
            return this.AIVideoCategoryJob;
        }

    }

    public static class ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds self = new ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCategoryJobResponseBodyNonExistAIVideoCategoryJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
