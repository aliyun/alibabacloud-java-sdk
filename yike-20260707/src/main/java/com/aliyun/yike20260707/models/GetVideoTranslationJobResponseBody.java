// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoTranslationJobResponseBody extends TeaModel {
    /**
     * <p>The video translation task.</p>
     */
    @NameInMap("Job")
    public GetVideoTranslationJobResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVideoTranslationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTranslationJobResponseBody self = new GetVideoTranslationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoTranslationJobResponseBody setJob(GetVideoTranslationJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetVideoTranslationJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetVideoTranslationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVideoTranslationJobResponseBodyJob extends TeaModel {
        /**
         * <p>The duration of the input video, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The editing project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ba50304145fd411c827239c398820267</p>
         */
        @NameInMap("EditingProjectId")
        public String editingProjectId;

        /**
         * <p>Optional. The error code returned when the task ultimately fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidInput</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Optional. The error message returned when the task ultimately fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Input is invalid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The normalized Input JSON.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Video&quot;:&quot;<a href="https://example.com/input.mp4%22%7D">https://example.com/input.mp4&quot;}</a></p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vtj_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The normalized JobParameters JSON, including default values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NeedDetext&quot;:true,&quot;SubtitleFrom&quot;:&quot;default&quot;,&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;NeedVisualTranslate&quot;:true}</p>
         */
        @NameInMap("JobParameters")
        public String jobParameters;

        /**
         * <p>The normalized task type.</p>
         * 
         * <strong>example:</strong>
         * <p>VoiceTranslate</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The JSON string of the final task result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AiResult&quot;:{&quot;ResultMap&quot;:{&quot;ja&quot;:{&quot;EditingProjectId&quot;:&quot;editing-project-xxx&quot;,&quot;MediaURL&quot;:&quot;<a href="https://example.com/bucket/prefix/ja/result.mp4%22%7D%7D%7D%7D">https://example.com/bucket/prefix/ja/result.mp4&quot;}}}}</a></p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The task status. Valid values: Created, Queuing, Executing, Finished, and Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetVideoTranslationJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetVideoTranslationJobResponseBodyJob self = new GetVideoTranslationJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetVideoTranslationJobResponseBodyJob setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetVideoTranslationJobResponseBodyJob setEditingProjectId(String editingProjectId) {
            this.editingProjectId = editingProjectId;
            return this;
        }
        public String getEditingProjectId() {
            return this.editingProjectId;
        }

        public GetVideoTranslationJobResponseBodyJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetVideoTranslationJobResponseBodyJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoTranslationJobResponseBodyJob setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetVideoTranslationJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetVideoTranslationJobResponseBodyJob setJobParameters(String jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }
        public String getJobParameters() {
            return this.jobParameters;
        }

        public GetVideoTranslationJobResponseBodyJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetVideoTranslationJobResponseBodyJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetVideoTranslationJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
