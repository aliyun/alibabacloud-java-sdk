// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskDetail extends TeaModel {
    /**
     * <p>List of job administrators.</p>
     */
    @NameInMap("Admins")
    public java.util.List<SimpleUser> admins;

    /**
     * <p>Alert time.</p>
     * 
     * <strong>example:</strong>
     * <p>12412312</p>
     */
    @NameInMap("AlertTime")
    public Long alertTime;

    /**
     * <p>Indicates whether data appending is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowAppendData")
    public Boolean allowAppendData;

    /**
     * <p>Indicates whether the job has been archived.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Archived")
    public Boolean archived;

    /**
     * <p>Data archiving information.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ArchivedInfos")
    public String archivedInfos;

    /**
     * <p>Job assignment configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("AssignConfig")
    public java.util.Map<String, ?> assignConfig;

    /**
     * <p>Creator information.</p>
     */
    @NameInMap("Creator")
    public SimpleUser creator;

    /**
     * <p>List of Data proxy relationships.</p>
     */
    @NameInMap("DatasetProxyRelations")
    public java.util.List<TaskDetailDatasetProxyRelations> datasetProxyRelations;

    /**
     * <p>Additional configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    /**
     * <p>Creation UTC time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-04 11:42:57</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>UTC time of the last modification.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-16 18:38:42</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Annotation style.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("LabelStyle")
    public String labelStyle;

    /**
     * <p>My configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MineConfigs")
    public java.util.Map<String, ?> mineConfigs;

    /**
     * <p>Updated By information.</p>
     */
    @NameInMap("Modifier")
    public SimpleUser modifier;

    /**
     * <p>Notice configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DingHook&quot;:&quot;&quot;,&quot;ListenActions&quot;:[],&quot;SubTaskAlertGap&quot;:&quot;&quot;}</p>
     */
    @NameInMap("NoticeConfig")
    public java.util.Map<String, ?> noticeConfig;

    /**
     * <p>Time configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;periodConfigId&quot;:&quot;&quot;,&quot;status&quot;:&quot;&quot;}</p>
     */
    @NameInMap("PeriodConfig")
    public java.util.Map<String, ?> periodConfig;

    /**
     * <p>Auto triggered task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12312414</p>
     */
    @NameInMap("RefTaskId")
    public String refTaskId;

    /**
     * <p>Related job configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("RelateTaskConfig")
    public java.util.Map<String, ?> relateTaskConfig;

    /**
     * <p>Remark information.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Result callback configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RetMsgMode&quot;:&quot;&quot;,&quot;Exif&quot;:{}}</p>
     */
    @NameInMap("ResultCallbackConfig")
    public java.util.Map<String, ?> resultCallbackConfig;

    /**
     * <p>Current edge zone. Possible values:</p>
     * <ul>
     * <li>MARK: Annotating.</li>
     * <li>CHECK: Checking.</li>
     * <li>SAMPLING: Validating.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MARK</p>
     */
    @NameInMap("Stage")
    public String stage;

    /**
     * <p>Task Status. Possible values:</p>
     * <ul>
     * <li>CREATED</li>
     * <li>SUCCESS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>List of job tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>Job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15438***8306500608</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Task Name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Supplementary configuration for the Job template.</p>
     */
    @NameInMap("TaskTemplateConfig")
    public TaskDetailTaskTemplateConfig taskTemplateConfig;

    /**
     * <p>Task Type.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>List of job stream configurations.</p>
     */
    @NameInMap("TaskWorkflow")
    public java.util.List<TaskDetailTaskWorkflow> taskWorkflow;

    /**
     * <p>Template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1529***348342353920</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>GA***W134</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>Tenant name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务202208101424</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    /**
     * <p>UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>paiworkspace-0001</p>
     */
    @NameInMap("UUID")
    public String UUID;

    /**
     * <p>Voting configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;1&quot;:{&quot;VoteNum&quot;:1,&quot;MinVote&quot;:1}}</p>
     */
    @NameInMap("VoteConfigs")
    public java.util.Map<String, ?> voteConfigs;

    /**
     * <p>List of pipeline nodes.</p>
     */
    @NameInMap("WorkflowNodes")
    public java.util.List<String> workflowNodes;

    /**
     * <p>Run message.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("runMsg")
    public String runMsg;

    public static TaskDetail build(java.util.Map<String, ?> map) throws Exception {
        TaskDetail self = new TaskDetail();
        return TeaModel.build(map, self);
    }

    public TaskDetail setAdmins(java.util.List<SimpleUser> admins) {
        this.admins = admins;
        return this;
    }
    public java.util.List<SimpleUser> getAdmins() {
        return this.admins;
    }

    public TaskDetail setAlertTime(Long alertTime) {
        this.alertTime = alertTime;
        return this;
    }
    public Long getAlertTime() {
        return this.alertTime;
    }

    public TaskDetail setAllowAppendData(Boolean allowAppendData) {
        this.allowAppendData = allowAppendData;
        return this;
    }
    public Boolean getAllowAppendData() {
        return this.allowAppendData;
    }

    public TaskDetail setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
    public Boolean getArchived() {
        return this.archived;
    }

    public TaskDetail setArchivedInfos(String archivedInfos) {
        this.archivedInfos = archivedInfos;
        return this;
    }
    public String getArchivedInfos() {
        return this.archivedInfos;
    }

    public TaskDetail setAssignConfig(java.util.Map<String, ?> assignConfig) {
        this.assignConfig = assignConfig;
        return this;
    }
    public java.util.Map<String, ?> getAssignConfig() {
        return this.assignConfig;
    }

    public TaskDetail setCreator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }
    public SimpleUser getCreator() {
        return this.creator;
    }

    public TaskDetail setDatasetProxyRelations(java.util.List<TaskDetailDatasetProxyRelations> datasetProxyRelations) {
        this.datasetProxyRelations = datasetProxyRelations;
        return this;
    }
    public java.util.List<TaskDetailDatasetProxyRelations> getDatasetProxyRelations() {
        return this.datasetProxyRelations;
    }

    public TaskDetail setExif(java.util.Map<String, ?> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, ?> getExif() {
        return this.exif;
    }

    public TaskDetail setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public TaskDetail setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public TaskDetail setLabelStyle(String labelStyle) {
        this.labelStyle = labelStyle;
        return this;
    }
    public String getLabelStyle() {
        return this.labelStyle;
    }

    public TaskDetail setMineConfigs(java.util.Map<String, ?> mineConfigs) {
        this.mineConfigs = mineConfigs;
        return this;
    }
    public java.util.Map<String, ?> getMineConfigs() {
        return this.mineConfigs;
    }

    public TaskDetail setModifier(SimpleUser modifier) {
        this.modifier = modifier;
        return this;
    }
    public SimpleUser getModifier() {
        return this.modifier;
    }

    public TaskDetail setNoticeConfig(java.util.Map<String, ?> noticeConfig) {
        this.noticeConfig = noticeConfig;
        return this;
    }
    public java.util.Map<String, ?> getNoticeConfig() {
        return this.noticeConfig;
    }

    public TaskDetail setPeriodConfig(java.util.Map<String, ?> periodConfig) {
        this.periodConfig = periodConfig;
        return this;
    }
    public java.util.Map<String, ?> getPeriodConfig() {
        return this.periodConfig;
    }

    public TaskDetail setRefTaskId(String refTaskId) {
        this.refTaskId = refTaskId;
        return this;
    }
    public String getRefTaskId() {
        return this.refTaskId;
    }

    public TaskDetail setRelateTaskConfig(java.util.Map<String, ?> relateTaskConfig) {
        this.relateTaskConfig = relateTaskConfig;
        return this;
    }
    public java.util.Map<String, ?> getRelateTaskConfig() {
        return this.relateTaskConfig;
    }

    public TaskDetail setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public TaskDetail setResultCallbackConfig(java.util.Map<String, ?> resultCallbackConfig) {
        this.resultCallbackConfig = resultCallbackConfig;
        return this;
    }
    public java.util.Map<String, ?> getResultCallbackConfig() {
        return this.resultCallbackConfig;
    }

    public TaskDetail setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public TaskDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskDetail setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public TaskDetail setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TaskDetail setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public TaskDetail setTaskTemplateConfig(TaskDetailTaskTemplateConfig taskTemplateConfig) {
        this.taskTemplateConfig = taskTemplateConfig;
        return this;
    }
    public TaskDetailTaskTemplateConfig getTaskTemplateConfig() {
        return this.taskTemplateConfig;
    }

    public TaskDetail setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public TaskDetail setTaskWorkflow(java.util.List<TaskDetailTaskWorkflow> taskWorkflow) {
        this.taskWorkflow = taskWorkflow;
        return this;
    }
    public java.util.List<TaskDetailTaskWorkflow> getTaskWorkflow() {
        return this.taskWorkflow;
    }

    public TaskDetail setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public TaskDetail setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TaskDetail setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TaskDetail setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

    public TaskDetail setVoteConfigs(java.util.Map<String, ?> voteConfigs) {
        this.voteConfigs = voteConfigs;
        return this;
    }
    public java.util.Map<String, ?> getVoteConfigs() {
        return this.voteConfigs;
    }

    public TaskDetail setWorkflowNodes(java.util.List<String> workflowNodes) {
        this.workflowNodes = workflowNodes;
        return this;
    }
    public java.util.List<String> getWorkflowNodes() {
        return this.workflowNodes;
    }

    public TaskDetail setRunMsg(String runMsg) {
        this.runMsg = runMsg;
        return this;
    }
    public String getRunMsg() {
        return this.runMsg;
    }

    public static class TaskDetailDatasetProxyRelations extends TeaModel {
        /**
         * <p>Dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102***124</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>Dataset type.</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        /**
         * <p>Additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Exif")
        public java.util.Map<String, ?> exif;

        /**
         * <p>Dataset source.</p>
         * 
         * <strong>example:</strong>
         * <p>PAI</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Source business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-24eyimdzdn4a98jktk</p>
         */
        @NameInMap("SourceBizId")
        public String sourceBizId;

        /**
         * <p>Source dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2312124</p>
         */
        @NameInMap("SourceDatasetId")
        public String sourceDatasetId;

        public static TaskDetailDatasetProxyRelations build(java.util.Map<String, ?> map) throws Exception {
            TaskDetailDatasetProxyRelations self = new TaskDetailDatasetProxyRelations();
            return TeaModel.build(map, self);
        }

        public TaskDetailDatasetProxyRelations setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public TaskDetailDatasetProxyRelations setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public TaskDetailDatasetProxyRelations setExif(java.util.Map<String, ?> exif) {
            this.exif = exif;
            return this;
        }
        public java.util.Map<String, ?> getExif() {
            return this.exif;
        }

        public TaskDetailDatasetProxyRelations setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public TaskDetailDatasetProxyRelations setSourceBizId(String sourceBizId) {
            this.sourceBizId = sourceBizId;
            return this;
        }
        public String getSourceBizId() {
            return this.sourceBizId;
        }

        public TaskDetailDatasetProxyRelations setSourceDatasetId(String sourceDatasetId) {
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }
        public String getSourceDatasetId() {
            return this.sourceDatasetId;
        }

    }

    public static class TaskDetailTaskTemplateConfig extends TeaModel {
        /**
         * <p>Additional information for template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Exif")
        public java.util.Map<String, ?> exif;

        /**
         * <p>Resource key.</p>
         * 
         * <strong>example:</strong>
         * <p>picture1</p>
         */
        @NameInMap("ResourceKey")
        public String resourceKey;

        /**
         * <p>Robot configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RobotConfig")
        public java.util.Map<String, ?> robotConfig;

        /**
         * <p>If the number of questions in the Job is less than that in the template, you can select the required questions from the List.</p>
         */
        @NameInMap("SelectQuestions")
        public java.util.List<String> selectQuestions;

        /**
         * <p>Options configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;1&quot;:[{&quot;label&quot;:&quot;label1&quot;,&quot;key&quot;:&quot;label1&quot;}]}</p>
         */
        @NameInMap("TemplateOptionMap")
        public java.util.Map<String, ?> templateOptionMap;

        /**
         * <p>Template relation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TemplateRelationId")
        public String templateRelationId;

        public static TaskDetailTaskTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            TaskDetailTaskTemplateConfig self = new TaskDetailTaskTemplateConfig();
            return TeaModel.build(map, self);
        }

        public TaskDetailTaskTemplateConfig setExif(java.util.Map<String, ?> exif) {
            this.exif = exif;
            return this;
        }
        public java.util.Map<String, ?> getExif() {
            return this.exif;
        }

        public TaskDetailTaskTemplateConfig setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public TaskDetailTaskTemplateConfig setRobotConfig(java.util.Map<String, ?> robotConfig) {
            this.robotConfig = robotConfig;
            return this;
        }
        public java.util.Map<String, ?> getRobotConfig() {
            return this.robotConfig;
        }

        public TaskDetailTaskTemplateConfig setSelectQuestions(java.util.List<String> selectQuestions) {
            this.selectQuestions = selectQuestions;
            return this;
        }
        public java.util.List<String> getSelectQuestions() {
            return this.selectQuestions;
        }

        public TaskDetailTaskTemplateConfig setTemplateOptionMap(java.util.Map<String, ?> templateOptionMap) {
            this.templateOptionMap = templateOptionMap;
            return this;
        }
        public java.util.Map<String, ?> getTemplateOptionMap() {
            return this.templateOptionMap;
        }

        public TaskDetailTaskTemplateConfig setTemplateRelationId(String templateRelationId) {
            this.templateRelationId = templateRelationId;
            return this;
        }
        public String getTemplateRelationId() {
            return this.templateRelationId;
        }

    }

    public static class TaskDetailTaskWorkflow extends TeaModel {
        /**
         * <p>Extra information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Exif")
        public java.util.Map<String, ?> exif;

        /**
         * <p>Group list.</p>
         */
        @NameInMap("Groups")
        public java.util.List<String> groups;

        /**
         * <p>Edge zone name. Possible values:  </p>
         * <ul>
         * <li>MARK  </li>
         * <li>CHECK  </li>
         * <li>SAMPLING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MARK</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>User List.</p>
         */
        @NameInMap("Users")
        public java.util.List<SimpleUser> users;

        public static TaskDetailTaskWorkflow build(java.util.Map<String, ?> map) throws Exception {
            TaskDetailTaskWorkflow self = new TaskDetailTaskWorkflow();
            return TeaModel.build(map, self);
        }

        public TaskDetailTaskWorkflow setExif(java.util.Map<String, ?> exif) {
            this.exif = exif;
            return this;
        }
        public java.util.Map<String, ?> getExif() {
            return this.exif;
        }

        public TaskDetailTaskWorkflow setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public TaskDetailTaskWorkflow setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public TaskDetailTaskWorkflow setUsers(java.util.List<SimpleUser> users) {
            this.users = users;
            return this;
        }
        public java.util.List<SimpleUser> getUsers() {
            return this.users;
        }

    }

}
