// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public DescribeProjectResponseBodyData data;

    @NameInMap("ErrorDetail")
    public DescribeProjectResponseBodyErrorDetail errorDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectResponseBody self = new DescribeProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeProjectResponseBody setData(DescribeProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProjectResponseBodyData getData() {
        return this.data;
    }

    public DescribeProjectResponseBody setErrorDetail(DescribeProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectResponseBodyDataAlarmStats extends TeaModel {
        @NameInMap("AlarmContent")
        public String alarmContent;

        @NameInMap("Alarming")
        public Boolean alarming;

        @NameInMap("OpenMonitor")
        public Boolean openMonitor;

        @NameInMap("RecentlyTriggerCount")
        public Integer recentlyTriggerCount;

        @NameInMap("RuleToRecentlyTriggerCount")
        public java.util.Map<String, Integer> ruleToRecentlyTriggerCount;

        @NameInMap("Target")
        public String target;

        public static DescribeProjectResponseBodyDataAlarmStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataAlarmStats self = new DescribeProjectResponseBodyDataAlarmStats();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataAlarmStats setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public DescribeProjectResponseBodyDataAlarmStats setAlarming(Boolean alarming) {
            this.alarming = alarming;
            return this;
        }
        public Boolean getAlarming() {
            return this.alarming;
        }

        public DescribeProjectResponseBodyDataAlarmStats setOpenMonitor(Boolean openMonitor) {
            this.openMonitor = openMonitor;
            return this;
        }
        public Boolean getOpenMonitor() {
            return this.openMonitor;
        }

        public DescribeProjectResponseBodyDataAlarmStats setRecentlyTriggerCount(Integer recentlyTriggerCount) {
            this.recentlyTriggerCount = recentlyTriggerCount;
            return this;
        }
        public Integer getRecentlyTriggerCount() {
            return this.recentlyTriggerCount;
        }

        public DescribeProjectResponseBodyDataAlarmStats setRuleToRecentlyTriggerCount(java.util.Map<String, Integer> ruleToRecentlyTriggerCount) {
            this.ruleToRecentlyTriggerCount = ruleToRecentlyTriggerCount;
            return this;
        }
        public java.util.Map<String, Integer> getRuleToRecentlyTriggerCount() {
            return this.ruleToRecentlyTriggerCount;
        }

        public DescribeProjectResponseBodyDataAlarmStats setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class DescribeProjectResponseBodyDataCommonTransferConfig extends TeaModel {
        @NameInMap("ActiveActive")
        public Boolean activeActive;

        @NameInMap("DataWorksBusinessName")
        public String dataWorksBusinessName;

        @NameInMap("DatahubTopicType")
        public String datahubTopicType;

        @NameInMap("MqPartition")
        public Integer mqPartition;

        @NameInMap("MqPartitionMode")
        public String mqPartitionMode;

        @NameInMap("MqSerializerType")
        public String mqSerializerType;

        @NameInMap("RocketMqEnableMsgTrace")
        public Boolean rocketMqEnableMsgTrace;

        @NameInMap("RocketMqMsgTags")
        public String rocketMqMsgTags;

        @NameInMap("RocketMqProducerGroup")
        public String rocketMqProducerGroup;

        @NameInMap("RocketMqSendMsgTimeout")
        public Long rocketMqSendMsgTimeout;

        @NameInMap("TableCategory")
        public String tableCategory;

        public static DescribeProjectResponseBodyDataCommonTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataCommonTransferConfig self = new DescribeProjectResponseBodyDataCommonTransferConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setActiveActive(Boolean activeActive) {
            this.activeActive = activeActive;
            return this;
        }
        public Boolean getActiveActive() {
            return this.activeActive;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setDataWorksBusinessName(String dataWorksBusinessName) {
            this.dataWorksBusinessName = dataWorksBusinessName;
            return this;
        }
        public String getDataWorksBusinessName() {
            return this.dataWorksBusinessName;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setDatahubTopicType(String datahubTopicType) {
            this.datahubTopicType = datahubTopicType;
            return this;
        }
        public String getDatahubTopicType() {
            return this.datahubTopicType;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setMqPartition(Integer mqPartition) {
            this.mqPartition = mqPartition;
            return this;
        }
        public Integer getMqPartition() {
            return this.mqPartition;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setMqPartitionMode(String mqPartitionMode) {
            this.mqPartitionMode = mqPartitionMode;
            return this;
        }
        public String getMqPartitionMode() {
            return this.mqPartitionMode;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setMqSerializerType(String mqSerializerType) {
            this.mqSerializerType = mqSerializerType;
            return this;
        }
        public String getMqSerializerType() {
            return this.mqSerializerType;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setRocketMqEnableMsgTrace(Boolean rocketMqEnableMsgTrace) {
            this.rocketMqEnableMsgTrace = rocketMqEnableMsgTrace;
            return this;
        }
        public Boolean getRocketMqEnableMsgTrace() {
            return this.rocketMqEnableMsgTrace;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setRocketMqMsgTags(String rocketMqMsgTags) {
            this.rocketMqMsgTags = rocketMqMsgTags;
            return this;
        }
        public String getRocketMqMsgTags() {
            return this.rocketMqMsgTags;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setRocketMqProducerGroup(String rocketMqProducerGroup) {
            this.rocketMqProducerGroup = rocketMqProducerGroup;
            return this;
        }
        public String getRocketMqProducerGroup() {
            return this.rocketMqProducerGroup;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setRocketMqSendMsgTimeout(Long rocketMqSendMsgTimeout) {
            this.rocketMqSendMsgTimeout = rocketMqSendMsgTimeout;
            return this;
        }
        public Long getRocketMqSendMsgTimeout() {
            return this.rocketMqSendMsgTimeout;
        }

        public DescribeProjectResponseBodyDataCommonTransferConfig setTableCategory(String tableCategory) {
            this.tableCategory = tableCategory;
            return this;
        }
        public String getTableCategory() {
            return this.tableCategory;
        }

    }

    public static class DescribeProjectResponseBodyDataExtraInfo extends TeaModel {
        @NameInMap("AccessObSource")
        public Boolean accessObSource;

        @NameInMap("IgnoreUnsupportDdl")
        public Boolean ignoreUnsupportDdl;

        @NameInMap("IncrSyncTimestamp")
        public Long incrSyncTimestamp;

        @NameInMap("LogServiceStartCheckpoint")
        public Long logServiceStartCheckpoint;

        @NameInMap("MaxConnectorCount")
        public Integer maxConnectorCount;

        @NameInMap("MonitoringIncr")
        public Boolean monitoringIncr;

        @NameInMap("OverwriteConfig")
        public Boolean overwriteConfig;

        @NameInMap("ReverseSubtopics")
        public java.util.List<String> reverseSubtopics;

        @NameInMap("RunningProgress")
        public Integer runningProgress;

        @NameInMap("RunningStep")
        public String runningStep;

        @NameInMap("SourceStoreKeptHour")
        public Integer sourceStoreKeptHour;

        @NameInMap("StoreIncr")
        public Boolean storeIncr;

        @NameInMap("SubConds")
        public java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> subConds;

        @NameInMap("SubDbs")
        public java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> subDbs;

        @NameInMap("SubIds")
        public java.util.Map<String, String> subIds;

        @NameInMap("Subtopics")
        public java.util.List<String> subtopics;

        @NameInMap("SyncDelay")
        public Long syncDelay;

        @NameInMap("SyncDelaySampleTimestamp")
        public Long syncDelaySampleTimestamp;

        public static DescribeProjectResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataExtraInfo self = new DescribeProjectResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataExtraInfo setAccessObSource(Boolean accessObSource) {
            this.accessObSource = accessObSource;
            return this;
        }
        public Boolean getAccessObSource() {
            return this.accessObSource;
        }

        public DescribeProjectResponseBodyDataExtraInfo setIgnoreUnsupportDdl(Boolean ignoreUnsupportDdl) {
            this.ignoreUnsupportDdl = ignoreUnsupportDdl;
            return this;
        }
        public Boolean getIgnoreUnsupportDdl() {
            return this.ignoreUnsupportDdl;
        }

        public DescribeProjectResponseBodyDataExtraInfo setIncrSyncTimestamp(Long incrSyncTimestamp) {
            this.incrSyncTimestamp = incrSyncTimestamp;
            return this;
        }
        public Long getIncrSyncTimestamp() {
            return this.incrSyncTimestamp;
        }

        public DescribeProjectResponseBodyDataExtraInfo setLogServiceStartCheckpoint(Long logServiceStartCheckpoint) {
            this.logServiceStartCheckpoint = logServiceStartCheckpoint;
            return this;
        }
        public Long getLogServiceStartCheckpoint() {
            return this.logServiceStartCheckpoint;
        }

        public DescribeProjectResponseBodyDataExtraInfo setMaxConnectorCount(Integer maxConnectorCount) {
            this.maxConnectorCount = maxConnectorCount;
            return this;
        }
        public Integer getMaxConnectorCount() {
            return this.maxConnectorCount;
        }

        public DescribeProjectResponseBodyDataExtraInfo setMonitoringIncr(Boolean monitoringIncr) {
            this.monitoringIncr = monitoringIncr;
            return this;
        }
        public Boolean getMonitoringIncr() {
            return this.monitoringIncr;
        }

        public DescribeProjectResponseBodyDataExtraInfo setOverwriteConfig(Boolean overwriteConfig) {
            this.overwriteConfig = overwriteConfig;
            return this;
        }
        public Boolean getOverwriteConfig() {
            return this.overwriteConfig;
        }

        public DescribeProjectResponseBodyDataExtraInfo setReverseSubtopics(java.util.List<String> reverseSubtopics) {
            this.reverseSubtopics = reverseSubtopics;
            return this;
        }
        public java.util.List<String> getReverseSubtopics() {
            return this.reverseSubtopics;
        }

        public DescribeProjectResponseBodyDataExtraInfo setRunningProgress(Integer runningProgress) {
            this.runningProgress = runningProgress;
            return this;
        }
        public Integer getRunningProgress() {
            return this.runningProgress;
        }

        public DescribeProjectResponseBodyDataExtraInfo setRunningStep(String runningStep) {
            this.runningStep = runningStep;
            return this;
        }
        public String getRunningStep() {
            return this.runningStep;
        }

        public DescribeProjectResponseBodyDataExtraInfo setSourceStoreKeptHour(Integer sourceStoreKeptHour) {
            this.sourceStoreKeptHour = sourceStoreKeptHour;
            return this;
        }
        public Integer getSourceStoreKeptHour() {
            return this.sourceStoreKeptHour;
        }

        public DescribeProjectResponseBodyDataExtraInfo setStoreIncr(Boolean storeIncr) {
            this.storeIncr = storeIncr;
            return this;
        }
        public Boolean getStoreIncr() {
            return this.storeIncr;
        }

        public DescribeProjectResponseBodyDataExtraInfo setSubConds(java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> subConds) {
            this.subConds = subConds;
            return this;
        }
        public java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> getSubConds() {
            return this.subConds;
        }

        public DescribeProjectResponseBodyDataExtraInfo setSubDbs(java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> subDbs) {
            this.subDbs = subDbs;
            return this;
        }
        public java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> getSubDbs() {
            return this.subDbs;
        }

        public DescribeProjectResponseBodyDataExtraInfo setSubIds(java.util.Map<String, String> subIds) {
            this.subIds = subIds;
            return this;
        }
        public java.util.Map<String, String> getSubIds() {
            return this.subIds;
        }

        public DescribeProjectResponseBodyDataExtraInfo setSubtopics(java.util.List<String> subtopics) {
            this.subtopics = subtopics;
            return this;
        }
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

        public DescribeProjectResponseBodyDataExtraInfo setSyncDelay(Long syncDelay) {
            this.syncDelay = syncDelay;
            return this;
        }
        public Long getSyncDelay() {
            return this.syncDelay;
        }

        public DescribeProjectResponseBodyDataExtraInfo setSyncDelaySampleTimestamp(Long syncDelaySampleTimestamp) {
            this.syncDelaySampleTimestamp = syncDelaySampleTimestamp;
            return this;
        }
        public Long getSyncDelaySampleTimestamp() {
            return this.syncDelaySampleTimestamp;
        }

    }

    public static class DescribeProjectResponseBodyDataFullTransferConfig extends TeaModel {
        @NameInMap("AllowDestTableNotEmpty")
        public Boolean allowDestTableNotEmpty;

        @NameInMap("FullTransferSpeedMode")
        public String fullTransferSpeedMode;

        @NameInMap("FullVerifySpeedMode")
        public String fullVerifySpeedMode;

        @NameInMap("NonePkUkTruncateDstTable")
        public Boolean nonePkUkTruncateDstTable;

        @NameInMap("ReadWorkerNum")
        public Integer readWorkerNum;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        @NameInMap("WriteWorkerNum")
        public Integer writeWorkerNum;

        public static DescribeProjectResponseBodyDataFullTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataFullTransferConfig self = new DescribeProjectResponseBodyDataFullTransferConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setAllowDestTableNotEmpty(Boolean allowDestTableNotEmpty) {
            this.allowDestTableNotEmpty = allowDestTableNotEmpty;
            return this;
        }
        public Boolean getAllowDestTableNotEmpty() {
            return this.allowDestTableNotEmpty;
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setFullTransferSpeedMode(String fullTransferSpeedMode) {
            this.fullTransferSpeedMode = fullTransferSpeedMode;
            return this;
        }
        public String getFullTransferSpeedMode() {
            return this.fullTransferSpeedMode;
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setFullVerifySpeedMode(String fullVerifySpeedMode) {
            this.fullVerifySpeedMode = fullVerifySpeedMode;
            return this;
        }
        public String getFullVerifySpeedMode() {
            return this.fullVerifySpeedMode;
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setNonePkUkTruncateDstTable(Boolean nonePkUkTruncateDstTable) {
            this.nonePkUkTruncateDstTable = nonePkUkTruncateDstTable;
            return this;
        }
        public Boolean getNonePkUkTruncateDstTable() {
            return this.nonePkUkTruncateDstTable;
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setReadWorkerNum(Integer readWorkerNum) {
            this.readWorkerNum = readWorkerNum;
            return this;
        }
        public Integer getReadWorkerNum() {
            return this.readWorkerNum;
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        public DescribeProjectResponseBodyDataFullTransferConfig setWriteWorkerNum(Integer writeWorkerNum) {
            this.writeWorkerNum = writeWorkerNum;
            return this;
        }
        public Integer getWriteWorkerNum() {
            return this.writeWorkerNum;
        }

    }

    public static class DescribeProjectResponseBodyDataIncrTransferConfig extends TeaModel {
        @NameInMap("EnableIncrSyncStatistics")
        public Boolean enableIncrSyncStatistics;

        @NameInMap("EnableSequencingWithinTxn")
        public Boolean enableSequencingWithinTxn;

        @NameInMap("IncrSyncConcurrency")
        public Integer incrSyncConcurrency;

        @NameInMap("RecordTypeWhiteList")
        public java.util.List<String> recordTypeWhiteList;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        @NameInMap("StoreLogKeptHour")
        public Integer storeLogKeptHour;

        @NameInMap("SupportDDLTypes")
        public java.util.List<String> supportDDLTypes;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        public static DescribeProjectResponseBodyDataIncrTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataIncrTransferConfig self = new DescribeProjectResponseBodyDataIncrTransferConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setEnableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
            this.enableIncrSyncStatistics = enableIncrSyncStatistics;
            return this;
        }
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setEnableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
            this.enableSequencingWithinTxn = enableSequencingWithinTxn;
            return this;
        }
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setIncrSyncConcurrency(Integer incrSyncConcurrency) {
            this.incrSyncConcurrency = incrSyncConcurrency;
            return this;
        }
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setRecordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
            this.recordTypeWhiteList = recordTypeWhiteList;
            return this;
        }
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setStoreLogKeptHour(Integer storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setSupportDDLTypes(java.util.List<String> supportDDLTypes) {
            this.supportDDLTypes = supportDDLTypes;
            return this;
        }
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public DescribeProjectResponseBodyDataIncrTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

    }

    public static class DescribeProjectResponseBodyDataLabels extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static DescribeProjectResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataLabels self = new DescribeProjectResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeProjectResponseBodyDataReverseIncrTransferConfig extends TeaModel {
        @NameInMap("EnableIncrSyncStatistics")
        public Boolean enableIncrSyncStatistics;

        @NameInMap("EnableSequencingWithinTxn")
        public Boolean enableSequencingWithinTxn;

        @NameInMap("IncrSyncConcurrency")
        public Integer incrSyncConcurrency;

        @NameInMap("RecordTypeWhiteList")
        public java.util.List<String> recordTypeWhiteList;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        @NameInMap("StoreLogKeptHour")
        public Integer storeLogKeptHour;

        @NameInMap("SupportDDLTypes")
        public java.util.List<String> supportDDLTypes;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        public static DescribeProjectResponseBodyDataReverseIncrTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataReverseIncrTransferConfig self = new DescribeProjectResponseBodyDataReverseIncrTransferConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setEnableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
            this.enableIncrSyncStatistics = enableIncrSyncStatistics;
            return this;
        }
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setEnableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
            this.enableSequencingWithinTxn = enableSequencingWithinTxn;
            return this;
        }
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setIncrSyncConcurrency(Integer incrSyncConcurrency) {
            this.incrSyncConcurrency = incrSyncConcurrency;
            return this;
        }
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setRecordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
            this.recordTypeWhiteList = recordTypeWhiteList;
            return this;
        }
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setStoreLogKeptHour(Integer storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setSupportDDLTypes(java.util.List<String> supportDDLTypes) {
            this.supportDDLTypes = supportDDLTypes;
            return this;
        }
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public DescribeProjectResponseBodyDataReverseIncrTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

    }

    public static class DescribeProjectResponseBodyDataSinkConnectInfo extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("ConnExtraAttributes")
        public Object connExtraAttributes;

        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        @NameInMap("DbEngine")
        public String dbEngine;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointSide")
        public String endpointSide;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public String id;

        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        @NameInMap("OcpName")
        public String ocpName;

        @NameInMap("OperatingSystem")
        public String operatingSystem;

        /**
         * <p>Owner。</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceOwner")
        public String resourceOwner;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        public static DescribeProjectResponseBodyDataSinkConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataSinkConnectInfo self = new DescribeProjectResponseBodyDataSinkConnectInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setConnExtraAttributes(Object connExtraAttributes) {
            this.connExtraAttributes = connExtraAttributes;
            return this;
        }
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setDbEngine(String dbEngine) {
            this.dbEngine = dbEngine;
            return this;
        }
        public String getDbEngine() {
            return this.dbEngine;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setEndpointSide(String endpointSide) {
            this.endpointSide = endpointSide;
            return this;
        }
        public String getEndpointSide() {
            return this.endpointSide;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setOcpName(String ocpName) {
            this.ocpName = ocpName;
            return this;
        }
        public String getOcpName() {
            return this.ocpName;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setResourceOwner(String resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeProjectResponseBodyDataSinkConnectInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeProjectResponseBodyDataSourceConnectInfo extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("ConnExtraAttributes")
        public Object connExtraAttributes;

        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        @NameInMap("DbEngine")
        public String dbEngine;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointSide")
        public String endpointSide;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public String id;

        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        @NameInMap("OcpName")
        public String ocpName;

        @NameInMap("OperatingSystem")
        public String operatingSystem;

        /**
         * <p>Owner。</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceOwner")
        public String resourceOwner;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        public static DescribeProjectResponseBodyDataSourceConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataSourceConnectInfo self = new DescribeProjectResponseBodyDataSourceConnectInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setConnExtraAttributes(Object connExtraAttributes) {
            this.connExtraAttributes = connExtraAttributes;
            return this;
        }
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setDbEngine(String dbEngine) {
            this.dbEngine = dbEngine;
            return this;
        }
        public String getDbEngine() {
            return this.dbEngine;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setEndpointSide(String endpointSide) {
            this.endpointSide = endpointSide;
            return this;
        }
        public String getEndpointSide() {
            return this.endpointSide;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setOcpName(String ocpName) {
            this.ocpName = ocpName;
            return this;
        }
        public String getOcpName() {
            return this.ocpName;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setResourceOwner(String resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeProjectResponseBodyDataSourceConnectInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <p>FATAL, ERROR, WARNING, CRITICAL</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails self = new DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectResponseBodyDataStepsExtraInfo extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails> errorDetails;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        @NameInMap("FailedTime")
        public String failedTime;

        public static DescribeProjectResponseBodyDataStepsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataStepsExtraInfo self = new DescribeProjectResponseBodyDataStepsExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataStepsExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfo setErrorDetails(java.util.List<DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataStepsExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public DescribeProjectResponseBodyDataStepsExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class DescribeProjectResponseBodyDataSteps extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public DescribeProjectResponseBodyDataStepsExtraInfo extraInfo;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StepInfo")
        public java.util.Map<String, ?> stepInfo;

        public static DescribeProjectResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataSteps self = new DescribeProjectResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataSteps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProjectResponseBodyDataSteps setExtraInfo(DescribeProjectResponseBodyDataStepsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeProjectResponseBodyDataStepsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeProjectResponseBodyDataSteps setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeProjectResponseBodyDataSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataSteps setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeProjectResponseBodyDataSteps setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeProjectResponseBodyDataSteps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeProjectResponseBodyDataSteps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectResponseBodyDataSteps setStepInfo(java.util.Map<String, ?> stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public java.util.Map<String, ?> getStepInfo() {
            return this.stepInfo;
        }

    }

    public static class DescribeProjectResponseBodyDataStructTransferConfig extends TeaModel {
        @NameInMap("ByteCharConvertStrategy")
        public String byteCharConvertStrategy;

        @NameInMap("DeferIndexCreation")
        public Boolean deferIndexCreation;

        public static DescribeProjectResponseBodyDataStructTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataStructTransferConfig self = new DescribeProjectResponseBodyDataStructTransferConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataStructTransferConfig setByteCharConvertStrategy(String byteCharConvertStrategy) {
            this.byteCharConvertStrategy = byteCharConvertStrategy;
            return this;
        }
        public String getByteCharConvertStrategy() {
            return this.byteCharConvertStrategy;
        }

        public DescribeProjectResponseBodyDataStructTransferConfig setDeferIndexCreation(Boolean deferIndexCreation) {
            this.deferIndexCreation = deferIndexCreation;
            return this;
        }
        public Boolean getDeferIndexCreation() {
            return this.deferIndexCreation;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables self = new DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews self = new DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesTables self = new DescribeProjectResponseBodyDataTransferMappingDatabasesTables();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTables setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesViews build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesViews self = new DescribeProjectResponseBodyDataTransferMappingDatabasesViews();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViews setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabases extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Views")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesViews> views;

        public static DescribeProjectResponseBodyDataTransferMappingDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabases self = new DescribeProjectResponseBodyDataTransferMappingDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setSpecificTables(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setSpecificViews(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setTables(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesTables> getTables() {
            return this.tables;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabases setViews(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesViews> getViews() {
            return this.views;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews setAdbTableSchema(DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMappingDatabasesBlack extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Views")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews> views;

        public static DescribeProjectResponseBodyDataTransferMappingDatabasesBlack build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMappingDatabasesBlack self = new DescribeProjectResponseBodyDataTransferMappingDatabasesBlack();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setSpecificTables(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setSpecificViews(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setTables(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackTables> getTables() {
            return this.tables;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProjectResponseBodyDataTransferMappingDatabasesBlack setViews(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlackViews> getViews() {
            return this.views;
        }

    }

    public static class DescribeProjectResponseBodyDataTransferMapping extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabases> databases;

        @NameInMap("DatabasesBlack")
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlack> databasesBlack;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("TableAndViewBlackList")
        public java.util.List<String> tableAndViewBlackList;

        @NameInMap("TableAndViewWhiteList")
        public java.util.List<String> tableAndViewWhiteList;

        public static DescribeProjectResponseBodyDataTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataTransferMapping self = new DescribeProjectResponseBodyDataTransferMapping();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataTransferMapping setDatabases(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        public DescribeProjectResponseBodyDataTransferMapping setDatabasesBlack(java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlack> databasesBlack) {
            this.databasesBlack = databasesBlack;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataTransferMappingDatabasesBlack> getDatabasesBlack() {
            return this.databasesBlack;
        }

        public DescribeProjectResponseBodyDataTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeProjectResponseBodyDataTransferMapping setTableAndViewBlackList(java.util.List<String> tableAndViewBlackList) {
            this.tableAndViewBlackList = tableAndViewBlackList;
            return this;
        }
        public java.util.List<String> getTableAndViewBlackList() {
            return this.tableAndViewBlackList;
        }

        public DescribeProjectResponseBodyDataTransferMapping setTableAndViewWhiteList(java.util.List<String> tableAndViewWhiteList) {
            this.tableAndViewWhiteList = tableAndViewWhiteList;
            return this;
        }
        public java.util.List<String> getTableAndViewWhiteList() {
            return this.tableAndViewWhiteList;
        }

    }

    public static class DescribeProjectResponseBodyDataWorkerGradeInfo extends TeaModel {
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Grade")
        public String grade;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SourceRegion")
        public String sourceRegion;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("SpecName")
        public String specName;

        public static DescribeProjectResponseBodyDataWorkerGradeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyDataWorkerGradeInfo self = new DescribeProjectResponseBodyDataWorkerGradeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeProjectResponseBodyDataWorkerGradeInfo setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

    public static class DescribeProjectResponseBodyData extends TeaModel {
        @NameInMap("AlarmStats")
        public DescribeProjectResponseBodyDataAlarmStats alarmStats;

        @NameInMap("CommonTransferConfig")
        public DescribeProjectResponseBodyDataCommonTransferConfig commonTransferConfig;

        @NameInMap("DestConnId")
        public String destConnId;

        @NameInMap("EnableFullTransfer")
        public Boolean enableFullTransfer;

        @NameInMap("EnableFullVerify")
        public Boolean enableFullVerify;

        @NameInMap("EnableIncrTransfer")
        public Boolean enableIncrTransfer;

        @NameInMap("EnableIncrVerify")
        public Boolean enableIncrVerify;

        @NameInMap("EnableReverseIncrTransfer")
        public Boolean enableReverseIncrTransfer;

        @NameInMap("EnableStructTransfer")
        public Boolean enableStructTransfer;

        @NameInMap("ExtraInfo")
        public DescribeProjectResponseBodyDataExtraInfo extraInfo;

        @NameInMap("FullTransferConfig")
        public DescribeProjectResponseBodyDataFullTransferConfig fullTransferConfig;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtFinish")
        public String gmtFinish;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtStart")
        public String gmtStart;

        @NameInMap("Id")
        public String id;

        @NameInMap("Importance")
        public String importance;

        @NameInMap("IncrTransferConfig")
        public DescribeProjectResponseBodyDataIncrTransferConfig incrTransferConfig;

        @NameInMap("IsMerging")
        public Boolean isMerging;

        @NameInMap("IsModifying")
        public Boolean isModifying;

        @NameInMap("IsSubProject")
        public Boolean isSubProject;

        @NameInMap("Labels")
        public java.util.List<DescribeProjectResponseBodyDataLabels> labels;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ReverseIncrTransferConfig")
        public DescribeProjectResponseBodyDataReverseIncrTransferConfig reverseIncrTransferConfig;

        @NameInMap("SinkConnectInfo")
        public DescribeProjectResponseBodyDataSinkConnectInfo sinkConnectInfo;

        @NameInMap("SinkEndpointType")
        public String sinkEndpointType;

        @NameInMap("SourceConnectInfo")
        public DescribeProjectResponseBodyDataSourceConnectInfo sourceConnectInfo;

        @NameInMap("SourceEndpointType")
        public String sourceEndpointType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Steps")
        public java.util.List<DescribeProjectResponseBodyDataSteps> steps;

        @NameInMap("StructTransferConfig")
        public DescribeProjectResponseBodyDataStructTransferConfig structTransferConfig;

        @NameInMap("TransferMapping")
        public DescribeProjectResponseBodyDataTransferMapping transferMapping;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkerGradeId")
        public String workerGradeId;

        @NameInMap("WorkerGradeInfo")
        public DescribeProjectResponseBodyDataWorkerGradeInfo workerGradeInfo;

        public static DescribeProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyData self = new DescribeProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyData setAlarmStats(DescribeProjectResponseBodyDataAlarmStats alarmStats) {
            this.alarmStats = alarmStats;
            return this;
        }
        public DescribeProjectResponseBodyDataAlarmStats getAlarmStats() {
            return this.alarmStats;
        }

        public DescribeProjectResponseBodyData setCommonTransferConfig(DescribeProjectResponseBodyDataCommonTransferConfig commonTransferConfig) {
            this.commonTransferConfig = commonTransferConfig;
            return this;
        }
        public DescribeProjectResponseBodyDataCommonTransferConfig getCommonTransferConfig() {
            return this.commonTransferConfig;
        }

        public DescribeProjectResponseBodyData setDestConnId(String destConnId) {
            this.destConnId = destConnId;
            return this;
        }
        public String getDestConnId() {
            return this.destConnId;
        }

        public DescribeProjectResponseBodyData setEnableFullTransfer(Boolean enableFullTransfer) {
            this.enableFullTransfer = enableFullTransfer;
            return this;
        }
        public Boolean getEnableFullTransfer() {
            return this.enableFullTransfer;
        }

        public DescribeProjectResponseBodyData setEnableFullVerify(Boolean enableFullVerify) {
            this.enableFullVerify = enableFullVerify;
            return this;
        }
        public Boolean getEnableFullVerify() {
            return this.enableFullVerify;
        }

        public DescribeProjectResponseBodyData setEnableIncrTransfer(Boolean enableIncrTransfer) {
            this.enableIncrTransfer = enableIncrTransfer;
            return this;
        }
        public Boolean getEnableIncrTransfer() {
            return this.enableIncrTransfer;
        }

        public DescribeProjectResponseBodyData setEnableIncrVerify(Boolean enableIncrVerify) {
            this.enableIncrVerify = enableIncrVerify;
            return this;
        }
        public Boolean getEnableIncrVerify() {
            return this.enableIncrVerify;
        }

        public DescribeProjectResponseBodyData setEnableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
            this.enableReverseIncrTransfer = enableReverseIncrTransfer;
            return this;
        }
        public Boolean getEnableReverseIncrTransfer() {
            return this.enableReverseIncrTransfer;
        }

        public DescribeProjectResponseBodyData setEnableStructTransfer(Boolean enableStructTransfer) {
            this.enableStructTransfer = enableStructTransfer;
            return this;
        }
        public Boolean getEnableStructTransfer() {
            return this.enableStructTransfer;
        }

        public DescribeProjectResponseBodyData setExtraInfo(DescribeProjectResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeProjectResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeProjectResponseBodyData setFullTransferConfig(DescribeProjectResponseBodyDataFullTransferConfig fullTransferConfig) {
            this.fullTransferConfig = fullTransferConfig;
            return this;
        }
        public DescribeProjectResponseBodyDataFullTransferConfig getFullTransferConfig() {
            return this.fullTransferConfig;
        }

        public DescribeProjectResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectResponseBodyData setGmtFinish(String gmtFinish) {
            this.gmtFinish = gmtFinish;
            return this;
        }
        public String getGmtFinish() {
            return this.gmtFinish;
        }

        public DescribeProjectResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeProjectResponseBodyData setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public DescribeProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProjectResponseBodyData setImportance(String importance) {
            this.importance = importance;
            return this;
        }
        public String getImportance() {
            return this.importance;
        }

        public DescribeProjectResponseBodyData setIncrTransferConfig(DescribeProjectResponseBodyDataIncrTransferConfig incrTransferConfig) {
            this.incrTransferConfig = incrTransferConfig;
            return this;
        }
        public DescribeProjectResponseBodyDataIncrTransferConfig getIncrTransferConfig() {
            return this.incrTransferConfig;
        }

        public DescribeProjectResponseBodyData setIsMerging(Boolean isMerging) {
            this.isMerging = isMerging;
            return this;
        }
        public Boolean getIsMerging() {
            return this.isMerging;
        }

        public DescribeProjectResponseBodyData setIsModifying(Boolean isModifying) {
            this.isModifying = isModifying;
            return this;
        }
        public Boolean getIsModifying() {
            return this.isModifying;
        }

        public DescribeProjectResponseBodyData setIsSubProject(Boolean isSubProject) {
            this.isSubProject = isSubProject;
            return this;
        }
        public Boolean getIsSubProject() {
            return this.isSubProject;
        }

        public DescribeProjectResponseBodyData setLabels(java.util.List<DescribeProjectResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public DescribeProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeProjectResponseBodyData setReverseIncrTransferConfig(DescribeProjectResponseBodyDataReverseIncrTransferConfig reverseIncrTransferConfig) {
            this.reverseIncrTransferConfig = reverseIncrTransferConfig;
            return this;
        }
        public DescribeProjectResponseBodyDataReverseIncrTransferConfig getReverseIncrTransferConfig() {
            return this.reverseIncrTransferConfig;
        }

        public DescribeProjectResponseBodyData setSinkConnectInfo(DescribeProjectResponseBodyDataSinkConnectInfo sinkConnectInfo) {
            this.sinkConnectInfo = sinkConnectInfo;
            return this;
        }
        public DescribeProjectResponseBodyDataSinkConnectInfo getSinkConnectInfo() {
            return this.sinkConnectInfo;
        }

        public DescribeProjectResponseBodyData setSinkEndpointType(String sinkEndpointType) {
            this.sinkEndpointType = sinkEndpointType;
            return this;
        }
        public String getSinkEndpointType() {
            return this.sinkEndpointType;
        }

        public DescribeProjectResponseBodyData setSourceConnectInfo(DescribeProjectResponseBodyDataSourceConnectInfo sourceConnectInfo) {
            this.sourceConnectInfo = sourceConnectInfo;
            return this;
        }
        public DescribeProjectResponseBodyDataSourceConnectInfo getSourceConnectInfo() {
            return this.sourceConnectInfo;
        }

        public DescribeProjectResponseBodyData setSourceEndpointType(String sourceEndpointType) {
            this.sourceEndpointType = sourceEndpointType;
            return this;
        }
        public String getSourceEndpointType() {
            return this.sourceEndpointType;
        }

        public DescribeProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectResponseBodyData setSteps(java.util.List<DescribeProjectResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<DescribeProjectResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

        public DescribeProjectResponseBodyData setStructTransferConfig(DescribeProjectResponseBodyDataStructTransferConfig structTransferConfig) {
            this.structTransferConfig = structTransferConfig;
            return this;
        }
        public DescribeProjectResponseBodyDataStructTransferConfig getStructTransferConfig() {
            return this.structTransferConfig;
        }

        public DescribeProjectResponseBodyData setTransferMapping(DescribeProjectResponseBodyDataTransferMapping transferMapping) {
            this.transferMapping = transferMapping;
            return this;
        }
        public DescribeProjectResponseBodyDataTransferMapping getTransferMapping() {
            return this.transferMapping;
        }

        public DescribeProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProjectResponseBodyData setWorkerGradeId(String workerGradeId) {
            this.workerGradeId = workerGradeId;
            return this;
        }
        public String getWorkerGradeId() {
            return this.workerGradeId;
        }

        public DescribeProjectResponseBodyData setWorkerGradeInfo(DescribeProjectResponseBodyDataWorkerGradeInfo workerGradeInfo) {
            this.workerGradeInfo = workerGradeInfo;
            return this;
        }
        public DescribeProjectResponseBodyDataWorkerGradeInfo getWorkerGradeInfo() {
            return this.workerGradeInfo;
        }

    }

    public static class DescribeProjectResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectResponseBodyErrorDetail self = new DescribeProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
