// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateScheduledTaskShrinkRequest extends TeaModel {
    /**
     * <p>The description information.</p>
     */
    @NameInMap("description")
    public String descriptionShrink;

    /**
     * <p>The list of digital human names.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeNameShrink;

    /**
     * <p>Specifies whether the task is publicly accessible.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOpen")
    public Boolean isOpen;

    /**
     * <p>The execution model tier. If not specified, the model tier is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The segments.</p>
     */
    @NameInMap("segments")
    public String segmentsShrink;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("taskDetail")
    public String taskDetailShrink;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The trigger configuration. The configuration varies depending on the trigger type.</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfigShrink;

    /**
     * <p>The visibility scope for group tasks. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaborators), and PUBLIC (visible to all group members). If not specified, the visibility is not updated. This parameter is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>COLLABORATIVE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>The full replacement list of collaborator member user IDs. This parameter takes effect only when visibility is set to COLLABORATIVE. The list is cleared when switching away from the COLLABORATIVE tier. A maximum of 1000 members are supported. If not specified, the member list is not updated. The task creator and group creator do not need to be included because they are covered by the authentication layer. This parameter is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("visibleMemberUserIds")
    public String visibleMemberUserIdsShrink;

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

    public UpdateScheduledTaskShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public UpdateScheduledTaskShrinkRequest setVisibleMemberUserIdsShrink(String visibleMemberUserIdsShrink) {
        this.visibleMemberUserIdsShrink = visibleMemberUserIdsShrink;
        return this;
    }
    public String getVisibleMemberUserIdsShrink() {
        return this.visibleMemberUserIdsShrink;
    }

}
