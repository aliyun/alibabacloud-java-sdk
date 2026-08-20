// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListScheduledTasksResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether more data is available. Valid values:</p>
     * <ul>
     * <li>true: More data is available.</li>
     * <li>false: No more data is available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The list of skill cards.</p>
     */
    @NameInMap("items")
    public java.util.List<ListScheduledTasksResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>1763604514518000_531300</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListScheduledTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksResponseBody self = new ListScheduledTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScheduledTasksResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListScheduledTasksResponseBody setItems(java.util.List<ListScheduledTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListScheduledTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public ListScheduledTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListScheduledTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScheduledTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScheduledTasksResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListScheduledTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScheduledTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduledTasksResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListScheduledTasksResponseBodyItems extends TeaModel {
        /**
         * <p>The reason for the abnormality. This field has a value only when status is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("abnormalReason")
        public String abnormalReason;

        /**
         * <p>Indicates whether the current caller can delete the task (only the task creator and group owner can do so). Always returns true for personal tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canDelete")
        public Boolean canDelete;

        /**
         * <p>Indicates whether the task can be edited or deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canEdit")
        public Boolean canEdit;

        /**
         * <p>Indicates whether the current caller can immediately execute the task (anyone with visibility can operate. Returns false for abnormal tasks). Always returns true for personal tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canExecute")
        public Boolean canExecute;

        /**
         * <p>Indicates whether the current caller can start or stop the task (only the task creator and group owner can do so. Returns false for abnormal tasks). Always returns true for personal tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canToggle")
        public Boolean canToggle;

        /**
         * <p>The ID of the collaboration group (such as cg_101). If specified, a group task is created (the caller must be a valid group member). If left empty, a personal task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        @NameInMap("collaborationGroupId")
        public String collaborationGroupId;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <p>The description of the to-do card type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The list of digital employee names.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("digitalEmployeeName")
        public java.util.List<String> digitalEmployeeName;

        /**
         * <p>The cumulative number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("executionCount")
        public Long executionCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether public access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOpen")
        public Boolean isOpen;

        /**
         * <p>The execution model tier. If not specified, the value is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The task status. Running is returned upon submission.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTaskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        /**
         * <p>The visibility of the group task. Valid values:</p>
         * <ul>
         * <li>PRIVATE: visible only to the creator and group owner.</li>
         * <li>COLLABORATIVE: visible to specified collaborators.</li>
         * <li>PUBLIC: visible to all group members.</li>
         * </ul>
         * <p>If not specified for a group task, the default value is PRIVATE. This field is ignored for personal tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("visibility")
        public String visibility;

        /**
         * <p>The list of collaborator user IDs (excluding the task creator and group creator, who are covered by the authentication layer). This field is returned only for group tasks. An empty list is returned for PRIVATE or PUBLIC visibility.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("visibleMemberUserIds")
        public java.util.List<String> visibleMemberUserIds;

        public static ListScheduledTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScheduledTasksResponseBodyItems self = new ListScheduledTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScheduledTasksResponseBodyItems setAbnormalReason(String abnormalReason) {
            this.abnormalReason = abnormalReason;
            return this;
        }
        public String getAbnormalReason() {
            return this.abnormalReason;
        }

        public ListScheduledTasksResponseBodyItems setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListScheduledTasksResponseBodyItems setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        public ListScheduledTasksResponseBodyItems setCanExecute(Boolean canExecute) {
            this.canExecute = canExecute;
            return this;
        }
        public Boolean getCanExecute() {
            return this.canExecute;
        }

        public ListScheduledTasksResponseBodyItems setCanToggle(Boolean canToggle) {
            this.canToggle = canToggle;
            return this;
        }
        public Boolean getCanToggle() {
            return this.canToggle;
        }

        public ListScheduledTasksResponseBodyItems setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public ListScheduledTasksResponseBodyItems setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListScheduledTasksResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListScheduledTasksResponseBodyItems setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListScheduledTasksResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScheduledTasksResponseBodyItems setDigitalEmployeeName(java.util.List<String> digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public java.util.List<String> getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public ListScheduledTasksResponseBodyItems setExecutionCount(Long executionCount) {
            this.executionCount = executionCount;
            return this;
        }
        public Long getExecutionCount() {
            return this.executionCount;
        }

        public ListScheduledTasksResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListScheduledTasksResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListScheduledTasksResponseBodyItems setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public ListScheduledTasksResponseBodyItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListScheduledTasksResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScheduledTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListScheduledTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListScheduledTasksResponseBodyItems setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListScheduledTasksResponseBodyItems setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public ListScheduledTasksResponseBodyItems setVisibleMemberUserIds(java.util.List<String> visibleMemberUserIds) {
            this.visibleMemberUserIds = visibleMemberUserIds;
            return this;
        }
        public java.util.List<String> getVisibleMemberUserIds() {
            return this.visibleMemberUserIds;
        }

    }

}
