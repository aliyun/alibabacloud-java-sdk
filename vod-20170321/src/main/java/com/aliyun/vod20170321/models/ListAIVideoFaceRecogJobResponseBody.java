// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoFaceRecogJobResponseBody extends TeaModel {
    @NameInMap("AIVideoFaceRecogJobList")
    public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList AIVideoFaceRecogJobList;

    @NameInMap("NonExistAIVideoFaceRecogJobIds")
    public ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds nonExistAIVideoFaceRecogJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoFaceRecogJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoFaceRecogJobResponseBody self = new ListAIVideoFaceRecogJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoFaceRecogJobResponseBody setAIVideoFaceRecogJobList(ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList AIVideoFaceRecogJobList) {
        this.AIVideoFaceRecogJobList = AIVideoFaceRecogJobList;
        return this;
    }
    public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList getAIVideoFaceRecogJobList() {
        return this.AIVideoFaceRecogJobList;
    }

    public ListAIVideoFaceRecogJobResponseBody setNonExistAIVideoFaceRecogJobIds(ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds nonExistAIVideoFaceRecogJobIds) {
        this.nonExistAIVideoFaceRecogJobIds = nonExistAIVideoFaceRecogJobIds;
        return this;
    }
    public ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds getNonExistAIVideoFaceRecogJobIds() {
        return this.nonExistAIVideoFaceRecogJobIds;
    }

    public ListAIVideoFaceRecogJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob extends TeaModel {
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

        public static ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob self = new ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList extends TeaModel {
        @NameInMap("AIVideoFaceRecogJob")
        public java.util.List<ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob> AIVideoFaceRecogJob;

        public static ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList self = new ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobList setAIVideoFaceRecogJob(java.util.List<ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob> AIVideoFaceRecogJob) {
            this.AIVideoFaceRecogJob = AIVideoFaceRecogJob;
            return this;
        }
        public java.util.List<ListAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJobListAIVideoFaceRecogJob> getAIVideoFaceRecogJob() {
            return this.AIVideoFaceRecogJob;
        }

    }

    public static class ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds self = new ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoFaceRecogJobResponseBodyNonExistAIVideoFaceRecogJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
