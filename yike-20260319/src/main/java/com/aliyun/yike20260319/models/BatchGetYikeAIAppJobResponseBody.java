// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class BatchGetYikeAIAppJobResponseBody extends TeaModel {
    @NameInMap("JobList")
    public java.util.List<BatchGetYikeAIAppJobResponseBodyJobList> jobList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchGetYikeAIAppJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetYikeAIAppJobResponseBody self = new BatchGetYikeAIAppJobResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetYikeAIAppJobResponseBody setJobList(java.util.List<BatchGetYikeAIAppJobResponseBodyJobList> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<BatchGetYikeAIAppJobResponseBodyJobList> getJobList() {
        return this.jobList;
    }

    public BatchGetYikeAIAppJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bb1dfa20a0c971f08c94e7f6d6496202</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp3">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp3</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult self = new BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class BatchGetYikeAIAppJobResponseBodyJobListResultImageResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>318d6350a57d71f08c9ae7f7d4496302</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.jpg">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.jpg</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static BatchGetYikeAIAppJobResponseBodyJobListResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAIAppJobResponseBodyJobListResultImageResult self = new BatchGetYikeAIAppJobResponseBodyJobListResultImageResult();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResultImageResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResultImageResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ec2de25068fd71f0a48cf7e6c4596302</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp4">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        public static BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult self = new BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class BatchGetYikeAIAppJobResponseBodyJobListResult extends TeaModel {
        @NameInMap("AudioResult")
        public java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult> audioResult;

        @NameInMap("ImageResult")
        public java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultImageResult> imageResult;

        @NameInMap("VideoResult")
        public java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult> videoResult;

        public static BatchGetYikeAIAppJobResponseBodyJobListResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAIAppJobResponseBodyJobListResult self = new BatchGetYikeAIAppJobResponseBodyJobListResult();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResult setAudioResult(java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResult setImageResult(java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultImageResult> getImageResult() {
            return this.imageResult;
        }

        public BatchGetYikeAIAppJobResponseBodyJobListResult setVideoResult(java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult> videoResult) {
            this.videoResult = videoResult;
            return this;
        }
        public java.util.List<BatchGetYikeAIAppJobResponseBodyJobListResultVideoResult> getVideoResult() {
            return this.videoResult;
        }

    }

    public static class BatchGetYikeAIAppJobResponseBodyJobList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9e09955d662a</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;LoadImage.1.TargetImage\&quot;:\&quot;MediaId1\&quot;}</p>
         */
        @NameInMap("AppInputConfig")
        public String appInputConfig;

        /**
         * <strong>example:</strong>
         * <p>2026-02-06T18:53:34.001+08:00</p>
         */
        @NameInMap("ExecutionFinishTime")
        public String executionFinishTime;

        /**
         * <strong>example:</strong>
         * <p>2026-02-06T18:53:18.809+08:00</p>
         */
        @NameInMap("ExecutionStartTime")
        public String executionStartTime;

        /**
         * <strong>example:</strong>
         * <p>pd_0617169475</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>pd_0617169475</p>
         */
        @NameInMap("ProductionId")
        public String productionId;

        @NameInMap("Result")
        public BatchGetYikeAIAppJobResponseBodyJobListResult result;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        public static BatchGetYikeAIAppJobResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetYikeAIAppJobResponseBodyJobList self = new BatchGetYikeAIAppJobResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setAppInputConfig(String appInputConfig) {
            this.appInputConfig = appInputConfig;
            return this;
        }
        public String getAppInputConfig() {
            return this.appInputConfig;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setExecutionFinishTime(String executionFinishTime) {
            this.executionFinishTime = executionFinishTime;
            return this;
        }
        public String getExecutionFinishTime() {
            return this.executionFinishTime;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setProductionId(String productionId) {
            this.productionId = productionId;
            return this;
        }
        public String getProductionId() {
            return this.productionId;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setResult(BatchGetYikeAIAppJobResponseBodyJobListResult result) {
            this.result = result;
            return this;
        }
        public BatchGetYikeAIAppJobResponseBodyJobListResult getResult() {
            return this.result;
        }

        public BatchGetYikeAIAppJobResponseBodyJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
