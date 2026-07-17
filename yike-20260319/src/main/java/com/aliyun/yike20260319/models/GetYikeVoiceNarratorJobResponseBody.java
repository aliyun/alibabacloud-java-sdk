// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeVoiceNarratorJobResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is returned only when JobStatus is <code>Failed</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowTaskFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>task_abc123def456</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The input parameters of the task, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TextType\&quot;:2,\&quot;TextContent\&quot;:\&quot;Today, Beijing held a press conference to announce plans to further optimize the city\&quot;s transportation network, including adding three new subway lines within the next three years....\&quot;,\&quot;AspectRatio\&quot;:\&quot;16:9\&quot;, \&quot;Resolution\&quot;:\&quot;720P\&quot;, \&quot;OutputLanguages\&quot;:[\&quot;CN\&quot;,\&quot;YUE\&quot;]&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The task results. This parameter is valid only when JobStatus is <code>Succeeded</code>.</p>
     */
    @NameInMap("JobResult")
    public java.util.List<GetYikeVoiceNarratorJobResponseBodyJobResult> jobResult;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>Running</li>
     * <li>Succeeded</li>
     * <li>Failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req_query_20260420_002</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The custom user data passed in when the task was created. The value is returned as-is.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://cms.example.com/callback/video-task%5C%5C%22%7D">https://cms.example.com/callback/video-task\\&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GetYikeVoiceNarratorJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeVoiceNarratorJobResponseBody self = new GetYikeVoiceNarratorJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeVoiceNarratorJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetYikeVoiceNarratorJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetYikeVoiceNarratorJobResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public GetYikeVoiceNarratorJobResponseBody setJobResult(java.util.List<GetYikeVoiceNarratorJobResponseBodyJobResult> jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public java.util.List<GetYikeVoiceNarratorJobResponseBodyJobResult> getJobResult() {
        return this.jobResult;
    }

    public GetYikeVoiceNarratorJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public GetYikeVoiceNarratorJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYikeVoiceNarratorJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetYikeVoiceNarratorJobResponseBodyJobResult extends TeaModel {
        /**
         * <p>The online editing project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01a6adbbd181437eb5030d3d93e0182d</p>
         */
        @NameInMap("EditingProjectId")
        public String editingProjectId;

        /**
         * <p>The asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9d7e982012c671f1b803e7f6d75a6302</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The output language.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("OutputLanguage")
        public String outputLanguage;

        /**
         * <p>The download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/videos/task_abc123def456.mp4">https://test.oss-cn-shanghai.aliyuncs.com/videos/task_abc123def456.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetYikeVoiceNarratorJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeVoiceNarratorJobResponseBodyJobResult self = new GetYikeVoiceNarratorJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public GetYikeVoiceNarratorJobResponseBodyJobResult setEditingProjectId(String editingProjectId) {
            this.editingProjectId = editingProjectId;
            return this;
        }
        public String getEditingProjectId() {
            return this.editingProjectId;
        }

        public GetYikeVoiceNarratorJobResponseBodyJobResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetYikeVoiceNarratorJobResponseBodyJobResult setOutputLanguage(String outputLanguage) {
            this.outputLanguage = outputLanguage;
            return this;
        }
        public String getOutputLanguage() {
            return this.outputLanguage;
        }

        public GetYikeVoiceNarratorJobResponseBodyJobResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

}
