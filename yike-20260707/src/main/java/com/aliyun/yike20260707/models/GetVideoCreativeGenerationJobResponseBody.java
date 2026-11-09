// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoCreativeGenerationJobResponseBody extends TeaModel {
    /**
     * <p>The job creation time in UTC format (yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T18:53:34.001+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The error code. This parameter is returned only when the job status is Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowTaskFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The job completion time in UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T18:53:34.001+08:00</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The task results of the node. This parameter is valid only when the job status is Succeeded. Each element represents the output for a single language.</p>
     */
    @NameInMap("JobResult")
    public java.util.List<GetVideoCreativeGenerationJobResponseBodyJobResult> jobResult;

    /**
     * <p>The job status. Valid values: Running, Succeeded, and Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The custom user data, which is returned as-is.</p>
     * 
     * <strong>example:</strong>
     * <p>12374214127312673137132</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GetVideoCreativeGenerationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCreativeGenerationJobResponseBody self = new GetVideoCreativeGenerationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoCreativeGenerationJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetVideoCreativeGenerationJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetVideoCreativeGenerationJobResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetVideoCreativeGenerationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetVideoCreativeGenerationJobResponseBody setJobResult(java.util.List<GetVideoCreativeGenerationJobResponseBodyJobResult> jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public java.util.List<GetVideoCreativeGenerationJobResponseBodyJobResult> getJobResult() {
        return this.jobResult;
    }

    public GetVideoCreativeGenerationJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public GetVideoCreativeGenerationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoCreativeGenerationJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetVideoCreativeGenerationJobResponseBodyJobResult extends TeaModel {
        /**
         * <p>The online editing project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01a6adbbd181437eb5030d3d93e0182d</p>
         */
        @NameInMap("EditingProjectId")
        public String editingProjectId;

        /**
         * <p>The media asset ID of the output video.</p>
         * 
         * <strong>example:</strong>
         * <p>9d7e982012c671f1b803e7f6d75a6302</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The output language. Valid values: CN, EN, and YUE.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("OutputLanguage")
        public String outputLanguage;

        /**
         * <p>The signed download URL of the output video. The URL is time-limited.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetVideoCreativeGenerationJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCreativeGenerationJobResponseBodyJobResult self = new GetVideoCreativeGenerationJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public GetVideoCreativeGenerationJobResponseBodyJobResult setEditingProjectId(String editingProjectId) {
            this.editingProjectId = editingProjectId;
            return this;
        }
        public String getEditingProjectId() {
            return this.editingProjectId;
        }

        public GetVideoCreativeGenerationJobResponseBodyJobResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetVideoCreativeGenerationJobResponseBodyJobResult setOutputLanguage(String outputLanguage) {
            this.outputLanguage = outputLanguage;
            return this;
        }
        public String getOutputLanguage() {
            return this.outputLanguage;
        }

        public GetVideoCreativeGenerationJobResponseBodyJobResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

}
