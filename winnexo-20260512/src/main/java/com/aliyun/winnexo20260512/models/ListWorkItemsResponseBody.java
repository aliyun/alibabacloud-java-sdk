// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkItemsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The list of work items on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("items")
    public java.util.List<ListWorkItemsResponseBodyItems> items;

    /**
     * <p>The maximum number of items returned per page in the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. An empty string indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of visible items under the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListWorkItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemsResponseBody self = new ListWorkItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkItemsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListWorkItemsResponseBody setItems(java.util.List<ListWorkItemsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListWorkItemsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListWorkItemsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListWorkItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkItemsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListWorkItemsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkItemsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListWorkItemsResponseBodyItemsAttachments extends TeaModel {
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
         * <p>The access URL of the attachment.</p>
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

        public static ListWorkItemsResponseBodyItemsAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListWorkItemsResponseBodyItemsAttachments self = new ListWorkItemsResponseBodyItemsAttachments();
            return TeaModel.build(map, self);
        }

        public ListWorkItemsResponseBodyItemsAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public ListWorkItemsResponseBodyItemsAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListWorkItemsResponseBodyItemsAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public ListWorkItemsResponseBodyItemsAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListWorkItemsResponseBodyItemsAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public ListWorkItemsResponseBodyItemsAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public ListWorkItemsResponseBodyItemsAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListWorkItemsResponseBodyItems extends TeaModel {
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
        public java.util.List<ListWorkItemsResponseBodyItemsAttachments> attachments;

        /**
         * <p>The business status.</p>
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
         * <p>The creation time in ISO 8601 format.</p>
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
         * <p>The version of the input snapshot.</p>
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
         * <p>The time when the item last entered the processing state in ISO 8601 format.</p>
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
         * <p>The modification time in ISO 8601 format.</p>
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
         * <p>Indicates whether the item is pinned by the caller.</p>
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
         * <p>The trigger time of the task in ISO 8601 format.</p>
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
         * <p>The workflow status projection.</p>
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

        public static ListWorkItemsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkItemsResponseBodyItems self = new ListWorkItemsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkItemsResponseBodyItems setAcceptanceCriteria(String acceptanceCriteria) {
            this.acceptanceCriteria = acceptanceCriteria;
            return this;
        }
        public String getAcceptanceCriteria() {
            return this.acceptanceCriteria;
        }

        public ListWorkItemsResponseBodyItems setAppliedStatusVersion(Long appliedStatusVersion) {
            this.appliedStatusVersion = appliedStatusVersion;
            return this;
        }
        public Long getAppliedStatusVersion() {
            return this.appliedStatusVersion;
        }

        public ListWorkItemsResponseBodyItems setAttachments(java.util.List<ListWorkItemsResponseBodyItemsAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<ListWorkItemsResponseBodyItemsAttachments> getAttachments() {
            return this.attachments;
        }

        public ListWorkItemsResponseBodyItems setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListWorkItemsResponseBodyItems setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListWorkItemsResponseBodyItems setCanManage(Boolean canManage) {
            this.canManage = canManage;
            return this;
        }
        public Boolean getCanManage() {
            return this.canManage;
        }

        public ListWorkItemsResponseBodyItems setCanManageVisibility(Boolean canManageVisibility) {
            this.canManageVisibility = canManageVisibility;
            return this;
        }
        public Boolean getCanManageVisibility() {
            return this.canManageVisibility;
        }

        public ListWorkItemsResponseBodyItems setCanRename(Boolean canRename) {
            this.canRename = canRename;
            return this;
        }
        public Boolean getCanRename() {
            return this.canRename;
        }

        public ListWorkItemsResponseBodyItems setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public ListWorkItemsResponseBodyItems setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
            this.collaboratorUserIds = collaboratorUserIds;
            return this;
        }
        public java.util.List<Long> getCollaboratorUserIds() {
            return this.collaboratorUserIds;
        }

        public ListWorkItemsResponseBodyItems setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListWorkItemsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListWorkItemsResponseBodyItems setCreatedByUserId(Long createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }
        public Long getCreatedByUserId() {
            return this.createdByUserId;
        }

        public ListWorkItemsResponseBodyItems setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public ListWorkItemsResponseBodyItems setCurrentPlanId(String currentPlanId) {
            this.currentPlanId = currentPlanId;
            return this;
        }
        public String getCurrentPlanId() {
            return this.currentPlanId;
        }

        public ListWorkItemsResponseBodyItems setCurrentRevision(Long currentRevision) {
            this.currentRevision = currentRevision;
            return this;
        }
        public Long getCurrentRevision() {
            return this.currentRevision;
        }

        public ListWorkItemsResponseBodyItems setCurrentRunId(String currentRunId) {
            this.currentRunId = currentRunId;
            return this;
        }
        public String getCurrentRunId() {
            return this.currentRunId;
        }

        public ListWorkItemsResponseBodyItems setCurrentRunSeq(Long currentRunSeq) {
            this.currentRunSeq = currentRunSeq;
            return this;
        }
        public Long getCurrentRunSeq() {
            return this.currentRunSeq;
        }

        public ListWorkItemsResponseBodyItems setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public ListWorkItemsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkItemsResponseBodyItems setInputVersion(Long inputVersion) {
            this.inputVersion = inputVersion;
            return this;
        }
        public Long getInputVersion() {
            return this.inputVersion;
        }

        public ListWorkItemsResponseBodyItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListWorkItemsResponseBodyItems setLastProcessingAt(String lastProcessingAt) {
            this.lastProcessingAt = lastProcessingAt;
            return this;
        }
        public String getLastProcessingAt() {
            return this.lastProcessingAt;
        }

        public ListWorkItemsResponseBodyItems setLegacyTopic(Boolean legacyTopic) {
            this.legacyTopic = legacyTopic;
            return this;
        }
        public Boolean getLegacyTopic() {
            return this.legacyTopic;
        }

        public ListWorkItemsResponseBodyItems setMemberUserIds(java.util.List<Long> memberUserIds) {
            this.memberUserIds = memberUserIds;
            return this;
        }
        public java.util.List<Long> getMemberUserIds() {
            return this.memberUserIds;
        }

        public ListWorkItemsResponseBodyItems setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public ListWorkItemsResponseBodyItems setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListWorkItemsResponseBodyItems setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public ListWorkItemsResponseBodyItems setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListWorkItemsResponseBodyItems setProgressCompleted(Long progressCompleted) {
            this.progressCompleted = progressCompleted;
            return this;
        }
        public Long getProgressCompleted() {
            return this.progressCompleted;
        }

        public ListWorkItemsResponseBodyItems setProgressTotal(Long progressTotal) {
            this.progressTotal = progressTotal;
            return this;
        }
        public Long getProgressTotal() {
            return this.progressTotal;
        }

        public ListWorkItemsResponseBodyItems setSourceExecutionId(String sourceExecutionId) {
            this.sourceExecutionId = sourceExecutionId;
            return this;
        }
        public String getSourceExecutionId() {
            return this.sourceExecutionId;
        }

        public ListWorkItemsResponseBodyItems setSourceTaskId(String sourceTaskId) {
            this.sourceTaskId = sourceTaskId;
            return this;
        }
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        public ListWorkItemsResponseBodyItems setSourceTaskName(String sourceTaskName) {
            this.sourceTaskName = sourceTaskName;
            return this;
        }
        public String getSourceTaskName() {
            return this.sourceTaskName;
        }

        public ListWorkItemsResponseBodyItems setSourceTriggerKey(String sourceTriggerKey) {
            this.sourceTriggerKey = sourceTriggerKey;
            return this;
        }
        public String getSourceTriggerKey() {
            return this.sourceTriggerKey;
        }

        public ListWorkItemsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListWorkItemsResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListWorkItemsResponseBodyItems setTriggerTimezone(String triggerTimezone) {
            this.triggerTimezone = triggerTimezone;
            return this;
        }
        public String getTriggerTimezone() {
            return this.triggerTimezone;
        }

        public ListWorkItemsResponseBodyItems setTriggeredAt(String triggeredAt) {
            this.triggeredAt = triggeredAt;
            return this;
        }
        public String getTriggeredAt() {
            return this.triggeredAt;
        }

        public ListWorkItemsResponseBodyItems setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public ListWorkItemsResponseBodyItems setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public ListWorkItemsResponseBodyItems setVisibilitySource(String visibilitySource) {
            this.visibilitySource = visibilitySource;
            return this;
        }
        public String getVisibilitySource() {
            return this.visibilitySource;
        }

        public ListWorkItemsResponseBodyItems setWorkItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }
        public String getWorkItemId() {
            return this.workItemId;
        }

        public ListWorkItemsResponseBodyItems setWorkflowStatus(String workflowStatus) {
            this.workflowStatus = workflowStatus;
            return this;
        }
        public String getWorkflowStatus() {
            return this.workflowStatus;
        }

        public ListWorkItemsResponseBodyItems setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
            this.workflowTemplateIds = workflowTemplateIds;
            return this;
        }
        public java.util.List<String> getWorkflowTemplateIds() {
            return this.workflowTemplateIds;
        }

    }

}
