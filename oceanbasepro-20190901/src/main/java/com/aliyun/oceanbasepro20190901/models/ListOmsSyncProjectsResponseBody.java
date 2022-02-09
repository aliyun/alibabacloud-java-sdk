// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsSyncProjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOmsSyncProjectsResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsSyncProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsSyncProjectsResponseBody self = new ListOmsSyncProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsSyncProjectsResponseBody setData(java.util.List<ListOmsSyncProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOmsSyncProjectsResponseBodyData> getData() {
        return this.data;
    }

    public ListOmsSyncProjectsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsSyncProjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOmsSyncProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsSyncProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsSyncProjectsResponseBodyDataAlarmStats extends TeaModel {
        @NameInMap("AlarmContent")
        public String alarmContent;

        @NameInMap("Alarming")
        public Boolean alarming;

        @NameInMap("OpenMonitor")
        public Boolean openMonitor;

        @NameInMap("RecentlyTriggerCount")
        public Long recentlyTriggerCount;

        @NameInMap("RuleToRecentlyTriggerCount")
        public java.util.Map<String, Long> ruleToRecentlyTriggerCount;

        @NameInMap("Target")
        public String target;

        public static ListOmsSyncProjectsResponseBodyDataAlarmStats build(java.util.Map<String, ?> map) throws Exception {
            ListOmsSyncProjectsResponseBodyDataAlarmStats self = new ListOmsSyncProjectsResponseBodyDataAlarmStats();
            return TeaModel.build(map, self);
        }

        public ListOmsSyncProjectsResponseBodyDataAlarmStats setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public ListOmsSyncProjectsResponseBodyDataAlarmStats setAlarming(Boolean alarming) {
            this.alarming = alarming;
            return this;
        }
        public Boolean getAlarming() {
            return this.alarming;
        }

        public ListOmsSyncProjectsResponseBodyDataAlarmStats setOpenMonitor(Boolean openMonitor) {
            this.openMonitor = openMonitor;
            return this;
        }
        public Boolean getOpenMonitor() {
            return this.openMonitor;
        }

        public ListOmsSyncProjectsResponseBodyDataAlarmStats setRecentlyTriggerCount(Long recentlyTriggerCount) {
            this.recentlyTriggerCount = recentlyTriggerCount;
            return this;
        }
        public Long getRecentlyTriggerCount() {
            return this.recentlyTriggerCount;
        }

        public ListOmsSyncProjectsResponseBodyDataAlarmStats setRuleToRecentlyTriggerCount(java.util.Map<String, Long> ruleToRecentlyTriggerCount) {
            this.ruleToRecentlyTriggerCount = ruleToRecentlyTriggerCount;
            return this;
        }
        public java.util.Map<String, Long> getRuleToRecentlyTriggerCount() {
            return this.ruleToRecentlyTriggerCount;
        }

        public ListOmsSyncProjectsResponseBodyDataAlarmStats setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class ListOmsSyncProjectsResponseBodyDataDestConnectInfo extends TeaModel {
        @NameInMap("CharSet")
        public String charSet;

        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        @NameInMap("DbEngine")
        public String dbEngine;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        public static ListOmsSyncProjectsResponseBodyDataDestConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOmsSyncProjectsResponseBodyDataDestConnectInfo self = new ListOmsSyncProjectsResponseBodyDataDestConnectInfo();
            return TeaModel.build(map, self);
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setCharSet(String charSet) {
            this.charSet = charSet;
            return this;
        }
        public String getCharSet() {
            return this.charSet;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setDbEngine(String dbEngine) {
            this.dbEngine = dbEngine;
            return this;
        }
        public String getDbEngine() {
            return this.dbEngine;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListOmsSyncProjectsResponseBodyDataExtraInfo extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("DelaySyncGmt")
        public Integer delaySyncGmt;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorParam")
        public java.util.Map<String, ?> errorParam;

        @NameInMap("FailedTime")
        public String failedTime;

        @NameInMap("LogServiceStartCheckpoint")
        public Integer logServiceStartCheckpoint;

        @NameInMap("MonitoringIncr")
        public Boolean monitoringIncr;

        @NameInMap("RunningProgress")
        public Integer runningProgress;

        @NameInMap("RunningStep")
        public String runningStep;

        @NameInMap("SourceStoreKeptHour")
        public Integer sourceStoreKeptHour;

        @NameInMap("Subtopics")
        public java.util.List<String> subtopics;

        public static ListOmsSyncProjectsResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOmsSyncProjectsResponseBodyDataExtraInfo self = new ListOmsSyncProjectsResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setDelaySyncGmt(Integer delaySyncGmt) {
            this.delaySyncGmt = delaySyncGmt;
            return this;
        }
        public Integer getDelaySyncGmt() {
            return this.delaySyncGmt;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setErrorParam(java.util.Map<String, ?> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, ?> getErrorParam() {
            return this.errorParam;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setLogServiceStartCheckpoint(Integer logServiceStartCheckpoint) {
            this.logServiceStartCheckpoint = logServiceStartCheckpoint;
            return this;
        }
        public Integer getLogServiceStartCheckpoint() {
            return this.logServiceStartCheckpoint;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setMonitoringIncr(Boolean monitoringIncr) {
            this.monitoringIncr = monitoringIncr;
            return this;
        }
        public Boolean getMonitoringIncr() {
            return this.monitoringIncr;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setRunningProgress(Integer runningProgress) {
            this.runningProgress = runningProgress;
            return this;
        }
        public Integer getRunningProgress() {
            return this.runningProgress;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setRunningStep(String runningStep) {
            this.runningStep = runningStep;
            return this;
        }
        public String getRunningStep() {
            return this.runningStep;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setSourceStoreKeptHour(Integer sourceStoreKeptHour) {
            this.sourceStoreKeptHour = sourceStoreKeptHour;
            return this;
        }
        public Integer getSourceStoreKeptHour() {
            return this.sourceStoreKeptHour;
        }

        public ListOmsSyncProjectsResponseBodyDataExtraInfo setSubtopics(java.util.List<String> subtopics) {
            this.subtopics = subtopics;
            return this;
        }
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

    }

    public static class ListOmsSyncProjectsResponseBodyDataSourceConnectInfo extends TeaModel {
        @NameInMap("CharSet")
        public String charSet;

        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        @NameInMap("DbEngine")
        public String dbEngine;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        public static ListOmsSyncProjectsResponseBodyDataSourceConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOmsSyncProjectsResponseBodyDataSourceConnectInfo self = new ListOmsSyncProjectsResponseBodyDataSourceConnectInfo();
            return TeaModel.build(map, self);
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setCharSet(String charSet) {
            this.charSet = charSet;
            return this;
        }
        public String getCharSet() {
            return this.charSet;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setDbEngine(String dbEngine) {
            this.dbEngine = dbEngine;
            return this;
        }
        public String getDbEngine() {
            return this.dbEngine;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListOmsSyncProjectsResponseBodyData extends TeaModel {
        @NameInMap("AlarmStats")
        public ListOmsSyncProjectsResponseBodyDataAlarmStats alarmStats;

        @NameInMap("DatabaseInfos")
        public String databaseInfos;

        @NameInMap("DatabaseVerbTypes")
        public java.util.List<String> databaseVerbTypes;

        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("DestConnectInfo")
        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo destConnectInfo;

        @NameInMap("EnableLogicTable")
        public Boolean enableLogicTable;

        @NameInMap("ExtraInfo")
        public ListOmsSyncProjectsResponseBodyDataExtraInfo extraInfo;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Importance")
        public String importance;

        @NameInMap("ImportanceDoc")
        public String importanceDoc;

        @NameInMap("LogicTable")
        public String logicTable;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectStatus")
        public String projectStatus;

        @NameInMap("Sink")
        public String sink;

        @NameInMap("SinkConfig")
        public String sinkConfig;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceConfig")
        public String sourceConfig;

        @NameInMap("SourceConnectInfo")
        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo sourceConnectInfo;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("SyncKinds")
        public java.util.List<String> syncKinds;

        @NameInMap("SyncModes")
        public java.util.List<String> syncModes;

        @NameInMap("SyncSteps")
        public String syncSteps;

        @NameInMap("SyncType")
        public String syncType;

        @NameInMap("WorkerGradeId")
        public String workerGradeId;

        public static ListOmsSyncProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsSyncProjectsResponseBodyData self = new ListOmsSyncProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsSyncProjectsResponseBodyData setAlarmStats(ListOmsSyncProjectsResponseBodyDataAlarmStats alarmStats) {
            this.alarmStats = alarmStats;
            return this;
        }
        public ListOmsSyncProjectsResponseBodyDataAlarmStats getAlarmStats() {
            return this.alarmStats;
        }

        public ListOmsSyncProjectsResponseBodyData setDatabaseInfos(String databaseInfos) {
            this.databaseInfos = databaseInfos;
            return this;
        }
        public String getDatabaseInfos() {
            return this.databaseInfos;
        }

        public ListOmsSyncProjectsResponseBodyData setDatabaseVerbTypes(java.util.List<String> databaseVerbTypes) {
            this.databaseVerbTypes = databaseVerbTypes;
            return this;
        }
        public java.util.List<String> getDatabaseVerbTypes() {
            return this.databaseVerbTypes;
        }

        public ListOmsSyncProjectsResponseBodyData setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public ListOmsSyncProjectsResponseBodyData setDestConnectInfo(ListOmsSyncProjectsResponseBodyDataDestConnectInfo destConnectInfo) {
            this.destConnectInfo = destConnectInfo;
            return this;
        }
        public ListOmsSyncProjectsResponseBodyDataDestConnectInfo getDestConnectInfo() {
            return this.destConnectInfo;
        }

        public ListOmsSyncProjectsResponseBodyData setEnableLogicTable(Boolean enableLogicTable) {
            this.enableLogicTable = enableLogicTable;
            return this;
        }
        public Boolean getEnableLogicTable() {
            return this.enableLogicTable;
        }

        public ListOmsSyncProjectsResponseBodyData setExtraInfo(ListOmsSyncProjectsResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public ListOmsSyncProjectsResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public ListOmsSyncProjectsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOmsSyncProjectsResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListOmsSyncProjectsResponseBodyData setImportance(String importance) {
            this.importance = importance;
            return this;
        }
        public String getImportance() {
            return this.importance;
        }

        public ListOmsSyncProjectsResponseBodyData setImportanceDoc(String importanceDoc) {
            this.importanceDoc = importanceDoc;
            return this;
        }
        public String getImportanceDoc() {
            return this.importanceDoc;
        }

        public ListOmsSyncProjectsResponseBodyData setLogicTable(String logicTable) {
            this.logicTable = logicTable;
            return this;
        }
        public String getLogicTable() {
            return this.logicTable;
        }

        public ListOmsSyncProjectsResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListOmsSyncProjectsResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListOmsSyncProjectsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListOmsSyncProjectsResponseBodyData setProjectStatus(String projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public String getProjectStatus() {
            return this.projectStatus;
        }

        public ListOmsSyncProjectsResponseBodyData setSink(String sink) {
            this.sink = sink;
            return this;
        }
        public String getSink() {
            return this.sink;
        }

        public ListOmsSyncProjectsResponseBodyData setSinkConfig(String sinkConfig) {
            this.sinkConfig = sinkConfig;
            return this;
        }
        public String getSinkConfig() {
            return this.sinkConfig;
        }

        public ListOmsSyncProjectsResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListOmsSyncProjectsResponseBodyData setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public ListOmsSyncProjectsResponseBodyData setSourceConnectInfo(ListOmsSyncProjectsResponseBodyDataSourceConnectInfo sourceConnectInfo) {
            this.sourceConnectInfo = sourceConnectInfo;
            return this;
        }
        public ListOmsSyncProjectsResponseBodyDataSourceConnectInfo getSourceConnectInfo() {
            return this.sourceConnectInfo;
        }

        public ListOmsSyncProjectsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListOmsSyncProjectsResponseBodyData setSyncKinds(java.util.List<String> syncKinds) {
            this.syncKinds = syncKinds;
            return this;
        }
        public java.util.List<String> getSyncKinds() {
            return this.syncKinds;
        }

        public ListOmsSyncProjectsResponseBodyData setSyncModes(java.util.List<String> syncModes) {
            this.syncModes = syncModes;
            return this;
        }
        public java.util.List<String> getSyncModes() {
            return this.syncModes;
        }

        public ListOmsSyncProjectsResponseBodyData setSyncSteps(String syncSteps) {
            this.syncSteps = syncSteps;
            return this;
        }
        public String getSyncSteps() {
            return this.syncSteps;
        }

        public ListOmsSyncProjectsResponseBodyData setSyncType(String syncType) {
            this.syncType = syncType;
            return this;
        }
        public String getSyncType() {
            return this.syncType;
        }

        public ListOmsSyncProjectsResponseBodyData setWorkerGradeId(String workerGradeId) {
            this.workerGradeId = workerGradeId;
            return this;
        }
        public String getWorkerGradeId() {
            return this.workerGradeId;
        }

    }

}
