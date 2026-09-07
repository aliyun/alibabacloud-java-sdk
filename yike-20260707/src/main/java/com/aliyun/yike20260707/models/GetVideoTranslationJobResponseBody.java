// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoTranslationJobResponseBody extends TeaModel {
    /**
     * <p>The video translation job.</p>
     */
    @NameInMap("Job")
    public GetVideoTranslationJobResponseBodyJob job;

    /**
     * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>req-vt-get-20260820-001</p>
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
         * <p>The input video duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60.5</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The editing project ID for a single-target-language job. For multi-target-language results, retrieve the ID from Output.AiResult.ResultMap.</p>
         * 
         * <strong>example:</strong>
         * <p>editing-project-001</p>
         */
        @NameInMap("EditingProjectId")
        public String editingProjectId;

        /**
         * <p>The business error code returned when the job fails. This field is typically not returned for non-failed states.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidInput</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The business error message returned when the job fails. This field is typically not returned for non-failed states.</p>
         * 
         * <strong>example:</strong>
         * <p>Input video is invalid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The normalized input configuration JSON string saved at submission time.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoMediaId&quot;:&quot;media-video-001&quot;}</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The video translation job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vtj_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The normalized job parameters JSON string, including default values supplemented by the service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;SubtitleFrom&quot;:&quot;default&quot;,&quot;NeedDetext&quot;:false,&quot;NeedVisualTranslate&quot;:false}</p>
         */
        @NameInMap("JobParameters")
        public String jobParameters;

        /**
         * <p>The normalized job type.</p>
         * 
         * <strong>example:</strong>
         * <p>VoiceTranslate</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The job output JSON string. When the job succeeds, AiResult.ResultMap organizes the final video, subtitle, and audio outputs by target language.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AiResult&quot;:{&quot;ResultMap&quot;:{&quot;en&quot;:{&quot;EditingProjectId&quot;:&quot;editing-project-001&quot;,&quot;MediaURL&quot;:&quot;<a href="https://example.com/video-translation/en/result.mp4%22,%22MediaId%22:%22media-output-001%22%7D%7D%7D%7D">https://example.com/video-translation/en/result.mp4&quot;,&quot;MediaId&quot;:&quot;media-output-001&quot;}}}}</a></p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The job status. Valid values: Created, Queuing, Executing, Finished, or Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
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
