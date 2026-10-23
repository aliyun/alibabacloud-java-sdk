// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryWorkItemFeedResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The entries on the current page. The entryType determines the effective fields: WORK_ITEM maps to item, and TASK_GROUP maps to aggregation fields.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("entries")
    public java.util.List<QueryWorkItemFeedResponseBodyEntries> entries;

    /**
     * <p>Indicates whether more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("nextCursor")
    public String nextCursor;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of items in the visible pool by personal scope.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("scopeCounts")
    public java.util.Map<String, ?> scopeCounts;

    /**
     * <p>The number of items in the visible pool by business status.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("statusCounts")
    public java.util.Map<String, ?> statusCounts;

    /**
     * <p>The total number of entries in the visible pool.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalEntryCount")
    public Long totalEntryCount;

    /**
     * <p>The total number of work items in the visible pool.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalWorkItemCount")
    public Long totalWorkItemCount;

    public static QueryWorkItemFeedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkItemFeedResponseBody self = new QueryWorkItemFeedResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorkItemFeedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWorkItemFeedResponseBody setEntries(java.util.List<QueryWorkItemFeedResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<QueryWorkItemFeedResponseBodyEntries> getEntries() {
        return this.entries;
    }

    public QueryWorkItemFeedResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryWorkItemFeedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWorkItemFeedResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public QueryWorkItemFeedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorkItemFeedResponseBody setScopeCounts(java.util.Map<String, ?> scopeCounts) {
        this.scopeCounts = scopeCounts;
        return this;
    }
    public java.util.Map<String, ?> getScopeCounts() {
        return this.scopeCounts;
    }

    public QueryWorkItemFeedResponseBody setStatusCounts(java.util.Map<String, ?> statusCounts) {
        this.statusCounts = statusCounts;
        return this;
    }
    public java.util.Map<String, ?> getStatusCounts() {
        return this.statusCounts;
    }

    public QueryWorkItemFeedResponseBody setTotalEntryCount(Long totalEntryCount) {
        this.totalEntryCount = totalEntryCount;
        return this;
    }
    public Long getTotalEntryCount() {
        return this.totalEntryCount;
    }

    public QueryWorkItemFeedResponseBody setTotalWorkItemCount(Long totalWorkItemCount) {
        this.totalWorkItemCount = totalWorkItemCount;
        return this;
    }
    public Long getTotalWorkItemCount() {
        return this.totalWorkItemCount;
    }

    public static class QueryWorkItemFeedResponseBodyEntriesItemAttachments extends TeaModel {
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
         * <p>The access URL of the attachment (prefixed with an OpenAPI 302 redirect).</p>
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
         * <p>The attachment size in bytes.</p>
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

        public static QueryWorkItemFeedResponseBodyEntriesItemAttachments build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkItemFeedResponseBodyEntriesItemAttachments self = new QueryWorkItemFeedResponseBodyEntriesItemAttachments();
            return TeaModel.build(map, self);
        }

        public QueryWorkItemFeedResponseBodyEntriesItemAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryWorkItemFeedResponseBodyEntriesItem extends TeaModel {
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
        public java.util.List<QueryWorkItemFeedResponseBodyEntriesItemAttachments> attachments;

        /**
         * <p>The business status (seven states).</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("businessStatus")
        public String businessStatus;

        /**
         * <p>Indicates whether the caller can delete the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canDelete")
        public Boolean canDelete;

        /**
         * <p>Indicates whether the caller can manage the item.</p>
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
         * <p>Indicates whether the caller can rename the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canRename")
        public Boolean canRename;

        /**
         * <p>The collaboration workspace ID.</p>
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
         * <p>The creation source. Valid values: DEFAULT and TASK.</p>
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
         * <p>The time when the item last entered the processing state, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("lastProcessingAt")
        public String lastProcessingAt;

        /**
         * <p>Indicates whether the topic is a free exploration topic during the compatibility period.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("legacyTopic")
        public Boolean legacyTopic;

        /**
         * <p>The list of user IDs of visible members.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("memberUserIds")
        public java.util.List<Long> memberUserIds;

        /**
         * <p>The modification time, in ISO 8601 format.</p>
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
         * <p>The pinned status for the caller.</p>
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
         * <p>The time zone when the task is triggered.</p>
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
         * <p>The source of the visibility scope. Valid values: SELF, TASK, and TEMPLATE.</p>
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
         * <p>The workflow status projection (four states).</p>
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

        public static QueryWorkItemFeedResponseBodyEntriesItem build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkItemFeedResponseBodyEntriesItem self = new QueryWorkItemFeedResponseBodyEntriesItem();
            return TeaModel.build(map, self);
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setAcceptanceCriteria(String acceptanceCriteria) {
            this.acceptanceCriteria = acceptanceCriteria;
            return this;
        }
        public String getAcceptanceCriteria() {
            return this.acceptanceCriteria;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setAppliedStatusVersion(Long appliedStatusVersion) {
            this.appliedStatusVersion = appliedStatusVersion;
            return this;
        }
        public Long getAppliedStatusVersion() {
            return this.appliedStatusVersion;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setAttachments(java.util.List<QueryWorkItemFeedResponseBodyEntriesItemAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<QueryWorkItemFeedResponseBodyEntriesItemAttachments> getAttachments() {
            return this.attachments;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCanManage(Boolean canManage) {
            this.canManage = canManage;
            return this;
        }
        public Boolean getCanManage() {
            return this.canManage;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCanManageVisibility(Boolean canManageVisibility) {
            this.canManageVisibility = canManageVisibility;
            return this;
        }
        public Boolean getCanManageVisibility() {
            return this.canManageVisibility;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCanRename(Boolean canRename) {
            this.canRename = canRename;
            return this;
        }
        public Boolean getCanRename() {
            return this.canRename;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
            this.collaboratorUserIds = collaboratorUserIds;
            return this;
        }
        public java.util.List<Long> getCollaboratorUserIds() {
            return this.collaboratorUserIds;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCreatedByUserId(Long createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }
        public Long getCreatedByUserId() {
            return this.createdByUserId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCurrentPlanId(String currentPlanId) {
            this.currentPlanId = currentPlanId;
            return this;
        }
        public String getCurrentPlanId() {
            return this.currentPlanId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCurrentRevision(Long currentRevision) {
            this.currentRevision = currentRevision;
            return this;
        }
        public Long getCurrentRevision() {
            return this.currentRevision;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCurrentRunId(String currentRunId) {
            this.currentRunId = currentRunId;
            return this;
        }
        public String getCurrentRunId() {
            return this.currentRunId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCurrentRunSeq(Long currentRunSeq) {
            this.currentRunSeq = currentRunSeq;
            return this;
        }
        public Long getCurrentRunSeq() {
            return this.currentRunSeq;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setInputVersion(Long inputVersion) {
            this.inputVersion = inputVersion;
            return this;
        }
        public Long getInputVersion() {
            return this.inputVersion;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setLastProcessingAt(String lastProcessingAt) {
            this.lastProcessingAt = lastProcessingAt;
            return this;
        }
        public String getLastProcessingAt() {
            return this.lastProcessingAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setLegacyTopic(Boolean legacyTopic) {
            this.legacyTopic = legacyTopic;
            return this;
        }
        public Boolean getLegacyTopic() {
            return this.legacyTopic;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setMemberUserIds(java.util.List<Long> memberUserIds) {
            this.memberUserIds = memberUserIds;
            return this;
        }
        public java.util.List<Long> getMemberUserIds() {
            return this.memberUserIds;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setProgressCompleted(Long progressCompleted) {
            this.progressCompleted = progressCompleted;
            return this;
        }
        public Long getProgressCompleted() {
            return this.progressCompleted;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setProgressTotal(Long progressTotal) {
            this.progressTotal = progressTotal;
            return this;
        }
        public Long getProgressTotal() {
            return this.progressTotal;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setSourceExecutionId(String sourceExecutionId) {
            this.sourceExecutionId = sourceExecutionId;
            return this;
        }
        public String getSourceExecutionId() {
            return this.sourceExecutionId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setSourceTaskId(String sourceTaskId) {
            this.sourceTaskId = sourceTaskId;
            return this;
        }
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setSourceTaskName(String sourceTaskName) {
            this.sourceTaskName = sourceTaskName;
            return this;
        }
        public String getSourceTaskName() {
            return this.sourceTaskName;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setSourceTriggerKey(String sourceTriggerKey) {
            this.sourceTriggerKey = sourceTriggerKey;
            return this;
        }
        public String getSourceTriggerKey() {
            return this.sourceTriggerKey;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setTriggerTimezone(String triggerTimezone) {
            this.triggerTimezone = triggerTimezone;
            return this;
        }
        public String getTriggerTimezone() {
            return this.triggerTimezone;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setTriggeredAt(String triggeredAt) {
            this.triggeredAt = triggeredAt;
            return this;
        }
        public String getTriggeredAt() {
            return this.triggeredAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setVisibilitySource(String visibilitySource) {
            this.visibilitySource = visibilitySource;
            return this;
        }
        public String getVisibilitySource() {
            return this.visibilitySource;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setWorkItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }
        public String getWorkItemId() {
            return this.workItemId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setWorkflowStatus(String workflowStatus) {
            this.workflowStatus = workflowStatus;
            return this;
        }
        public String getWorkflowStatus() {
            return this.workflowStatus;
        }

        public QueryWorkItemFeedResponseBodyEntriesItem setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
            this.workflowTemplateIds = workflowTemplateIds;
            return this;
        }
        public java.util.List<String> getWorkflowTemplateIds() {
            return this.workflowTemplateIds;
        }

    }

    public static class QueryWorkItemFeedResponseBodyEntriesItemsAttachments extends TeaModel {
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
         * <p>The access URL of the attachment (prefixed with an OpenAPI 302 redirect).</p>
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
         * <p>The attachment size in bytes.</p>
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

        public static QueryWorkItemFeedResponseBodyEntriesItemsAttachments build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkItemFeedResponseBodyEntriesItemsAttachments self = new QueryWorkItemFeedResponseBodyEntriesItemsAttachments();
            return TeaModel.build(map, self);
        }

        public QueryWorkItemFeedResponseBodyEntriesItemsAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemsAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemsAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemsAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemsAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemsAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public QueryWorkItemFeedResponseBodyEntriesItemsAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryWorkItemFeedResponseBodyEntriesItems extends TeaModel {
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
        public java.util.List<QueryWorkItemFeedResponseBodyEntriesItemsAttachments> attachments;

        /**
         * <p>The business status (seven states).</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("businessStatus")
        public String businessStatus;

        /**
         * <p>Indicates whether the caller can delete the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canDelete")
        public Boolean canDelete;

        /**
         * <p>Indicates whether the caller can manage the item.</p>
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
         * <p>Indicates whether the caller can rename the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canRename")
        public Boolean canRename;

        /**
         * <p>The collaboration workspace ID.</p>
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
         * <p>The creation source. Valid values: DEFAULT and TASK.</p>
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
         * <p>The time when the item last entered the processing state, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("lastProcessingAt")
        public String lastProcessingAt;

        /**
         * <p>Indicates whether the topic is a free exploration topic during the compatibility period.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("legacyTopic")
        public Boolean legacyTopic;

        /**
         * <p>The list of user IDs of visible members.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("memberUserIds")
        public java.util.List<Long> memberUserIds;

        /**
         * <p>The modification time, in ISO 8601 format.</p>
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
         * <p>The pinned status for the caller.</p>
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
         * <p>The time zone when the task is triggered.</p>
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
         * <p>The source of the visibility scope. Valid values: SELF, TASK, and TEMPLATE.</p>
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
         * <p>The workflow status projection (four states).</p>
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

        public static QueryWorkItemFeedResponseBodyEntriesItems build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkItemFeedResponseBodyEntriesItems self = new QueryWorkItemFeedResponseBodyEntriesItems();
            return TeaModel.build(map, self);
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setAcceptanceCriteria(String acceptanceCriteria) {
            this.acceptanceCriteria = acceptanceCriteria;
            return this;
        }
        public String getAcceptanceCriteria() {
            return this.acceptanceCriteria;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setAppliedStatusVersion(Long appliedStatusVersion) {
            this.appliedStatusVersion = appliedStatusVersion;
            return this;
        }
        public Long getAppliedStatusVersion() {
            return this.appliedStatusVersion;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setAttachments(java.util.List<QueryWorkItemFeedResponseBodyEntriesItemsAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<QueryWorkItemFeedResponseBodyEntriesItemsAttachments> getAttachments() {
            return this.attachments;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCanManage(Boolean canManage) {
            this.canManage = canManage;
            return this;
        }
        public Boolean getCanManage() {
            return this.canManage;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCanManageVisibility(Boolean canManageVisibility) {
            this.canManageVisibility = canManageVisibility;
            return this;
        }
        public Boolean getCanManageVisibility() {
            return this.canManageVisibility;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCanRename(Boolean canRename) {
            this.canRename = canRename;
            return this;
        }
        public Boolean getCanRename() {
            return this.canRename;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
            this.collaboratorUserIds = collaboratorUserIds;
            return this;
        }
        public java.util.List<Long> getCollaboratorUserIds() {
            return this.collaboratorUserIds;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCreatedByUserId(Long createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }
        public Long getCreatedByUserId() {
            return this.createdByUserId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCurrentPlanId(String currentPlanId) {
            this.currentPlanId = currentPlanId;
            return this;
        }
        public String getCurrentPlanId() {
            return this.currentPlanId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCurrentRevision(Long currentRevision) {
            this.currentRevision = currentRevision;
            return this;
        }
        public Long getCurrentRevision() {
            return this.currentRevision;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCurrentRunId(String currentRunId) {
            this.currentRunId = currentRunId;
            return this;
        }
        public String getCurrentRunId() {
            return this.currentRunId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCurrentRunSeq(Long currentRunSeq) {
            this.currentRunSeq = currentRunSeq;
            return this;
        }
        public Long getCurrentRunSeq() {
            return this.currentRunSeq;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setInputVersion(Long inputVersion) {
            this.inputVersion = inputVersion;
            return this;
        }
        public Long getInputVersion() {
            return this.inputVersion;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setLastProcessingAt(String lastProcessingAt) {
            this.lastProcessingAt = lastProcessingAt;
            return this;
        }
        public String getLastProcessingAt() {
            return this.lastProcessingAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setLegacyTopic(Boolean legacyTopic) {
            this.legacyTopic = legacyTopic;
            return this;
        }
        public Boolean getLegacyTopic() {
            return this.legacyTopic;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setMemberUserIds(java.util.List<Long> memberUserIds) {
            this.memberUserIds = memberUserIds;
            return this;
        }
        public java.util.List<Long> getMemberUserIds() {
            return this.memberUserIds;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setProgressCompleted(Long progressCompleted) {
            this.progressCompleted = progressCompleted;
            return this;
        }
        public Long getProgressCompleted() {
            return this.progressCompleted;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setProgressTotal(Long progressTotal) {
            this.progressTotal = progressTotal;
            return this;
        }
        public Long getProgressTotal() {
            return this.progressTotal;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setSourceExecutionId(String sourceExecutionId) {
            this.sourceExecutionId = sourceExecutionId;
            return this;
        }
        public String getSourceExecutionId() {
            return this.sourceExecutionId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setSourceTaskId(String sourceTaskId) {
            this.sourceTaskId = sourceTaskId;
            return this;
        }
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setSourceTaskName(String sourceTaskName) {
            this.sourceTaskName = sourceTaskName;
            return this;
        }
        public String getSourceTaskName() {
            return this.sourceTaskName;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setSourceTriggerKey(String sourceTriggerKey) {
            this.sourceTriggerKey = sourceTriggerKey;
            return this;
        }
        public String getSourceTriggerKey() {
            return this.sourceTriggerKey;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setTriggerTimezone(String triggerTimezone) {
            this.triggerTimezone = triggerTimezone;
            return this;
        }
        public String getTriggerTimezone() {
            return this.triggerTimezone;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setTriggeredAt(String triggeredAt) {
            this.triggeredAt = triggeredAt;
            return this;
        }
        public String getTriggeredAt() {
            return this.triggeredAt;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setVisibilitySource(String visibilitySource) {
            this.visibilitySource = visibilitySource;
            return this;
        }
        public String getVisibilitySource() {
            return this.visibilitySource;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setWorkItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }
        public String getWorkItemId() {
            return this.workItemId;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setWorkflowStatus(String workflowStatus) {
            this.workflowStatus = workflowStatus;
            return this;
        }
        public String getWorkflowStatus() {
            return this.workflowStatus;
        }

        public QueryWorkItemFeedResponseBodyEntriesItems setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
            this.workflowTemplateIds = workflowTemplateIds;
            return this;
        }
        public java.util.List<String> getWorkflowTemplateIds() {
            return this.workflowTemplateIds;
        }

    }

    public static class QueryWorkItemFeedResponseBodyEntries extends TeaModel {
        /**
         * <p>The entry type.</p>
         * 
         * <strong>example:</strong>
         * <p>WORK_ITEM</p>
         */
        @NameInMap("entryType")
        public String entryType;

        /**
         * <p>Indicates whether more child items are available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasMoreChildren")
        public Boolean hasMoreChildren;

        /**
         * <p>The content of a regular work item row.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("item")
        public QueryWorkItemFeedResponseBodyEntriesItem item;

        /**
         * <p>The latest five work items in the task aggregation row.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("items")
        public java.util.List<QueryWorkItemFeedResponseBodyEntriesItems> items;

        /**
         * <p>The time of the latest work item, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("latestWorkItemAt")
        public String latestWorkItemAt;

        /**
         * <p>The total number of matched work items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("matchedWorkItemCount")
        public Long matchedWorkItemCount;

        /**
         * <p>The source task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("sourceTaskId")
        public String sourceTaskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static QueryWorkItemFeedResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkItemFeedResponseBodyEntries self = new QueryWorkItemFeedResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public QueryWorkItemFeedResponseBodyEntries setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public QueryWorkItemFeedResponseBodyEntries setHasMoreChildren(Boolean hasMoreChildren) {
            this.hasMoreChildren = hasMoreChildren;
            return this;
        }
        public Boolean getHasMoreChildren() {
            return this.hasMoreChildren;
        }

        public QueryWorkItemFeedResponseBodyEntries setItem(QueryWorkItemFeedResponseBodyEntriesItem item) {
            this.item = item;
            return this;
        }
        public QueryWorkItemFeedResponseBodyEntriesItem getItem() {
            return this.item;
        }

        public QueryWorkItemFeedResponseBodyEntries setItems(java.util.List<QueryWorkItemFeedResponseBodyEntriesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryWorkItemFeedResponseBodyEntriesItems> getItems() {
            return this.items;
        }

        public QueryWorkItemFeedResponseBodyEntries setLatestWorkItemAt(String latestWorkItemAt) {
            this.latestWorkItemAt = latestWorkItemAt;
            return this;
        }
        public String getLatestWorkItemAt() {
            return this.latestWorkItemAt;
        }

        public QueryWorkItemFeedResponseBodyEntries setMatchedWorkItemCount(Long matchedWorkItemCount) {
            this.matchedWorkItemCount = matchedWorkItemCount;
            return this;
        }
        public Long getMatchedWorkItemCount() {
            return this.matchedWorkItemCount;
        }

        public QueryWorkItemFeedResponseBodyEntries setSourceTaskId(String sourceTaskId) {
            this.sourceTaskId = sourceTaskId;
            return this;
        }
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        public QueryWorkItemFeedResponseBodyEntries setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
