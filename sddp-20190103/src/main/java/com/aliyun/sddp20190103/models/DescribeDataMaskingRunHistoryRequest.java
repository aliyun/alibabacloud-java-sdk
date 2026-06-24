// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingRunHistoryRequest extends TeaModel {
    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of service to which the masked data is destined. Valid values: <strong>1</strong> for MaxCompute, <strong>2</strong> for OSS, <strong>3</strong> for ADS, <strong>4</strong> for OTS, and <strong>5</strong> for RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DstType")
    public Integer dstType;

    /**
     * <p>The end time to query for task executions. This is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1583856000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the main task.</p>
     * <blockquote>
     * <p>If a task has subtasks, this parameter specifies the ID of the main task. Otherwise, this parameter is empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>366731</p>
     */
    @NameInMap("MainProcessId")
    public Long mainProcessId;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the source table.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("SrcTableName")
    public String srcTableName;

    /**
     * <p>The type of service to which the source data belongs. Valid values: <strong>1</strong> for MaxCompute, <strong>2</strong> for OSS, <strong>3</strong> for ADS, <strong>4</strong> for OTS, and <strong>5</strong> for RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SrcType")
    public Integer srcType;

    /**
     * <p>The start time to query for task executions. This is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582992000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The execution status of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>-1</strong>: pending.</p>
     * </li>
     * <li><p><strong>0</strong>: running.</p>
     * </li>
     * <li><p><strong>1</strong>: successful.</p>
     * </li>
     * <li><p><strong>2</strong>: failed.</p>
     * </li>
     * <li><p><strong>3</strong>: stopped by user.</p>
     * </li>
     * <li><p><strong>4</strong>: partially failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the data masking task.</p>
     * 
     * <strong>example:</strong>
     * <p>mt4HBgtw1B******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeDataMaskingRunHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingRunHistoryRequest self = new DescribeDataMaskingRunHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingRunHistoryRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataMaskingRunHistoryRequest setDstType(Integer dstType) {
        this.dstType = dstType;
        return this;
    }
    public Integer getDstType() {
        return this.dstType;
    }

    public DescribeDataMaskingRunHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDataMaskingRunHistoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataMaskingRunHistoryRequest setMainProcessId(Long mainProcessId) {
        this.mainProcessId = mainProcessId;
        return this;
    }
    public Long getMainProcessId() {
        return this.mainProcessId;
    }

    public DescribeDataMaskingRunHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataMaskingRunHistoryRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

    public DescribeDataMaskingRunHistoryRequest setSrcType(Integer srcType) {
        this.srcType = srcType;
        return this;
    }
    public Integer getSrcType() {
        return this.srcType;
    }

    public DescribeDataMaskingRunHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDataMaskingRunHistoryRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeDataMaskingRunHistoryRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
