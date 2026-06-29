// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleTask extends TeaModel {
    /**
     * <p>Indicates whether the job is archived. Possible values:  </p>
     * <ul>
     * <li>false: Not archived.  </li>
     * <li>true: Archived.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>Creator information.</p>
     */
    @NameInMap("Creator")
    public SimpleUser creator;

    /**
     * <p>UTC creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 16:09:20</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>UTC time of the last update.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 16:09:20</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Label style.</p>
     * 
     * <strong>example:</strong>
     * <p>IMG</p>
     */
    @NameInMap("LabelStyle")
    public String labelStyle;

    /**
     * <p>Updated By information.</p>
     */
    @NameInMap("Modifier")
    public SimpleUser modifier;

    /**
     * <p>Auto triggered task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123***5124</p>
     */
    @NameInMap("RefTaskId")
    public String refTaskId;

    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Current streaming node. Possible values:  </p>
     * <ul>
     * <li>MARK: Annotating.  </li>
     * <li>CHECK: Checking.  </li>
     * <li>FINISHED: Completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MARK</p>
     */
    @NameInMap("Stage")
    public String stage;

    /**
     * <p>Task Status. Possible values:  </p>
     * <ul>
     * <li>CREATED  </li>
     * <li>SUCCESS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>List of job labels.</p>
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
     * <p>Job name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Task Type.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

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
     * <p>UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>paiworkspace-****</p>
     */
    @NameInMap("UUID")
    public String UUID;

    /**
     * <p>Pipeline nodes.</p>
     */
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
