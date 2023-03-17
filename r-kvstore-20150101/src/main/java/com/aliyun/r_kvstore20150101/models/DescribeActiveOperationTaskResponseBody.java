// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskResponseBody extends TeaModel {
    /**
     * <p>The list of O&M tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTaskResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries that were returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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
         * <p>The time when the O&M task was created. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The database type of the instance. The returned value is **Redis**.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The deadline before which the time to execute the O\&M task can be modified. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The ID of the O&M task.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The ID of the ApsaraDB for Redis instance.</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The time when the O&M task was modified. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The required preparation period between the task start time and the switchover time. The time is displayed in the *HH:mm:ss* format.</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the O&M task was executed. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the O&M task. Valid values:</p>
         * <br>
         * <p>*   **2**: The O&M task is waiting until the specified time.</p>
         * <p>*   **3**: The O&M task is waiting to be handled.</p>
         * <p>*   **4**: The O&M task is being executed. You cannot call the [ModifyActiveOperationTask](~~197384#doc-api-R-kvstore-ModifyActiveOperationTask~~ "Modifies the scheduled switchover time of an operations and maintenance (O&M) task.") operation to modify the time if the task is in this state.</p>
         * <p>*   **5**: The O&M task succeeded</p>
         * <p>*   **6**: The O&M task failed</p>
         * <p>*   **7**: The O&M task is canceled.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the system performs the switchover operation. The time in UTC is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format.</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **rds_apsaradb_ha**: switchover between a master node and a replica node.</p>
         * <p>*   **rds_apsaradb_transfer**: instance migration task.</p>
         * <p>*   **rds_apsaradb_upgrade**: minor version upgrade.</p>
         * <p>*   **all**: all task types.</p>
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
