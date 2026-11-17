// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateScheduledTaskShrinkRequest extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("description")
    public String descriptionShrink;

    /**
     * <p>The list of digital employee names.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;test&quot;]</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeNameShrink;

    /**
     * <p>Specifies whether public access is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOpen")
    public Boolean isOpen;

    /**
     * <p>The execution model tier. If this parameter is not specified, the model tier is not updated.</p>
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
     * <p>The output conversation mode. If this parameter is omitted, the current configuration is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>SAME_CONVERSATION</p>
     */
    @NameInMap("outputMode")
    public String outputMode;

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
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The trigger configuration. The configuration varies based on the trigger type.</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfigShrink;

    /**
     * <p>The visibility scope adjustment for group tasks. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaborators), and PUBLIC (visible to all group members). If this parameter is not specified, the visibility scope is not updated. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>COLLABORATIVE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>The full replacement list of collaborators. This parameter takes effect only when visibility is set to COLLABORATIVE. When the visibility is changed from COLLABORATIVE to another value, the list is cleared. A maximum of 1,000 members are supported. If this parameter is not specified, the members are not updated. You do not need to specify the task creator and group creator because they are covered by the authentication layer. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10001&quot;]</p>
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

    public UpdateScheduledTaskShrinkRequest setOutputMode(String outputMode) {
        this.outputMode = outputMode;
        return this;
    }
    public String getOutputMode() {
        return this.outputMode;
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
