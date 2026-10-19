// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkItemShrinkRequest extends TeaModel {
    /**
     * <p>验收标准</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>输入附件稳定引用</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("attachments")
    public String attachmentsShrink;

    /**
     * <p>协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>协作人用户ID列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("collaboratorUserIds")
    public String collaboratorUserIdsShrink;

    /**
     * <p>关联会话ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>工作项描述</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>工作项类型；仅接受 WORKFLOW</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>负责人用户ID；缺省为调用者本人</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ownerUserId")
    public Long ownerUserId;

    /**
     * <p>排产优先级</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>工作项标题</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>绑定的工作流模板ID列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowTemplateIds")
    public String workflowTemplateIdsShrink;

    public static CreateWorkItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkItemShrinkRequest self = new CreateWorkItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkItemShrinkRequest setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public CreateWorkItemShrinkRequest setAttachmentsShrink(String attachmentsShrink) {
        this.attachmentsShrink = attachmentsShrink;
        return this;
    }
    public String getAttachmentsShrink() {
        return this.attachmentsShrink;
    }

    public CreateWorkItemShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateWorkItemShrinkRequest setCollaboratorUserIdsShrink(String collaboratorUserIdsShrink) {
        this.collaboratorUserIdsShrink = collaboratorUserIdsShrink;
        return this;
    }
    public String getCollaboratorUserIdsShrink() {
        return this.collaboratorUserIdsShrink;
    }

    public CreateWorkItemShrinkRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateWorkItemShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkItemShrinkRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public CreateWorkItemShrinkRequest setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateWorkItemShrinkRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateWorkItemShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateWorkItemShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateWorkItemShrinkRequest setWorkflowTemplateIdsShrink(String workflowTemplateIdsShrink) {
        this.workflowTemplateIdsShrink = workflowTemplateIdsShrink;
        return this;
    }
    public String getWorkflowTemplateIdsShrink() {
        return this.workflowTemplateIdsShrink;
    }

}
