// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingRunHistoryRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the service to which the de-identified data belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DstType")
    public Integer dstType;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1583856000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the task.</p>
     * <blockquote>
     * <p>If a task has one or more subtasks, the value of the parameter must be the ID of the task. Otherwise, leave this parameter empty.</p>
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
     * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SrcType")
    public Integer srcType;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582992000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the de-identification task. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: waiting</li>
     * <li><strong>0</strong>: being executed</li>
     * <li><strong>1</strong>: executed</li>
     * <li><strong>2</strong>: failed to be executed</li>
     * <li><strong>3</strong>: terminated</li>
     * <li><strong>4</strong>: partially failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the de-identification task.</p>
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
