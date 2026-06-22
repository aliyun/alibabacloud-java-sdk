// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationProcessRequest extends TeaModel {
    /**
     * <p>The page number of the current page to display in a paged query. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query based on the task completion time. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635575219000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query based on the task creation time. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1680919232000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The list of task status codes.</p>
     */
    @NameInMap("StatusCodes")
    public java.util.List<Integer> statusCodes;

    /**
     * <p>The list of task IDs.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
     * <p>The list of task sources.</p>
     */
    @NameInMap("TaskSources")
    public java.util.List<String> taskSources;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>CHECK_ALL: full check.</li>
     * <li>CHECK_POLICY: check performed based on check items in the configured policy.</li>
     * <li>CHECK_SCHEDULE: scheduled check.</li>
     * <li>CHECK_ITEM: check performed based on specified check items.</li>
     * <li>CHECK_INSTANCE: check performed based on specified check items and instances.</li>
     * </ul>
     */
    @NameInMap("TaskTypes")
    public java.util.List<String> taskTypes;

    public static ListOperationProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationProcessRequest self = new ListOperationProcessRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationProcessRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOperationProcessRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListOperationProcessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationProcessRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListOperationProcessRequest setStatusCodes(java.util.List<Integer> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }
    public java.util.List<Integer> getStatusCodes() {
        return this.statusCodes;
    }

    public ListOperationProcessRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public ListOperationProcessRequest setTaskSources(java.util.List<String> taskSources) {
        this.taskSources = taskSources;
        return this;
    }
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

    public ListOperationProcessRequest setTaskTypes(java.util.List<String> taskTypes) {
        this.taskTypes = taskTypes;
        return this;
    }
    public java.util.List<String> getTaskTypes() {
        return this.taskTypes;
    }

}
