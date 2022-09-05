// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleTask extends TeaModel {
    @NameInMap("Archived")
    public Boolean archived;

    @NameInMap("ArchivedInfos")
    public String archivedInfos;

    @NameInMap("Creator")
    public SimpleUser creator;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("LabelStyle")
    public String labelStyle;

    @NameInMap("Modifier")
    public SimpleUser modifier;

    @NameInMap("RefTaskId")
    public String refTaskId;

    @NameInMap("Remark")
    public String remark;

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

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UUID")
    public String UUID;

    @NameInMap("WorkflowNodes")
    public java.util.List<String> workflowNodes;

    public static SimpleTask build(java.util.Map<String, ?> map) throws Exception {
        SimpleTask self = new SimpleTask();
        return TeaModel.build(map, self);
    }

    public SimpleTask setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
    public Boolean getArchived() {
        return this.archived;
    }

    public SimpleTask setArchivedInfos(String archivedInfos) {
        this.archivedInfos = archivedInfos;
        return this;
    }
    public String getArchivedInfos() {
        return this.archivedInfos;
    }

    public SimpleTask setCreator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }
    public SimpleUser getCreator() {
        return this.creator;
    }

    public SimpleTask setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public SimpleTask setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public SimpleTask setLabelStyle(String labelStyle) {
        this.labelStyle = labelStyle;
        return this;
    }
    public String getLabelStyle() {
        return this.labelStyle;
    }

    public SimpleTask setModifier(SimpleUser modifier) {
        this.modifier = modifier;
        return this;
    }
    public SimpleUser getModifier() {
        return this.modifier;
    }

    public SimpleTask setRefTaskId(String refTaskId) {
        this.refTaskId = refTaskId;
        return this;
    }
    public String getRefTaskId() {
        return this.refTaskId;
    }

    public SimpleTask setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SimpleTask setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public SimpleTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SimpleTask setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public SimpleTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SimpleTask setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public SimpleTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public SimpleTask setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SimpleTask setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SimpleTask setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

    public SimpleTask setWorkflowNodes(java.util.List<String> workflowNodes) {
        this.workflowNodes = workflowNodes;
        return this;
    }
    public java.util.List<String> getWorkflowNodes() {
        return this.workflowNodes;
    }

}
