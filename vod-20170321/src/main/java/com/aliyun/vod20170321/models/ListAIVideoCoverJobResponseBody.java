// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoCoverJobResponseBody extends TeaModel {
    @NameInMap("AIVideoCoverJobList")
    public ListAIVideoCoverJobResponseBodyAIVideoCoverJobList AIVideoCoverJobList;

    @NameInMap("NonExistAIVideoCoverJobIds")
    public ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds nonExistAIVideoCoverJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoCoverJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCoverJobResponseBody self = new ListAIVideoCoverJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoCoverJobResponseBody setAIVideoCoverJobList(ListAIVideoCoverJobResponseBodyAIVideoCoverJobList AIVideoCoverJobList) {
        this.AIVideoCoverJobList = AIVideoCoverJobList;
        return this;
    }
    public ListAIVideoCoverJobResponseBodyAIVideoCoverJobList getAIVideoCoverJobList() {
        return this.AIVideoCoverJobList;
    }

    public ListAIVideoCoverJobResponseBody setNonExistAIVideoCoverJobIds(ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds nonExistAIVideoCoverJobIds) {
        this.nonExistAIVideoCoverJobIds = nonExistAIVideoCoverJobIds;
        return this;
    }
    public ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds getNonExistAIVideoCoverJobIds() {
        return this.nonExistAIVideoCoverJobIds;
    }

    public ListAIVideoCoverJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob extends TeaModel {
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

        public static ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob self = new ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoCoverJobResponseBodyAIVideoCoverJobList extends TeaModel {
        @NameInMap("AIVideoCoverJob")
        public java.util.List<ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob> AIVideoCoverJob;

        public static ListAIVideoCoverJobResponseBodyAIVideoCoverJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCoverJobResponseBodyAIVideoCoverJobList self = new ListAIVideoCoverJobResponseBodyAIVideoCoverJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCoverJobResponseBodyAIVideoCoverJobList setAIVideoCoverJob(java.util.List<ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob> AIVideoCoverJob) {
            this.AIVideoCoverJob = AIVideoCoverJob;
            return this;
        }
        public java.util.List<ListAIVideoCoverJobResponseBodyAIVideoCoverJobListAIVideoCoverJob> getAIVideoCoverJob() {
            return this.AIVideoCoverJob;
        }

    }

    public static class ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds self = new ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoCoverJobResponseBodyNonExistAIVideoCoverJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
