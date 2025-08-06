// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoTagJobResponseBody extends TeaModel {
    @NameInMap("AIVideoTagJobList")
    public ListAIVideoTagJobResponseBodyAIVideoTagJobList AIVideoTagJobList;

    @NameInMap("NonExistAIVideoTagJobIds")
    public ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds nonExistAIVideoTagJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoTagJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoTagJobResponseBody self = new ListAIVideoTagJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoTagJobResponseBody setAIVideoTagJobList(ListAIVideoTagJobResponseBodyAIVideoTagJobList AIVideoTagJobList) {
        this.AIVideoTagJobList = AIVideoTagJobList;
        return this;
    }
    public ListAIVideoTagJobResponseBodyAIVideoTagJobList getAIVideoTagJobList() {
        return this.AIVideoTagJobList;
    }

    public ListAIVideoTagJobResponseBody setNonExistAIVideoTagJobIds(ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds nonExistAIVideoTagJobIds) {
        this.nonExistAIVideoTagJobIds = nonExistAIVideoTagJobIds;
        return this;
    }
    public ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds getNonExistAIVideoTagJobIds() {
        return this.nonExistAIVideoTagJobIds;
    }

    public ListAIVideoTagJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob extends TeaModel {
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

        public static ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob self = new ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoTagJobResponseBodyAIVideoTagJobList extends TeaModel {
        @NameInMap("AIVideoTagJob")
        public java.util.List<ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob> AIVideoTagJob;

        public static ListAIVideoTagJobResponseBodyAIVideoTagJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTagJobResponseBodyAIVideoTagJobList self = new ListAIVideoTagJobResponseBodyAIVideoTagJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoTagJobResponseBodyAIVideoTagJobList setAIVideoTagJob(java.util.List<ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob> AIVideoTagJob) {
            this.AIVideoTagJob = AIVideoTagJob;
            return this;
        }
        public java.util.List<ListAIVideoTagJobResponseBodyAIVideoTagJobListAIVideoTagJob> getAIVideoTagJob() {
            return this.AIVideoTagJob;
        }

    }

    public static class ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds self = new ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoTagJobResponseBodyNonExistAIVideoTagJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
