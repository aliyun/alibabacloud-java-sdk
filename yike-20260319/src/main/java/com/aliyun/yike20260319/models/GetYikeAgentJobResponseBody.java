// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAgentJobResponseBody extends TeaModel {
    /**
     * <p>The time when the task started. The time is in the yyyy-mm-ddTHH:mm:ssZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T18:53:34.001+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The error code. This parameter is returned only when the task is in the Failed state.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowTaskFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The time when the task ended. The time is in the yyyy-mm-ddTHH:mm:ssZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T18:53:34.001+08:00</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82df****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The input parameters of the task. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TextType\&quot;:2,\&quot;TextContent\&quot;:\&quot;Today, Beijing held a press conference to announce plans to further optimize the city\&quot;s transportation network, including adding three new subway lines within the next three years....\&quot;,\&quot;AspectRatio\&quot;:\&quot;16:9\&quot;, \&quot;Resolution\&quot;:\&quot;720P\&quot;, \&quot;OutputLanguages\&quot;:[\&quot;CN\&quot;,\&quot;YUE\&quot;]&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The task results. This parameter is valid only when the task is in the Succeeded state.</p>
     */
    @NameInMap("JobResult")
    public java.util.List<GetYikeAgentJobResponseBodyJobResult> jobResult;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>Running</li>
     * <li>Succeeded</li>
     * <li>Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>The agent task type. Valid values:</p>
     * <ul>
     * <li>VoiceNarrator: narration video without a digital human.</li>
     * <li>AvatarNarrator: narration video with a digital human.</li>
     * <li>VideoClone: video cloning.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VoiceNarrator</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The custom user data that was passed in when the task was created. The value is returned as-is.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://cms.example.com/callback/video-task%5C%5C%22%7D">https://cms.example.com/callback/video-task\\&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GetYikeAgentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAgentJobResponseBody self = new GetYikeAgentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeAgentJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetYikeAgentJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetYikeAgentJobResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetYikeAgentJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetYikeAgentJobResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public GetYikeAgentJobResponseBody setJobResult(java.util.List<GetYikeAgentJobResponseBodyJobResult> jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public java.util.List<GetYikeAgentJobResponseBodyJobResult> getJobResult() {
        return this.jobResult;
    }

    public GetYikeAgentJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public GetYikeAgentJobResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetYikeAgentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYikeAgentJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetYikeAgentJobResponseBodyJobResult extends TeaModel {
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

        public static GetYikeAgentJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeAgentJobResponseBodyJobResult self = new GetYikeAgentJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public GetYikeAgentJobResponseBodyJobResult setEditingProjectId(String editingProjectId) {
            this.editingProjectId = editingProjectId;
            return this;
        }
        public String getEditingProjectId() {
            return this.editingProjectId;
        }

        public GetYikeAgentJobResponseBodyJobResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetYikeAgentJobResponseBodyJobResult setOutputLanguage(String outputLanguage) {
            this.outputLanguage = outputLanguage;
            return this;
        }
        public String getOutputLanguage() {
            return this.outputLanguage;
        }

        public GetYikeAgentJobResponseBodyJobResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

}
