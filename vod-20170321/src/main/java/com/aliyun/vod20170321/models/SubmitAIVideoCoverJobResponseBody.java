// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCoverJobResponseBody extends TeaModel {
    @NameInMap("AIVideoCoverJob")
    public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob AIVideoCoverJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoCoverJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCoverJobResponseBody self = new SubmitAIVideoCoverJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoCoverJobResponseBody setAIVideoCoverJob(SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob AIVideoCoverJob) {
        this.AIVideoCoverJob = AIVideoCoverJob;
        return this;
    }
    public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob getAIVideoCoverJob() {
        return this.AIVideoCoverJob;
    }

    public SubmitAIVideoCoverJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob extends TeaModel {
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

        public static SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob self = new SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoCoverJobResponseBodyAIVideoCoverJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
