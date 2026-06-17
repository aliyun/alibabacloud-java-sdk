// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLogFilesResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><p><strong>polardb_mysql_rw</strong>: read-write instance.</p>
     * </li>
     * <li><p><strong>polardb_mysql_ro</strong>: read-only instance.</p>
     * </li>
     * <li><p><strong>polardb_mysql_standby</strong>: standby instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polardb_mysql_rw</p>
     */
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    /**
     * <p>A list of failover logs.</p>
     */
    @NameInMap("HaLogItems")
    public java.util.List<DescribeDBLogFilesResponseBodyHaLogItems> haLogItems;

    /**
     * <p>Indicates whether a failover record exists. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: No</p>
     * </li>
     * <li><p><strong>0</strong>: Yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HaStatus")
    public Integer haStatus;

    /**
     * <p>The number of log items on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    /**
     * <p>The page number. It must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 5 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of fault simulation records.</p>
     */
    @NameInMap("SwitchListItems")
    public java.util.List<DescribeDBLogFilesResponseBodySwitchListItems> switchListItems;

    /**
     * <p>A list of fault simulation logs.</p>
     */
    @NameInMap("SwitchLogItems")
    public java.util.List<DescribeDBLogFilesResponseBodySwitchLogItems> switchLogItems;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecords")
    public Integer totalRecords;

    public static DescribeDBLogFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBLogFilesResponseBody self = new DescribeDBLogFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBLogFilesResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBLogFilesResponseBody setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
        return this;
    }
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    public DescribeDBLogFilesResponseBody setHaLogItems(java.util.List<DescribeDBLogFilesResponseBodyHaLogItems> haLogItems) {
        this.haLogItems = haLogItems;
        return this;
    }
    public java.util.List<DescribeDBLogFilesResponseBodyHaLogItems> getHaLogItems() {
        return this.haLogItems;
    }

    public DescribeDBLogFilesResponseBody setHaStatus(Integer haStatus) {
        this.haStatus = haStatus;
        return this;
    }
    public Integer getHaStatus() {
        return this.haStatus;
    }

    public DescribeDBLogFilesResponseBody setItemsNumbers(Integer itemsNumbers) {
        this.itemsNumbers = itemsNumbers;
        return this;
    }
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    public DescribeDBLogFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBLogFilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBLogFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBLogFilesResponseBody setSwitchListItems(java.util.List<DescribeDBLogFilesResponseBodySwitchListItems> switchListItems) {
        this.switchListItems = switchListItems;
        return this;
    }
    public java.util.List<DescribeDBLogFilesResponseBodySwitchListItems> getSwitchListItems() {
        return this.switchListItems;
    }

    public DescribeDBLogFilesResponseBody setSwitchLogItems(java.util.List<DescribeDBLogFilesResponseBodySwitchLogItems> switchLogItems) {
        this.switchLogItems = switchLogItems;
        return this;
    }
    public java.util.List<DescribeDBLogFilesResponseBodySwitchLogItems> getSwitchLogItems() {
        return this.switchLogItems;
    }

    public DescribeDBLogFilesResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static class DescribeDBLogFilesResponseBodyHaLogItems extends TeaModel {
        /**
         * <p>The number of affected sessions during the failover.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AffectedSessions")
        public Long affectedSessions;

        /**
         * <p>The instance type before the failover. Valid values:</p>
         * <ul>
         * <li><p><strong>polardb_mysql_rw</strong>: read-write instance.</p>
         * </li>
         * <li><p><strong>polardb_mysql_ro</strong>: read-only instance.</p>
         * </li>
         * <li><p><strong>polardb_mysql_standby</strong>: standby instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polardb_mysql_rw</p>
         */
        @NameInMap("FromDBType")
        public String fromDBType;

        /**
         * <p>The error code for the failover cause.</p>
         * 
         * <strong>example:</strong>
         * <p>Platform.Ha.AuroraService.ManualOperations</p>
         */
        @NameInMap("SwitchCauseCode")
        public String switchCauseCode;

        /**
         * <p>Details about the failover cause.</p>
         * 
         * <strong>example:</strong>
         * <p>Platform.Ha.ManuallyTriggered</p>
         */
        @NameInMap("SwitchCauseDetail")
        public String switchCauseDetail;

        /**
         * <p>The time when the failover was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-20T03:09:56Z</p>
         */
        @NameInMap("SwitchFinishTime")
        public String switchFinishTime;

        /**
         * <p>The failover log ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e571f897-9b3c-4012-9470-88333832dec4</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The time when the failover started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-20T03:09:45Z</p>
         */
        @NameInMap("SwitchStartTime")
        public String switchStartTime;

        /**
         * <p>The failover type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SwitchType")
        public Long switchType;

        /**
         * <p>The total number of sessions during the failover.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalSessions")
        public Long totalSessions;

        public static DescribeDBLogFilesResponseBodyHaLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLogFilesResponseBodyHaLogItems self = new DescribeDBLogFilesResponseBodyHaLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setAffectedSessions(Long affectedSessions) {
            this.affectedSessions = affectedSessions;
            return this;
        }
        public Long getAffectedSessions() {
            return this.affectedSessions;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setFromDBType(String fromDBType) {
            this.fromDBType = fromDBType;
            return this;
        }
        public String getFromDBType() {
            return this.fromDBType;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setSwitchCauseCode(String switchCauseCode) {
            this.switchCauseCode = switchCauseCode;
            return this;
        }
        public String getSwitchCauseCode() {
            return this.switchCauseCode;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setSwitchCauseDetail(String switchCauseDetail) {
            this.switchCauseDetail = switchCauseDetail;
            return this;
        }
        public String getSwitchCauseDetail() {
            return this.switchCauseDetail;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setSwitchFinishTime(String switchFinishTime) {
            this.switchFinishTime = switchFinishTime;
            return this;
        }
        public String getSwitchFinishTime() {
            return this.switchFinishTime;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setSwitchStartTime(String switchStartTime) {
            this.switchStartTime = switchStartTime;
            return this;
        }
        public String getSwitchStartTime() {
            return this.switchStartTime;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setSwitchType(Long switchType) {
            this.switchType = switchType;
            return this;
        }
        public Long getSwitchType() {
            return this.switchType;
        }

        public DescribeDBLogFilesResponseBodyHaLogItems setTotalSessions(Long totalSessions) {
            this.totalSessions = totalSessions;
            return this;
        }
        public Long getTotalSessions() {
            return this.totalSessions;
        }

    }

    public static class DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems extends TeaModel {
        /**
         * <p>The time when the step was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-14T02:07:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the step was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The step was successful.</p>
         * </li>
         * <li><p><code>false</code>: The step failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSuccess")
        public String isSuccess;

        /**
         * <p>The fault simulation phase. Valid values:</p>
         * <ul>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</strong>: The fault injection phase.</p>
         * </li>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.RECOVERY</strong>: The recovery phase.</p>
         * </li>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.POST_PROCESS</strong>: The post-processing phase.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</p>
         */
        @NameInMap("SimulatePhase")
        public String simulatePhase;

        /**
         * <p>The time when the step started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-19T02:12:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The name of the current step. You can call the <a href="https://help.aliyun.com/document_detail/2400077.html">DescribeHistoryTasks</a> operation to query the current step of a specified task. A common value is <strong>do_pause</strong>, which indicates that the system waits for a specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>init_task_info</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The duration of the step in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TimeCost")
        public String timeCost;

        public static DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems self = new DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems setIsSuccess(String isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public String getIsSuccess() {
            return this.isSuccess;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems setSimulatePhase(String simulatePhase) {
            this.simulatePhase = simulatePhase;
            return this;
        }
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems setTimeCost(String timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public String getTimeCost() {
            return this.timeCost;
        }

    }

    public static class DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of your clusters, including the cluster IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The destination database type. Valid values:</p>
         * <ul>
         * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
         * </li>
         * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolarDBMySQL</p>
         */
        @NameInMap("DstDbType")
        public String dstDbType;

        /**
         * <p>The time when the system event was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-19T02:12:00Z</p>
         */
        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        /**
         * <p>The time when the system event started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-19T01:12:00Z</p>
         */
        @NameInMap("EventStartTime")
        public String eventStartTime;

        /**
         * <p>The simulation list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("SimulateListId")
        public String simulateListId;

        /**
         * <p>The simulation log ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("SimulateLogId")
        public String simulateLogId;

        /**
         * <p>The fault simulation status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Pending</p>
         * </li>
         * <li><p><strong>1</strong>: Success</p>
         * </li>
         * <li><p><strong>2</strong>: Running</p>
         * </li>
         * <li><p><strong>3</strong>: Failed</p>
         * </li>
         * <li><p><strong>4</strong>: Aborted</p>
         * </li>
         * <li><p><strong>5</strong>: Awaiting rollback</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SimulateStatus")
        public String simulateStatus;

        /**
         * <p>The source database type. Valid values:</p>
         * <ul>
         * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
         * </li>
         * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolarDBMySQL</p>
         */
        @NameInMap("SrcDbType")
        public String srcDbType;

        /**
         * <p>A list of fault simulation steps.</p>
         */
        @NameInMap("SwitchStepItems")
        public java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems> switchStepItems;

        public static DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems self = new DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setDstDbType(String dstDbType) {
            this.dstDbType = dstDbType;
            return this;
        }
        public String getDstDbType() {
            return this.dstDbType;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setEventFinishTime(String eventFinishTime) {
            this.eventFinishTime = eventFinishTime;
            return this;
        }
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setEventStartTime(String eventStartTime) {
            this.eventStartTime = eventStartTime;
            return this;
        }
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setSimulateListId(String simulateListId) {
            this.simulateListId = simulateListId;
            return this;
        }
        public String getSimulateListId() {
            return this.simulateListId;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setSimulateLogId(String simulateLogId) {
            this.simulateLogId = simulateLogId;
            return this;
        }
        public String getSimulateLogId() {
            return this.simulateLogId;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setSimulateStatus(String simulateStatus) {
            this.simulateStatus = simulateStatus;
            return this;
        }
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setSrcDbType(String srcDbType) {
            this.srcDbType = srcDbType;
            return this;
        }
        public String getSrcDbType() {
            return this.srcDbType;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems setSwitchStepItems(java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems> switchStepItems) {
            this.switchStepItems = switchStepItems;
            return this;
        }
        public java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItemsSwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

    }

    public static class DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems extends TeaModel {
        /**
         * <p>The cluster node ID.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <code>Key</code> parameter in the request is not set to <code>PolarDBDiskUsage</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The time when the step was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-23T02:30:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the step was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The step was successful.</p>
         * </li>
         * <li><p><code>false</code>: The step failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSuccess")
        public String isSuccess;

        /**
         * <p>The fault simulation phase. Valid values:</p>
         * <ul>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</strong>: The fault injection phase.</p>
         * </li>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.RECOVERY</strong>: The recovery phase.</p>
         * </li>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.POST_PROCESS</strong>: The post-processing phase.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</p>
         */
        @NameInMap("SimulatePhase")
        public String simulatePhase;

        /**
         * <p>The time when the step started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-16T02:12:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The name of the current step. You can call the <a href="https://help.aliyun.com/document_detail/2400077.html">DescribeHistoryTasks</a> operation to query the current step of a specified task. A common value is <strong>do_pause</strong>, which indicates that the system waits for a specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>init_task_info</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The duration of the step in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TimeCost")
        public String timeCost;

        public static DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems self = new DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems setIsSuccess(String isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public String getIsSuccess() {
            return this.isSuccess;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems setSimulatePhase(String simulatePhase) {
            this.simulatePhase = simulatePhase;
            return this;
        }
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems setTimeCost(String timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public String getTimeCost() {
            return this.timeCost;
        }

    }

    public static class DescribeDBLogFilesResponseBodySwitchListItems extends TeaModel {
        /**
         * <p>The IDs of nodes on which to simulate a fault.</p>
         * <blockquote>
         * <p>For a node-level fault simulation, specify the ID of a single node. For an availability zone-level fault simulation, you can either omit this parameter or specify the IDs of all nodes in the zone.</p>
         * </blockquote>
         */
        @NameInMap("DBNodeCrashList")
        public java.util.List<String> DBNodeCrashList;

        /**
         * <p>The time when the fault simulation was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-10T02:25:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the system event was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-19T02:12:00Z</p>
         */
        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        /**
         * <p>The time when the system event started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-19T01:12:00Z</p>
         */
        @NameInMap("EventStartTime")
        public String eventStartTime;

        /**
         * <p>The fault injection method. Valid values:</p>
         * <ul>
         * <li>CrashSQLInjection: Injects a fault into the instance by using <code>Crash SQL</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CrashSQLInjection</p>
         */
        @NameInMap("FaultInjectionType")
        public String faultInjectionType;

        /**
         * <p>The fault simulation record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("SimulateListId")
        public String simulateListId;

        /**
         * <p>The fault simulation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SimulateMode")
        public String simulateMode;

        /**
         * <p>The fault simulation status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Pending</p>
         * </li>
         * <li><p><strong>1</strong>: Success</p>
         * </li>
         * <li><p><strong>2</strong>: Running</p>
         * </li>
         * <li><p><strong>3</strong>: Failed</p>
         * </li>
         * <li><p><strong>4</strong>: Aborted</p>
         * </li>
         * <li><p><strong>5</strong>: Awaiting rollback</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SimulateStatus")
        public String simulateStatus;

        /**
         * <p>The fault simulation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("SimulateTaskId")
        public String simulateTaskId;

        /**
         * <p>The time when the fault simulation started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-25T01:05:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>A list of fault simulation logs.</p>
         */
        @NameInMap("SwitchLogItems")
        public java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems> switchLogItems;

        /**
         * <p>A list of failover steps.</p>
         */
        @NameInMap("SwitchStepItems")
        public java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems> switchStepItems;

        public static DescribeDBLogFilesResponseBodySwitchListItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLogFilesResponseBodySwitchListItems self = new DescribeDBLogFilesResponseBodySwitchListItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setDBNodeCrashList(java.util.List<String> DBNodeCrashList) {
            this.DBNodeCrashList = DBNodeCrashList;
            return this;
        }
        public java.util.List<String> getDBNodeCrashList() {
            return this.DBNodeCrashList;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setEventFinishTime(String eventFinishTime) {
            this.eventFinishTime = eventFinishTime;
            return this;
        }
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setEventStartTime(String eventStartTime) {
            this.eventStartTime = eventStartTime;
            return this;
        }
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setFaultInjectionType(String faultInjectionType) {
            this.faultInjectionType = faultInjectionType;
            return this;
        }
        public String getFaultInjectionType() {
            return this.faultInjectionType;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setSimulateListId(String simulateListId) {
            this.simulateListId = simulateListId;
            return this;
        }
        public String getSimulateListId() {
            return this.simulateListId;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setSimulateMode(String simulateMode) {
            this.simulateMode = simulateMode;
            return this;
        }
        public String getSimulateMode() {
            return this.simulateMode;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setSimulateStatus(String simulateStatus) {
            this.simulateStatus = simulateStatus;
            return this;
        }
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setSimulateTaskId(String simulateTaskId) {
            this.simulateTaskId = simulateTaskId;
            return this;
        }
        public String getSimulateTaskId() {
            return this.simulateTaskId;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setSwitchLogItems(java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems> switchLogItems) {
            this.switchLogItems = switchLogItems;
            return this;
        }
        public java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems> getSwitchLogItems() {
            return this.switchLogItems;
        }

        public DescribeDBLogFilesResponseBodySwitchListItems setSwitchStepItems(java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems> switchStepItems) {
            this.switchStepItems = switchStepItems;
            return this;
        }
        public java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

    }

    public static class DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems extends TeaModel {
        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>You must specify either the <code>DBNodeId</code> or <code>DBClusterId</code> parameter. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of your clusters, including the node IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The time when the step was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-27T02:27:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the step was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The step was successful.</p>
         * </li>
         * <li><p><code>false</code>: The step failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSuccess")
        public String isSuccess;

        /**
         * <p>The fault simulation phase. Valid values:</p>
         * <ul>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</strong>: The fault injection phase.</p>
         * </li>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.RECOVERY</strong>: The recovery phase.</p>
         * </li>
         * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.POST_PROCESS</strong>: The post-processing phase.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</p>
         */
        @NameInMap("SimulatePhase")
        public String simulatePhase;

        /**
         * <p>The time when the step started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-21T02:12:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>A message about the execution status of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>This step exec success</p>
         */
        @NameInMap("StepMsg")
        public String stepMsg;

        /**
         * <p>The name of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>init_task_info</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The duration of the step in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TimeCost")
        public String timeCost;

        public static DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems self = new DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setIsSuccess(String isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public String getIsSuccess() {
            return this.isSuccess;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setSimulatePhase(String simulatePhase) {
            this.simulatePhase = simulatePhase;
            return this;
        }
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setStepMsg(String stepMsg) {
            this.stepMsg = stepMsg;
            return this;
        }
        public String getStepMsg() {
            return this.stepMsg;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems setTimeCost(String timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public String getTimeCost() {
            return this.timeCost;
        }

    }

    public static class DescribeDBLogFilesResponseBodySwitchLogItems extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of your clusters, including the cluster IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The destination database type. Valid values:</p>
         * <ul>
         * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
         * </li>
         * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolarDBMySQL</p>
         */
        @NameInMap("DstDbType")
        public String dstDbType;

        /**
         * <p>The time when the system event was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-19T02:12:00Z</p>
         */
        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        /**
         * <p>The time when the system event started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-19T01:12:00Z</p>
         */
        @NameInMap("EventStartTime")
        public String eventStartTime;

        /**
         * <p>The simulation list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("SimulateListId")
        public String simulateListId;

        /**
         * <p>The fault simulation status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Pending</p>
         * </li>
         * <li><p><strong>1</strong>: Success</p>
         * </li>
         * <li><p><strong>2</strong>: Running</p>
         * </li>
         * <li><p><strong>3</strong>: Failed</p>
         * </li>
         * <li><p><strong>4</strong>: Aborted</p>
         * </li>
         * <li><p><strong>5</strong>: Awaiting rollback</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SimulateStatus")
        public String simulateStatus;

        /**
         * <p>The status code of the fault simulation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Simulatecode")
        public String simulatecode;

        /**
         * <p>The source database type. Valid values:</p>
         * <ul>
         * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
         * </li>
         * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PolarDBMySQL</p>
         */
        @NameInMap("SrcDbType")
        public String srcDbType;

        /**
         * <p>A list of failover steps.</p>
         */
        @NameInMap("SwitchStepItems")
        public java.util.List<DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems> switchStepItems;

        public static DescribeDBLogFilesResponseBodySwitchLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBLogFilesResponseBodySwitchLogItems self = new DescribeDBLogFilesResponseBodySwitchLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setDstDbType(String dstDbType) {
            this.dstDbType = dstDbType;
            return this;
        }
        public String getDstDbType() {
            return this.dstDbType;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setEventFinishTime(String eventFinishTime) {
            this.eventFinishTime = eventFinishTime;
            return this;
        }
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setEventStartTime(String eventStartTime) {
            this.eventStartTime = eventStartTime;
            return this;
        }
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setSimulateListId(String simulateListId) {
            this.simulateListId = simulateListId;
            return this;
        }
        public String getSimulateListId() {
            return this.simulateListId;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setSimulateStatus(String simulateStatus) {
            this.simulateStatus = simulateStatus;
            return this;
        }
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setSimulatecode(String simulatecode) {
            this.simulatecode = simulatecode;
            return this;
        }
        public String getSimulatecode() {
            return this.simulatecode;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setSrcDbType(String srcDbType) {
            this.srcDbType = srcDbType;
            return this;
        }
        public String getSrcDbType() {
            return this.srcDbType;
        }

        public DescribeDBLogFilesResponseBodySwitchLogItems setSwitchStepItems(java.util.List<DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems> switchStepItems) {
            this.switchStepItems = switchStepItems;
            return this;
        }
        public java.util.List<DescribeDBLogFilesResponseBodySwitchLogItemsSwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

    }

}
