// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIASRJobResponseBody extends TeaModel {
    @NameInMap("AIASRJob")
    public SubmitAIASRJobResponseBodyAIASRJob AIASRJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIASRJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIASRJobResponseBody self = new SubmitAIASRJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIASRJobResponseBody setAIASRJob(SubmitAIASRJobResponseBodyAIASRJob AIASRJob) {
        this.AIASRJob = AIASRJob;
        return this;
    }
    public SubmitAIASRJobResponseBodyAIASRJob getAIASRJob() {
        return this.AIASRJob;
    }

    public SubmitAIASRJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIASRJobResponseBodyAIASRJob extends TeaModel {
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

        public static SubmitAIASRJobResponseBodyAIASRJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIASRJobResponseBodyAIASRJob self = new SubmitAIASRJobResponseBodyAIASRJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIASRJobResponseBodyAIASRJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIASRJobResponseBodyAIASRJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIASRJobResponseBodyAIASRJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIASRJobResponseBodyAIASRJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIASRJobResponseBodyAIASRJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIASRJobResponseBodyAIASRJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIASRJobResponseBodyAIASRJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
