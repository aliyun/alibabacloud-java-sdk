// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionResponseBody extends TeaModel {
    /**
     * <p>Details about tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribePendingMaintenanceActionResponseBodyItems> items;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2F029645-FED9-4FE8-A6D3-488954******</p>
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

    public static DescribePendingMaintenanceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePendingMaintenanceActionResponseBody self = new DescribePendingMaintenanceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePendingMaintenanceActionResponseBody setItems(java.util.List<DescribePendingMaintenanceActionResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribePendingMaintenanceActionResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribePendingMaintenanceActionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePendingMaintenanceActionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePendingMaintenanceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePendingMaintenanceActionResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePendingMaintenanceActionResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the task was created. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T22:00:42Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine.</p>
         * <ul>
         * <li><p>Valid values for the MySQL database engine:</p>
         * <ul>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>8.0</strong></li>
         * </ul>
         * </li>
         * <li><p>Valid values for the PostgreSQL database engine:</p>
         * <ul>
         * <li><strong>11</strong></li>
         * <li><strong>14</strong></li>
         * </ul>
         * </li>
         * <li><p>Valid value for the Oracle database engine: <strong>11</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The deadline before which the task can be executed. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-11T15:59:59Z</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The time when the parameter was modified. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T22:00:42Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The preparation time that is required before the pending event is switched. The time follows the <code>HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>04:00:00</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The region ID of the pending event.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The execution result of the task. Valid values:</p>
         * <ul>
         * <li><strong>manualCancel</strong>: The task is manually canceled.</li>
         * <li><strong>paramCheckNotPass</strong>: The task fails to pass the parameter check.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when the value of the <code>Status</code> parameter is <strong>6</strong> or <strong>7</strong>. The value 6 indicates that the task is completed but fails to be executed. The value 7 indicates that the task is canceled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>manualCancel</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the task was executed in the background. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T18:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the pending task.</p>
         * <ul>
         * <li><p>If you set the <code>IsHistory</code> parameter to <strong>0</strong>, the status of the pending task is returned. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: The start time of the task is to be specified.</li>
         * <li><strong>3</strong>: The task is pending.</li>
         * <li><strong>4</strong>: The task is running. In this case, you cannot modify the execution time.</li>
         * </ul>
         * </li>
         * <li><p>If you set the <code>IsHistory</code> parameter to <strong>1</strong>, the details of the historical tasks are returned. Valid values:</p>
         * <ul>
         * <li><strong>5</strong>: The task is completed and executed.</li>
         * <li><strong>6</strong>: The task is completed but fails to be executed.</li>
         * <li><strong>7</strong>: The task is canceled.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the pending event was switched. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T22:00:00Z</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The type of the pending event.</p>
         * 
         * <strong>example:</strong>
         * <p>DatabaseSoftwareUpgrading</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribePendingMaintenanceActionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePendingMaintenanceActionResponseBodyItems self = new DescribePendingMaintenanceActionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePendingMaintenanceActionResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setPrepareInterval(String prepareInterval) {
            this.prepareInterval = prepareInterval;
            return this;
        }
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
