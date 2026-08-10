// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoRenderJobResponseBody extends TeaModel {
    /**
     * <p>The video rendering and composition task object.</p>
     */
    @NameInMap("Job")
    public GetVideoRenderJobResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVideoRenderJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoRenderJobResponseBody self = new GetVideoRenderJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoRenderJobResponseBody setJob(GetVideoRenderJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetVideoRenderJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetVideoRenderJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVideoRenderJobResponseBodyJob extends TeaModel {
        /**
         * <p>The online editing project ID, which can be used for secondary editing of the output video.</p>
         * 
         * <strong>example:</strong>
         * <p>8239345231244512***</p>
         */
        @NameInMap("EditingProjectId")
        public String editingProjectId;

        /**
         * <p>The error code. This parameter is returned when the task is in the Failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. This parameter is returned when the task is in the Failed state.</p>
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
         * <p>The narration language of the output video.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The download URL of the rendered and composed video.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.mp4">https://xxxx.mp4</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Created: The task is created.</li>
         * <li>Executing: The task is being executed.</li>
         * <li>Finished: The task is completed.</li>
         * <li>Failed: The task has failed.</li>
         * <li>Deleted: The task is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The custom user data in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetVideoRenderJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetVideoRenderJobResponseBodyJob self = new GetVideoRenderJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetVideoRenderJobResponseBodyJob setEditingProjectId(String editingProjectId) {
            this.editingProjectId = editingProjectId;
            return this;
        }
        public String getEditingProjectId() {
            return this.editingProjectId;
        }

        public GetVideoRenderJobResponseBodyJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetVideoRenderJobResponseBodyJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoRenderJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetVideoRenderJobResponseBodyJob setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetVideoRenderJobResponseBodyJob setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetVideoRenderJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoRenderJobResponseBodyJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
