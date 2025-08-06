// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoTerrorismRecogJobResponseBody extends TeaModel {
    @NameInMap("AIVideoTerrorismRecogJobList")
    public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList AIVideoTerrorismRecogJobList;

    @NameInMap("NonExistTerrorismRecogJobIds")
    public ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds nonExistTerrorismRecogJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoTerrorismRecogJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoTerrorismRecogJobResponseBody self = new ListAIVideoTerrorismRecogJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoTerrorismRecogJobResponseBody setAIVideoTerrorismRecogJobList(ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList AIVideoTerrorismRecogJobList) {
        this.AIVideoTerrorismRecogJobList = AIVideoTerrorismRecogJobList;
        return this;
    }
    public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList getAIVideoTerrorismRecogJobList() {
        return this.AIVideoTerrorismRecogJobList;
    }

    public ListAIVideoTerrorismRecogJobResponseBody setNonExistTerrorismRecogJobIds(ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds nonExistTerrorismRecogJobIds) {
        this.nonExistTerrorismRecogJobIds = nonExistTerrorismRecogJobIds;
        return this;
    }
    public ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds getNonExistTerrorismRecogJobIds() {
        return this.nonExistTerrorismRecogJobIds;
    }

    public ListAIVideoTerrorismRecogJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob extends TeaModel {
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

        public static ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob self = new ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList extends TeaModel {
        @NameInMap("AIVideoTerrorismRecogJob")
        public java.util.List<ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob> AIVideoTerrorismRecogJob;

        public static ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList self = new ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobList setAIVideoTerrorismRecogJob(java.util.List<ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob> AIVideoTerrorismRecogJob) {
            this.AIVideoTerrorismRecogJob = AIVideoTerrorismRecogJob;
            return this;
        }
        public java.util.List<ListAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob> getAIVideoTerrorismRecogJob() {
            return this.AIVideoTerrorismRecogJob;
        }

    }

    public static class ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds self = new ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoTerrorismRecogJobResponseBodyNonExistTerrorismRecogJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
