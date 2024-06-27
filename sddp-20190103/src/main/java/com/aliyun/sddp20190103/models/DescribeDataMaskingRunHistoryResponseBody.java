// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingRunHistoryResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The execution information about the de-identification task.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataMaskingRunHistoryResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-4******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataMaskingRunHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingRunHistoryResponseBody self = new DescribeDataMaskingRunHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingRunHistoryResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataMaskingRunHistoryResponseBody setItems(java.util.List<DescribeDataMaskingRunHistoryResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataMaskingRunHistoryResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataMaskingRunHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataMaskingRunHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataMaskingRunHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataMaskingRunHistoryResponseBodyItems extends TeaModel {
        /**
         * <p>The number of rows that are in conflict with the data to be de-identified in the destination table to which the data to be de-identified is moved.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ConflictCount")
        public Long conflictCount;

        /**
         * <p>The type of the service to which the de-identified data belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DstType")
        public Integer dstType;

        /**
         * <p>The service that stores the de-identified data. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("DstTypeCode")
        public String dstTypeCode;

        /**
         * <p>The end time of the de-identification task.</p>
         * 
         * <strong>example:</strong>
         * <p>1582251233000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The error code that is returned when the de-identification task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>masking_task_not_found</p>
         */
        @NameInMap("FailCode")
        public String failCode;

        /**
         * <p>The reason why the de-identification task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("FailMsg")
        public String failMsg;

        /**
         * <p>Indicates whether a file is available for download.</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HasDownloadFile")
        public Integer hasDownloadFile;

        /**
         * <p>The number of created subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HasSubProcess")
        public Integer hasSubProcess;

        /**
         * <p>The ID of the task execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of rows that are de-identified.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaskingCount")
        public Long maskingCount;

        /**
         * <p>The progress of the de-identification task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The number of times that the de-identification task is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunIndex")
        public Integer runIndex;

        /**
         * <p>The name of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("SrcTableName")
        public String srcTableName;

        /**
         * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SrcType")
        public Integer srcType;

        /**
         * <p>The service to which the data to be de-identified belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SrcTypeCode")
        public String srcTypeCode;

        /**
         * <p>The time when the de-identification task was executed. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582251233000</p>
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
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the identification task.</p>
         * 
         * <strong>example:</strong>
         * <p>mt4HBgtw1B******</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The mode in which the de-identification task is executed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: manual</li>
         * <li><strong>2</strong>: scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static DescribeDataMaskingRunHistoryResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataMaskingRunHistoryResponseBodyItems self = new DescribeDataMaskingRunHistoryResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setConflictCount(Long conflictCount) {
            this.conflictCount = conflictCount;
            return this;
        }
        public Long getConflictCount() {
            return this.conflictCount;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setDstType(Integer dstType) {
            this.dstType = dstType;
            return this;
        }
        public Integer getDstType() {
            return this.dstType;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setDstTypeCode(String dstTypeCode) {
            this.dstTypeCode = dstTypeCode;
            return this;
        }
        public String getDstTypeCode() {
            return this.dstTypeCode;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setFailMsg(String failMsg) {
            this.failMsg = failMsg;
            return this;
        }
        public String getFailMsg() {
            return this.failMsg;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setHasDownloadFile(Integer hasDownloadFile) {
            this.hasDownloadFile = hasDownloadFile;
            return this;
        }
        public Integer getHasDownloadFile() {
            return this.hasDownloadFile;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setHasSubProcess(Integer hasSubProcess) {
            this.hasSubProcess = hasSubProcess;
            return this;
        }
        public Integer getHasSubProcess() {
            return this.hasSubProcess;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setMaskingCount(Long maskingCount) {
            this.maskingCount = maskingCount;
            return this;
        }
        public Long getMaskingCount() {
            return this.maskingCount;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setRunIndex(Integer runIndex) {
            this.runIndex = runIndex;
            return this;
        }
        public Integer getRunIndex() {
            return this.runIndex;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setSrcTableName(String srcTableName) {
            this.srcTableName = srcTableName;
            return this;
        }
        public String getSrcTableName() {
            return this.srcTableName;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setSrcTypeCode(String srcTypeCode) {
            this.srcTypeCode = srcTypeCode;
            return this;
        }
        public String getSrcTypeCode() {
            return this.srcTypeCode;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeDataMaskingRunHistoryResponseBodyItems setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
