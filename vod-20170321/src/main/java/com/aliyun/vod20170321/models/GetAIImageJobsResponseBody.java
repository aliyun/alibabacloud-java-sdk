// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIImageJobsResponseBody extends TeaModel {
    /**
     * <p>The list of AI image processing tasks.</p>
     */
    @NameInMap("AIImageJobList")
    public java.util.List<GetAIImageJobsResponseBodyAIImageJobList> AIImageJobList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7721B494-1F78-4E*****E8-A7CEE7315BFA</p>
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
         * <p>The OSS URL of the AI image.</p>
         * <blockquote>
         * <p>This is the task result. The URL does not contain complete authentication information. To obtain authentication information, generate it yourself or call the <a href="https://help.aliyun.com/document_detail/186924.html">ListAIImage</a> operation to retrieve the media asset result.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Score&quot;:5.035636554444242,&quot;Url&quot;:&quot;<a href="http://outin-*****.oss-cn-shanghai.aliyuncs.com/357a8748c577*****789d2726e6436aa/image/ai/b0a7612554d*****5cbe3-00001.gif%22%7D%5D">http://outin-*****.oss-cn-shanghai.aliyuncs.com/357a8748c577*****789d2726e6436aa/image/ai/b0a7612554d*****5cbe3-00001.gif&quot;}]</a></p>
         */
        @NameInMap("AIImageResult")
        public String AIImageResult;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the AI image processing task was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-15T03:30:03Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the AI image processing task.</p>
         * 
         * <strong>example:</strong>
         * <p>cf08a2c6e11e*****de1711b738b9067</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The task is successful.</li>
         * <li><strong>fail</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The snapshot of the configuration information of the specified template when the task was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Format&quot;:&quot;gif&quot;,&quot;SetDefaultCover&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The AI template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5a86a00f15194*****d7fe7de1b4a173</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The custom settings.</p>
         * <ul>
         * <li>The value must be a JSON string.</li>
         * <li>The value must contain the MessageCallback or Extend parameter.</li>
         * <li>The maximum length is 512 bytes.</li>
         * </ul>
         * <p>For more information about the parameter structure, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The video ID.</p>
         * 
         * <strong>example:</strong>
         * <p>357a8748c577*****789d2726e6436aa</p>
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
