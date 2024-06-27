// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of de-identification tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataMaskingTasksResponseBodyItems> items;

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

    public static DescribeDataMaskingTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingTasksResponseBody self = new DescribeDataMaskingTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingTasksResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataMaskingTasksResponseBody setItems(java.util.List<DescribeDataMaskingTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataMaskingTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataMaskingTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataMaskingTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataMaskingTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataMaskingTasksResponseBodyItems extends TeaModel {
        /**
         * <p>The member account to which the desensitization target belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>192479427903xxxx</p>
         */
        @NameInMap("DstMemberAccount")
        public Long dstMemberAccount;

        /**
         * <p>The destination path.</p>
         */
        @NameInMap("DstPath")
        public String dstPath;

        /**
         * <p>The service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DstType")
        public Integer dstType;

        /**
         * <p>The type of the service to which the de-identified data belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("DstTypeCode")
        public String dstTypeCode;

        /**
         * <p>The time when the de-identification task is created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582992000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>Indicates whether the de-identification task is running.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasUnfinishProcess")
        public Boolean hasUnfinishProcess;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the source table is de-identified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OriginalTable")
        public Boolean originalTable;

        /**
         * <p>The user who created the de-identification task.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The number of times that the de-identification task is run.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunCount")
        public Integer runCount;

        /**
         * <p>The member account to which the desensitization source belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>192479427903xxxx</p>
         */
        @NameInMap("SrcMemberAccount")
        public Long srcMemberAccount;

        /**
         * <p>The source path.</p>
         */
        @NameInMap("SrcPath")
        public String srcPath;

        /**
         * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SrcType")
        public Integer srcType;

        /**
         * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("SrcTypeCode")
        public String srcTypeCode;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>mt4HBgtw1B******</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Task name</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The mode in which the de-identification task is run. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: manual</li>
         * <li><strong>2</strong>: scheduled</li>
         * <li><strong>3</strong>: manual and scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        public static DescribeDataMaskingTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataMaskingTasksResponseBodyItems self = new DescribeDataMaskingTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataMaskingTasksResponseBodyItems setDstMemberAccount(Long dstMemberAccount) {
            this.dstMemberAccount = dstMemberAccount;
            return this;
        }
        public Long getDstMemberAccount() {
            return this.dstMemberAccount;
        }

        public DescribeDataMaskingTasksResponseBodyItems setDstPath(String dstPath) {
            this.dstPath = dstPath;
            return this;
        }
        public String getDstPath() {
            return this.dstPath;
        }

        public DescribeDataMaskingTasksResponseBodyItems setDstType(Integer dstType) {
            this.dstType = dstType;
            return this;
        }
        public Integer getDstType() {
            return this.dstType;
        }

        public DescribeDataMaskingTasksResponseBodyItems setDstTypeCode(String dstTypeCode) {
            this.dstTypeCode = dstTypeCode;
            return this;
        }
        public String getDstTypeCode() {
            return this.dstTypeCode;
        }

        public DescribeDataMaskingTasksResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataMaskingTasksResponseBodyItems setHasUnfinishProcess(Boolean hasUnfinishProcess) {
            this.hasUnfinishProcess = hasUnfinishProcess;
            return this;
        }
        public Boolean getHasUnfinishProcess() {
            return this.hasUnfinishProcess;
        }

        public DescribeDataMaskingTasksResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataMaskingTasksResponseBodyItems setOriginalTable(Boolean originalTable) {
            this.originalTable = originalTable;
            return this;
        }
        public Boolean getOriginalTable() {
            return this.originalTable;
        }

        public DescribeDataMaskingTasksResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDataMaskingTasksResponseBodyItems setRunCount(Integer runCount) {
            this.runCount = runCount;
            return this;
        }
        public Integer getRunCount() {
            return this.runCount;
        }

        public DescribeDataMaskingTasksResponseBodyItems setSrcMemberAccount(Long srcMemberAccount) {
            this.srcMemberAccount = srcMemberAccount;
            return this;
        }
        public Long getSrcMemberAccount() {
            return this.srcMemberAccount;
        }

        public DescribeDataMaskingTasksResponseBodyItems setSrcPath(String srcPath) {
            this.srcPath = srcPath;
            return this;
        }
        public String getSrcPath() {
            return this.srcPath;
        }

        public DescribeDataMaskingTasksResponseBodyItems setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public DescribeDataMaskingTasksResponseBodyItems setSrcTypeCode(String srcTypeCode) {
            this.srcTypeCode = srcTypeCode;
            return this;
        }
        public String getSrcTypeCode() {
            return this.srcTypeCode;
        }

        public DescribeDataMaskingTasksResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDataMaskingTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeDataMaskingTasksResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDataMaskingTasksResponseBodyItems setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

    }

}
