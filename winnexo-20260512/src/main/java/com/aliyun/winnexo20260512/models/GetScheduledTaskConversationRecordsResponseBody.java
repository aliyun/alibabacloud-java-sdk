// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskConversationRecordsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether a next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The collaboration group ID, such as cg_101. If you specify this parameter, the data is returned by group dimension, and the caller must be a valid group member. If you do not specify this parameter, the data is returned by personal dimension, excluding group tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("tasks")
    public java.util.List<GetScheduledTaskConversationRecordsResponseBodyTasks> tasks;

    /**
     * <p>The total number of Logtail pipeline configurations in the current project.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static GetScheduledTaskConversationRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskConversationRecordsResponseBody self = new GetScheduledTaskConversationRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskConversationRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScheduledTaskConversationRecordsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public GetScheduledTaskConversationRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduledTaskConversationRecordsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetScheduledTaskConversationRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetScheduledTaskConversationRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledTaskConversationRecordsResponseBody setTasks(java.util.List<GetScheduledTaskConversationRecordsResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<GetScheduledTaskConversationRecordsResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public GetScheduledTaskConversationRecordsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetScheduledTaskConversationRecordsResponseBodyTasksConversations extends TeaModel {
        /**
         * <p>The actual group topic ID, which can be associated in queryWorkItemFeed. This ID cannot be used as a Workflow workItemId.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleConversationId</p>
         */
        @NameInMap("conversationId")
        public String conversationId;

        /**
         * <p>The name of the schedule location.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily sales weekly report</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Indicates whether unread messages exist.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasUnread")
        public Boolean hasUnread;

        /**
         * <p>The ID of the latest execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        @NameInMap("latestExecutionId")
        public String latestExecutionId;

        /**
         * <p>The latest execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("latestStatus")
        public String latestStatus;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-16T09:30:00+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetScheduledTaskConversationRecordsResponseBodyTasksConversations build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskConversationRecordsResponseBodyTasksConversations self = new GetScheduledTaskConversationRecordsResponseBodyTasksConversations();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasksConversations setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasksConversations setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasksConversations setHasUnread(Boolean hasUnread) {
            this.hasUnread = hasUnread;
            return this;
        }
        public Boolean getHasUnread() {
            return this.hasUnread;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasksConversations setLatestExecutionId(String latestExecutionId) {
            this.latestExecutionId = latestExecutionId;
            return this;
        }
        public String getLatestExecutionId() {
            return this.latestExecutionId;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasksConversations setLatestStatus(String latestStatus) {
            this.latestStatus = latestStatus;
            return this;
        }
        public String getLatestStatus() {
            return this.latestStatus;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasksConversations setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class GetScheduledTaskConversationRecordsResponseBodyTasks extends TeaModel {
        /**
         * <p>Pre-filters by a single task. If you do not specify this parameter, the execution records of all visible tasks are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        @NameInMap("collaborationGroupId")
        public String collaborationGroupId;

        /**
         * <p>The list of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("conversations")
        public java.util.List<GetScheduledTaskConversationRecordsResponseBodyTasksConversations> conversations;

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
         * <p>Indicates whether public access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOpen")
        public Boolean isOpen;

        /**
         * <p>The execution model tier. Valid values: flagship (Flagship), standard (Standard), and quick (Lightweight).</p>
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
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTaskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The time zone.</p>
         * <blockquote>
         * <p>Default value: UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Manual: Manual execution.</li>
         * <li>Cron: Scheduled trigger.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static GetScheduledTaskConversationRecordsResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskConversationRecordsResponseBodyTasks self = new GetScheduledTaskConversationRecordsResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setConversations(java.util.List<GetScheduledTaskConversationRecordsResponseBodyTasksConversations> conversations) {
            this.conversations = conversations;
            return this;
        }
        public java.util.List<GetScheduledTaskConversationRecordsResponseBodyTasksConversations> getConversations() {
            return this.conversations;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetScheduledTaskConversationRecordsResponseBodyTasks setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
