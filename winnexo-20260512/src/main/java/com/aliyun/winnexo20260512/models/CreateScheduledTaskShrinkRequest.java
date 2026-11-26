// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskShrinkRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>AUTO 偏好：none=默认、performance=效果优先、credit=成本优先；创建缺省为 none，固定模型可保存但不生效</p>
     * 
     * <strong>example:</strong>
     * <p>performance</p>
     */
    @NameInMap("autoPreference")
    public String autoPreference;

    /**
     * <p>The ID of the associated collaboration group (such as cg_101). If this parameter is passed, a group space task is created, and the caller must be a valid group member. If this parameter is empty, a personal task is created.</p>
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
     * <p>The name of the currently effective digital employee. This parameter is empty if it is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pcitc-magent&quot;]</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeNameShrink;

    /**
     * <p>Specifies whether public access is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOpen")
    public Boolean isOpen;

    /**
     * <p>The large model used by the assistant. The default value is empty, which indicates that DingTalk automatically selects the model.</p>
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
     * <p>Sample name.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The output conversation mode. Default value: NEW_CONVERSATION.</p>
     * 
     * <strong>example:</strong>
     * <p>NEW_CONVERSATION</p>
     */
    @NameInMap("outputMode")
    public String outputMode;

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
     * <p>The trigger configuration of the scheduled task. triggerMode supports manual (manual trigger) and scheduled (scheduled trigger). If scheduled is used, cron must be specified. timezone and language are injected by the server, and the client does not need to pass them. pushConfig is the list of task push channels. If it is empty or no channel is enabled, no push is performed.</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfigShrink;

    /**
     * <p>The visibility scope of the group task. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaboration members), and PUBLIC (visible to all group members). If this parameter is not passed for a group task, the default value is PRIVATE. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>The list of user IDs of collaboration members. This parameter takes effect only when visibility is set to COLLABORATIVE and is ignored for other values. A maximum of 1,000 user IDs can be specified. You do not need to pass the IDs of the task creator and group creator because they are covered by the authentication layer. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1002&quot;]</p>
     */
    @NameInMap("visibleMemberUserIds")
    public String visibleMemberUserIdsShrink;

    public static CreateScheduledTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskShrinkRequest self = new CreateScheduledTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreateScheduledTaskShrinkRequest setAutoPreference(String autoPreference) {
        this.autoPreference = autoPreference;
        return this;
    }
    public String getAutoPreference() {
        return this.autoPreference;
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

    public CreateScheduledTaskShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateScheduledTaskShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreateScheduledTaskShrinkRequest setOutputMode(String outputMode) {
        this.outputMode = outputMode;
        return this;
    }
    public String getOutputMode() {
        return this.outputMode;
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
