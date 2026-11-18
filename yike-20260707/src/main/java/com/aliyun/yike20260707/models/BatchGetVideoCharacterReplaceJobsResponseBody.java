// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class BatchGetVideoCharacterReplaceJobsResponseBody extends TeaModel {
    /**
     * <p>The list of queried jobs.</p>
     */
    @NameInMap("JobList")
    public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobList> jobList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchGetVideoCharacterReplaceJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetVideoCharacterReplaceJobsResponseBody self = new BatchGetVideoCharacterReplaceJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetVideoCharacterReplaceJobsResponseBody setJobList(java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobList> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobList> getJobList() {
        return this.jobList;
    }

    public BatchGetVideoCharacterReplaceJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult extends TeaModel {
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

        public static BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult self = new BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult();
            return TeaModel.build(map, self);
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult extends TeaModel {
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

        public static BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult self = new BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult();
            return TeaModel.build(map, self);
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult extends TeaModel {
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

        public static BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult self = new BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult();
            return TeaModel.build(map, self);
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

    }

    public static class BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult extends TeaModel {
        /**
         * <p>The list of output audio files.</p>
         */
        @NameInMap("AudioResult")
        public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult> audioResult;

        /**
         * <p>The list of output images.</p>
         */
        @NameInMap("ImageResult")
        public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult> imageResult;

        /**
         * <p>The list of output videos.</p>
         */
        @NameInMap("VideoResult")
        public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult> videoResult;

        public static BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult self = new BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult();
            return TeaModel.build(map, self);
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult setAudioResult(java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult setImageResult(java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultImageResult> getImageResult() {
            return this.imageResult;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult setVideoResult(java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult> videoResult) {
            this.videoResult = videoResult;
            return this;
        }
        public java.util.List<BatchGetVideoCharacterReplaceJobsResponseBodyJobListResultVideoResult> getVideoResult() {
            return this.videoResult;
        }

    }

    public static class BatchGetVideoCharacterReplaceJobsResponseBodyJobList extends TeaModel {
        /**
         * <p>The ID of the video character replacement application. Make sure to use a configured application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application input parameters specified when the job was submitted. The value is a JSON-serialized string. This corresponds to the AppParams parameter in the submit operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;LoadImage.1.TargetImage&quot;:&quot;1a7852b032c371f0b64fe6f6c74b****&quot;}</p>
         */
        @NameInMap("AppInputConfig")
        public String appInputConfig;

        /**
         * <p>The time when the job finished execution. The time is in the ISO 8601 format with a time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T18:54:18.809+08:00</p>
         */
        @NameInMap("ExecutionFinishTime")
        public String executionFinishTime;

        /**
         * <p>The time when the job started execution. The time is in the ISO 8601 format with a time zone.</p>
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
         * <p>The job ID, which is returned by the SubmitVideoCharacterReplaceJob operation.</p>
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
         * <p>The output results of the job, categorized by image, video, and audio.</p>
         */
        @NameInMap("Result")
        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult result;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Created: The job is created.</li>
         * <li>Queuing: The job is in the queue.</li>
         * <li>Executing: The job is being executed.</li>
         * <li>Finished: The job is finished.</li>
         * <li>Failed: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static BatchGetVideoCharacterReplaceJobsResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetVideoCharacterReplaceJobsResponseBodyJobList self = new BatchGetVideoCharacterReplaceJobsResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setAppInputConfig(String appInputConfig) {
            this.appInputConfig = appInputConfig;
            return this;
        }
        public String getAppInputConfig() {
            return this.appInputConfig;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setExecutionFinishTime(String executionFinishTime) {
            this.executionFinishTime = executionFinishTime;
            return this;
        }
        public String getExecutionFinishTime() {
            return this.executionFinishTime;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setExecutionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setResult(BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult result) {
            this.result = result;
            return this;
        }
        public BatchGetVideoCharacterReplaceJobsResponseBodyJobListResult getResult() {
            return this.result;
        }

        public BatchGetVideoCharacterReplaceJobsResponseBodyJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
