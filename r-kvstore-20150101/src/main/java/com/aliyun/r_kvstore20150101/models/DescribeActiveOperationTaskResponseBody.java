// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskResponseBody extends TeaModel {
    /**
     * <p>The time when the system performs the switchover operation. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTaskResponseBodyItems> items;

    /**
     * <p>The number of the page to return. It must be an integer that is greater than **0** and less than or equal to the maximum value supported by the integer data type. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The time when the O\&M task was executed. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the region to which pending events belong. You can call the [DescribeRegions](~~61012~~) operation to query the region IDs.</p>
     * <br>
     * <p>>  A value of **all** indicates all region IDs.</p>
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
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>Queries the information about operations and maintenance (O&M) tasks for an ApsaraDB for Redis instance.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The time when the O\&M task was modified. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The maximum number of entries that were returned per page.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **rds_apsaradb_ha**: switchover between a master node and a replica node.</p>
         * <p>*   **rds_apsaradb_transfer**: instance migration task.</p>
         * <p>*   **rds_apsaradb_upgrade**: minor version upgrade.</p>
         * <p>*   **all**: all task types.</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        @NameInMap("Region")
        public String region;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The required preparation period between the task start time and the switchover time. The time is displayed in the *HH:mm:ss* format.</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The number of entries to return on each page. Specify a value greater than **10**. Default value: **30**.</p>
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

        public DescribeActiveOperationTaskResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
