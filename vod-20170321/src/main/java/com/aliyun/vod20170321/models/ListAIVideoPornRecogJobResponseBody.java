// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoPornRecogJobResponseBody extends TeaModel {
    @NameInMap("AIVideoPornRecogJobList")
    public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList AIVideoPornRecogJobList;

    @NameInMap("NonExistPornRecogJobIds")
    public ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds nonExistPornRecogJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAIVideoPornRecogJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoPornRecogJobResponseBody self = new ListAIVideoPornRecogJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIVideoPornRecogJobResponseBody setAIVideoPornRecogJobList(ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList AIVideoPornRecogJobList) {
        this.AIVideoPornRecogJobList = AIVideoPornRecogJobList;
        return this;
    }
    public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList getAIVideoPornRecogJobList() {
        return this.AIVideoPornRecogJobList;
    }

    public ListAIVideoPornRecogJobResponseBody setNonExistPornRecogJobIds(ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds nonExistPornRecogJobIds) {
        this.nonExistPornRecogJobIds = nonExistPornRecogJobIds;
        return this;
    }
    public ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds getNonExistPornRecogJobIds() {
        return this.nonExistPornRecogJobIds;
    }

    public ListAIVideoPornRecogJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob extends TeaModel {
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

        public static ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob self = new ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob();
            return TeaModel.build(map, self);
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList extends TeaModel {
        @NameInMap("AIVideoPornRecogJob")
        public java.util.List<ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob> AIVideoPornRecogJob;

        public static ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList self = new ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList();
            return TeaModel.build(map, self);
        }

        public ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobList setAIVideoPornRecogJob(java.util.List<ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob> AIVideoPornRecogJob) {
            this.AIVideoPornRecogJob = AIVideoPornRecogJob;
            return this;
        }
        public java.util.List<ListAIVideoPornRecogJobResponseBodyAIVideoPornRecogJobListAIVideoPornRecogJob> getAIVideoPornRecogJob() {
            return this.AIVideoPornRecogJob;
        }

    }

    public static class ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds self = new ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds();
            return TeaModel.build(map, self);
        }

        public ListAIVideoPornRecogJobResponseBodyNonExistPornRecogJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
