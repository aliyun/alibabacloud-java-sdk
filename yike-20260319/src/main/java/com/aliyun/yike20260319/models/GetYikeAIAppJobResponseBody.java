// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAIAppJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;LoadImage.1.TargetImage\&quot;:\&quot;MediaId1\&quot;}</p>
     */
    @NameInMap("AppParams")
    public String appParams;

    /**
     * <strong>example:</strong>
     * <p>2026-02-06T18:53:18.809+08:00</p>
     */
    @NameInMap("ExecutionFinishTime")
    public String executionFinishTime;

    /**
     * <strong>example:</strong>
     * <p>2026-02-06T18:53:34.001+08:00</p>
     */
    @NameInMap("ExecutionStartTime")
    public String executionStartTime;

    /**
     * <strong>example:</strong>
     * <p>folder-u3ilwhoc36ux9a****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <strong>example:</strong>
     * <p>0622C702-41BE-467E-AF2E-883D4517962E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetYikeAIAppJobResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetYikeAIAppJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAIAppJobResponseBody self = new GetYikeAIAppJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeAIAppJobResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetYikeAIAppJobResponseBody setAppParams(String appParams) {
        this.appParams = appParams;
        return this;
    }
    public String getAppParams() {
        return this.appParams;
    }

    public GetYikeAIAppJobResponseBody setExecutionFinishTime(String executionFinishTime) {
        this.executionFinishTime = executionFinishTime;
        return this;
    }
    public String getExecutionFinishTime() {
        return this.executionFinishTime;
    }

    public GetYikeAIAppJobResponseBody setExecutionStartTime(String executionStartTime) {
        this.executionStartTime = executionStartTime;
        return this;
    }
    public String getExecutionStartTime() {
        return this.executionStartTime;
    }

    public GetYikeAIAppJobResponseBody setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public GetYikeAIAppJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetYikeAIAppJobResponseBody setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public GetYikeAIAppJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYikeAIAppJobResponseBody setResult(GetYikeAIAppJobResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetYikeAIAppJobResponseBodyResult getResult() {
        return this.result;
    }

    public GetYikeAIAppJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetYikeAIAppJobResponseBodyResultAudioResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1a7852b032c371f0b64fe6f6c74b****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp3">http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp3</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetYikeAIAppJobResponseBodyResultAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeAIAppJobResponseBodyResultAudioResult self = new GetYikeAIAppJobResponseBodyResultAudioResult();
            return TeaModel.build(map, self);
        }

        public GetYikeAIAppJobResponseBodyResultAudioResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetYikeAIAppJobResponseBodyResultAudioResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class GetYikeAIAppJobResponseBodyResultImageResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1a7852b032c371f0b64fe6f6c74b****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.png">http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.png</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetYikeAIAppJobResponseBodyResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeAIAppJobResponseBodyResultImageResult self = new GetYikeAIAppJobResponseBodyResultImageResult();
            return TeaModel.build(map, self);
        }

        public GetYikeAIAppJobResponseBodyResultImageResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetYikeAIAppJobResponseBodyResultImageResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class GetYikeAIAppJobResponseBodyResultVideoResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1a7852b032c371f0b64fe6f6c74b****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4">http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static GetYikeAIAppJobResponseBodyResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeAIAppJobResponseBodyResultVideoResult self = new GetYikeAIAppJobResponseBodyResultVideoResult();
            return TeaModel.build(map, self);
        }

        public GetYikeAIAppJobResponseBodyResultVideoResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetYikeAIAppJobResponseBodyResultVideoResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class GetYikeAIAppJobResponseBodyResult extends TeaModel {
        @NameInMap("AudioResult")
        public java.util.List<GetYikeAIAppJobResponseBodyResultAudioResult> audioResult;

        @NameInMap("ImageResult")
        public java.util.List<GetYikeAIAppJobResponseBodyResultImageResult> imageResult;

        @NameInMap("VideoResult")
        public java.util.List<GetYikeAIAppJobResponseBodyResultVideoResult> videoResult;

        public static GetYikeAIAppJobResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeAIAppJobResponseBodyResult self = new GetYikeAIAppJobResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetYikeAIAppJobResponseBodyResult setAudioResult(java.util.List<GetYikeAIAppJobResponseBodyResultAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<GetYikeAIAppJobResponseBodyResultAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public GetYikeAIAppJobResponseBodyResult setImageResult(java.util.List<GetYikeAIAppJobResponseBodyResultImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<GetYikeAIAppJobResponseBodyResultImageResult> getImageResult() {
            return this.imageResult;
        }

        public GetYikeAIAppJobResponseBodyResult setVideoResult(java.util.List<GetYikeAIAppJobResponseBodyResultVideoResult> videoResult) {
            this.videoResult = videoResult;
            return this;
        }
        public java.util.List<GetYikeAIAppJobResponseBodyResultVideoResult> getVideoResult() {
            return this.videoResult;
        }

    }

}
