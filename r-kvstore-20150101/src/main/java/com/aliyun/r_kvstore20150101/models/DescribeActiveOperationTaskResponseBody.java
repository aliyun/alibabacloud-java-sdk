// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskResponseBody extends TeaModel {
    /**
     * <p>Details of O\&amp;M tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTaskResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2E1FF0CC-F42A-4B6F-A1F4-A17B1451****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The time when the O\&amp;M task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-15 23:59:59</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The database type of the instance. The return value is <strong>Redis</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The deadline before which the time to preform the O&amp;M task can be modified. The time in UTC is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19 23:59:59</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The ID of the O&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>114111</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1lgal1sdvxrz****</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The time when the O\&amp;M task was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19 14:00:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The required preparation period between the task start time and the switchover time. The time is displayed in the <em>HH:mm:ss</em> format.</p>
         * 
         * <strong>example:</strong>
         * <p>14:00:00</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the O\&amp;M task was preformed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19 10:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the O&amp;M task. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: The task is waiting for users to specify a switchover time.</li>
         * <li><strong>3</strong>: The task is waiting to be performed.</li>
         * <li><strong>4</strong>: The task is being performed. If the task is in this state, the <a href="~~ModifyActiveOperationTask~~">ModifyActiveOperationTask</a> operation cannot be called to modify the scheduled switchover time.</li>
         * <li><strong>5</strong>: The task is performed.</li>
         * <li><strong>6</strong>: The task fails.</li>
         * <li><strong>7</strong>: The task is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the system performs the switchover operation. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-19 14:00:00</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>rds_apsaradb_ha</strong>: master-replica switchover</li>
         * <li><strong>rds_apsaradb_transfer</strong>: instance migration</li>
         * <li><strong>rds_apsaradb_upgrade</strong>: minor version update</li>
         * <li><strong>all</strong>: all types</li>
         * </ul>
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
