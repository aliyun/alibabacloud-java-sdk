// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoSummaryJobResponseBody extends TeaModel {
    @NameInMap("AIVideoSummaryJob")
    public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob AIVideoSummaryJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIVideoSummaryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoSummaryJobResponseBody self = new SubmitAIVideoSummaryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoSummaryJobResponseBody setAIVideoSummaryJob(SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob AIVideoSummaryJob) {
        this.AIVideoSummaryJob = AIVideoSummaryJob;
        return this;
    }
    public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob getAIVideoSummaryJob() {
        return this.AIVideoSummaryJob;
    }

    public SubmitAIVideoSummaryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob extends TeaModel {
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

        public static SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob self = new SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAIVideoSummaryJobResponseBodyAIVideoSummaryJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
