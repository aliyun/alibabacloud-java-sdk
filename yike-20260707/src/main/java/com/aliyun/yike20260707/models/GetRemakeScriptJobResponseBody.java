// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetRemakeScriptJobResponseBody extends TeaModel {
    /**
     * <p>The generated creative script object.</p>
     */
    @NameInMap("Job")
    public GetRemakeScriptJobResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRemakeScriptJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRemakeScriptJobResponseBody self = new GetRemakeScriptJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRemakeScriptJobResponseBody setJob(GetRemakeScriptJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetRemakeScriptJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetRemakeScriptJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRemakeScriptJobResponseBodyJob extends TeaModel {
        /**
         * <p>The error code. Returned when the status is Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. Returned when the status is Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified product does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68ca759e798b40b4903b255*******</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The file URL of the script imitation result. The file content is in JSON format of the creative script.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.json">http://xxxx.json</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The file status. Valid values:</p>
         * <ul>
         * <li>Created: Created.</li>
         * <li>Executing: Executing.</li>
         * <li>Finished: Finished.</li>
         * <li>Failed: Failed.</li>
         * <li>Deleted: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user-defined parameter, in JSON format string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetRemakeScriptJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetRemakeScriptJobResponseBodyJob self = new GetRemakeScriptJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetRemakeScriptJobResponseBodyJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetRemakeScriptJobResponseBodyJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetRemakeScriptJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetRemakeScriptJobResponseBodyJob setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetRemakeScriptJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRemakeScriptJobResponseBodyJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
