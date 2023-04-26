// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIImageJobsResponseBody extends TeaModel {
    /**
     * <p>The time when the image AI processing job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("AIImageJobList")
    public java.util.List<GetAIImageJobsResponseBodyAIImageJobList> AIImageJobList;

    /**
     * <p>The information about the image AI processing job.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAIImageJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIImageJobsResponseBody self = new GetAIImageJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIImageJobsResponseBody setAIImageJobList(java.util.List<GetAIImageJobsResponseBodyAIImageJobList> AIImageJobList) {
        this.AIImageJobList = AIImageJobList;
        return this;
    }
    public java.util.List<GetAIImageJobsResponseBodyAIImageJobList> getAIImageJobList() {
        return this.AIImageJobList;
    }

    public GetAIImageJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAIImageJobsResponseBodyAIImageJobList extends TeaModel {
        /**
         * <p>The Object Storage Service (OSS) URL of the image file.</p>
         * <br>
         * <p>> This parameter does not include the complete authentication information. To obtain the authentication information, you must generate a signed URL. Alternatively, you can call the [ListAIImage](~~ListAIImage~~) operation to obtain the image information.</p>
         */
        @NameInMap("AIImageResult")
        public String AIImageResult;

        /**
         * <p>The user data.</p>
         * <br>
         * <p>*   The value must be a JSON string.</p>
         * <p>*   The MessageCallback or Extend parameter is returned.</p>
         * <p>*   The value contains a maximum of 512 bytes.</p>
         * <br>
         * <p>For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the image AI processing job. You can obtain the value of JobId from the response to the [SubmitAIImageJob](~~186922~~) operation.</p>
         * <br>
         * <p>*   You can specify a maximum of 10 IDs.</p>
         * <p>*   Separate multiple IDs with commas (,).</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the image AI processing job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Queries jobs of image AI processing.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The configurations of the AI template that was used to submit the job.</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static GetAIImageJobsResponseBodyAIImageJobList build(java.util.Map<String, ?> map) throws Exception {
            GetAIImageJobsResponseBodyAIImageJobList self = new GetAIImageJobsResponseBodyAIImageJobList();
            return TeaModel.build(map, self);
        }

        public GetAIImageJobsResponseBodyAIImageJobList setAIImageResult(String AIImageResult) {
            this.AIImageResult = AIImageResult;
            return this;
        }
        public String getAIImageResult() {
            return this.AIImageResult;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetAIImageJobsResponseBodyAIImageJobList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
