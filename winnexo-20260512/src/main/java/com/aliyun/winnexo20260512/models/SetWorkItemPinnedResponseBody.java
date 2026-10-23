// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SetWorkItemPinnedResponseBody extends TeaModel {
    /**
     * <p>The acceptance criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>The applied status version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appliedStatusVersion")
    public Long appliedStatusVersion;

    /**
     * <p>The list of attachments.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("attachments")
    public java.util.List<SetWorkItemPinnedResponseBodyAttachments> attachments;

    /**
     * <p>The business status (seven states).</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESSING</p>
     */
    @NameInMap("businessStatus")
    public String businessStatus;

    /**
     * <p>Specifies whether the caller can delete the work item.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canDelete")
    public Boolean canDelete;

    /**
     * <p>Specifies whether the caller can manage the work item.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canManage")
    public Boolean canManage;

    /**
     * <p>Specifies whether the visibility scope can be adjusted independently.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canManageVisibility")
    public Boolean canManageVisibility;

    /**
     * <p>Specifies whether the caller can rename the work item.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canRename")
    public Boolean canRename;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The ID of the collaboration workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
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
     * <p>The creation time (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The user ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("createdByUserId")
    public Long createdByUserId;

    /**
     * <p>The creation source. Valid values: DEFAULT and TASK.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("creationType")
    public String creationType;

    /**
     * <p>The ID of the current physical plan.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("currentPlanId")
    public String currentPlanId;

    /**
     * <p>The current revision number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentRevision")
    public Long currentRevision;

    /**
     * <p>The ID of the current run.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("currentRunId")
    public String currentRunId;

    /**
     * <p>The sequence number of the current run.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentRunSeq")
    public Long currentRunSeq;

    /**
     * <p>The name of the current step.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("currentStepName")
    public String currentStepName;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The input snapshot version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("inputVersion")
    public Long inputVersion;

    /**
     * <p>The type of the work item.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The time when the work item last entered the processing state (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("lastProcessingAt")
    public String lastProcessingAt;

    /**
     * <p>Specifies whether the topic is a free exploration topic during the compatibility period.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("legacyTopic")
    public Boolean legacyTopic;

    /**
     * <p>The list of user IDs of the visible members.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("memberUserIds")
    public java.util.List<Long> memberUserIds;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The modification time (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("modifiedAt")
    public String modifiedAt;

    /**
     * <p>The user ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ownerUserId")
    public Long ownerUserId;

    /**
     * <p>The personal pin status of the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("pinned")
    public Boolean pinned;

    /**
     * <p>The priority.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>The completed progress.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("progressCompleted")
    public Long progressCompleted;

    /**
     * <p>The total progress.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("progressTotal")
    public Long progressTotal;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The execution ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceExecutionId")
    public String sourceExecutionId;

    /**
     * <p>The source ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTaskId")
    public String sourceTaskId;

    /**
     * <p>The source name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTaskName")
    public String sourceTaskName;

    /**
     * <p>The trigger key of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTriggerKey")
    public String sourceTriggerKey;

    /**
     * <p>The source type of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The time zone when the task is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("triggerTimezone")
    public String triggerTimezone;

    /**
     * <p>The trigger time of the task (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("triggeredAt")
    public String triggeredAt;

    /**
     * <p>The optimistic version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Long version;

    /**
     * <p>The visibility scope.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>The source of the visibility scope. Valid values: SELF, TASK, and TEMPLATE.</p>
     * 
     * <strong>example:</strong>
     * <p>SELF</p>
     */
    @NameInMap("visibilitySource")
    public String visibilitySource;

    /**
     * <p>The ID of the work item.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    /**
     * <p>The four-state projection of the workflow status.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowStatus")
    public String workflowStatus;

    /**
     * <p>The list of IDs of the bound workflow templates.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowTemplateIds")
    public java.util.List<String> workflowTemplateIds;

    public static SetWorkItemPinnedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetWorkItemPinnedResponseBody self = new SetWorkItemPinnedResponseBody();
        return TeaModel.build(map, self);
    }

    public SetWorkItemPinnedResponseBody setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public SetWorkItemPinnedResponseBody setAppliedStatusVersion(Long appliedStatusVersion) {
        this.appliedStatusVersion = appliedStatusVersion;
        return this;
    }
    public Long getAppliedStatusVersion() {
        return this.appliedStatusVersion;
    }

    public SetWorkItemPinnedResponseBody setAttachments(java.util.List<SetWorkItemPinnedResponseBodyAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<SetWorkItemPinnedResponseBodyAttachments> getAttachments() {
        return this.attachments;
    }

    public SetWorkItemPinnedResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public SetWorkItemPinnedResponseBody setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public SetWorkItemPinnedResponseBody setCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }
    public Boolean getCanManage() {
        return this.canManage;
    }

    public SetWorkItemPinnedResponseBody setCanManageVisibility(Boolean canManageVisibility) {
        this.canManageVisibility = canManageVisibility;
        return this;
    }
    public Boolean getCanManageVisibility() {
        return this.canManageVisibility;
    }

    public SetWorkItemPinnedResponseBody setCanRename(Boolean canRename) {
        this.canRename = canRename;
        return this;
    }
    public Boolean getCanRename() {
        return this.canRename;
    }

    public SetWorkItemPinnedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetWorkItemPinnedResponseBody setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public SetWorkItemPinnedResponseBody setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
        this.collaboratorUserIds = collaboratorUserIds;
        return this;
    }
    public java.util.List<Long> getCollaboratorUserIds() {
        return this.collaboratorUserIds;
    }

    public SetWorkItemPinnedResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public SetWorkItemPinnedResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public SetWorkItemPinnedResponseBody setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    public SetWorkItemPinnedResponseBody setCreationType(String creationType) {
        this.creationType = creationType;
        return this;
    }
    public String getCreationType() {
        return this.creationType;
    }

    public SetWorkItemPinnedResponseBody setCurrentPlanId(String currentPlanId) {
        this.currentPlanId = currentPlanId;
        return this;
    }
    public String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public SetWorkItemPinnedResponseBody setCurrentRevision(Long currentRevision) {
        this.currentRevision = currentRevision;
        return this;
    }
    public Long getCurrentRevision() {
        return this.currentRevision;
    }

    public SetWorkItemPinnedResponseBody setCurrentRunId(String currentRunId) {
        this.currentRunId = currentRunId;
        return this;
    }
    public String getCurrentRunId() {
        return this.currentRunId;
    }

    public SetWorkItemPinnedResponseBody setCurrentRunSeq(Long currentRunSeq) {
        this.currentRunSeq = currentRunSeq;
        return this;
    }
    public Long getCurrentRunSeq() {
        return this.currentRunSeq;
    }

    public SetWorkItemPinnedResponseBody setCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
        return this;
    }
    public String getCurrentStepName() {
        return this.currentStepName;
    }

    public SetWorkItemPinnedResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetWorkItemPinnedResponseBody setInputVersion(Long inputVersion) {
        this.inputVersion = inputVersion;
        return this;
    }
    public Long getInputVersion() {
        return this.inputVersion;
    }

    public SetWorkItemPinnedResponseBody setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public SetWorkItemPinnedResponseBody setLastProcessingAt(String lastProcessingAt) {
        this.lastProcessingAt = lastProcessingAt;
        return this;
    }
    public String getLastProcessingAt() {
        return this.lastProcessingAt;
    }

    public SetWorkItemPinnedResponseBody setLegacyTopic(Boolean legacyTopic) {
        this.legacyTopic = legacyTopic;
        return this;
    }
    public Boolean getLegacyTopic() {
        return this.legacyTopic;
    }

    public SetWorkItemPinnedResponseBody setMemberUserIds(java.util.List<Long> memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public java.util.List<Long> getMemberUserIds() {
        return this.memberUserIds;
    }

    public SetWorkItemPinnedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetWorkItemPinnedResponseBody setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public SetWorkItemPinnedResponseBody setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public SetWorkItemPinnedResponseBody setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }
    public Boolean getPinned() {
        return this.pinned;
    }

    public SetWorkItemPinnedResponseBody setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SetWorkItemPinnedResponseBody setProgressCompleted(Long progressCompleted) {
        this.progressCompleted = progressCompleted;
        return this;
    }
    public Long getProgressCompleted() {
        return this.progressCompleted;
    }

    public SetWorkItemPinnedResponseBody setProgressTotal(Long progressTotal) {
        this.progressTotal = progressTotal;
        return this;
    }
    public Long getProgressTotal() {
        return this.progressTotal;
    }

    public SetWorkItemPinnedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetWorkItemPinnedResponseBody setSourceExecutionId(String sourceExecutionId) {
        this.sourceExecutionId = sourceExecutionId;
        return this;
    }
    public String getSourceExecutionId() {
        return this.sourceExecutionId;
    }

    public SetWorkItemPinnedResponseBody setSourceTaskId(String sourceTaskId) {
        this.sourceTaskId = sourceTaskId;
        return this;
    }
    public String getSourceTaskId() {
        return this.sourceTaskId;
    }

    public SetWorkItemPinnedResponseBody setSourceTaskName(String sourceTaskName) {
        this.sourceTaskName = sourceTaskName;
        return this;
    }
    public String getSourceTaskName() {
        return this.sourceTaskName;
    }

    public SetWorkItemPinnedResponseBody setSourceTriggerKey(String sourceTriggerKey) {
        this.sourceTriggerKey = sourceTriggerKey;
        return this;
    }
    public String getSourceTriggerKey() {
        return this.sourceTriggerKey;
    }

    public SetWorkItemPinnedResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public SetWorkItemPinnedResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SetWorkItemPinnedResponseBody setTriggerTimezone(String triggerTimezone) {
        this.triggerTimezone = triggerTimezone;
        return this;
    }
    public String getTriggerTimezone() {
        return this.triggerTimezone;
    }

    public SetWorkItemPinnedResponseBody setTriggeredAt(String triggeredAt) {
        this.triggeredAt = triggeredAt;
        return this;
    }
    public String getTriggeredAt() {
        return this.triggeredAt;
    }

    public SetWorkItemPinnedResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public SetWorkItemPinnedResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public SetWorkItemPinnedResponseBody setVisibilitySource(String visibilitySource) {
        this.visibilitySource = visibilitySource;
        return this;
    }
    public String getVisibilitySource() {
        return this.visibilitySource;
    }

    public SetWorkItemPinnedResponseBody setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

    public SetWorkItemPinnedResponseBody setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
        return this;
    }
    public String getWorkflowStatus() {
        return this.workflowStatus;
    }

    public SetWorkItemPinnedResponseBody setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
        this.workflowTemplateIds = workflowTemplateIds;
        return this;
    }
    public java.util.List<String> getWorkflowTemplateIds() {
        return this.workflowTemplateIds;
    }

    public static class SetWorkItemPinnedResponseBodyAttachments extends TeaModel {
        /**
         * <p>The ID of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("attachmentId")
        public String attachmentId;

        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The access URL of the attachment (OpenAPI 302 redirect).</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("refUrl")
        public String refUrl;

        /**
         * <p>The resource ID of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("resourceKind")
        public String resourceKind;

        /**
         * <p>The size of the attachment in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public static SetWorkItemPinnedResponseBodyAttachments build(java.util.Map<String, ?> map) throws Exception {
            SetWorkItemPinnedResponseBodyAttachments self = new SetWorkItemPinnedResponseBodyAttachments();
            return TeaModel.build(map, self);
        }

        public SetWorkItemPinnedResponseBodyAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public SetWorkItemPinnedResponseBodyAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public SetWorkItemPinnedResponseBodyAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public SetWorkItemPinnedResponseBodyAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public SetWorkItemPinnedResponseBodyAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public SetWorkItemPinnedResponseBodyAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public SetWorkItemPinnedResponseBodyAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
