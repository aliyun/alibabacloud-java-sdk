// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetImageGenerationJobResponseBody extends TeaModel {
    @NameInMap("ImageGenerationJob")
    public GetImageGenerationJobResponseBodyImageGenerationJob imageGenerationJob;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetImageGenerationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageGenerationJobResponseBody self = new GetImageGenerationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageGenerationJobResponseBody setImageGenerationJob(GetImageGenerationJobResponseBodyImageGenerationJob imageGenerationJob) {
        this.imageGenerationJob = imageGenerationJob;
        return this;
    }
    public GetImageGenerationJobResponseBodyImageGenerationJob getImageGenerationJob() {
        return this.imageGenerationJob;
    }

    public GetImageGenerationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageGenerationJobResponseBodyImageGenerationJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("AspectRatio")
        public String aspectRatio;

        /**
         * <strong>example:</strong>
         * <p>Input file not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Prompt&quot;:&quot;图1在篮球场上，用图2来了个灌篮&quot;}</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>fdc7f121056249c2b64e04bba27bcc8c</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("JobParameters")
        public String jobParameters;

        /**
         * <strong>example:</strong>
         * <p>text_to_image</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>wan2.7-image</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("N")
        public String n;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Medias&quot;:[{&quot;MediaId&quot;:&quot;<em><strong>e3700761971f19c32e7e7d5496</strong></em>&quot;,&quot;OutputUrl&quot;:&quot;https://<strong>bucket</strong>.oss-ap-southeast-1.aliyuncs.com/xxx.prd&quot;}]}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>1K</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetImageGenerationJobResponseBodyImageGenerationJob build(java.util.Map<String, ?> map) throws Exception {
            GetImageGenerationJobResponseBodyImageGenerationJob self = new GetImageGenerationJobResponseBodyImageGenerationJob();
            return TeaModel.build(map, self);
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setJobParameters(String jobParameters) {
            this.jobParameters = jobParameters;
            return this;
        }
        public String getJobParameters() {
            return this.jobParameters;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageGenerationJobResponseBodyImageGenerationJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
