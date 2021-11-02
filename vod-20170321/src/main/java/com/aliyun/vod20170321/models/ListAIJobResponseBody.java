// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIJobResponseBody extends TeaModel {
    @NameInMap("AIJobList")
    public ListAIJobResponseBodyAIJobList AIJobList;

    @NameInMap("NonExistAIJobIds")
    public ListAIJobResponseBodyNonExistAIJobIds nonExistAIJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIJobResponseBody self = new ListAIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIJobResponseBody setAIJobList(ListAIJobResponseBodyAIJobList AIJobList) {
        this.AIJobList = AIJobList;
        return this;
    }
    public ListAIJobResponseBodyAIJobList getAIJobList() {
        return this.AIJobList;
    }

    public ListAIJobResponseBody setNonExistAIJobIds(ListAIJobResponseBodyNonExistAIJobIds nonExistAIJobIds) {
        this.nonExistAIJobIds = nonExistAIJobIds;
        return this;
    }
    public ListAIJobResponseBodyNonExistAIJobIds getNonExistAIJobIds() {
        return this.nonExistAIJobIds;
    }

    public ListAIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIJobResponseBodyAIJobListAIJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CompleteTime")
        public String completeTime;

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

        @NameInMap("Type")
        public String type;

        public static ListAIJobResponseBodyAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseBodyAIJobListAIJob self = new ListAIJobResponseBodyAIJobListAIJob();
            return TeaModel.build(map, self);
        }

        public ListAIJobResponseBodyAIJobListAIJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIJobResponseBodyAIJobListAIJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListAIJobResponseBodyAIJobListAIJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIJobResponseBodyAIJobListAIJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIJobResponseBodyAIJobListAIJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIJobResponseBodyAIJobListAIJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIJobResponseBodyAIJobListAIJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIJobResponseBodyAIJobListAIJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAIJobResponseBodyAIJobListAIJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAIJobResponseBodyAIJobList extends TeaModel {
        @NameInMap("AIJob")
        public java.util.List<ListAIJobResponseBodyAIJobListAIJob> AIJob;

        public static ListAIJobResponseBodyAIJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseBodyAIJobList self = new ListAIJobResponseBodyAIJobList();
            return TeaModel.build(map, self);
        }

        public ListAIJobResponseBodyAIJobList setAIJob(java.util.List<ListAIJobResponseBodyAIJobListAIJob> AIJob) {
            this.AIJob = AIJob;
            return this;
        }
        public java.util.List<ListAIJobResponseBodyAIJobListAIJob> getAIJob() {
            return this.AIJob;
        }

    }

    public static class ListAIJobResponseBodyNonExistAIJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIJobResponseBodyNonExistAIJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseBodyNonExistAIJobIds self = new ListAIJobResponseBodyNonExistAIJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIJobResponseBodyNonExistAIJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
