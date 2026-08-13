// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateScheduledTaskShrinkRequest extends TeaModel {
    @NameInMap("description")
    public String descriptionShrink;

    /**
     * <p>数字员工名称列表</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeNameShrink;

    /**
     * <p>是否公开访问</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOpen")
    public Boolean isOpen;

    /**
     * <p>执行模型档位；不传则不更新</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>文件名</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("segments")
    public String segmentsShrink;

    @NameInMap("taskDetail")
    public String taskDetailShrink;

    /**
     * <p>任务 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("triggerConfig")
    public String triggerConfigShrink;

    public static UpdateScheduledTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledTaskShrinkRequest self = new UpdateScheduledTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledTaskShrinkRequest setDescriptionShrink(String descriptionShrink) {
        this.descriptionShrink = descriptionShrink;
        return this;
    }
    public String getDescriptionShrink() {
        return this.descriptionShrink;
    }

    public UpdateScheduledTaskShrinkRequest setDigitalEmployeeNameShrink(String digitalEmployeeNameShrink) {
        this.digitalEmployeeNameShrink = digitalEmployeeNameShrink;
        return this;
    }
    public String getDigitalEmployeeNameShrink() {
        return this.digitalEmployeeNameShrink;
    }

    public UpdateScheduledTaskShrinkRequest setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public UpdateScheduledTaskShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateScheduledTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateScheduledTaskShrinkRequest setSegmentsShrink(String segmentsShrink) {
        this.segmentsShrink = segmentsShrink;
        return this;
    }
    public String getSegmentsShrink() {
        return this.segmentsShrink;
    }

    public UpdateScheduledTaskShrinkRequest setTaskDetailShrink(String taskDetailShrink) {
        this.taskDetailShrink = taskDetailShrink;
        return this;
    }
    public String getTaskDetailShrink() {
        return this.taskDetailShrink;
    }

    public UpdateScheduledTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateScheduledTaskShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateScheduledTaskShrinkRequest setTriggerConfigShrink(String triggerConfigShrink) {
        this.triggerConfigShrink = triggerConfigShrink;
        return this;
    }
    public String getTriggerConfigShrink() {
        return this.triggerConfigShrink;
    }

}
