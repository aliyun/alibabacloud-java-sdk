// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetJobDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the AI task. This parameter takes effect only when the TaskType parameter is set to AI.</p>
     */
    @NameInMap("AIJobDetail")
    public GetJobDetailResponseBodyAIJobDetail AIJobDetail;

    /**
     * <p>The type of the task. Valid values:</p>
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
     * <p>The details of the snapshot task. This parameter takes effect only when the jobType parameter is set to Snapshot.</p>
     */
    @NameInMap("SnapshotJobDetail")
    public GetJobDetailResponseBodySnapshotJobDetail snapshotJobDetail;

    /**
     * <p>The details of the transcoding task. This parameter takes effect only when the jobType parameter is set to Transcode.</p>
     */
    @NameInMap("TranscodeJobDetail")
    public GetJobDetailResponseBodyTranscodeJobDetail transcodeJobDetail;

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
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:46Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>5c9dff751ba**********59d50a967f5</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p>AIVideoCensor</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>30e5d7**********bd900764de7c0102</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>reserved</li>
         * <li>init</li>
         * <li>success</li>
         * <li>fail</li>
         * <li>processing</li>
         * <li>analysing</li>
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
         * <p>The trigger mode. Valid values:</p>
         * <ul>
         * <li>Auto</li>
         * <li>Manual</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <p>The ID of the user who submitted the task.</p>
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
         * <p>The time when the task was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:45Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>63df12s0**********4hdq249t82kr91</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Configuration of normal snapshots.</p>
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
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>Processing</li>
         * <li>Fail</li>
         * <li>Success</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The trigger mode. Valid values:</p>
         * <ul>
         * <li>Auto</li>
         * <li>Manual</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <p>The ID of the user who submitted the task.</p>
         * 
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The ID of the media asset.</p>
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
         * <p>The time when the task was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:34Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2dc1634e**********3f1d22d1a0174e</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>Submitted</li>
         * <li>Transcoding</li>
         * <li>TranscodeSuccess</li>
         * <li>TranscodeFail</li>
         * <li>TranscodeCancelled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TranscodeSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>dbfaaec9e**********bf0b81219244c</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The ID of the user who submitted the task.</p>
         * 
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The ID of the media asset.</p>
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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("ActivityResults")
        public String activityResults;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskInput")
        public String taskInput;

        @NameInMap("UserData")
        public String userData;

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
