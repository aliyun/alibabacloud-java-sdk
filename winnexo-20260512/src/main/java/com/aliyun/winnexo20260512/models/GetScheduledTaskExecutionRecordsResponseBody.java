// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionRecordsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
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
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of tasks per page.</p>
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
     * <p>The task list.</p>
     */
    @NameInMap("tasks")
    public java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasks> tasks;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static GetScheduledTaskExecutionRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskExecutionRecordsResponseBody self = new GetScheduledTaskExecutionRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskExecutionRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScheduledTaskExecutionRecordsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public GetScheduledTaskExecutionRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduledTaskExecutionRecordsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetScheduledTaskExecutionRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetScheduledTaskExecutionRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledTaskExecutionRecordsResponseBody setTasks(java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public GetScheduledTaskExecutionRecordsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline extends TeaModel {
        /**
         * <p>The actual working hours, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("actualTime")
        public String actualTime;

        /**
         * <p>The name of the schedule location.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The execution record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        @NameInMap("executionId")
        public String executionId;

        /**
         * <p>Indicates whether the execution record has been archived due to expiration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isExpired")
        public Boolean isExpired;

        /**
         * <p>The execution output content (historical records only).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("outputContent")
        public String outputContent;

        /**
         * <p>The timed scheduling time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("scheduledTime")
        public String scheduledTime;

        /**
         * <p>The final status of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        public static GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline self = new GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setActualTime(String actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public String getActualTime() {
            return this.actualTime;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setOutputContent(String outputContent) {
            this.outputContent = outputContent;
            return this;
        }
        public String getOutputContent() {
            return this.outputContent;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setScheduledTime(String scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }
        public String getScheduledTime() {
            return this.scheduledTime;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetScheduledTaskExecutionRecordsResponseBodyTasks extends TeaModel {
        /**
         * <p>The ID of the collaboration group to which the task belongs. If empty, the task is a personal task.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        @NameInMap("collaborationGroupId")
        public String collaborationGroupId;

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
         * <p>The execution model tier. Valid values:</p>
         * <ul>
         * <li>flagship: flagship.</li>
         * <li>standard: standard.</li>
         * <li>quick: lightweight.</li>
         * </ul>
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
         * <p>The timeline.</p>
         */
        @NameInMap("timeline")
        public java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline> timeline;

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
         * <li>Manual: manually executed.</li>
         * <li>Cron: triggered by a schedule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static GetScheduledTaskExecutionRecordsResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskExecutionRecordsResponseBodyTasks self = new GetScheduledTaskExecutionRecordsResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setTimeline(java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline> timeline) {
            this.timeline = timeline;
            return this;
        }
        public java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline> getTimeline() {
            return this.timeline;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetScheduledTaskExecutionRecordsResponseBodyTasks setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
