// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoDetextJobResponseBody extends TeaModel {
    /**
     * <p>The video text removal job.</p>
     */
    @NameInMap("Job")
    public GetVideoDetextJobResponseBodyJob job;

    /**
     * <p>The request ID, which is used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>req-detext-get-20260820-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVideoDetextJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDetextJobResponseBody self = new GetVideoDetextJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoDetextJobResponseBody setJob(GetVideoDetextJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetVideoDetextJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetVideoDetextJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVideoDetextJobResponseBodyJob extends TeaModel {
        /**
         * <p>The business error code returned when the job fails. This field is typically not returned when the job is not in a failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidInput</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The business error message returned when the job fails. This field is typically not returned when the job is not in a failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>Input video is invalid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The normalized JSON string of the input configuration saved during submission.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoUrl&quot;:&quot;<a href="https://example.com/input.mp4%22%7D">https://example.com/input.mp4&quot;}</a></p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The ID of the video text removal job.</p>
         * 
         * <strong>example:</strong>
         * <p>vdt_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The normalized JSON string of the text removal parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EraseAllText&quot;:false,&quot;TextTargets&quot;:[{&quot;Box&quot;:[0.1,0.8,0.8,0.15],&quot;TimeRanges&quot;:[[0,30]]}]}</p>
         */
        @NameInMap("JobParameters")
        public String jobParameters;

        /**
         * <p>The job type. The value is fixed as VIDEO_DETEXT.</p>
         * 
         * <strong>example:</strong>
         * <p>VIDEO_DETEXT</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The JSON character string of the task result. When Status is Finished, deserialize the sequence of this field and read AiResult.DetextVideoURL to obtain the URL of the video with text removed. If the node is not successfully completed, the video URL is not guaranteed to be included. If Output.OssUri is specified during commit, the result is stored in the specified OSS bucket. Otherwise, a signed URL is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AiResult&quot;:{&quot;DetextVideoURL&quot;:&quot;<a href="https://example.com/detext/detext.mp4%22%7D%7D">https://example.com/detext/detext.mp4&quot;}}</a></p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The job status. Valid values: Created, Queuing, Executing, Finished, and Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetVideoDetextJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetextJobResponseBodyJob self = new GetVideoDetextJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetVideoDetextJobResponseBodyJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetVideoDetextJobResponseBodyJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoDetextJobResponseBodyJob setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetVideoDetextJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetVideoDetextJobResponseBodyJob setJobParameters(String jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }
        public String getJobParameters() {
            return this.jobParameters;
        }

        public GetVideoDetextJobResponseBodyJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetVideoDetextJobResponseBodyJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetVideoDetextJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
