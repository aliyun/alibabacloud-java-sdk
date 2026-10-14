// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBatchTasksRequest extends TeaModel {
    /**
     * <p>The end of the creation time range.</p>
     * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-06T20:52:40Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start of the creation time range.</p>
     * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-06T20:51:40Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The list of task statuses.</p>
     * <blockquote>
     * <p>If this parameter is left empty, scheduled tasks in all statuses are queried by default.</p>
     * </blockquote>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The batch task type.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclaw_install_skills</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeBatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchTasksRequest self = new DescribeBatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBatchTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBatchTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBatchTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBatchTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeBatchTasksRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeBatchTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
