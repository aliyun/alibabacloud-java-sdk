// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingRunHistoryRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("SrcType")
    public Integer srcType;

    @NameInMap("DstType")
    public Integer dstType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("MainProcessId")
    public Long mainProcessId;

    @NameInMap("SrcTableName")
    public String srcTableName;

    public static DescribeDataMaskingRunHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingRunHistoryRequest self = new DescribeDataMaskingRunHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingRunHistoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataMaskingRunHistoryRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeDataMaskingRunHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDataMaskingRunHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDataMaskingRunHistoryRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeDataMaskingRunHistoryRequest setSrcType(Integer srcType) {
        this.srcType = srcType;
        return this;
    }
    public Integer getSrcType() {
        return this.srcType;
    }

    public DescribeDataMaskingRunHistoryRequest setDstType(Integer dstType) {
        this.dstType = dstType;
        return this;
    }
    public Integer getDstType() {
        return this.dstType;
    }

    public DescribeDataMaskingRunHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataMaskingRunHistoryRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataMaskingRunHistoryRequest setMainProcessId(Long mainProcessId) {
        this.mainProcessId = mainProcessId;
        return this;
    }
    public Long getMainProcessId() {
        return this.mainProcessId;
    }

    public DescribeDataMaskingRunHistoryRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

}
