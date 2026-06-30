// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikePromptExpansionVoiceFixJobResponseBody extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-30T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The error code. This parameter is returned when the task is in the Failed state.</p>
     * 
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82df****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The task parameters, in JSON format. The following fields are included:</p>
     * <ul>
     * <li>model (String, required): The model name. Example: happyhorse-1.0-r2v.</li>
     * <li>input (Object, required): The input data object.<ul>
     * <li>prompt (String, required): The prompt content. The maximum length is 10,000 characters.</li>
     * <li>media (Array(Object), required): The list of media materials used to specify reference images and audio.<ul>
     * <li>type (String, required): The input media type. Valid values: reference_image and reference_audio.</li>
     * <li>url (String, required): The URL of the input media.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>parameters (Object, required): The video generation parameter object.<ul>
     * <li>duration (Integer, required): The video duration in seconds. The value must be a positive integer. Valid values: 5 to 15.</li>
     * <li>ratio (String, required): The aspect ratio. Valid values: 16:9, 9:16, 4:3, 3:4, and 1:1.</li>
     * <li>resolution (String, required): The video resolution. Valid values: 720P and 1080P.</li>
     * <li>specialEdition (Bool, optional): The cost-effective edition parameter. This parameter can be set to true only when the resolution is 1080P.</li>
     * <li>skipPromptEnhancer (Bool, optional): Specifies whether to skip prompt enhancement. Default value: false.</li>
     * <li>skipVoiceResync (Bool, optional): Specifies whether to skip audio repair. Default value: false.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;model\&quot;:\&quot;happyhorse-1.0-r2v\&quot;,\&quot;input\&quot;:{\&quot;prompt\&quot;:\&quot;[Image 1]中身着红色旗袍的女性，镜头先以侧面中景勾勒旗袍修身剪裁与S型曲线，随即切换至低角度仰拍，捕捉她轻抬玉手展开[Image 2]中的折扇的同时，[Image 3]中的流苏耳坠随头部转动轻盈摆动的细节，最后推近至面部特写，定格在她指尖轻点扇骨、眼波流转间的含蓄风情，多视角全方位展现东方韵味。\&quot;,\&quot;media\&quot;:[{\&quot;type\&quot;:\&quot;reference_image\&quot;,\&quot;url\&quot;:\&quot;<a href="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/mvzfud/hh-v2v-girl.jpg%5C%5C%22%7D,%7B%5C%5C%22type%5C%5C%22:%5C%5C%22reference_image%5C%5C%22,%5C%5C%22url%5C%5C%22:%5C%5C%22https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/fvuihk/hh-v2v2-folding-fan.jpg%5C%5C%22%7D,%7B%5C%5C%22type%5C%5C%22:%5C%5C%22reference_image%5C%5C%22,%5C%5C%22url%5C%5C%22:%5C%5C%22https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/imerii/hh-v2v-earrings.jpg%5C%5C%22%7D%5D%7D,%5C%5C%22parameters%5C%5C%22:%7B%5C%5C%22resolution%5C%5C%22:%5C%5C%22720P%5C%5C%22,%5C%5C%22ratio%5C%5C%22:%5C%5C%2216:9%5C%5C%22,%5C%5C%22duration%5C%5C%22:5,%5C%5C%22specialEdition%5C%5C%22:false,%5C%5C%22skipPromptEnhancer%5C%5C%22:false,%5C%5C%22skipVoiceResync%5C%5C%22:false%7D%7D">https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/mvzfud/hh-v2v-girl.jpg\\&quot;},{\\&quot;type\\&quot;:\\&quot;reference_image\\&quot;,\\&quot;url\\&quot;:\\&quot;https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/fvuihk/hh-v2v2-folding-fan.jpg\\&quot;},{\\&quot;type\\&quot;:\\&quot;reference_image\\&quot;,\\&quot;url\\&quot;:\\&quot;https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20260424/imerii/hh-v2v-earrings.jpg\\&quot;}]},\\&quot;parameters\\&quot;:{\\&quot;resolution\\&quot;:\\&quot;720P\\&quot;,\\&quot;ratio\\&quot;:\\&quot;16:9\\&quot;,\\&quot;duration\\&quot;:5,\\&quot;specialEdition\\&quot;:false,\\&quot;skipPromptEnhancer\\&quot;:false,\\&quot;skipVoiceResync\\&quot;:false}}</a></p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The task result of the node.</p>
     */
    @NameInMap("JobResult")
    public java.util.List<GetYikePromptExpansionVoiceFixJobResponseBodyJobResult> jobResult;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p><strong>Succeeded</strong>: The task is processed.</p>
     * </li>
     * <li><p><strong>Failed</strong>: The task failed.</p>
     * </li>
     * <li><p><strong>Running</strong>: The task is being processed.</p>
     * </li>
     * </ul>
     * 
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

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-24T00:55:06Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The custom user parameter.</p>
     * 
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
