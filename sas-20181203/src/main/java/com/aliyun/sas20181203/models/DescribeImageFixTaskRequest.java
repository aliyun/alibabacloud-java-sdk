// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixTaskRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The timestamp when the task ends. Unit: milliseconds.
    @NameInMap("EndTime")
    public Long endTime;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The timestamp when the task starts. Unit: milliseconds.
    @NameInMap("StartTime")
    public Long startTime;

    // The status of the task. Valid values:
    // 
    // *   **1**: The task is running.
    // *   **2**: The task is successful.
    // *   **3**: The task failed.
    @NameInMap("Status")
    public String status;

    public static DescribeImageFixTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFixTaskRequest self = new DescribeImageFixTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageFixTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageFixTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeImageFixTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageFixTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeImageFixTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
