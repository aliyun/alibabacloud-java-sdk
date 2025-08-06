// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoCensorJobResponseBody extends TeaModel {
    @NameInMap("AIVideoCensorJobList")
    public ListAIVideoCensorJobResponseBodyAIVideoCensorJobList AIVideoCensorJobList;

    @NameInMap("NonExistAIVideoCensorJobIds")
    public ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds nonExistAIVideoCensorJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoCensorJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCensorJobResponseBody self = new ListAIVideoCensorJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoCensorJobResponseBody setAIVideoCensorJobList(ListAIVideoCensorJobResponseBodyAIVideoCensorJobList AIVideoCensorJobList) {
        this.AIVideoCensorJobList = AIVideoCensorJobList;
        return this;
    }
    public ListAIVideoCensorJobResponseBodyAIVideoCensorJobList getAIVideoCensorJobList() {
        return this.AIVideoCensorJobList;
    }

    public ListAIVideoCensorJobResponseBody setNonExistAIVideoCensorJobIds(ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds nonExistAIVideoCensorJobIds) {
        this.nonExistAIVideoCensorJobIds = nonExistAIVideoCensorJobIds;
        return this;
    }
    public ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds getNonExistAIVideoCensorJobIds() {
        return this.nonExistAIVideoCensorJobIds;
    }

    public ListAIVideoCensorJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob extends TeaModel {
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

        public static ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob self = new ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoCensorJobResponseBodyAIVideoCensorJobList extends TeaModel {
        @NameInMap("AIVideoCensorJob")
        public java.util.List<ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob> AIVideoCensorJob;

        public static ListAIVideoCensorJobResponseBodyAIVideoCensorJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCensorJobResponseBodyAIVideoCensorJobList self = new ListAIVideoCensorJobResponseBodyAIVideoCensorJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCensorJobResponseBodyAIVideoCensorJobList setAIVideoCensorJob(java.util.List<ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob> AIVideoCensorJob) {
            this.AIVideoCensorJob = AIVideoCensorJob;
            return this;
        }
        public java.util.List<ListAIVideoCensorJobResponseBodyAIVideoCensorJobListAIVideoCensorJob> getAIVideoCensorJob() {
            return this.AIVideoCensorJob;
        }

    }

    public static class ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds self = new ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCensorJobResponseBodyNonExistAIVideoCensorJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
