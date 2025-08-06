// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIASRJobResponseBody extends TeaModel {
    @NameInMap("AIASRJobList")
    public ListAIASRJobResponseBodyAIASRJobList AIASRJobList;

    @NameInMap("NonExistAIASRJobIds")
    public ListAIASRJobResponseBodyNonExistAIASRJobIds nonExistAIASRJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIASRJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIASRJobResponseBody self = new ListAIASRJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIASRJobResponseBody setAIASRJobList(ListAIASRJobResponseBodyAIASRJobList AIASRJobList) {
        this.AIASRJobList = AIASRJobList;
        return this;
    }
    public ListAIASRJobResponseBodyAIASRJobList getAIASRJobList() {
        return this.AIASRJobList;
    }

    public ListAIASRJobResponseBody setNonExistAIASRJobIds(ListAIASRJobResponseBodyNonExistAIASRJobIds nonExistAIASRJobIds) {
        this.nonExistAIASRJobIds = nonExistAIASRJobIds;
        return this;
    }
    public ListAIASRJobResponseBodyNonExistAIASRJobIds getNonExistAIASRJobIds() {
        return this.nonExistAIASRJobIds;
    }

    public ListAIASRJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIASRJobResponseBodyAIASRJobListAIASRJob extends TeaModel {
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

        public static ListAIASRJobResponseBodyAIASRJobListAIASRJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIASRJobResponseBodyAIASRJobListAIASRJob self = new ListAIASRJobResponseBodyAIASRJobListAIASRJob();
            return TeaModel.build(map, self);
        }

        public ListAIASRJobResponseBodyAIASRJobListAIASRJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIASRJobResponseBodyAIASRJobListAIASRJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIASRJobResponseBodyAIASRJobListAIASRJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIASRJobResponseBodyAIASRJobListAIASRJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIASRJobResponseBodyAIASRJobListAIASRJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIASRJobResponseBodyAIASRJobListAIASRJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIASRJobResponseBodyAIASRJobListAIASRJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIASRJobResponseBodyAIASRJobList extends TeaModel {
        @NameInMap("AIASRJob")
        public java.util.List<ListAIASRJobResponseBodyAIASRJobListAIASRJob> AIASRJob;

        public static ListAIASRJobResponseBodyAIASRJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIASRJobResponseBodyAIASRJobList self = new ListAIASRJobResponseBodyAIASRJobList();
            return TeaModel.build(map, self);
        }

        public ListAIASRJobResponseBodyAIASRJobList setAIASRJob(java.util.List<ListAIASRJobResponseBodyAIASRJobListAIASRJob> AIASRJob) {
            this.AIASRJob = AIASRJob;
            return this;
        }
        public java.util.List<ListAIASRJobResponseBodyAIASRJobListAIASRJob> getAIASRJob() {
            return this.AIASRJob;
        }

    }

    public static class ListAIASRJobResponseBodyNonExistAIASRJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIASRJobResponseBodyNonExistAIASRJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIASRJobResponseBodyNonExistAIASRJobIds self = new ListAIASRJobResponseBodyNonExistAIASRJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIASRJobResponseBodyNonExistAIASRJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
