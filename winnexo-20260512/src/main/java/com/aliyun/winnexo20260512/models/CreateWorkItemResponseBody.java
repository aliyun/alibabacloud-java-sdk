// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkItemResponseBody extends TeaModel {
    /**
     * <p>验收标准</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>已应用的状态版本</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appliedStatusVersion")
    public Long appliedStatusVersion;

    /**
     * <p>输入附件列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("attachments")
    public java.util.List<CreateWorkItemResponseBodyAttachments> attachments;

    /**
     * <p>业务状态（七态）</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESSING</p>
     */
    @NameInMap("businessStatus")
    public String businessStatus;

    /**
     * <p>调用者是否可删除</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canDelete")
    public Boolean canDelete;

    /**
     * <p>调用者是否可管理</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canManage")
    public Boolean canManage;

    /**
     * <p>是否可独立调整可见范围</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canManageVisibility")
    public Boolean canManageVisibility;

    /**
     * <p>调用者是否可重命名</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("canRename")
    public Boolean canRename;

    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>协作空间ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
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
     * <p>创建时间(ISO8601)</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>创建人用户ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("createdByUserId")
    public Long createdByUserId;

    /**
     * <p>创建来源：DEFAULT/TASK</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("creationType")
    public String creationType;

    /**
     * <p>当前物理计划ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("currentPlanId")
    public String currentPlanId;

    /**
     * <p>当前修订号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentRevision")
    public Long currentRevision;

    /**
     * <p>当前运行ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("currentRunId")
    public String currentRunId;

    /**
     * <p>当前运行序号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentRunSeq")
    public Long currentRunSeq;

    /**
     * <p>当前步骤名称</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("currentStepName")
    public String currentStepName;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>输入快照版本</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("inputVersion")
    public Long inputVersion;

    /**
     * <p>工作项类型</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>最近进入处理中的时间(ISO8601)</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("lastProcessingAt")
    public String lastProcessingAt;

    /**
     * <p>是否为兼容期自由探索话题</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("legacyTopic")
    public Boolean legacyTopic;

    /**
     * <p>可见成员用户ID列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("memberUserIds")
    public java.util.List<Long> memberUserIds;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>修改时间(ISO8601)</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("modifiedAt")
    public String modifiedAt;

    /**
     * <p>负责人用户ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ownerUserId")
    public Long ownerUserId;

    /**
     * <p>调用者个人置顶状态</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("pinned")
    public Boolean pinned;

    /**
     * <p>优先级</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>已完成进度</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("progressCompleted")
    public Long progressCompleted;

    /**
     * <p>总进度</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("progressTotal")
    public Long progressTotal;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>任务执行ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceExecutionId")
    public String sourceExecutionId;

    /**
     * <p>任务来源ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTaskId")
    public String sourceTaskId;

    /**
     * <p>任务来源名称</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTaskName")
    public String sourceTaskName;

    /**
     * <p>任务触发键</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTriggerKey")
    public String sourceTriggerKey;

    /**
     * <p>任务来源类型</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>标题</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>任务触发时区</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("triggerTimezone")
    public String triggerTimezone;

    /**
     * <p>任务触发时间(ISO8601)</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("triggeredAt")
    public String triggeredAt;

    /**
     * <p>乐观版本号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Long version;

    /**
     * <p>可见范围</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>可见范围来源：SELF/TASK/TEMPLATE</p>
     * 
     * <strong>example:</strong>
     * <p>SELF</p>
     */
    @NameInMap("visibilitySource")
    public String visibilitySource;

    /**
     * <p>工作项ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    /**
     * <p>Workflow四态投影</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowStatus")
    public String workflowStatus;

    /**
     * <p>绑定的工作流模板ID列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workflowTemplateIds")
    public java.util.List<String> workflowTemplateIds;

    public static CreateWorkItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkItemResponseBody self = new CreateWorkItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkItemResponseBody setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public CreateWorkItemResponseBody setAppliedStatusVersion(Long appliedStatusVersion) {
        this.appliedStatusVersion = appliedStatusVersion;
        return this;
    }
    public Long getAppliedStatusVersion() {
        return this.appliedStatusVersion;
    }

    public CreateWorkItemResponseBody setAttachments(java.util.List<CreateWorkItemResponseBodyAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<CreateWorkItemResponseBodyAttachments> getAttachments() {
        return this.attachments;
    }

    public CreateWorkItemResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public CreateWorkItemResponseBody setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public CreateWorkItemResponseBody setCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }
    public Boolean getCanManage() {
        return this.canManage;
    }

    public CreateWorkItemResponseBody setCanManageVisibility(Boolean canManageVisibility) {
        this.canManageVisibility = canManageVisibility;
        return this;
    }
    public Boolean getCanManageVisibility() {
        return this.canManageVisibility;
    }

    public CreateWorkItemResponseBody setCanRename(Boolean canRename) {
        this.canRename = canRename;
        return this;
    }
    public Boolean getCanRename() {
        return this.canRename;
    }

    public CreateWorkItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWorkItemResponseBody setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateWorkItemResponseBody setCollaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
        this.collaboratorUserIds = collaboratorUserIds;
        return this;
    }
    public java.util.List<Long> getCollaboratorUserIds() {
        return this.collaboratorUserIds;
    }

    public CreateWorkItemResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateWorkItemResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateWorkItemResponseBody setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    public CreateWorkItemResponseBody setCreationType(String creationType) {
        this.creationType = creationType;
        return this;
    }
    public String getCreationType() {
        return this.creationType;
    }

    public CreateWorkItemResponseBody setCurrentPlanId(String currentPlanId) {
        this.currentPlanId = currentPlanId;
        return this;
    }
    public String getCurrentPlanId() {
        return this.currentPlanId;
    }

    public CreateWorkItemResponseBody setCurrentRevision(Long currentRevision) {
        this.currentRevision = currentRevision;
        return this;
    }
    public Long getCurrentRevision() {
        return this.currentRevision;
    }

    public CreateWorkItemResponseBody setCurrentRunId(String currentRunId) {
        this.currentRunId = currentRunId;
        return this;
    }
    public String getCurrentRunId() {
        return this.currentRunId;
    }

    public CreateWorkItemResponseBody setCurrentRunSeq(Long currentRunSeq) {
        this.currentRunSeq = currentRunSeq;
        return this;
    }
    public Long getCurrentRunSeq() {
        return this.currentRunSeq;
    }

    public CreateWorkItemResponseBody setCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
        return this;
    }
    public String getCurrentStepName() {
        return this.currentStepName;
    }

    public CreateWorkItemResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkItemResponseBody setInputVersion(Long inputVersion) {
        this.inputVersion = inputVersion;
        return this;
    }
    public Long getInputVersion() {
        return this.inputVersion;
    }

    public CreateWorkItemResponseBody setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public CreateWorkItemResponseBody setLastProcessingAt(String lastProcessingAt) {
        this.lastProcessingAt = lastProcessingAt;
        return this;
    }
    public String getLastProcessingAt() {
        return this.lastProcessingAt;
    }

    public CreateWorkItemResponseBody setLegacyTopic(Boolean legacyTopic) {
        this.legacyTopic = legacyTopic;
        return this;
    }
    public Boolean getLegacyTopic() {
        return this.legacyTopic;
    }

    public CreateWorkItemResponseBody setMemberUserIds(java.util.List<Long> memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public java.util.List<Long> getMemberUserIds() {
        return this.memberUserIds;
    }

    public CreateWorkItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWorkItemResponseBody setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public CreateWorkItemResponseBody setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateWorkItemResponseBody setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }
    public Boolean getPinned() {
        return this.pinned;
    }

    public CreateWorkItemResponseBody setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateWorkItemResponseBody setProgressCompleted(Long progressCompleted) {
        this.progressCompleted = progressCompleted;
        return this;
    }
    public Long getProgressCompleted() {
        return this.progressCompleted;
    }

    public CreateWorkItemResponseBody setProgressTotal(Long progressTotal) {
        this.progressTotal = progressTotal;
        return this;
    }
    public Long getProgressTotal() {
        return this.progressTotal;
    }

    public CreateWorkItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkItemResponseBody setSourceExecutionId(String sourceExecutionId) {
        this.sourceExecutionId = sourceExecutionId;
        return this;
    }
    public String getSourceExecutionId() {
        return this.sourceExecutionId;
    }

    public CreateWorkItemResponseBody setSourceTaskId(String sourceTaskId) {
        this.sourceTaskId = sourceTaskId;
        return this;
    }
    public String getSourceTaskId() {
        return this.sourceTaskId;
    }

    public CreateWorkItemResponseBody setSourceTaskName(String sourceTaskName) {
        this.sourceTaskName = sourceTaskName;
        return this;
    }
    public String getSourceTaskName() {
        return this.sourceTaskName;
    }

    public CreateWorkItemResponseBody setSourceTriggerKey(String sourceTriggerKey) {
        this.sourceTriggerKey = sourceTriggerKey;
        return this;
    }
    public String getSourceTriggerKey() {
        return this.sourceTriggerKey;
    }

    public CreateWorkItemResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateWorkItemResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateWorkItemResponseBody setTriggerTimezone(String triggerTimezone) {
        this.triggerTimezone = triggerTimezone;
        return this;
    }
    public String getTriggerTimezone() {
        return this.triggerTimezone;
    }

    public CreateWorkItemResponseBody setTriggeredAt(String triggeredAt) {
        this.triggeredAt = triggeredAt;
        return this;
    }
    public String getTriggeredAt() {
        return this.triggeredAt;
    }

    public CreateWorkItemResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public CreateWorkItemResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateWorkItemResponseBody setVisibilitySource(String visibilitySource) {
        this.visibilitySource = visibilitySource;
        return this;
    }
    public String getVisibilitySource() {
        return this.visibilitySource;
    }

    public CreateWorkItemResponseBody setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

    public CreateWorkItemResponseBody setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
        return this;
    }
    public String getWorkflowStatus() {
        return this.workflowStatus;
    }

    public CreateWorkItemResponseBody setWorkflowTemplateIds(java.util.List<String> workflowTemplateIds) {
        this.workflowTemplateIds = workflowTemplateIds;
        return this;
    }
    public java.util.List<String> getWorkflowTemplateIds() {
        return this.workflowTemplateIds;
    }

    public static class CreateWorkItemResponseBodyAttachments extends TeaModel {
        /**
         * <p>附件ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("attachmentId")
        public String attachmentId;

        /**
         * <p>内容类型</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>附件访问入口（OpenAPI 302 前置）</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("refUrl")
        public String refUrl;

        /**
         * <p>附件资源ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>附件资源类型</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("resourceKind")
        public String resourceKind;

        /**
         * <p>附件大小(字节)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public static CreateWorkItemResponseBodyAttachments build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkItemResponseBodyAttachments self = new CreateWorkItemResponseBodyAttachments();
            return TeaModel.build(map, self);
        }

        public CreateWorkItemResponseBodyAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public CreateWorkItemResponseBodyAttachments setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateWorkItemResponseBodyAttachments setRefUrl(String refUrl) {
            this.refUrl = refUrl;
            return this;
        }
        public String getRefUrl() {
            return this.refUrl;
        }

        public CreateWorkItemResponseBodyAttachments setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateWorkItemResponseBodyAttachments setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public CreateWorkItemResponseBodyAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public CreateWorkItemResponseBodyAttachments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
