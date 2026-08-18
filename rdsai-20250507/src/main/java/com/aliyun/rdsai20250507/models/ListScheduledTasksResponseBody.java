// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListScheduledTasksResponseBody extends TeaModel {
    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Task information queried successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of scheduled inspection tasks.</p>
     */
    @NameInMap("Schedules")
    public java.util.List<ListScheduledTasksResponseBodySchedules> schedules;

    /**
     * <p>The request result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T06:51:24Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The inspection description.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatic inspection of production RDS instances at 2 AM every day</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The new inspection frequency. Separate multiple values with commas (,). Default value: DAILY. Valid values:</p>
         * <ul>
         * <li>DAILY: every day</li>
         * <li>Monday: Monday</li>
         * <li>Tuesday: Tuesday</li>
         * <li>Wednesday: Wednesday</li>
         * <li>Thursday: Thursday</li>
         * <li>Friday: Friday</li>
         * <li>Saturday: Saturday</li>
         * <li>Sunday: Sunday</li>
         * </ul>
         * <h3>Note: DAILY overrides weekly values. For example, if you specify DAILY,Monday, the backend uses DAILY as the inspection frequency.</h3>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        @NameInMap("InspectionItems")
        public String inspectionItems;

        /**
         * <p>The number of task instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>InspectionTest</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReportLanguage")
        public String reportLanguage;

        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The ID of the scheduled inspection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>9d246af2-a0cd-4f69-857d-3785048f****</p>
         */
        @NameInMap("ScheduledId")
        public String scheduledId;

        /**
         * <p>The actual start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00:00Z</p>
         */
        @NameInMap("TaskStartTime")
        public String taskStartTime;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The inspection time range. Default value: the last 24 hours. Valid values: 1 to 168 (up to 7 days).</p>
         * 
         * <strong>example:</strong>
         * <p>24 hours</p>
         */
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

        public ListScheduledTasksResponseBodySchedules setInspectionItems(String inspectionItems) {
            this.inspectionItems = inspectionItems;
            return this;
        }
        public String getInspectionItems() {
            return this.inspectionItems;
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

        public ListScheduledTasksResponseBodySchedules setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListScheduledTasksResponseBodySchedules setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public ListScheduledTasksResponseBodySchedules setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
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

        public ListScheduledTasksResponseBodySchedules setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListScheduledTasksResponseBodySchedules setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
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
