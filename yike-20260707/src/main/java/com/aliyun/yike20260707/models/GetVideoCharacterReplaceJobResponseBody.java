// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoCharacterReplaceJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the video character replacement application. Use a configured application.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application input parameters, which are serialized into a JSON string. The field names and material requirements are subject to the input definition of the corresponding AppId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;LoadImage.1.TargetImage&quot;:&quot;1a7852b032c371f0b64fe6f6c74b****&quot;}</p>
     */
    @NameInMap("AppParams")
    public String appParams;

    /**
     * <p>The time when the task finished execution, in ISO 8601 format with time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T18:54:18.809+08:00</p>
     */
    @NameInMap("ExecutionFinishTime")
    public String executionFinishTime;

    /**
     * <p>The time when the task started execution, in ISO 8601 format with time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T18:53:34.001+08:00</p>
     */
    @NameInMap("ExecutionStartTime")
    public String executionStartTime;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>folder-u3ilwhoc36ux9a****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The task ID, which is returned by SubmitVideoCharacterReplaceJob.</p>
     * 
     * <strong>example:</strong>
     * <p>ag_83baeea38b534ee1937b8a4acd08****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_061716****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task output results, categorized by image, video, and audio.</p>
     */
    @NameInMap("Result")
    public GetVideoCharacterReplaceJobResponseBodyResult result;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>Created: The task is created.</li>
     * <li>Queuing: The task is queuing.</li>
     * <li>Executing: The task is being executed.</li>
     * <li>Finished: The task is finished.</li>
     * <li>Failed: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetVideoCharacterReplaceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCharacterReplaceJobResponseBody self = new GetVideoCharacterReplaceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoCharacterReplaceJobResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetVideoCharacterReplaceJobResponseBody setAppParams(String appParams) {
        this.appParams = appParams;
        return this;
    }
    public String getAppParams() {
        return this.appParams;
    }

    public GetVideoCharacterReplaceJobResponseBody setExecutionFinishTime(String executionFinishTime) {
        this.executionFinishTime = executionFinishTime;
        return this;
    }
    public String getExecutionFinishTime() {
        return this.executionFinishTime;
    }

    public GetVideoCharacterReplaceJobResponseBody setExecutionStartTime(String executionStartTime) {
        this.executionStartTime = executionStartTime;
        return this;
    }
    public String getExecutionStartTime() {
        return this.executionStartTime;
    }

    public GetVideoCharacterReplaceJobResponseBody setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public GetVideoCharacterReplaceJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetVideoCharacterReplaceJobResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetVideoCharacterReplaceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoCharacterReplaceJobResponseBody setResult(GetVideoCharacterReplaceJobResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetVideoCharacterReplaceJobResponseBodyResult getResult() {
        return this.result;
    }

    public GetVideoCharacterReplaceJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetVideoCharacterReplaceJobResponseBodyResultAudioResult extends TeaModel {
        /**
         * <p>The ID of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1a7852b032c371f0b64fe6f6c74b****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The download URL of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp3">https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp3</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetVideoCharacterReplaceJobResponseBodyResultAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCharacterReplaceJobResponseBodyResultAudioResult self = new GetVideoCharacterReplaceJobResponseBodyResultAudioResult();
            return TeaModel.build(map, self);
        }

        public GetVideoCharacterReplaceJobResponseBodyResultAudioResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetVideoCharacterReplaceJobResponseBodyResultAudioResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class GetVideoCharacterReplaceJobResponseBodyResultImageResult extends TeaModel {
        /**
         * <p>The ID of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1a7852b032c371f0b64fe6f6c74b****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The download URL of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.png">https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.png</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetVideoCharacterReplaceJobResponseBodyResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCharacterReplaceJobResponseBodyResultImageResult self = new GetVideoCharacterReplaceJobResponseBodyResultImageResult();
            return TeaModel.build(map, self);
        }

        public GetVideoCharacterReplaceJobResponseBodyResultImageResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetVideoCharacterReplaceJobResponseBodyResultImageResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class GetVideoCharacterReplaceJobResponseBodyResultVideoResult extends TeaModel {
        /**
         * <p>The ID of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1a7852b032c371f0b64fe6f6c74b****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The download URL of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4">https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetVideoCharacterReplaceJobResponseBodyResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCharacterReplaceJobResponseBodyResultVideoResult self = new GetVideoCharacterReplaceJobResponseBodyResultVideoResult();
            return TeaModel.build(map, self);
        }

        public GetVideoCharacterReplaceJobResponseBodyResultVideoResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetVideoCharacterReplaceJobResponseBodyResultVideoResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class GetVideoCharacterReplaceJobResponseBodyResult extends TeaModel {
        /**
         * <p>The list of output audio files.</p>
         */
        @NameInMap("AudioResult")
        public java.util.List<GetVideoCharacterReplaceJobResponseBodyResultAudioResult> audioResult;

        /**
         * <p>The list of output images.</p>
         */
        @NameInMap("ImageResult")
        public java.util.List<GetVideoCharacterReplaceJobResponseBodyResultImageResult> imageResult;

        /**
         * <p>The list of output videos.</p>
         */
        @NameInMap("VideoResult")
        public java.util.List<GetVideoCharacterReplaceJobResponseBodyResultVideoResult> videoResult;

        public static GetVideoCharacterReplaceJobResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCharacterReplaceJobResponseBodyResult self = new GetVideoCharacterReplaceJobResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetVideoCharacterReplaceJobResponseBodyResult setAudioResult(java.util.List<GetVideoCharacterReplaceJobResponseBodyResultAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<GetVideoCharacterReplaceJobResponseBodyResultAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public GetVideoCharacterReplaceJobResponseBodyResult setImageResult(java.util.List<GetVideoCharacterReplaceJobResponseBodyResultImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<GetVideoCharacterReplaceJobResponseBodyResultImageResult> getImageResult() {
            return this.imageResult;
        }

        public GetVideoCharacterReplaceJobResponseBodyResult setVideoResult(java.util.List<GetVideoCharacterReplaceJobResponseBodyResultVideoResult> videoResult) {
            this.videoResult = videoResult;
            return this;
        }
        public java.util.List<GetVideoCharacterReplaceJobResponseBodyResultVideoResult> getVideoResult() {
            return this.videoResult;
        }

    }

}
