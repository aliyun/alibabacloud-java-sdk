// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The timestamp when the root task ends. Unit: milliseconds.
    @NameInMap("EndTimeQuery")
    public Long endTimeQuery;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the root task.
    // 
    // >  You must specify at least one of the **TaskType** and **RootTaskId** parameters.
    @NameInMap("RootTaskId")
    public String rootTaskId;

    // The timestamp when the root task starts. Unit: milliseconds.
    @NameInMap("StartTimeQuery")
    public Long startTimeQuery;

    @NameInMap("TaskId")
    public String taskId;

    // The type of the task. Valid values:
    // 
    // *   **CLIENT\_PROBLEM_CHECK**: a task of the Security Center agent
    // *   **CLIENT\_DEV_OPS**: an O&M task of Cloud Assistant
    // *   **ASSET\_SECURITY_CHECK**: a task of asset information collection
    // 
    // >  You must specify at least one of the **TaskType** and **RootTaskId** parameters.
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskRequest self = new DescribeOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOnceTaskRequest setEndTimeQuery(Long endTimeQuery) {
        this.endTimeQuery = endTimeQuery;
        return this;
    }
    public Long getEndTimeQuery() {
        return this.endTimeQuery;
    }

    public DescribeOnceTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOnceTaskRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public DescribeOnceTaskRequest setStartTimeQuery(Long startTimeQuery) {
        this.startTimeQuery = startTimeQuery;
        return this;
    }
    public Long getStartTimeQuery() {
        return this.startTimeQuery;
    }

    public DescribeOnceTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeOnceTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
