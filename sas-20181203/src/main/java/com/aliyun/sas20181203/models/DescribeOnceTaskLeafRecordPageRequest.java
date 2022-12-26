// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskLeafRecordPageRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RelateInfo")
    public Boolean relateInfo;

    @NameInMap("Source")
    public String source;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    public static DescribeOnceTaskLeafRecordPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskLeafRecordPageRequest self = new DescribeOnceTaskLeafRecordPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskLeafRecordPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOnceTaskLeafRecordPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeOnceTaskLeafRecordPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOnceTaskLeafRecordPageRequest setRelateInfo(Boolean relateInfo) {
        this.relateInfo = relateInfo;
        return this;
    }
    public Boolean getRelateInfo() {
        return this.relateInfo;
    }

    public DescribeOnceTaskLeafRecordPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeOnceTaskLeafRecordPageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeOnceTaskLeafRecordPageRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public DescribeOnceTaskLeafRecordPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeOnceTaskLeafRecordPageRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
