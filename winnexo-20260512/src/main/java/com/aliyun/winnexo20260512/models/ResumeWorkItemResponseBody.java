// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResumeWorkItemResponseBody extends TeaModel {
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
     * <p>The list of input attachments.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("attachments")
    public java.util.List<ResumeWorkItemResponseBodyAttachments> attachments;

    /**
     * <p>The business status (seven states).</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESSING</p>
     */
    @NameInMap("businessStatus")
    public String businessStatus;

    /**
     * <p>Indicates whether the caller can delete this item.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canDelete")
    public Boolean canDelete;

    /**
     * <p>Indicates whether the caller can manage this item.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canManage")
    public Boolean canManage;

    /**
     * <p>Indicates whether the visibility scope can be adjusted independently.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canManageVisibility")
    public Boolean canManageVisibility;

    /**
     * <p>Indicates whether the caller can rename this item.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canRename")
    public Boolean canRename;

    /**
     * <p>The business status code. 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The collaboration space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The list of collaborator user IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("collaboratorUserIds")
    public java.util.List<Long> collaboratorUserIds;

    /**
     * <p>The associated conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>The creation time, in ISO 8601 format.</p>
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
     * <p>The creation source. Valid values: DEFAULT, TASK.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("creationType")
    public String creationType;

    /**
     * <p>The current physical plan ID.</p>
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
     * <p>The current run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("currentRunId")
    public String currentRunId;

    /**
     * <p>The current run sequence number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentRunSeq")
    public Long currentRunSeq;

    /**
     * <p>The current step name.</p>
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
     * <p>The work item type.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The most recent time the item entered processing state, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("lastProcessingAt")
    public String lastProcessingAt;

    /**
     * <p>Indicates whether this is a legacy free-exploration topic.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("legacyTopic")
    public Boolean legacyTopic;

    /**
     * <p>The list of visible member user IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("memberUserIds")
    public java.util.List<Long> memberUserIds;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The modification time, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("modifiedAt")
    public String modifiedAt;

    /**
     * <p>The owner user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ownerUserId")
    public Long ownerUserId;

    /**
     * <p>Indicates whether the caller has pinned this item.</p>
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
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceExecutionId")
    public String sourceExecutionId;

    /**
     * <p>The task source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTaskId")
    public String sourceTaskId;

    /**
     * <p>The task source name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTaskName")
    public String sourceTaskName;

    /**
     * <p>The task trigger key.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTriggerKey")
    public String sourceTriggerKey;

    /**
     * <p>The task source type.</p>
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
     * <p>The task trigger time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("triggerTimezone")
    public String triggerTimezone;

    /**
     * <p>The task trigger time, in ISO 8601 format.</p>
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
     * <p>The visibility scope source. Valid values: SELF, TASK, TEMPLATE.</p>
     * 
     * <strong>example:</strong>
     * <p>SELF</p>
     */
    @NameInMap("visibilitySource")
    public String visibilitySource;

    /**
     * <p>The work item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    /**
     * <p>The workflow four-state projection.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowStatus")
    public String workflowStatus;

    /**
     * <p>The list of bound workflow template IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowTemplateIds")
    public java.util.List<String> workflowTemplateIds;

    public static ResumeWorkItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeWorkItemResponseBody self = new ResumeWorkItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeWorkItemResponseBody setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public ResumeWorkItemResponseBody setAppliedStatusVersion(Long appliedStatusVersion) {
        this.appliedStatusVersion = appliedStatusVersion;
        return this;
    }
    public Long getAppliedStatusVersion() {
        return this.appliedStatusVersion;
    }

    public ResumeWorkItemResponseBody setAttachments(java.util.List<ResumeWorkItemResponseBodyAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<ResumeWorkItemResponseBodyAttachments> getAttachments() {
        return this.attachments;
    }

    public ResumeWorkItemResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public ResumeWorkItemResponseBody setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ResumeWorkItemResponseBody setCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }
    public Boolean getCanManage() {
        return this.canManage;
    }

    public ResumeWorkItemResponseBody setCanManageVisibility(Boolean canManageVisibility) {
        this.canManageVisibility = canManageVisibility;
        return this;
    }
    public Boolean getCanManageVisibility() {
        return this.canManageVisibility;
    }

    public ResumeWorkItemResponseBody setCanRename(Boolean canRename) {
        this.canRename = canRename;
        return this;
    }
    public Boolean getCanRename() {
        return this.canRename;
    }

    public ResumeWorkItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResumeWorkItemResponseBody setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ResumeWorkItemResponseBody setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
        this.collaboratorUserIds = collaboratorUserIds;
        return this;
    }
    public java.util.List<Long> getCollaboratorUserIds() {
        return this.collaboratorUserIds;
    }

    public ResumeWorkItemResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ResumeWorkItemResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ResumeWorkItemResponseBody setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    public ResumeWorkItemResponseBody setCreationType(String creationType) {
        this.creationType = creationType;
        return this;
    }
    public String getCreationType() {
        return this.creationType;
    }

    public ResumeWorkItemResponseBody setCurrentPlanId(String currentPlanId) {
        this.currentPlanId = currentPlanId;
        return this;
    }
    public String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public ResumeWorkItemResponseBody setCurrentRevision(Long currentRevision) {
        this.currentRevision = currentRevision;
        return this;
    }
    public Long getCurrentRevision() {
        return this.currentRevision;
    }

    public ResumeWorkItemResponseBody setCurrentRunId(String currentRunId) {
        this.currentRunId = currentRunId;
        return this;
    }
    public String getCurrentRunId() {
        return this.currentRunId;
    }

    public ResumeWorkItemResponseBody setCurrentRunSeq(Long currentRunSeq) {
        this.currentRunSeq = currentRunSeq;
        return this;
    }
    public Long getCurrentRunSeq() {
        return this.currentRunSeq;
    }

    public ResumeWorkItemResponseBody setCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
        return this;
    }
    public String getCurrentStepName() {
        return this.currentStepName;
    }

    public ResumeWorkItemResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResumeWorkItemResponseBody setInputVersion(Long inputVersion) {
        this.inputVersion = inputVersion;
        return this;
    }
    public Long getInputVersion() {
        return this.inputVersion;
    }

    public ResumeWorkItemResponseBody setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public ResumeWorkItemResponseBody setLastProcessingAt(String lastProcessingAt) {
        this.lastProcessingAt = lastProcessingAt;
        return this;
    }
    public String getLastProcessingAt() {
        return this.lastProcessingAt;
    }

    public ResumeWorkItemResponseBody setLegacyTopic(Boolean legacyTopic) {
        this.legacyTopic = legacyTopic;
        return this;
    }
    public Boolean getLegacyTopic() {
        return this.legacyTopic;
    }

    public ResumeWorkItemResponseBody setMemberUserIds(java.util.List<Long> memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public java.util.List<Long> getMemberUserIds() {
        return this.memberUserIds;
    }

    public ResumeWorkItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResumeWorkItemResponseBody setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public ResumeWorkItemResponseBody setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public ResumeWorkItemResponseBody setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }
    public Boolean getPinned() {
        return this.pinned;
    }

    public ResumeWorkItemResponseBody setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ResumeWorkItemResponseBody setProgressCompleted(Long progressCompleted) {
        this.progressCompleted = progressCompleted;
        return this;
    }
    public Long getProgressCompleted() {
        return this.progressCompleted;
    }

    public ResumeWorkItemResponseBody setProgressTotal(Long progressTotal) {
        this.progressTotal = progressTotal;
        return this;
    }
    public Long getProgressTotal() {
        return this.progressTotal;
    }

    public ResumeWorkItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeWorkItemResponseBody setSourceExecutionId(String sourceExecutionId) {
        this.sourceExecutionId = sourceExecutionId;
        return this;
    }
    public String getSourceExecutionId() {
        return this.sourceExecutionId;
    }

    public ResumeWorkItemResponseBody setSourceTaskId(String sourceTaskId) {
        this.sourceTaskId = sourceTaskId;
        return this;
    }
    public String getSourceTaskId() {
        return this.sourceTaskId;
    }

    public ResumeWorkItemResponseBody setSourceTaskName(String sourceTaskName) {
        this.sourceTaskName = sourceTaskName;
        return this;
    }
    public String getSourceTaskName() {
        return this.sourceTaskName;
    }

    public ResumeWorkItemResponseBody setSourceTriggerKey(String sourceTriggerKey) {
        this.sourceTriggerKey = sourceTriggerKey;
        return this;
    }
    public String getSourceTriggerKey() {
        return this.sourceTriggerKey;
    }

    public ResumeWorkItemResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ResumeWorkItemResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ResumeWorkItemResponseBody setTriggerTimezone(String triggerTimezone) {
        this.triggerTimezone = triggerTimezone;
        return this;
    }
    public String getTriggerTimezone() {
        return this.triggerTimezone;
    }

    public ResumeWorkItemResponseBody setTriggeredAt(String triggeredAt) {
        this.triggeredAt = triggeredAt;
        return this;
    }
    public String getTriggeredAt() {
        return this.triggeredAt;
    }

    public ResumeWorkItemResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public ResumeWorkItemResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public ResumeWorkItemResponseBody setVisibilitySource(String visibilitySource) {
        this.visibilitySource = visibilitySource;
        return this;
    }
    public String getVisibilitySource() {
        return this.visibilitySource;
    }

    public ResumeWorkItemResponseBody setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

    public ResumeWorkItemResponseBody setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
        return this;
    }
    public String getWorkflowStatus() {
        return this.workflowStatus;
    }

    public ResumeWorkItemResponseBody setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
        this.workflowTemplateIds = workflowTemplateIds;
        return this;
    }
    public java.util.List<String> getWorkflowTemplateIds() {
        return this.workflowTemplateIds;
    }

    public static class ResumeWorkItemResponseBodyAttachments extends TeaModel {
        /**
         * <p>The attachment ID.</p>
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
         * <p>The attachment access entry (OpenAPI 302 pre-redirect).</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("refUrl")
        public String refUrl;

        /**
         * <p>The attachment resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The attachment resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("resourceKind")
        public String resourceKind;

        /**
         * <p>The attachment size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sizeBytes")
        public Long sizeBytes;

        /**
         * <p>The attachment title.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("title")
        public String title;

        public static ResumeWorkItemResponseBodyAttachments build(java.util.Map<String, ?> map) throws Exception {
            ResumeWorkItemResponseBodyAttachments self = new ResumeWorkItemResponseBodyAttachments();
            return TeaModel.build(map, self);
        }

        public ResumeWorkItemResponseBodyAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public ResumeWorkItemResponseBodyAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ResumeWorkItemResponseBodyAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public ResumeWorkItemResponseBodyAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ResumeWorkItemResponseBodyAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public ResumeWorkItemResponseBodyAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public ResumeWorkItemResponseBodyAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
