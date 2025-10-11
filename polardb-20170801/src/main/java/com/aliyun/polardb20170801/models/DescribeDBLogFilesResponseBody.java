// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLogFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pi-****************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>polardb_mysql_rw</p>
     */
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    @NameInMap("HaLogItems")
    public java.util.List<DescribeDBLogFilesResponseBodyHaLogItems> haLogItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HaStatus")
    public Integer haStatus;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SwitchListItems")
    public java.util.List<DescribeDBLogFilesResponseBodySwitchListItems> switchListItems;

    @NameInMap("SwitchLogItems")
    public java.util.List<DescribeDBLogFilesResponseBodySwitchLogItems> switchLogItems;

    /**
     * <strong>example:</strong>
     * <p>160</p>
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
        @NameInMap("AffectedSessions")
        public Long affectedSessions;

        @NameInMap("FromDBType")
        public String fromDBType;

        @NameInMap("SwitchCauseCode")
        public String switchCauseCode;

        @NameInMap("SwitchCauseDetail")
        public String switchCauseDetail;

        @NameInMap("SwitchFinishTime")
        public String switchFinishTime;

        /**
         * <strong>example:</strong>
         * <p>e571f897-9b3c-4012-9470-88333832dec4</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        @NameInMap("SwitchStartTime")
        public String switchStartTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SwitchType")
        public Long switchType;

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
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IsSuccess")
        public String isSuccess;

        @NameInMap("SimulatePhase")
        public String simulatePhase;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepName")
        public String stepName;

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
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DstDbType")
        public String dstDbType;

        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        @NameInMap("EventStartTime")
        public String eventStartTime;

        @NameInMap("SimulateListId")
        public String simulateListId;

        @NameInMap("SimulateLogId")
        public String simulateLogId;

        @NameInMap("SimulateStatus")
        public String simulateStatus;

        @NameInMap("SrcDbType")
        public String srcDbType;

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
        @NameInMap("DBNodeId")
        public String DBNodeId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IsSuccess")
        public String isSuccess;

        @NameInMap("SimulatePhase")
        public String simulatePhase;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepName")
        public String stepName;

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
        @NameInMap("DBNodeCrashList")
        public java.util.List<String> DBNodeCrashList;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        @NameInMap("EventStartTime")
        public String eventStartTime;

        @NameInMap("FaultInjectionType")
        public String faultInjectionType;

        @NameInMap("SimulateListId")
        public String simulateListId;

        @NameInMap("SimulateMode")
        public String simulateMode;

        @NameInMap("SimulateStatus")
        public String simulateStatus;

        @NameInMap("SimulateTaskId")
        public String simulateTaskId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SwitchLogItems")
        public java.util.List<DescribeDBLogFilesResponseBodySwitchListItemsSwitchLogItems> switchLogItems;

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
        @NameInMap("DBNodeId")
        public String DBNodeId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IsSuccess")
        public String isSuccess;

        @NameInMap("SimulatePhase")
        public String simulatePhase;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepMsg")
        public String stepMsg;

        @NameInMap("StepName")
        public String stepName;

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
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DstDbType")
        public String dstDbType;

        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        @NameInMap("EventStartTime")
        public String eventStartTime;

        @NameInMap("SimulateListId")
        public String simulateListId;

        @NameInMap("SimulateStatus")
        public String simulateStatus;

        @NameInMap("Simulatecode")
        public String simulatecode;

        @NameInMap("SrcDbType")
        public String srcDbType;

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
