// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskDetail extends TeaModel {
    @NameInMap("Admins")
    public java.util.List<SimpleUser> admins;

    @NameInMap("AlertTime")
    public Long alertTime;

    @NameInMap("AllowAppendData")
    public Boolean allowAppendData;

    @NameInMap("Archived")
    public Boolean archived;

    @NameInMap("ArchivedInfos")
    public String archivedInfos;

    @NameInMap("AssignConfig")
    public java.util.Map<String, ?> assignConfig;

    @NameInMap("Creator")
    public SimpleUser creator;

    @NameInMap("DatasetProxyRelations")
    public java.util.List<TaskDetailDatasetProxyRelations> datasetProxyRelations;

    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("LabelStyle")
    public String labelStyle;

    @NameInMap("MineConfigs")
    public java.util.Map<String, ?> mineConfigs;

    @NameInMap("Modifier")
    public SimpleUser modifier;

    @NameInMap("NoticeConfig")
    public java.util.Map<String, ?> noticeConfig;

    @NameInMap("PeriodConfig")
    public java.util.Map<String, ?> periodConfig;

    @NameInMap("RefTaskId")
    public String refTaskId;

    @NameInMap("RelateTaskConfig")
    public java.util.Map<String, ?> relateTaskConfig;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResultCallbackConfig")
    public java.util.Map<String, ?> resultCallbackConfig;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskTemplateConfig")
    public TaskDetailTaskTemplateConfig taskTemplateConfig;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskWorkflow")
    public java.util.List<TaskDetailTaskWorkflow> taskWorkflow;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("UUID")
    public String UUID;

    @NameInMap("VoteConfigs")
    public java.util.Map<String, ?> voteConfigs;

    @NameInMap("WorkflowNodes")
    public java.util.List<String> workflowNodes;

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
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("DatasetType")
        public String datasetType;

        @NameInMap("Exif")
        public java.util.Map<String, ?> exif;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceBizId")
        public String sourceBizId;

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
        @NameInMap("Exif")
        public java.util.Map<String, ?> exif;

        @NameInMap("ResourceKey")
        public String resourceKey;

        @NameInMap("RobotConfig")
        public java.util.Map<String, ?> robotConfig;

        @NameInMap("SelectQuestions")
        public java.util.List<String> selectQuestions;

        @NameInMap("TemplateOptionMap")
        public java.util.Map<String, ?> templateOptionMap;

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
        @NameInMap("Exif")
        public java.util.Map<String, ?> exif;

        @NameInMap("Groups")
        public java.util.List<String> groups;

        @NameInMap("NodeName")
        public String nodeName;

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
