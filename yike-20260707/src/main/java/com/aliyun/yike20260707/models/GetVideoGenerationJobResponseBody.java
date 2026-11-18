// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoGenerationJobResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The video generation job.</p>
     */
    @NameInMap("VideoGenerationJob")
    public GetVideoGenerationJobResponseBodyVideoGenerationJob videoGenerationJob;

    public static GetVideoGenerationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoGenerationJobResponseBody self = new GetVideoGenerationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoGenerationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoGenerationJobResponseBody setVideoGenerationJob(GetVideoGenerationJobResponseBodyVideoGenerationJob videoGenerationJob) {
        this.videoGenerationJob = videoGenerationJob;
        return this;
    }
    public GetVideoGenerationJobResponseBodyVideoGenerationJob getVideoGenerationJob() {
        return this.videoGenerationJob;
    }

    public static class GetVideoGenerationJobResponseBodyVideoGenerationJob extends TeaModel {
        /**
         * <p>The aspect ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("AspectRatio")
        public String aspectRatio;

        /**
         * <p>The video duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The error message. The value is a string. This parameter is returned only when the job status is Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Input file not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The job input.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Prompt&quot;:&quot;Image 1 is on the basketball court, performing a slam dunk with Image 2&quot;,&quot;Medias&quot;:[{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;<a href="https://xxx/xxx.jpg%22%7D,%7B%22Type%22:%22image%22,%22Url%22:%22https://xxx/xxx.jpg%22%7D%5D%7D">https://xxx/xxx.jpg&quot;},{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;https://xxx/xxx.jpg&quot;}]}</a></p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fdc7f121056249c2b64e04bba27bcc8c</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The job feature configurations. This parameter does not require configuration at this time.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("JobParameters")
        public String jobParameters;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>first_last_frame</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>happyhorse-1.1</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of generated videos.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("N")
        public Integer n;

        /**
         * <p>The generation result. The value is a JSON string that contains the following fields:</p>
         * <p>Medias: the list of media information (Media objects). Fields of a Media object:
         * MediaId: String. The media asset ID.
         * OutputUrl: String. The media URL, including the authentication string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Medias\&quot;:[{\&quot;MediaId\&quot;:\&quot;<em><strong><strong>470732171f1bfcaf7f6d44</strong></strong></em>\&quot;,\&quot;OutputUrl\&quot;:\&quot;<a href="https://xxxxxxx/.../xxxxx.mp4?Expires=xxxx&OSSAccessKeyId=xxx&Signature=xxxx%5C%5C%22%7D%5D%7D">https://xxxxxxx/.../xxxxx.mp4?Expires=xxxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxxx\\&quot;}]}</a></p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>720P</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The scene type. Currently, only general is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Created: The job is created.</li>
         * <li>Queuing: The job is queued.</li>
         * <li>Executing: The job is executing.</li>
         * <li>Finished: The job succeeded.</li>
         * <li>Failed: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user business information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetVideoGenerationJobResponseBodyVideoGenerationJob build(java.util.Map<String, ?> map) throws Exception {
            GetVideoGenerationJobResponseBodyVideoGenerationJob self = new GetVideoGenerationJobResponseBodyVideoGenerationJob();
            return TeaModel.build(map, self);
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setJobParameters(String jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }
        public String getJobParameters() {
            return this.jobParameters;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoGenerationJobResponseBodyVideoGenerationJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
