// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranscodeJobs")
    public SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs transcodeJobs;

    public static SubmitPreprocessJobsConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsConsoleResponseBody self = new SubmitPreprocessJobsConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitPreprocessJobsConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitPreprocessJobsConsoleResponseBody setTranscodeJobs(SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs transcodeJobs) {
        this.transcodeJobs = transcodeJobs;
        return this;
    }
    public SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs getTranscodeJobs() {
        return this.transcodeJobs;
    }

    public static class SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob self = new SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob();
            return TeaModel.build(map, self);
        }

        public SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs extends TeaModel {
        @NameInMap("TranscodeJob")
        public java.util.List<SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob> transcodeJob;

        public static SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs self = new SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs();
            return TeaModel.build(map, self);
        }

        public SubmitPreprocessJobsConsoleResponseBodyTranscodeJobs setTranscodeJob(java.util.List<SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob> transcodeJob) {
            this.transcodeJob = transcodeJob;
            return this;
        }
        public java.util.List<SubmitPreprocessJobsConsoleResponseBodyTranscodeJobsTranscodeJob> getTranscodeJob() {
            return this.transcodeJob;
        }

    }

}
