// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetJobDetailResponseBody extends TeaModel {
    @NameInMap("AIJobDetail")
    public GetJobDetailResponseBodyAIJobDetail AIJobDetail;

    /**
     * <strong>example:</strong>
     * <p>transcode</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <strong>example:</strong>
     * <p>6708D849-F109-1A6C-AC91-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotJobDetail")
    public GetJobDetailResponseBodySnapshotJobDetail snapshotJobDetail;

    @NameInMap("TranscodeJobDetail")
    public GetJobDetailResponseBodyTranscodeJobDetail transcodeJobDetail;

    public static GetJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobDetailResponseBody self = new GetJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobDetailResponseBody setAIJobDetail(GetJobDetailResponseBodyAIJobDetail AIJobDetail) {
        this.AIJobDetail = AIJobDetail;
        return this;
    }
    public GetJobDetailResponseBodyAIJobDetail getAIJobDetail() {
        return this.AIJobDetail;
    }

    public GetJobDetailResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobDetailResponseBody setSnapshotJobDetail(GetJobDetailResponseBodySnapshotJobDetail snapshotJobDetail) {
        this.snapshotJobDetail = snapshotJobDetail;
        return this;
    }
    public GetJobDetailResponseBodySnapshotJobDetail getSnapshotJobDetail() {
        return this.snapshotJobDetail;
    }

    public GetJobDetailResponseBody setTranscodeJobDetail(GetJobDetailResponseBodyTranscodeJobDetail transcodeJobDetail) {
        this.transcodeJobDetail = transcodeJobDetail;
        return this;
    }
    public GetJobDetailResponseBodyTranscodeJobDetail getTranscodeJobDetail() {
        return this.transcodeJobDetail;
    }

    public static class GetJobDetailResponseBodyAIJobDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:46Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>5c9dff751ba**********59d50a967f5</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>AIVideoCensor</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>30e5d7**********bd900764de7c0102</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{&quot;AuditRange&quot;:[&quot;video&quot;,&quot;image-cover&quot;,&quot;text-title&quot;],&quot;AuditContent&quot;:[&quot;screen&quot;],&quot;AuditItem&quot;:[&quot;terrorism&quot;,&quot;porn&quot;],&quot;AuditAutoBlock&quot;:&quot;no&quot;}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static GetJobDetailResponseBodyAIJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseBodyAIJobDetail self = new GetJobDetailResponseBodyAIJobDetail();
            return TeaModel.build(map, self);
        }

        public GetJobDetailResponseBodyAIJobDetail setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetJobDetailResponseBodyAIJobDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobDetailResponseBodyAIJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobDetailResponseBodyAIJobDetail setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobDetailResponseBodyAIJobDetail setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetJobDetailResponseBodyAIJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseBodyAIJobDetail setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetJobDetailResponseBodyAIJobDetail setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

        public GetJobDetailResponseBodyAIJobDetail setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class GetJobDetailResponseBodySnapshotJobDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:45Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>63df12s0**********4hdq249t82kr91</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;inl&quot;:0,&quot;num&quot;:32,&quot;tm&quot;:5,&quot;wd&quot;:&quot;352&quot;,&quot;ft&quot;:&quot;normal&quot;,&quot;hg&quot;:&quot;640&quot;}</p>
         */
        @NameInMap("NormalConfig")
        public String normalConfig;

        /**
         * <strong>example:</strong>
         * <p>{&quot;pad&quot;:&quot;0&quot;,&quot;lines&quot;:&quot;10&quot;,&quot;mgin&quot;:&quot;0&quot;,&quot;cols&quot;:&quot;10&quot;,&quot;ikcp&quot;:&quot;false&quot;,&quot;hg&quot;:&quot;68&quot;}</p>
         */
        @NameInMap("SpriteConfig")
        public String spriteConfig;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <strong>example:</strong>
         * <p>30e5d7**********bd900764de7c0102</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static GetJobDetailResponseBodySnapshotJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseBodySnapshotJobDetail self = new GetJobDetailResponseBodySnapshotJobDetail();
            return TeaModel.build(map, self);
        }

        public GetJobDetailResponseBodySnapshotJobDetail setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setNormalConfig(String normalConfig) {
            this.normalConfig = normalConfig;
            return this;
        }
        public String getNormalConfig() {
            return this.normalConfig;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setSpriteConfig(String spriteConfig) {
            this.spriteConfig = spriteConfig;
            return this;
        }
        public String getSpriteConfig() {
            return this.spriteConfig;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetJobDetailResponseBodySnapshotJobDetail setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

    public static class GetJobDetailResponseBodyTranscodeJobDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:34Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>HD</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <strong>example:</strong>
         * <p>2dc1634e**********3f1d22d1a0174e</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>TranscodeSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>dbfaaec9e**********bf0b81219244c</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <strong>example:</strong>
         * <p>30e5d7**********bd900764de7c0102</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static GetJobDetailResponseBodyTranscodeJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseBodyTranscodeJobDetail self = new GetJobDetailResponseBodyTranscodeJobDetail();
            return TeaModel.build(map, self);
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetJobDetailResponseBodyTranscodeJobDetail setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
