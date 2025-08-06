// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoPornRecogJobResponseBody extends TeaModel {
    @NameInMap("AIVideoPornRecogJob")
    public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob AIVideoPornRecogJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoPornRecogJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoPornRecogJobResponseBody self = new SubmitAIVideoPornRecogJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoPornRecogJobResponseBody setAIVideoPornRecogJob(SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob AIVideoPornRecogJob) {
        this.AIVideoPornRecogJob = AIVideoPornRecogJob;
        return this;
    }
    public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob getAIVideoPornRecogJob() {
        return this.AIVideoPornRecogJob;
    }

    public SubmitAIVideoPornRecogJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob extends TeaModel {
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

        public static SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob self = new SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoPornRecogJobResponseBodyAIVideoPornRecogJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
