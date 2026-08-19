// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetJobDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the AI task. This field has a value only when TaskType is AI.</p>
     */
    @NameInMap("AIJobDetail")
    public GetJobDetailResponseBodyAIJobDetail AIJobDetail;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>transcode</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6708D849-F109-1A6C-AC91-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the snapshot task. This field has a value only when jobType is Snapshot.</p>
     */
    @NameInMap("SnapshotJobDetail")
    public GetJobDetailResponseBodySnapshotJobDetail snapshotJobDetail;

    /**
     * <p>The details of the transcoding task. This field has a value only when jobType is Transcode.</p>
     */
    @NameInMap("TranscodeJobDetail")
    public GetJobDetailResponseBodyTranscodeJobDetail transcodeJobDetail;

    /**
     * <p>The details of the workflow task. This field has a value only when TaskType is Workflow.</p>
     */
    @NameInMap("WorkflowTaskDetail")
    public GetJobDetailResponseBodyWorkflowTaskDetail workflowTaskDetail;

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

    public GetJobDetailResponseBody setWorkflowTaskDetail(GetJobDetailResponseBodyWorkflowTaskDetail workflowTaskDetail) {
        this.workflowTaskDetail = workflowTaskDetail;
        return this;
    }
    public GetJobDetailResponseBodyWorkflowTaskDetail getWorkflowTaskDetail() {
        return this.workflowTaskDetail;
    }

    public static class GetJobDetailResponseBodyAIJobDetail extends TeaModel {
        /**
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:46Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the task was created, in UTC. Format: YYYY-MM-DDTHH:MM:SSZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c9dff751ba**********59d50a967f5</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The AI task type.</p>
         * 
         * <strong>example:</strong>
         * <p>AIVideoCensor</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30e5d7**********bd900764de7c0102</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>reserved: submitted.</li>
         * <li>init: started.</li>
         * <li>success: execution succeeded.</li>
         * <li>fail: execution failed.</li>
         * <li>processing: processing in progress.</li>
         * <li>analysing: analysis in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AuditRange&quot;:[&quot;video&quot;,&quot;image-cover&quot;,&quot;text-title&quot;],&quot;AuditContent&quot;:[&quot;screen&quot;],&quot;AuditItem&quot;:[&quot;terrorism&quot;,&quot;porn&quot;],&quot;AuditAutoBlock&quot;:&quot;no&quot;}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The trigger method. Valid values:</p>
         * <ul>
         * <li>Auto: automatically triggered by a workflow.</li>
         * <li>Manual: manually submitted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <p>The ID of the user who initiated the task.</p>
         * 
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
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:45Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the task was created, in UTC. Format: YYYY-MM-DDTHH:MM:SSZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>63df12s0**********4hdq249t82kr91</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The normal snapshot configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;inl&quot;:0,&quot;num&quot;:32,&quot;tm&quot;:5,&quot;wd&quot;:&quot;352&quot;,&quot;ft&quot;:&quot;normal&quot;,&quot;hg&quot;:&quot;640&quot;}</p>
         */
        @NameInMap("NormalConfig")
        public String normalConfig;

        /**
         * <p>The sprite configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pad&quot;:&quot;0&quot;,&quot;lines&quot;:&quot;10&quot;,&quot;mgin&quot;:&quot;0&quot;,&quot;cols&quot;:&quot;10&quot;,&quot;ikcp&quot;:&quot;false&quot;,&quot;hg&quot;:&quot;68&quot;}</p>
         */
        @NameInMap("SpriteConfig")
        public String spriteConfig;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Processing: processing in progress.</li>
         * <li>Fail: task failed.</li>
         * <li>Success: task succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The trigger method. Valid values:</p>
         * <ul>
         * <li>Auto: automatically triggered by a workflow.</li>
         * <li>Manual: manually submitted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <p>The ID of the user who initiated the task.</p>
         * 
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The media asset ID.</p>
         * 
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
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:34Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the task was created, in UTC. Format: YYYY-MM-DDTHH:MM:SSZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The definition.</p>
         * 
         * <strong>example:</strong>
         * <p>HD</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2dc1634e**********3f1d22d1a0174e</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Submitted: submitted.</li>
         * <li>Transcoding: transcoding in progress.</li>
         * <li>TranscodeSuccess: transcoding succeeded.</li>
         * <li>TranscodeFail: transcoding failed.</li>
         * <li>TranscodeCancelled: transcoding canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TranscodeSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dbfaaec9e**********bf0b81219244c</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The ID of the user who initiated the task.</p>
         * 
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The media asset ID.</p>
         * 
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

    public static class GetJobDetailResponseBodyWorkflowTaskDetailWorkflow extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the workflow was created, in UTC. Format: YYYY-MM-DDTHH:MM:SSZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26T05:50:14Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the workflow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26T07:51:55Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>All_Activity_New_1_app-1000000</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The workflow status. Valid values:</p>
         * <ul>
         * <li>Active: activated.</li>
         * <li>Inactive: not activated.</li>
         * <li>Deleted: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The workflow type. Not populated by default.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vw_09d6*****b5c5b19a0c891e02</p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        public static GetJobDetailResponseBodyWorkflowTaskDetailWorkflow build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseBodyWorkflowTaskDetailWorkflow self = new GetJobDetailResponseBodyWorkflowTaskDetailWorkflow();
            return TeaModel.build(map, self);
        }

        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetJobDetailResponseBodyWorkflowTaskDetail extends TeaModel {
        /**
         * <p>The processing results of each workflow node, in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;VodSnapshot_123\&quot;:{\&quot;ActivityId\&quot;:\&quot;VodSnapshot\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;c8cf62d53bef4e04bf703976bae6d0b9\&quot;,\&quot;EndTime\&quot;:\&quot;2025-03-27T08:15:51Z\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;RequestId\\\&quot;:\\\&quot;8B3649AF-5A6B-1099-BEB6-164D81067398\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;SnapshotComplete\\\&quot;,\\\&quot;UserId\\\&quot;:1797131669910763,\\\&quot;MessageBody\\\&quot;:{\\\&quot;Status\\\&quot;:\\\&quot;success\\\&quot;,\\\&quot;VideoId\\\&quot;:\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;SnapshotComplete\\\&quot;,\\\&quot;EventTime\\\&quot;:\\\&quot;2025-03-27T08:15:50Z\\\&quot;,\\\&quot;TriggerSource\\\&quot;:\\\&quot;{\\\\\\\&quot;ActivityInstanceId\\\\\\\&quot;:\\\\\\\&quot;c8cf62d53bef4e04bf703976bae6d0b9\\\\\\\&quot;,\\\\\\\&quot;BizType\\\\\\\&quot;:\\\\\\\&quot;ice-workflow\\\\\\\&quot;}\\\&quot;}}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:47Z\&quot;,\&quot;Status\&quot;:\&quot;Succeed\&quot;},\&quot;Translate_zh_en\&quot;:{\&quot;ActivityId\&quot;:\&quot;VodTranslation\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;c043a872bb044763a3d293a5c2458b50\&quot;,\&quot;EndTime\&quot;:\&quot;2025-03-27T08:20:19Z\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;Type\\\&quot;:\\\&quot;VideoTranslationAll\\\&quot;,\\\&quot;Success\\\&quot;:false}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:46Z\&quot;,\&quot;Status\&quot;:\&quot;Failed\&quot;},\&quot;Act_Start\&quot;:{\&quot;ActivityId\&quot;:\&quot;start\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;8a9402f4ff064084bf496707fb2d664a\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;Type\\\&quot;:\\\&quot;Media\\\&quot;,\\\&quot;bizType\\\&quot;:6,\\\&quot;Media\\\&quot;:\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\&quot;,\\\&quot;Title\\\&quot;:\\\&quot;2.mp4\\\&quot;,\\\&quot;taskInput\\\&quot;:\\\&quot;{\\\\\\\&quot;Type\\\\\\\&quot;:\\\\\\\&quot;Media\\\\\\\&quot;,\\\\\\\&quot;Media\\\\\\\&quot;:\\\\\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\\\\\&quot;}\\\&quot;,\\\&quot;userTaskInput\\\&quot;:\\\&quot;{\\\\\\\&quot;Type\\\\\\\&quot;:\\\\\\\&quot;Media\\\\\\\&quot;,\\\\\\\&quot;Media\\\\\\\&quot;:\\\\\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\\\\\&quot;,\\\\\\\&quot;Title\\\\\\\&quot;:\\\\\\\&quot;2.mp4\\\\\\\&quot;,\\\\\\\&quot;StorageLocation\\\\\\\&quot;:\\\\\\\&quot;yiming-pre.oss-cn-shanghai.aliyuncs.com\\\\\\\&quot;}\\\&quot;,\\\&quot;StorageLocation\\\&quot;:\\\&quot;yiming-pre.oss-cn-shanghai.aliyuncs.com\\\&quot;,\\\&quot;callerUid\\\&quot;:1797131669910763,\\\&quot;CUR_NODE_NAME\\\&quot;:\\\&quot;Act_Start\\\&quot;}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:45Z\&quot;,\&quot;Status\&quot;:\&quot;Succeed\&quot;},\&quot;VodDynamicImage_123\&quot;:{\&quot;ActivityId\&quot;:\&quot;VodDynamicImage\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;26e8dab82ab84110b1150f146caf633c\&quot;,\&quot;EndTime\&quot;:\&quot;2025-03-27T08:15:55Z\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;RequestId\\\&quot;:\\\&quot;7120B5D5-430F-14AD-8922-577F072DDD64\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;DynamicImageComplete\\\&quot;,\\\&quot;UserId\\\&quot;:1797131669910763,\\\&quot;MessageBody\\\&quot;:{\\\&quot;Status\\\&quot;:\\\&quot;success\\\&quot;,\\\&quot;VideoId\\\&quot;:\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;DynamicImageComplete\\\&quot;,\\\&quot;EventTime\\\&quot;:\\\&quot;2025-03-27T08:15:52Z\\\&quot;,\\\&quot;TriggerSource\\\&quot;:\\\&quot;{\\\\\\\&quot;ActivityInstanceId\\\\\\\&quot;:\\\\\\\&quot;26e8dab82ab84110b1150f146caf633c\\\\\\\&quot;,\\\\\\\&quot;BizType\\\\\\\&quot;:\\\\\\\&quot;ice-workflow\\\\\\\&quot;}\\\&quot;}}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:47Z\&quot;,\&quot;Status\&quot;:\&quot;Succeed\&quot;}}</p>
         */
        @NameInMap("ActivityResults")
        public String activityResults;

        /**
         * <p>The time when the task was created, in UTC. Format: YYYY-MM-DDTHH:MM:SSZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-27T08:15:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-27T08:20:19Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Init: started.</li>
         * <li>Processing: processing in progress.</li>
         * <li>Succeed: succeeded.</li>
         * <li>Failed: failed.</li>
         * <li>Canceled: canceled.</li>
         * <li>Skip: skipped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46ecc024******92c8e26237e51</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The media asset information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;:\&quot;Media\&quot;,\&quot;Media\&quot;:\&quot;00f985a50ae371f0ad1c4106e0ea0102\&quot;,\&quot;Title\&quot;:\&quot;2.mp4\&quot;,\&quot;StorageLocation\&quot;:\&quot;yiming-pre.oss-cn-shanghai.aliyuncs.com\&quot;}</p>
         */
        @NameInMap("TaskInput")
        public String taskInput;

        /**
         * <p>The custom settings. The value is a JSON string that supports message callback, upload acceleration, and other settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The workflow details.</p>
         */
        @NameInMap("Workflow")
        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow workflow;

        public static GetJobDetailResponseBodyWorkflowTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseBodyWorkflowTaskDetail self = new GetJobDetailResponseBodyWorkflowTaskDetail();
            return TeaModel.build(map, self);
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setActivityResults(String activityResults) {
            this.activityResults = activityResults;
            return this;
        }
        public String getActivityResults() {
            return this.activityResults;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setTaskInput(String taskInput) {
            this.taskInput = taskInput;
            return this;
        }
        public String getTaskInput() {
            return this.taskInput;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetJobDetailResponseBodyWorkflowTaskDetail setWorkflow(GetJobDetailResponseBodyWorkflowTaskDetailWorkflow workflow) {
            this.workflow = workflow;
            return this;
        }
        public GetJobDetailResponseBodyWorkflowTaskDetailWorkflow getWorkflow() {
            return this.workflow;
        }

    }

}
