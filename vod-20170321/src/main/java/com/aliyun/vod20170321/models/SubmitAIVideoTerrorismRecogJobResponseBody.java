// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoTerrorismRecogJobResponseBody extends TeaModel {
    @NameInMap("AIVideoTerrorismRecogJob")
    public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob AIVideoTerrorismRecogJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoTerrorismRecogJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoTerrorismRecogJobResponseBody self = new SubmitAIVideoTerrorismRecogJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoTerrorismRecogJobResponseBody setAIVideoTerrorismRecogJob(SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob AIVideoTerrorismRecogJob) {
        this.AIVideoTerrorismRecogJob = AIVideoTerrorismRecogJob;
        return this;
    }
    public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob getAIVideoTerrorismRecogJob() {
        return this.AIVideoTerrorismRecogJob;
    }

    public SubmitAIVideoTerrorismRecogJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob extends TeaModel {
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

        public static SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob self = new SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoTerrorismRecogJobResponseBodyAIVideoTerrorismRecogJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
