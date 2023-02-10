// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTimeQuery")
    public Long endTimeQuery;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RootTaskId")
    public String rootTaskId;

    @NameInMap("StartTimeQuery")
    public Long startTimeQuery;

    @NameInMap("TaskId")
    public String taskId;

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
