// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoRemakeJobResponseBody extends TeaModel {
    /**
     * <p>The unified remake task details.</p>
     */
    @NameInMap("Job")
    public GetVideoRemakeJobResponseBodyJob job;

    /**
     * <p>The request tracking identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4321-ABCD-123456789012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVideoRemakeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoRemakeJobResponseBody self = new GetVideoRemakeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoRemakeJobResponseBody setJob(GetVideoRemakeJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetVideoRemakeJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetVideoRemakeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVideoRemakeJobResponseBodyJobJobResult extends TeaModel {
        /**
         * <p>The download URL of the JSON file for the content understanding result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json">https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json</a></p>
         */
        @NameInMap("AiResult")
        public String aiResult;

        /**
         * <p>The download URL of the JSON file for the creative script. Use the file content as the Script parameter for SubmitVideoRenderJob.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/creative-script.json">https://example.com/creative-script.json</a></p>
         */
        @NameInMap("Script")
        public String script;

        public static GetVideoRemakeJobResponseBodyJobJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoRemakeJobResponseBodyJobJobResult self = new GetVideoRemakeJobResponseBodyJobJobResult();
            return TeaModel.build(map, self);
        }

        public GetVideoRemakeJobResponseBodyJobJobResult setAiResult(String aiResult) {
            this.aiResult = aiResult;
            return this;
        }
        public String getAiResult() {
            return this.aiResult;
        }

        public GetVideoRemakeJobResponseBodyJobJobResult setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class GetVideoRemakeJobResponseBodyJob extends TeaModel {
        /**
         * <p>The error code for the failed asynchronous task. This parameter has a value only when the task status is Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message for the failed asynchronous task. This parameter has a value only when the task status is Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>lockCredit business failed: NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The unified remake task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The content understanding and script outputs returned when the status is Finished. This is not the rendered video.</p>
         */
        @NameInMap("JobResult")
        public GetVideoRemakeJobResponseBodyJobJobResult jobResult;

        /**
         * <p>The list of input media asset IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1234567890abcdef1234567890abcdef&quot;]</p>
         */
        @NameInMap("MediaIds")
        public java.util.List<String> mediaIds;

        /**
         * <p>The task status. Valid values: Created, Executing, Finished, and Failed. Finished indicates that content understanding and script generation are completed. If the status is Failed, check ErrorCode and ErrorMessage. If the task has been deleted, the query returns RecordNotFound.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UserData JSON string submitted with the task, returned as is.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://example.com/callback%22%7D">https://example.com/callback&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetVideoRemakeJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetVideoRemakeJobResponseBodyJob self = new GetVideoRemakeJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetVideoRemakeJobResponseBodyJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetVideoRemakeJobResponseBodyJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoRemakeJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetVideoRemakeJobResponseBodyJob setJobResult(GetVideoRemakeJobResponseBodyJobJobResult jobResult) {
            this.jobResult = jobResult;
            return this;
        }
        public GetVideoRemakeJobResponseBodyJobJobResult getJobResult() {
            return this.jobResult;
        }

        public GetVideoRemakeJobResponseBodyJob setMediaIds(java.util.List<String> mediaIds) {
            this.mediaIds = mediaIds;
            return this;
        }
        public java.util.List<String> getMediaIds() {
            return this.mediaIds;
        }

        public GetVideoRemakeJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoRemakeJobResponseBodyJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
