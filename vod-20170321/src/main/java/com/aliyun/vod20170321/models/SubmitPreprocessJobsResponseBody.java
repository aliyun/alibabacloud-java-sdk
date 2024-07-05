// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsResponseBody extends TeaModel {
    /**
     * <p>The job information.</p>
     */
    @NameInMap("PreprocessJobs")
    public SubmitPreprocessJobsResponseBodyPreprocessJobs preprocessJobs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitPreprocessJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsResponseBody self = new SubmitPreprocessJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitPreprocessJobsResponseBody setPreprocessJobs(SubmitPreprocessJobsResponseBodyPreprocessJobs preprocessJobs) {
        this.preprocessJobs = preprocessJobs;
        return this;
    }
    public SubmitPreprocessJobsResponseBodyPreprocessJobs getPreprocessJobs() {
        return this.preprocessJobs;
    }

    public SubmitPreprocessJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob extends TeaModel {
        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>bb396607fd11fee9effbb99c4****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob self = new SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob();
            return TeaModel.build(map, self);
        }

        public SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class SubmitPreprocessJobsResponseBodyPreprocessJobs extends TeaModel {
        @NameInMap("PreprocessJob")
        public java.util.List<SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob> preprocessJob;

        public static SubmitPreprocessJobsResponseBodyPreprocessJobs build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsResponseBodyPreprocessJobs self = new SubmitPreprocessJobsResponseBodyPreprocessJobs();
            return TeaModel.build(map, self);
        }

        public SubmitPreprocessJobsResponseBodyPreprocessJobs setPreprocessJob(java.util.List<SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob> preprocessJob) {
            this.preprocessJob = preprocessJob;
            return this;
        }
        public java.util.List<SubmitPreprocessJobsResponseBodyPreprocessJobsPreprocessJob> getPreprocessJob() {
            return this.preprocessJob;
        }

    }

}
