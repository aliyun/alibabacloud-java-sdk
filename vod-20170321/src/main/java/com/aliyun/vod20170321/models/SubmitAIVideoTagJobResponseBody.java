// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoTagJobResponseBody extends TeaModel {
    @NameInMap("AIVideoTagJob")
    public SubmitAIVideoTagJobResponseBodyAIVideoTagJob AIVideoTagJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoTagJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoTagJobResponseBody self = new SubmitAIVideoTagJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoTagJobResponseBody setAIVideoTagJob(SubmitAIVideoTagJobResponseBodyAIVideoTagJob AIVideoTagJob) {
        this.AIVideoTagJob = AIVideoTagJob;
        return this;
    }
    public SubmitAIVideoTagJobResponseBodyAIVideoTagJob getAIVideoTagJob() {
        return this.AIVideoTagJob;
    }

    public SubmitAIVideoTagJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoTagJobResponseBodyAIVideoTagJob extends TeaModel {
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

        public static SubmitAIVideoTagJobResponseBodyAIVideoTagJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoTagJobResponseBodyAIVideoTagJob self = new SubmitAIVideoTagJobResponseBodyAIVideoTagJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoTagJobResponseBodyAIVideoTagJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoTagJobResponseBodyAIVideoTagJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoTagJobResponseBodyAIVideoTagJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoTagJobResponseBodyAIVideoTagJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoTagJobResponseBodyAIVideoTagJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoTagJobResponseBodyAIVideoTagJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoTagJobResponseBodyAIVideoTagJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
