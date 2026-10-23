// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkItemRequest extends TeaModel {
    /**
     * <p>The acceptance criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>The stable references of the input attachments.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("attachments")
    public java.util.List<CreateWorkItemRequestAttachments> attachments;

    /**
     * <p>The ID of the collaboration workspace.</p>
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
    public java.util.List<Long> collaboratorUserIds;

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
     * <p>The type of the work item. Only WORKFLOW is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The user ID of the owner. If this parameter is not specified, the ID of the caller is used.</p>
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
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
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
     * <p>The list of IDs of the bound workflow templates.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowTemplateIds")
    public java.util.List<String> workflowTemplateIds;

    public static CreateWorkItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkItemRequest self = new CreateWorkItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkItemRequest setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public CreateWorkItemRequest setAttachments(java.util.List<CreateWorkItemRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<CreateWorkItemRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public CreateWorkItemRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateWorkItemRequest setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
        this.collaboratorUserIds = collaboratorUserIds;
        return this;
    }
    public java.util.List<Long> getCollaboratorUserIds() {
        return this.collaboratorUserIds;
    }

    public CreateWorkItemRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateWorkItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkItemRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public CreateWorkItemRequest setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateWorkItemRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateWorkItemRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateWorkItemRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateWorkItemRequest setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
        this.workflowTemplateIds = workflowTemplateIds;
        return this;
    }
    public java.util.List<String> getWorkflowTemplateIds() {
        return this.workflowTemplateIds;
    }

    public static class CreateWorkItemRequestAttachments extends TeaModel {
        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/pdf</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The reference URL of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("refUrl")
        public String refUrl;

        /**
         * <p>The resource ID of the attachment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>res_example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type of the attachment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>attachment</p>
         */
        @NameInMap("resourceKind")
        public String resourceKind;

        /**
         * <p>The size of the attachment in bytes. The maximum size is 20 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("sizeBytes")
        public Long sizeBytes;

        /**
         * <p>The title of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("title")
        public String title;

        public static CreateWorkItemRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkItemRequestAttachments self = new CreateWorkItemRequestAttachments();
            return TeaModel.build(map, self);
        }

        public CreateWorkItemRequestAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateWorkItemRequestAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public CreateWorkItemRequestAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateWorkItemRequestAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public CreateWorkItemRequestAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public CreateWorkItemRequestAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
