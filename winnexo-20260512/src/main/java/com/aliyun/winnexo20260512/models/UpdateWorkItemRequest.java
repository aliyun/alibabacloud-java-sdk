// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkItemRequest extends TeaModel {
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
    public java.util.List<UpdateWorkItemRequestAttachments> attachments;

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
    public java.util.List<Long> collaboratorUserIds;

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
     * <p>乐观版本号，取上次响应的 version</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

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
     * <p>工作项 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wi_example</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    /**
     * <p>绑定的工作流模板ID列表；未传保持既有绑定，空数组清空</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowTemplateIds")
    public java.util.List<String> workflowTemplateIds;

    public static UpdateWorkItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkItemRequest self = new UpdateWorkItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkItemRequest setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public UpdateWorkItemRequest setAttachments(java.util.List<UpdateWorkItemRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<UpdateWorkItemRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public UpdateWorkItemRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public UpdateWorkItemRequest setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
        this.collaboratorUserIds = collaboratorUserIds;
        return this;
    }
    public java.util.List<Long> getCollaboratorUserIds() {
        return this.collaboratorUserIds;
    }

    public UpdateWorkItemRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public UpdateWorkItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkItemRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateWorkItemRequest setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public UpdateWorkItemRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateWorkItemRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateWorkItemRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateWorkItemRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

    public UpdateWorkItemRequest setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
        this.workflowTemplateIds = workflowTemplateIds;
        return this;
    }
    public java.util.List<String> getWorkflowTemplateIds() {
        return this.workflowTemplateIds;
    }

    public static class UpdateWorkItemRequestAttachments extends TeaModel {
        /**
         * <p>内容类型</p>
         * 
         * <strong>example:</strong>
         * <p>application/pdf</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>附件引用地址</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("refUrl")
        public String refUrl;

        /**
         * <p>附件资源ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>res_example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>附件资源类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>attachment</p>
         */
        @NameInMap("resourceKind")
        public String resourceKind;

        /**
         * <p>附件大小(字节)，上限 20MB</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("sizeBytes")
        public Long sizeBytes;

        /**
         * <p>附件标题</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("title")
        public String title;

        public static UpdateWorkItemRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkItemRequestAttachments self = new UpdateWorkItemRequestAttachments();
            return TeaModel.build(map, self);
        }

        public UpdateWorkItemRequestAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateWorkItemRequestAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public UpdateWorkItemRequestAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateWorkItemRequestAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public UpdateWorkItemRequestAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public UpdateWorkItemRequestAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
