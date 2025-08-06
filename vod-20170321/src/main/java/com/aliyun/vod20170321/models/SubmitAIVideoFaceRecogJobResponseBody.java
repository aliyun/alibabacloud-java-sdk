// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoFaceRecogJobResponseBody extends TeaModel {
    @NameInMap("AIVideoFaceRecogJob")
    public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob AIVideoFaceRecogJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoFaceRecogJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoFaceRecogJobResponseBody self = new SubmitAIVideoFaceRecogJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoFaceRecogJobResponseBody setAIVideoFaceRecogJob(SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob AIVideoFaceRecogJob) {
        this.AIVideoFaceRecogJob = AIVideoFaceRecogJob;
        return this;
    }
    public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob getAIVideoFaceRecogJob() {
        return this.AIVideoFaceRecogJob;
    }

    public SubmitAIVideoFaceRecogJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob extends TeaModel {
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

        public static SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob self = new SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoFaceRecogJobResponseBodyAIVideoFaceRecogJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
