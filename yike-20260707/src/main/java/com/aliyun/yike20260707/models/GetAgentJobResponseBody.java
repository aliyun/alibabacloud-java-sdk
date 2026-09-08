// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAgentJobResponseBody extends TeaModel {
    /**
     * <p>The task information.</p>
     */
    @NameInMap("Job")
    public GetAgentJobResponseBodyJob job;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentJobResponseBody self = new GetAgentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentJobResponseBody setJob(GetAgentJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetAgentJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetAgentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentJobResponseBodyJob extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bc30a1080b21434f961a0d9a391b30b9</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The task output JSON string. Different tasks return different structures, which are defined by the business side.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;OssUri\&quot;:\&quot;oss://ice-ai-saas/ice-ai-saas-prd/1123668546389636/210606863/generate/ag_3a506706a33f44008aec6274d2e38d58/\&quot;}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Created</li>
         * <li>Queuing</li>
         * <li>Executing</li>
         * <li>Finished</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAgentJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetAgentJobResponseBodyJob self = new GetAgentJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetAgentJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAgentJobResponseBodyJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetAgentJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
