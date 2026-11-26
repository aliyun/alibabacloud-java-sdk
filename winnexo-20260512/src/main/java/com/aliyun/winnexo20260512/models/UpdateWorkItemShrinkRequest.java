// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkItemShrinkRequest extends TeaModel {
    /**
     * <p>The acceptance criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The stable references for the attachments.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("attachments")
    public String attachmentsShrink;

    /**
     * <p>The ID of the collaboration space.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The list of user IDs of the collaborators.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("collaboratorUserIds")
    public String collaboratorUserIdsShrink;

    /**
     * <p>The ID of the associated conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>The description of the work item.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The optimistic version number. Obtain this value from the version field in the previous response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

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
     * <p>The user ID of the owner. If not specified, the user ID of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ownerUserId")
    public Long ownerUserId;

    /**
     * <p>The scheduling priority.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The title of the work item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The ID of the work item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wi_example</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    /**
     * <p>The list of bound workflow template IDs. If not specified, the existing bindings are retained. If an empty array is provided, the bindings are cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowTemplateIds")
    public String workflowTemplateIdsShrink;

    public static UpdateWorkItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkItemShrinkRequest self = new UpdateWorkItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkItemShrinkRequest setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public UpdateWorkItemShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public UpdateWorkItemShrinkRequest setAttachmentsShrink(String attachmentsShrink) {
        this.attachmentsShrink = attachmentsShrink;
        return this;
    }
    public String getAttachmentsShrink() {
        return this.attachmentsShrink;
    }

    public UpdateWorkItemShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public UpdateWorkItemShrinkRequest setCollaboratorUserIdsShrink(String collaboratorUserIdsShrink) {
        this.collaboratorUserIdsShrink = collaboratorUserIdsShrink;
        return this;
    }
    public String getCollaboratorUserIdsShrink() {
        return this.collaboratorUserIdsShrink;
    }

    public UpdateWorkItemShrinkRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public UpdateWorkItemShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkItemShrinkRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateWorkItemShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateWorkItemShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UpdateWorkItemShrinkRequest setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public UpdateWorkItemShrinkRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateWorkItemShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateWorkItemShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateWorkItemShrinkRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

    public UpdateWorkItemShrinkRequest setWorkflowTemplateIdsShrink(String workflowTemplateIdsShrink) {
        this.workflowTemplateIdsShrink = workflowTemplateIdsShrink;
        return this;
    }
    public String getWorkflowTemplateIdsShrink() {
        return this.workflowTemplateIdsShrink;
    }

}
