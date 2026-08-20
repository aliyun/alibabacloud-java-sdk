// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration group (such as cg_101). If specified, a group space task is created (the caller must be a valid group member). If empty, a personal task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The description of the to-do card type.</p>
     */
    @NameInMap("description")
    public String descriptionShrink;

    /**
     * <p>The name of the current effective digital employee. This parameter is empty if not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
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
     * <p>The large model used by the assistant. An empty value indicates that DingTalk automatically selects the model.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The site ID.</p>
     */
    @NameInMap("segments")
    public String segmentsShrink;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("taskDetail")
    public String taskDetailShrink;

    /**
     * <p>The ID of the effective tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The trigger configuration. The configuration varies depending on the trigger type. For the specific format, refer to the following data structures:</p>
     * <ul>
     * <li>OSS trigger: See <a href="https://help.aliyun.com/document_detail/415697.html">OSSTriggerConfig</a>.</li>
     * <li>Simple Log Service trigger: See <a href="https://help.aliyun.com/document_detail/415694.html">LogTriggerConfig</a>.</li>
     * <li>Time trigger: See <a href="https://help.aliyun.com/document_detail/415712.html">TimeTriggerConfig</a>.</li>
     * <li>HTTP trigger: See <a href="https://help.aliyun.com/document_detail/415685.html">HTTPTriggerConfig</a>.</li>
     * <li>Tablestore trigger: You only need to specify the complete <strong>SourceArn</strong> parameter. No additional configuration is required. Set the value to an empty object {}.</li>
     * <li>CDN event trigger: See <a href="https://help.aliyun.com/document_detail/415674.html">CDNEventsTriggerConfig</a>.</li>
     * <li>MNS topic trigger: See <a href="https://help.aliyun.com/document_detail/415695.html">MnsTopicTriggerConfig</a>.</li>
     * <li>EventBridge trigger: See <a href="https://help.aliyun.com/document_detail/2508622.html">EventBridgeTriggerConfig</a>.</li>
     * </ul>
     */
    @NameInMap("triggerConfig")
    public String triggerConfigShrink;

    /**
     * <p>The visibility scope of the group task. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaborators), and PUBLIC (visible to all group members). Default value for group tasks: PRIVATE. This parameter is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>The list of collaborator user IDs. This parameter takes effect only when visibility is set to COLLABORATIVE. It is ignored for other visibility levels. A maximum of 1000 IDs are supported. The task creator and group creator do not need to be included (covered by the authentication layer). This parameter is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("visibleMemberUserIds")
    public String visibleMemberUserIdsShrink;

    public static CreateScheduledTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskShrinkRequest self = new CreateScheduledTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateScheduledTaskShrinkRequest setDescriptionShrink(String descriptionShrink) {
        this.descriptionShrink = descriptionShrink;
        return this;
    }
    public String getDescriptionShrink() {
        return this.descriptionShrink;
    }

    public CreateScheduledTaskShrinkRequest setDigitalEmployeeNameShrink(String digitalEmployeeNameShrink) {
        this.digitalEmployeeNameShrink = digitalEmployeeNameShrink;
        return this;
    }
    public String getDigitalEmployeeNameShrink() {
        return this.digitalEmployeeNameShrink;
    }

    public CreateScheduledTaskShrinkRequest setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public CreateScheduledTaskShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateScheduledTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduledTaskShrinkRequest setSegmentsShrink(String segmentsShrink) {
        this.segmentsShrink = segmentsShrink;
        return this;
    }
    public String getSegmentsShrink() {
        return this.segmentsShrink;
    }

    public CreateScheduledTaskShrinkRequest setTaskDetailShrink(String taskDetailShrink) {
        this.taskDetailShrink = taskDetailShrink;
        return this;
    }
    public String getTaskDetailShrink() {
        return this.taskDetailShrink;
    }

    public CreateScheduledTaskShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateScheduledTaskShrinkRequest setTriggerConfigShrink(String triggerConfigShrink) {
        this.triggerConfigShrink = triggerConfigShrink;
        return this;
    }
    public String getTriggerConfigShrink() {
        return this.triggerConfigShrink;
    }

    public CreateScheduledTaskShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateScheduledTaskShrinkRequest setVisibleMemberUserIdsShrink(String visibleMemberUserIdsShrink) {
        this.visibleMemberUserIdsShrink = visibleMemberUserIdsShrink;
        return this;
    }
    public String getVisibleMemberUserIdsShrink() {
        return this.visibleMemberUserIdsShrink;
    }

}
