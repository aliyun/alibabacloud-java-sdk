// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkItemRequest extends TeaModel {
    /**
     * <p>The acceptance criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>The stable references for the attachments.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("attachments")
    public java.util.List<UpdateWorkItemRequestAttachments> attachments;

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
     * <p>The optimistic version number. Obtain this value from the version field in the previous response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

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
