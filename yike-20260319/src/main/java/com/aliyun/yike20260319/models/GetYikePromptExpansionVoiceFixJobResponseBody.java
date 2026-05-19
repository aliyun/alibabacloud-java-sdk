// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikePromptExpansionVoiceFixJobResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82df****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("JobResult")
    public java.util.List<GetYikePromptExpansionVoiceFixJobResponseBodyJobResult> jobResult;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>{&quot;testKey&quot;:&quot;testValue&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GetYikePromptExpansionVoiceFixJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikePromptExpansionVoiceFixJobResponseBody self = new GetYikePromptExpansionVoiceFixJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setJobResult(java.util.List<GetYikePromptExpansionVoiceFixJobResponseBodyJobResult> jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public java.util.List<GetYikePromptExpansionVoiceFixJobResponseBodyJobResult> getJobResult() {
        return this.jobResult;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetYikePromptExpansionVoiceFixJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetYikePromptExpansionVoiceFixJobResponseBodyJobResult extends TeaModel {
        /**
         * <p>Oss Url</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetYikePromptExpansionVoiceFixJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikePromptExpansionVoiceFixJobResponseBodyJobResult self = new GetYikePromptExpansionVoiceFixJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public GetYikePromptExpansionVoiceFixJobResponseBodyJobResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

}
