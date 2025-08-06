// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCensorJobResponseBody extends TeaModel {
    @NameInMap("AIVideoCensorJob")
    public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob AIVideoCensorJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoCensorJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCensorJobResponseBody self = new SubmitAIVideoCensorJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoCensorJobResponseBody setAIVideoCensorJob(SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob AIVideoCensorJob) {
        this.AIVideoCensorJob = AIVideoCensorJob;
        return this;
    }
    public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob getAIVideoCensorJob() {
        return this.AIVideoCensorJob;
    }

    public SubmitAIVideoCensorJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob extends TeaModel {
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

        public static SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob self = new SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoCensorJobResponseBodyAIVideoCensorJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
