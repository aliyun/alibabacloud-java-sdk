// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskResponseBody extends TeaModel {
    /**
     * <p>The list of tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTaskResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED2BD080-F9D9-4822-ACBB-AE5D87******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeActiveOperationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskResponseBody self = new DescribeActiveOperationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskResponseBody setItems(java.util.List<DescribeActiveOperationTaskResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeActiveOperationTaskResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeActiveOperationTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTaskResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeActiveOperationTaskResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the task was created. The time follows the <code>yyyy-MM-ddTHH:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T22:00:42Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>The deadline for adjusting the task execution time. The time follows the <code>yyyy-MM-ddTHH:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-11T15:59:59Z</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The time when the task was modified. The time follows the <code>yyyy-MM-ddTHH:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T22:00:42Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The preparation time before the transient disconnection. The time follows the <code>HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>04:00:00</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The region where the task is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The task execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the task is executed in the background. The time follows the <code>yyyy-MM-ddTHH:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T18:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status.</p>
         * <ul>
         * <li><p>If you set IsHistory to <strong>0</strong>, the details of the pending task status are returned. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: waiting for the user to set the task start time</li>
         * <li><strong>3</strong>: waiting to be processed</li>
         * <li><strong>4</strong>: the task is being processed</li>
         * </ul>
         * </li>
         * <li><p>If you set IsHistory to <strong>1</strong>, the details of the historical task status are returned. Valid values:</p>
         * <ul>
         * <li><strong>5</strong>: the task is completed and executed successfully</li>
         * <li><strong>6</strong>: the task is completed but failed</li>
         * <li><strong>7</strong>: the task is canceled</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the transient disconnection occurs. The time follows the <code>yyyy-MM-ddTHH:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T22:00:00Z</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The task parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;action\&quot;: \&quot;UpgradeDBVersion\&quot;, \&quot;check_method\&quot;: \&quot;check_cpu_usage\&quot;, \&quot;params\&quot;: {\&quot;RelativeDbtype\&quot;: \&quot;maxscale\&quot;, \&quot;DBInstanceName\&quot;: \&quot;pc-*************\&quot;, \&quot;User_ID\&quot;: \&quot;11111\&quot;, \&quot;UID\&quot;: \&quot;1406926474******\&quot;, \&quot;UpgradePolicy\&quot;: \&quot;hot\&quot;}}&quot;</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_apsaradb_upgrade</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeActiveOperationTaskResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationTaskResponseBodyItems self = new DescribeActiveOperationTaskResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationTaskResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeActiveOperationTaskResponseBodyItems setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeActiveOperationTaskResponseBodyItems setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public DescribeActiveOperationTaskResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeActiveOperationTaskResponseBodyItems setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeActiveOperationTaskResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setPrepareInterval(String prepareInterval) {
            this.prepareInterval = prepareInterval;
            return this;
        }
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        public DescribeActiveOperationTaskResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeActiveOperationTaskResponseBodyItems setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribeActiveOperationTaskResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeActiveOperationTaskResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeActiveOperationTaskResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
