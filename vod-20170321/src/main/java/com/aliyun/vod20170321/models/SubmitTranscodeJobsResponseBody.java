// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsResponseBody extends TeaModel {
    /**
     * <p>The ID of the transcoding job that was submitted.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Submits a transcoding job and starts asynchronous transcoding.</p>
     */
    @NameInMap("TranscodeJobs")
    public SubmitTranscodeJobsResponseBodyTranscodeJobs transcodeJobs;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("TranscodeTaskId")
    public String transcodeTaskId;

    public static SubmitTranscodeJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobsResponseBody self = new SubmitTranscodeJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTranscodeJobsResponseBody setTranscodeJobs(SubmitTranscodeJobsResponseBodyTranscodeJobs transcodeJobs) {
        this.transcodeJobs = transcodeJobs;
        return this;
    }
    public SubmitTranscodeJobsResponseBodyTranscodeJobs getTranscodeJobs() {
        return this.transcodeJobs;
    }

    public SubmitTranscodeJobsResponseBody setTranscodeTaskId(String transcodeTaskId) {
        this.transcodeTaskId = transcodeTaskId;
        return this;
    }
    public String getTranscodeTaskId() {
        return this.transcodeTaskId;
    }

    public static class SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob self = new SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class SubmitTranscodeJobsResponseBodyTranscodeJobs extends TeaModel {
        @NameInMap("TranscodeJob")
        public java.util.List<SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob> transcodeJob;

        public static SubmitTranscodeJobsResponseBodyTranscodeJobs build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobsResponseBodyTranscodeJobs self = new SubmitTranscodeJobsResponseBodyTranscodeJobs();
            return TeaModel.build(map, self);
        }

        public SubmitTranscodeJobsResponseBodyTranscodeJobs setTranscodeJob(java.util.List<SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob> transcodeJob) {
            this.transcodeJob = transcodeJob;
            return this;
        }
        public java.util.List<SubmitTranscodeJobsResponseBodyTranscodeJobsTranscodeJob> getTranscodeJob() {
            return this.transcodeJob;
        }

    }

}
