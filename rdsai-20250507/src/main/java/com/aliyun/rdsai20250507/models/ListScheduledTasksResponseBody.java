// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListScheduledTasksResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schedules")
    public java.util.List<ListScheduledTasksResponseBodySchedules> schedules;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListScheduledTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksResponseBody self = new ListScheduledTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScheduledTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
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

    public ListScheduledTasksResponseBody setSchedules(java.util.List<ListScheduledTasksResponseBodySchedules> schedules) {
        this.schedules = schedules;
        return this;
    }
    public java.util.List<ListScheduledTasksResponseBodySchedules> getSchedules() {
        return this.schedules;
    }

    public ListScheduledTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListScheduledTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListScheduledTasksResponseBodySchedules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-02-04T06:51:24Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>9d246af2-a0cd-4f69-857d-3785048f****</p>
         */
        @NameInMap("ScheduledId")
        public String scheduledId;

        /**
         * <strong>example:</strong>
         * <p>18:00:00Z</p>
         */
        @NameInMap("TaskStartTime")
        public String taskStartTime;

        @NameInMap("TimeRange")
        public String timeRange;

        public static ListScheduledTasksResponseBodySchedules build(java.util.Map<String, ?> map) throws Exception {
            ListScheduledTasksResponseBodySchedules self = new ListScheduledTasksResponseBodySchedules();
            return TeaModel.build(map, self);
        }

        public ListScheduledTasksResponseBodySchedules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScheduledTasksResponseBodySchedules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScheduledTasksResponseBodySchedules setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

        public ListScheduledTasksResponseBodySchedules setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public ListScheduledTasksResponseBodySchedules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScheduledTasksResponseBodySchedules setScheduledId(String scheduledId) {
            this.scheduledId = scheduledId;
            return this;
        }
        public String getScheduledId() {
            return this.scheduledId;
        }

        public ListScheduledTasksResponseBodySchedules setTaskStartTime(String taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

        public ListScheduledTasksResponseBodySchedules setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

    }

}
