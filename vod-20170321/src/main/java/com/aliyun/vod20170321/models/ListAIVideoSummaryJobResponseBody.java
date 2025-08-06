// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoSummaryJobResponseBody extends TeaModel {
    @NameInMap("AIVideoSummaryJobList")
    public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList AIVideoSummaryJobList;

    @NameInMap("NonExistAIVideoSummaryJobIds")
    public ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds nonExistAIVideoSummaryJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoSummaryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoSummaryJobResponseBody self = new ListAIVideoSummaryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoSummaryJobResponseBody setAIVideoSummaryJobList(ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList AIVideoSummaryJobList) {
        this.AIVideoSummaryJobList = AIVideoSummaryJobList;
        return this;
    }
    public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList getAIVideoSummaryJobList() {
        return this.AIVideoSummaryJobList;
    }

    public ListAIVideoSummaryJobResponseBody setNonExistAIVideoSummaryJobIds(ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds nonExistAIVideoSummaryJobIds) {
        this.nonExistAIVideoSummaryJobIds = nonExistAIVideoSummaryJobIds;
        return this;
    }
    public ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds getNonExistAIVideoSummaryJobIds() {
        return this.nonExistAIVideoSummaryJobIds;
    }

    public ListAIVideoSummaryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob extends TeaModel {
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

        public static ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob self = new ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList extends TeaModel {
        @NameInMap("AIVideoSummaryJob")
        public java.util.List<ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob> AIVideoSummaryJob;

        public static ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList self = new ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobList setAIVideoSummaryJob(java.util.List<ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob> AIVideoSummaryJob) {
            this.AIVideoSummaryJob = AIVideoSummaryJob;
            return this;
        }
        public java.util.List<ListAIVideoSummaryJobResponseBodyAIVideoSummaryJobListAIVideoSummaryJob> getAIVideoSummaryJob() {
            return this.AIVideoSummaryJob;
        }

    }

    public static class ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds self = new ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoSummaryJobResponseBodyNonExistAIVideoSummaryJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
