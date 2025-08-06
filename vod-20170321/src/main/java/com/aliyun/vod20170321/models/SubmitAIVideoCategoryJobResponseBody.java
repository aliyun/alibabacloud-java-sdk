// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCategoryJobResponseBody extends TeaModel {
    @NameInMap("AIVideoCategoryJob")
    public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob AIVideoCategoryJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoCategoryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCategoryJobResponseBody self = new SubmitAIVideoCategoryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoCategoryJobResponseBody setAIVideoCategoryJob(SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob AIVideoCategoryJob) {
        this.AIVideoCategoryJob = AIVideoCategoryJob;
        return this;
    }
    public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob getAIVideoCategoryJob() {
        return this.AIVideoCategoryJob;
    }

    public SubmitAIVideoCategoryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob extends TeaModel {
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

        public static SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob self = new SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoCategoryJobResponseBodyAIVideoCategoryJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
