// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionRecordsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("tasks")
    public java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasks> tasks;

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

    public GetScheduledTaskExecutionRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline extends TeaModel {
        /**
         * <p>实际执行时间（仅历史记录）</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("actualTime")
        public String actualTime;

        /**
         * <p>执行记录展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>错误信息（仅失败记录）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>执行记录 ID（历史记录才有）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        @NameInMap("executionId")
        public String executionId;

        /**
         * <p>执行输出内容（仅历史记录）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("outputContent")
        public String outputContent;

        /**
         * <p>计划执行时间 ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("scheduledTime")
        public String scheduledTime;

        /**
         * <p>状态：PENDING/RUNNING/SUCCESS/FAILED/SCHEDULED</p>
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
         * <p>Cron 表达式</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <p>任务简述</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>是否公开</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOpen")
        public Boolean isOpen;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>任务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTaskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("timeline")
        public java.util.List<GetScheduledTaskExecutionRecordsResponseBodyTasksTimeline> timeline;

        /**
         * <p>时区</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>触发类型 cron/manual/event</p>
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
