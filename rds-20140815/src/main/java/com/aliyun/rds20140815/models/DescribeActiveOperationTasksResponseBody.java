// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The O\&M tasks of the instance.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTasksResponseBodyItems> items;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 25.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeActiveOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTasksResponseBody self = new DescribeActiveOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTasksResponseBody setItems(java.util.List<DescribeActiveOperationTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeActiveOperationTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeActiveOperationTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeActiveOperationTasksResponseBodyItems extends TeaModel {
        /**
         * <p>Indicates whether the task can be canceled. The value 1 indicates that the task can be canceled. The value 0 indicates that the task cannot be canceled.</p>
         */
        @NameInMap("AllowCancel")
        public String allowCancel;

        /**
         * <p>Indicates whether the switching time can be changed. The value 1 indicates that the switching time can be changed. The value 0 indicates that the switching time cannot be changed.</p>
         */
        @NameInMap("AllowChange")
        public String allowChange;

        /**
         * <p>The code of the task level. The value S1 indicates the system O\&M level. The value S0 indicates the exception fixing level.</p>
         */
        @NameInMap("ChangeLevel")
        public String changeLevel;

        /**
         * <p>The level of the task in English.</p>
         */
        @NameInMap("ChangeLevelEn")
        public String changeLevelEn;

        /**
         * <p>The level of the task in Chinese.</p>
         */
        @NameInMap("ChangeLevelZh")
        public String changeLevelZh;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The current zone.</p>
         */
        @NameInMap("CurrentAVZ")
        public String currentAVZ;

        /**
         * <p>The type of the database. Valid values: mysql, pgsql, and mssql.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The minor engine version.</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>The deadline of the switching time for the task. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The ID of the precheck task.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The impact of the task.</p>
         */
        @NameInMap("Impact")
        public String impact;

        /**
         * <p>The impact of the task in English.</p>
         */
        @NameInMap("ImpactEn")
        public String impactEn;

        /**
         * <p>The impact of the task in Chinese.</p>
         */
        @NameInMap("ImpactZh")
        public String impactZh;

        /**
         * <p>The alias and description of the instance.</p>
         */
        @NameInMap("InsComment")
        public String insComment;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The time after the modification. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The required preparation period between the task start time and the switching time. The time is displayed in the HH:mm:ss format.</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The region ID of the pending task.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The information about the execution result.</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the task was executed. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the task.</p>
         * <br>
         * <p>*   **3**: pending</p>
         * <p>*   **4**: being processed</p>
         * <p>*   **5**: completed</p>
         * <p>*   **6**: failed</p>
         * <p>*   **7**: canceled</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The subtasks of the instance.</p>
         */
        @NameInMap("SubInsNames")
        public java.util.List<String> subInsNames;

        /**
         * <p>The switching time of the task. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **rds_apsaradb_ha**: primary/secondary switchover</p>
         * <p>*   **rds_apsaradb_transfer**: instance migration</p>
         * <p>*   **rds_apsaradb_upgrade**: update of the minor engine version</p>
         * <p>*   **rds_apsaradb_maxscale**: update of the minor version of the proxy</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The reason for the task in English.</p>
         */
        @NameInMap("TaskTypeEn")
        public String taskTypeEn;

        /**
         * <p>The reason for the task in Chinese.</p>
         */
        @NameInMap("TaskTypeZh")
        public String taskTypeZh;

        public static DescribeActiveOperationTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationTasksResponseBodyItems self = new DescribeActiveOperationTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationTasksResponseBodyItems setAllowCancel(String allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public String getAllowCancel() {
            return this.allowCancel;
        }

        public DescribeActiveOperationTasksResponseBodyItems setAllowChange(String allowChange) {
            this.allowChange = allowChange;
            return this;
        }
        public String getAllowChange() {
            return this.allowChange;
        }

        public DescribeActiveOperationTasksResponseBodyItems setChangeLevel(String changeLevel) {
            this.changeLevel = changeLevel;
            return this;
        }
        public String getChangeLevel() {
            return this.changeLevel;
        }

        public DescribeActiveOperationTasksResponseBodyItems setChangeLevelEn(String changeLevelEn) {
            this.changeLevelEn = changeLevelEn;
            return this;
        }
        public String getChangeLevelEn() {
            return this.changeLevelEn;
        }

        public DescribeActiveOperationTasksResponseBodyItems setChangeLevelZh(String changeLevelZh) {
            this.changeLevelZh = changeLevelZh;
            return this;
        }
        public String getChangeLevelZh() {
            return this.changeLevelZh;
        }

        public DescribeActiveOperationTasksResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setCurrentAVZ(String currentAVZ) {
            this.currentAVZ = currentAVZ;
            return this;
        }
        public String getCurrentAVZ() {
            return this.currentAVZ;
        }

        public DescribeActiveOperationTasksResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeActiveOperationTasksResponseBodyItems setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeActiveOperationTasksResponseBodyItems setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public DescribeActiveOperationTasksResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeActiveOperationTasksResponseBodyItems setImpact(String impact) {
            this.impact = impact;
            return this;
        }
        public String getImpact() {
            return this.impact;
        }

        public DescribeActiveOperationTasksResponseBodyItems setImpactEn(String impactEn) {
            this.impactEn = impactEn;
            return this;
        }
        public String getImpactEn() {
            return this.impactEn;
        }

        public DescribeActiveOperationTasksResponseBodyItems setImpactZh(String impactZh) {
            this.impactZh = impactZh;
            return this;
        }
        public String getImpactZh() {
            return this.impactZh;
        }

        public DescribeActiveOperationTasksResponseBodyItems setInsComment(String insComment) {
            this.insComment = insComment;
            return this;
        }
        public String getInsComment() {
            return this.insComment;
        }

        public DescribeActiveOperationTasksResponseBodyItems setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeActiveOperationTasksResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setPrepareInterval(String prepareInterval) {
            this.prepareInterval = prepareInterval;
            return this;
        }
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        public DescribeActiveOperationTasksResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeActiveOperationTasksResponseBodyItems setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribeActiveOperationTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeActiveOperationTasksResponseBodyItems setSubInsNames(java.util.List<String> subInsNames) {
            this.subInsNames = subInsNames;
            return this;
        }
        public java.util.List<String> getSubInsNames() {
            return this.subInsNames;
        }

        public DescribeActiveOperationTasksResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeActiveOperationTasksResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeActiveOperationTasksResponseBodyItems setTaskTypeEn(String taskTypeEn) {
            this.taskTypeEn = taskTypeEn;
            return this;
        }
        public String getTaskTypeEn() {
            return this.taskTypeEn;
        }

        public DescribeActiveOperationTasksResponseBodyItems setTaskTypeZh(String taskTypeZh) {
            this.taskTypeZh = taskTypeZh;
            return this;
        }
        public String getTaskTypeZh() {
            return this.taskTypeZh;
        }

    }

}
