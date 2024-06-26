// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Contact the administrator.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <strong>example:</strong>
     * <p>INNER_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<ListProjectsResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public ListProjectsResponseBodyErrorDetail errorDetail;

    /**
     * <strong>example:</strong>
     * <p>A system error occurred.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ListProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ListProjectsResponseBody setData(java.util.List<ListProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectsResponseBody setErrorDetail(ListProjectsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ListProjectsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ListProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectsResponseBodyDataAlarmStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AlarmContent")
        public String alarmContent;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Alarming")
        public Boolean alarming;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenMonitor")
        public Boolean openMonitor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RecentlyTriggerCount")
        public Integer recentlyTriggerCount;

        @NameInMap("RuleToRecentlyTriggerCount")
        public java.util.Map<String, Integer> ruleToRecentlyTriggerCount;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Target")
        public String target;

        public static ListProjectsResponseBodyDataAlarmStats build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataAlarmStats self = new ListProjectsResponseBodyDataAlarmStats();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataAlarmStats setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public ListProjectsResponseBodyDataAlarmStats setAlarming(Boolean alarming) {
            this.alarming = alarming;
            return this;
        }
        public Boolean getAlarming() {
            return this.alarming;
        }

        public ListProjectsResponseBodyDataAlarmStats setOpenMonitor(Boolean openMonitor) {
            this.openMonitor = openMonitor;
            return this;
        }
        public Boolean getOpenMonitor() {
            return this.openMonitor;
        }

        public ListProjectsResponseBodyDataAlarmStats setRecentlyTriggerCount(Integer recentlyTriggerCount) {
            this.recentlyTriggerCount = recentlyTriggerCount;
            return this;
        }
        public Integer getRecentlyTriggerCount() {
            return this.recentlyTriggerCount;
        }

        public ListProjectsResponseBodyDataAlarmStats setRuleToRecentlyTriggerCount(java.util.Map<String, Integer> ruleToRecentlyTriggerCount) {
            this.ruleToRecentlyTriggerCount = ruleToRecentlyTriggerCount;
            return this;
        }
        public java.util.Map<String, Integer> getRuleToRecentlyTriggerCount() {
            return this.ruleToRecentlyTriggerCount;
        }

        public ListProjectsResponseBodyDataAlarmStats setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class ListProjectsResponseBodyDataCommonTransferConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ActiveActive")
        public Boolean activeActive;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DataWorksBusinessName")
        public String dataWorksBusinessName;

        /**
         * <strong>example:</strong>
         * <p>TUPLE</p>
         */
        @NameInMap("DatahubTopicType")
        public String datahubTopicType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MqPartition")
        public Integer mqPartition;

        /**
         * <strong>example:</strong>
         * <p>ONE</p>
         */
        @NameInMap("MqPartitionMode")
        public String mqPartitionMode;

        /**
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("MqSerializerType")
        public String mqSerializerType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RocketMqEnableMsgTrace")
        public Boolean rocketMqEnableMsgTrace;

        /**
         * <strong>example:</strong>
         * <p>default_tag</p>
         */
        @NameInMap("RocketMqMsgTags")
        public String rocketMqMsgTags;

        /**
         * <strong>example:</strong>
         * <p>OMS</p>
         */
        @NameInMap("RocketMqProducerGroup")
        public String rocketMqProducerGroup;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RocketMqSendMsgTimeout")
        public Long rocketMqSendMsgTimeout;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("TableCategory")
        public String tableCategory;

        public static ListProjectsResponseBodyDataCommonTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataCommonTransferConfig self = new ListProjectsResponseBodyDataCommonTransferConfig();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setActiveActive(Boolean activeActive) {
            this.activeActive = activeActive;
            return this;
        }
        public Boolean getActiveActive() {
            return this.activeActive;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setDataWorksBusinessName(String dataWorksBusinessName) {
            this.dataWorksBusinessName = dataWorksBusinessName;
            return this;
        }
        public String getDataWorksBusinessName() {
            return this.dataWorksBusinessName;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setDatahubTopicType(String datahubTopicType) {
            this.datahubTopicType = datahubTopicType;
            return this;
        }
        public String getDatahubTopicType() {
            return this.datahubTopicType;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setMqPartition(Integer mqPartition) {
            this.mqPartition = mqPartition;
            return this;
        }
        public Integer getMqPartition() {
            return this.mqPartition;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setMqPartitionMode(String mqPartitionMode) {
            this.mqPartitionMode = mqPartitionMode;
            return this;
        }
        public String getMqPartitionMode() {
            return this.mqPartitionMode;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setMqSerializerType(String mqSerializerType) {
            this.mqSerializerType = mqSerializerType;
            return this;
        }
        public String getMqSerializerType() {
            return this.mqSerializerType;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setRocketMqEnableMsgTrace(Boolean rocketMqEnableMsgTrace) {
            this.rocketMqEnableMsgTrace = rocketMqEnableMsgTrace;
            return this;
        }
        public Boolean getRocketMqEnableMsgTrace() {
            return this.rocketMqEnableMsgTrace;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setRocketMqMsgTags(String rocketMqMsgTags) {
            this.rocketMqMsgTags = rocketMqMsgTags;
            return this;
        }
        public String getRocketMqMsgTags() {
            return this.rocketMqMsgTags;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setRocketMqProducerGroup(String rocketMqProducerGroup) {
            this.rocketMqProducerGroup = rocketMqProducerGroup;
            return this;
        }
        public String getRocketMqProducerGroup() {
            return this.rocketMqProducerGroup;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setRocketMqSendMsgTimeout(Long rocketMqSendMsgTimeout) {
            this.rocketMqSendMsgTimeout = rocketMqSendMsgTimeout;
            return this;
        }
        public Long getRocketMqSendMsgTimeout() {
            return this.rocketMqSendMsgTimeout;
        }

        public ListProjectsResponseBodyDataCommonTransferConfig setTableCategory(String tableCategory) {
            this.tableCategory = tableCategory;
            return this;
        }
        public String getTableCategory() {
            return this.tableCategory;
        }

    }

    public static class ListProjectsResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AccessObSource")
        public Boolean accessObSource;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreUnsupportDdl")
        public Boolean ignoreUnsupportDdl;

        /**
         * <strong>example:</strong>
         * <p>1689244596</p>
         */
        @NameInMap("IncrSyncTimestamp")
        public Long incrSyncTimestamp;

        /**
         * <strong>example:</strong>
         * <p>1689214358</p>
         */
        @NameInMap("LogServiceStartCheckpoint")
        public Long logServiceStartCheckpoint;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MaxConnectorCount")
        public Integer maxConnectorCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MonitoringIncr")
        public Boolean monitoringIncr;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OverwriteConfig")
        public Boolean overwriteConfig;

        @NameInMap("ReverseSubtopics")
        public java.util.List<String> reverseSubtopics;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("RunningProgress")
        public Integer runningProgress;

        /**
         * <strong>example:</strong>
         * <p>TRANSFER_PRECHECK</p>
         */
        @NameInMap("RunningStep")
        public String runningStep;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("SourceStoreKeptHour")
        public Integer sourceStoreKeptHour;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SyncDelay")
        public Long syncDelay;

        /**
         * <strong>example:</strong>
         * <p>1689214358</p>
         */
        @NameInMap("SyncDelaySampleTimestamp")
        public Long syncDelaySampleTimestamp;

        public static ListProjectsResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataExtraInfo self = new ListProjectsResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataExtraInfo setAccessObSource(Boolean accessObSource) {
            this.accessObSource = accessObSource;
            return this;
        }
        public Boolean getAccessObSource() {
            return this.accessObSource;
        }

        public ListProjectsResponseBodyDataExtraInfo setIgnoreUnsupportDdl(Boolean ignoreUnsupportDdl) {
            this.ignoreUnsupportDdl = ignoreUnsupportDdl;
            return this;
        }
        public Boolean getIgnoreUnsupportDdl() {
            return this.ignoreUnsupportDdl;
        }

        public ListProjectsResponseBodyDataExtraInfo setIncrSyncTimestamp(Long incrSyncTimestamp) {
            this.incrSyncTimestamp = incrSyncTimestamp;
            return this;
        }
        public Long getIncrSyncTimestamp() {
            return this.incrSyncTimestamp;
        }

        public ListProjectsResponseBodyDataExtraInfo setLogServiceStartCheckpoint(Long logServiceStartCheckpoint) {
            this.logServiceStartCheckpoint = logServiceStartCheckpoint;
            return this;
        }
        public Long getLogServiceStartCheckpoint() {
            return this.logServiceStartCheckpoint;
        }

        public ListProjectsResponseBodyDataExtraInfo setMaxConnectorCount(Integer maxConnectorCount) {
            this.maxConnectorCount = maxConnectorCount;
            return this;
        }
        public Integer getMaxConnectorCount() {
            return this.maxConnectorCount;
        }

        public ListProjectsResponseBodyDataExtraInfo setMonitoringIncr(Boolean monitoringIncr) {
            this.monitoringIncr = monitoringIncr;
            return this;
        }
        public Boolean getMonitoringIncr() {
            return this.monitoringIncr;
        }

        public ListProjectsResponseBodyDataExtraInfo setOverwriteConfig(Boolean overwriteConfig) {
            this.overwriteConfig = overwriteConfig;
            return this;
        }
        public Boolean getOverwriteConfig() {
            return this.overwriteConfig;
        }

        public ListProjectsResponseBodyDataExtraInfo setReverseSubtopics(java.util.List<String> reverseSubtopics) {
            this.reverseSubtopics = reverseSubtopics;
            return this;
        }
        public java.util.List<String> getReverseSubtopics() {
            return this.reverseSubtopics;
        }

        public ListProjectsResponseBodyDataExtraInfo setRunningProgress(Integer runningProgress) {
            this.runningProgress = runningProgress;
            return this;
        }
        public Integer getRunningProgress() {
            return this.runningProgress;
        }

        public ListProjectsResponseBodyDataExtraInfo setRunningStep(String runningStep) {
            this.runningStep = runningStep;
            return this;
        }
        public String getRunningStep() {
            return this.runningStep;
        }

        public ListProjectsResponseBodyDataExtraInfo setSourceStoreKeptHour(Integer sourceStoreKeptHour) {
            this.sourceStoreKeptHour = sourceStoreKeptHour;
            return this;
        }
        public Integer getSourceStoreKeptHour() {
            return this.sourceStoreKeptHour;
        }

        public ListProjectsResponseBodyDataExtraInfo setStoreIncr(Boolean storeIncr) {
            this.storeIncr = storeIncr;
            return this;
        }
        public Boolean getStoreIncr() {
            return this.storeIncr;
        }

        public ListProjectsResponseBodyDataExtraInfo setSubConds(java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> subConds) {
            this.subConds = subConds;
            return this;
        }
        public java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> getSubConds() {
            return this.subConds;
        }

        public ListProjectsResponseBodyDataExtraInfo setSubDbs(java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> subDbs) {
            this.subDbs = subDbs;
            return this;
        }
        public java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> getSubDbs() {
            return this.subDbs;
        }

        public ListProjectsResponseBodyDataExtraInfo setSubIds(java.util.Map<String, String> subIds) {
            this.subIds = subIds;
            return this;
        }
        public java.util.Map<String, String> getSubIds() {
            return this.subIds;
        }

        public ListProjectsResponseBodyDataExtraInfo setSubtopics(java.util.List<String> subtopics) {
            this.subtopics = subtopics;
            return this;
        }
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

        public ListProjectsResponseBodyDataExtraInfo setSyncDelay(Long syncDelay) {
            this.syncDelay = syncDelay;
            return this;
        }
        public Long getSyncDelay() {
            return this.syncDelay;
        }

        public ListProjectsResponseBodyDataExtraInfo setSyncDelaySampleTimestamp(Long syncDelaySampleTimestamp) {
            this.syncDelaySampleTimestamp = syncDelaySampleTimestamp;
            return this;
        }
        public Long getSyncDelaySampleTimestamp() {
            return this.syncDelaySampleTimestamp;
        }

    }

    public static class ListProjectsResponseBodyDataFullTransferConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowDestTableNotEmpty")
        public Boolean allowDestTableNotEmpty;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("FullTransferSpeedMode")
        public String fullTransferSpeedMode;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("FullVerifySpeedMode")
        public String fullVerifySpeedMode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NonePkUkTruncateDstTable")
        public Boolean nonePkUkTruncateDstTable;

        public static ListProjectsResponseBodyDataFullTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataFullTransferConfig self = new ListProjectsResponseBodyDataFullTransferConfig();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataFullTransferConfig setAllowDestTableNotEmpty(Boolean allowDestTableNotEmpty) {
            this.allowDestTableNotEmpty = allowDestTableNotEmpty;
            return this;
        }
        public Boolean getAllowDestTableNotEmpty() {
            return this.allowDestTableNotEmpty;
        }

        public ListProjectsResponseBodyDataFullTransferConfig setFullTransferSpeedMode(String fullTransferSpeedMode) {
            this.fullTransferSpeedMode = fullTransferSpeedMode;
            return this;
        }
        public String getFullTransferSpeedMode() {
            return this.fullTransferSpeedMode;
        }

        public ListProjectsResponseBodyDataFullTransferConfig setFullVerifySpeedMode(String fullVerifySpeedMode) {
            this.fullVerifySpeedMode = fullVerifySpeedMode;
            return this;
        }
        public String getFullVerifySpeedMode() {
            return this.fullVerifySpeedMode;
        }

        public ListProjectsResponseBodyDataFullTransferConfig setNonePkUkTruncateDstTable(Boolean nonePkUkTruncateDstTable) {
            this.nonePkUkTruncateDstTable = nonePkUkTruncateDstTable;
            return this;
        }
        public Boolean getNonePkUkTruncateDstTable() {
            return this.nonePkUkTruncateDstTable;
        }

    }

    public static class ListProjectsResponseBodyDataIncrTransferConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIncrSyncStatistics")
        public Boolean enableIncrSyncStatistics;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSequencingWithinTxn")
        public Boolean enableSequencingWithinTxn;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("IncrSyncConcurrency")
        public Integer incrSyncConcurrency;

        @NameInMap("RecordTypeWhiteList")
        public java.util.List<String> recordTypeWhiteList;

        /**
         * <strong>example:</strong>
         * <p>1681004708</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("StoreLogKeptHour")
        public Integer storeLogKeptHour;

        public static ListProjectsResponseBodyDataIncrTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataIncrTransferConfig self = new ListProjectsResponseBodyDataIncrTransferConfig();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataIncrTransferConfig setEnableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
            this.enableIncrSyncStatistics = enableIncrSyncStatistics;
            return this;
        }
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        public ListProjectsResponseBodyDataIncrTransferConfig setEnableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
            this.enableSequencingWithinTxn = enableSequencingWithinTxn;
            return this;
        }
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        public ListProjectsResponseBodyDataIncrTransferConfig setIncrSyncConcurrency(Integer incrSyncConcurrency) {
            this.incrSyncConcurrency = incrSyncConcurrency;
            return this;
        }
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        public ListProjectsResponseBodyDataIncrTransferConfig setRecordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
            this.recordTypeWhiteList = recordTypeWhiteList;
            return this;
        }
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        public ListProjectsResponseBodyDataIncrTransferConfig setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public ListProjectsResponseBodyDataIncrTransferConfig setStoreLogKeptHour(Integer storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

    }

    public static class ListProjectsResponseBodyDataLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>l_dfe****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>label_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ListProjectsResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataLabels self = new ListProjectsResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataLabels setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListProjectsResponseBodyDataLabels setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListProjectsResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsResponseBodyDataLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyDataLabels setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ListProjectsResponseBodyDataSinkConnectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ConnExtraAttributes")
        public Object connExtraAttributes;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        /**
         * <strong>example:</strong>
         * <p>MYSQL_PUBLIC</p>
         */
        @NameInMap("DbEngine")
        public String dbEngine;

        /**
         * <strong>example:</strong>
         * <p>e_4w3aic***</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>ation129<em><strong>9apimysql5616</strong></em>*</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <strong>example:</strong>
         * <p>sink</p>
         */
        @NameInMap("EndpointSide")
        public String endpointSide;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>c_4w3akx***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("OcpName")
        public String ocpName;

        /**
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OperatingSystem")
        public String operatingSystem;

        /**
         * <p>Owner。</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>2883</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1325847***</p>
         */
        @NameInMap("ResourceOwner")
        public String resourceOwner;

        /**
         * <strong>example:</strong>
         * <p>+08:00</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <strong>example:</strong>
         * <p>oms<strong>obmys</strong></p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>2.2.77</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListProjectsResponseBodyDataSinkConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataSinkConnectInfo self = new ListProjectsResponseBodyDataSinkConnectInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setConnExtraAttributes(Object connExtraAttributes) {
            this.connExtraAttributes = connExtraAttributes;
            return this;
        }
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setDbEngine(String dbEngine) {
            this.dbEngine = dbEngine;
            return this;
        }
        public String getDbEngine() {
            return this.dbEngine;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setEndpointSide(String endpointSide) {
            this.endpointSide = endpointSide;
            return this;
        }
        public String getEndpointSide() {
            return this.endpointSide;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setOcpName(String ocpName) {
            this.ocpName = ocpName;
            return this;
        }
        public String getOcpName() {
            return this.ocpName;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setResourceOwner(String resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListProjectsResponseBodyDataSinkConnectInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListProjectsResponseBodyDataSourceConnectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ConnExtraAttributes")
        public Object connExtraAttributes;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        /**
         * <strong>example:</strong>
         * <p>OB_MYSQL_PUBLIC</p>
         */
        @NameInMap("DbEngine")
        public String dbEngine;

        /**
         * <strong>example:</strong>
         * <p>e_4w3al***</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>ration12*<em><strong>0obmysql4116892</strong></em></p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("EndpointSide")
        public String endpointSide;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>c_4w3aq****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("OcpName")
        public String ocpName;

        /**
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OperatingSystem")
        public String operatingSystem;

        /**
         * <p>Owner。</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>2883</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1325847***</p>
         */
        @NameInMap("ResourceOwner")
        public String resourceOwner;

        /**
         * <strong>example:</strong>
         * <p>UTC</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <strong>example:</strong>
         * <p>oms931mys**</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>5.7.27</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListProjectsResponseBodyDataSourceConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataSourceConnectInfo self = new ListProjectsResponseBodyDataSourceConnectInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setConnExtraAttributes(Object connExtraAttributes) {
            this.connExtraAttributes = connExtraAttributes;
            return this;
        }
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setDbEngine(String dbEngine) {
            this.dbEngine = dbEngine;
            return this;
        }
        public String getDbEngine() {
            return this.dbEngine;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setEndpointSide(String endpointSide) {
            this.endpointSide = endpointSide;
            return this;
        }
        public String getEndpointSide() {
            return this.endpointSide;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setOcpName(String ocpName) {
            this.ocpName = ocpName;
            return this;
        }
        public String getOcpName() {
            return this.ocpName;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setResourceOwner(String resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListProjectsResponseBodyDataSourceConnectInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListProjectsResponseBodyDataStepsExtraInfoErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>Contact the administrator.</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static ListProjectsResponseBodyDataStepsExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataStepsExtraInfoErrorDetails self = new ListProjectsResponseBodyDataStepsExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListProjectsResponseBodyDataStepsExtraInfoErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class ListProjectsResponseBodyDataStepsExtraInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INNER_ERROR</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDetails")
        public java.util.List<ListProjectsResponseBodyDataStepsExtraInfoErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("FailedTime")
        public String failedTime;

        public static ListProjectsResponseBodyDataStepsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataStepsExtraInfo self = new ListProjectsResponseBodyDataStepsExtraInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataStepsExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListProjectsResponseBodyDataStepsExtraInfo setErrorDetails(java.util.List<ListProjectsResponseBodyDataStepsExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyDataStepsExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public ListProjectsResponseBodyDataStepsExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListProjectsResponseBodyDataStepsExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public ListProjectsResponseBodyDataStepsExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class ListProjectsResponseBodyDataSteps extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public ListProjectsResponseBodyDataStepsExtraInfo extraInfo;

        /**
         * <strong>example:</strong>
         * <p>2020-05-22T17:05:18</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>TRANSFER_PRECHECK</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>2020-05-22T17:04:18</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("StepInfo")
        public java.util.Map<String, ?> stepInfo;

        public static ListProjectsResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataSteps self = new ListProjectsResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataSteps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyDataSteps setExtraInfo(ListProjectsResponseBodyDataStepsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public ListProjectsResponseBodyDataStepsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public ListProjectsResponseBodyDataSteps setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListProjectsResponseBodyDataSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyDataSteps setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListProjectsResponseBodyDataSteps setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListProjectsResponseBodyDataSteps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListProjectsResponseBodyDataSteps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectsResponseBodyDataSteps setStepInfo(java.util.Map<String, ?> stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public java.util.Map<String, ?> getStepInfo() {
            return this.stepInfo;
        }

    }

    public static class ListProjectsResponseBodyDataStructTransferConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DO_NOTHING_IF_BYTE_USED</p>
         */
        @NameInMap("ByteCharConvertStrategy")
        public String byteCharConvertStrategy;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeferIndexCreation")
        public Boolean deferIndexCreation;

        public static ListProjectsResponseBodyDataStructTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataStructTransferConfig self = new ListProjectsResponseBodyDataStructTransferConfig();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataStructTransferConfig setByteCharConvertStrategy(String byteCharConvertStrategy) {
            this.byteCharConvertStrategy = byteCharConvertStrategy;
            return this;
        }
        public String getByteCharConvertStrategy() {
            return this.byteCharConvertStrategy;
        }

        public ListProjectsResponseBodyDataStructTransferConfig setDeferIndexCreation(Boolean deferIndexCreation) {
            this.deferIndexCreation = deferIndexCreation;
            return this;
        }
        public Boolean getDeferIndexCreation() {
            return this.deferIndexCreation;
        }

    }

    public static class ListProjectsResponseBodyDataTransferMapping extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SPECIFIC</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static ListProjectsResponseBodyDataTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataTransferMapping self = new ListProjectsResponseBodyDataTransferMapping();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class ListProjectsResponseBodyDataWorkerGradeInfo extends TeaModel {
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

        public static ListProjectsResponseBodyDataWorkerGradeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataWorkerGradeInfo self = new ListProjectsResponseBodyDataWorkerGradeInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListProjectsResponseBodyDataWorkerGradeInfo setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

    public static class ListProjectsResponseBodyData extends TeaModel {
        @NameInMap("AlarmStats")
        public ListProjectsResponseBodyDataAlarmStats alarmStats;

        @NameInMap("CommonTransferConfig")
        public ListProjectsResponseBodyDataCommonTransferConfig commonTransferConfig;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DestConnId")
        public String destConnId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableFullTransfer")
        public Boolean enableFullTransfer;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableFullVerify")
        public Boolean enableFullVerify;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIncrTransfer")
        public Boolean enableIncrTransfer;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIncrVerify")
        public Boolean enableIncrVerify;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableReverseIncrTransfer")
        public Boolean enableReverseIncrTransfer;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStructTransfer")
        public Boolean enableStructTransfer;

        @NameInMap("ExtraInfo")
        public ListProjectsResponseBodyDataExtraInfo extraInfo;

        @NameInMap("FullTransferConfig")
        public ListProjectsResponseBodyDataFullTransferConfig fullTransferConfig;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T06:26:15</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T08:01:27</p>
         */
        @NameInMap("GmtFinish")
        public String gmtFinish;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T07:01:27</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T07:02:27</p>
         */
        @NameInMap("GmtStart")
        public String gmtStart;

        /**
         * <strong>example:</strong>
         * <p>np_4w****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        @NameInMap("Importance")
        public String importance;

        @NameInMap("IncrTransferConfig")
        public ListProjectsResponseBodyDataIncrTransferConfig incrTransferConfig;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsMerging")
        public Boolean isMerging;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsModifying")
        public Boolean isModifying;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSubProject")
        public Boolean isSubProject;

        @NameInMap("Labels")
        public java.util.List<ListProjectsResponseBodyDataLabels> labels;

        /**
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("SinkConnectInfo")
        public ListProjectsResponseBodyDataSinkConnectInfo sinkConnectInfo;

        /**
         * <strong>example:</strong>
         * <p>OB_MYSQL</p>
         */
        @NameInMap("SinkEndpointType")
        public String sinkEndpointType;

        @NameInMap("SourceConnectInfo")
        public ListProjectsResponseBodyDataSourceConnectInfo sourceConnectInfo;

        /**
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        @NameInMap("SourceEndpointType")
        public String sourceEndpointType;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Steps")
        public java.util.List<ListProjectsResponseBodyDataSteps> steps;

        @NameInMap("StructTransferConfig")
        public ListProjectsResponseBodyDataStructTransferConfig structTransferConfig;

        @NameInMap("TransferMapping")
        public ListProjectsResponseBodyDataTransferMapping transferMapping;

        /**
         * <strong>example:</strong>
         * <p>MIGRATION</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>g_i4wa7XXX</p>
         */
        @NameInMap("WorkerGradeId")
        public String workerGradeId;

        @NameInMap("WorkerGradeInfo")
        public ListProjectsResponseBodyDataWorkerGradeInfo workerGradeInfo;

        public static ListProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyData self = new ListProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyData setAlarmStats(ListProjectsResponseBodyDataAlarmStats alarmStats) {
            this.alarmStats = alarmStats;
            return this;
        }
        public ListProjectsResponseBodyDataAlarmStats getAlarmStats() {
            return this.alarmStats;
        }

        public ListProjectsResponseBodyData setCommonTransferConfig(ListProjectsResponseBodyDataCommonTransferConfig commonTransferConfig) {
            this.commonTransferConfig = commonTransferConfig;
            return this;
        }
        public ListProjectsResponseBodyDataCommonTransferConfig getCommonTransferConfig() {
            return this.commonTransferConfig;
        }

        public ListProjectsResponseBodyData setDestConnId(String destConnId) {
            this.destConnId = destConnId;
            return this;
        }
        public String getDestConnId() {
            return this.destConnId;
        }

        public ListProjectsResponseBodyData setEnableFullTransfer(Boolean enableFullTransfer) {
            this.enableFullTransfer = enableFullTransfer;
            return this;
        }
        public Boolean getEnableFullTransfer() {
            return this.enableFullTransfer;
        }

        public ListProjectsResponseBodyData setEnableFullVerify(Boolean enableFullVerify) {
            this.enableFullVerify = enableFullVerify;
            return this;
        }
        public Boolean getEnableFullVerify() {
            return this.enableFullVerify;
        }

        public ListProjectsResponseBodyData setEnableIncrTransfer(Boolean enableIncrTransfer) {
            this.enableIncrTransfer = enableIncrTransfer;
            return this;
        }
        public Boolean getEnableIncrTransfer() {
            return this.enableIncrTransfer;
        }

        public ListProjectsResponseBodyData setEnableIncrVerify(Boolean enableIncrVerify) {
            this.enableIncrVerify = enableIncrVerify;
            return this;
        }
        public Boolean getEnableIncrVerify() {
            return this.enableIncrVerify;
        }

        public ListProjectsResponseBodyData setEnableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
            this.enableReverseIncrTransfer = enableReverseIncrTransfer;
            return this;
        }
        public Boolean getEnableReverseIncrTransfer() {
            return this.enableReverseIncrTransfer;
        }

        public ListProjectsResponseBodyData setEnableStructTransfer(Boolean enableStructTransfer) {
            this.enableStructTransfer = enableStructTransfer;
            return this;
        }
        public Boolean getEnableStructTransfer() {
            return this.enableStructTransfer;
        }

        public ListProjectsResponseBodyData setExtraInfo(ListProjectsResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public ListProjectsResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public ListProjectsResponseBodyData setFullTransferConfig(ListProjectsResponseBodyDataFullTransferConfig fullTransferConfig) {
            this.fullTransferConfig = fullTransferConfig;
            return this;
        }
        public ListProjectsResponseBodyDataFullTransferConfig getFullTransferConfig() {
            return this.fullTransferConfig;
        }

        public ListProjectsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectsResponseBodyData setGmtFinish(String gmtFinish) {
            this.gmtFinish = gmtFinish;
            return this;
        }
        public String getGmtFinish() {
            return this.gmtFinish;
        }

        public ListProjectsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectsResponseBodyData setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public ListProjectsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectsResponseBodyData setImportance(String importance) {
            this.importance = importance;
            return this;
        }
        public String getImportance() {
            return this.importance;
        }

        public ListProjectsResponseBodyData setIncrTransferConfig(ListProjectsResponseBodyDataIncrTransferConfig incrTransferConfig) {
            this.incrTransferConfig = incrTransferConfig;
            return this;
        }
        public ListProjectsResponseBodyDataIncrTransferConfig getIncrTransferConfig() {
            return this.incrTransferConfig;
        }

        public ListProjectsResponseBodyData setIsMerging(Boolean isMerging) {
            this.isMerging = isMerging;
            return this;
        }
        public Boolean getIsMerging() {
            return this.isMerging;
        }

        public ListProjectsResponseBodyData setIsModifying(Boolean isModifying) {
            this.isModifying = isModifying;
            return this;
        }
        public Boolean getIsModifying() {
            return this.isModifying;
        }

        public ListProjectsResponseBodyData setIsSubProject(Boolean isSubProject) {
            this.isSubProject = isSubProject;
            return this;
        }
        public Boolean getIsSubProject() {
            return this.isSubProject;
        }

        public ListProjectsResponseBodyData setLabels(java.util.List<ListProjectsResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public ListProjectsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectsResponseBodyData setSinkConnectInfo(ListProjectsResponseBodyDataSinkConnectInfo sinkConnectInfo) {
            this.sinkConnectInfo = sinkConnectInfo;
            return this;
        }
        public ListProjectsResponseBodyDataSinkConnectInfo getSinkConnectInfo() {
            return this.sinkConnectInfo;
        }

        public ListProjectsResponseBodyData setSinkEndpointType(String sinkEndpointType) {
            this.sinkEndpointType = sinkEndpointType;
            return this;
        }
        public String getSinkEndpointType() {
            return this.sinkEndpointType;
        }

        public ListProjectsResponseBodyData setSourceConnectInfo(ListProjectsResponseBodyDataSourceConnectInfo sourceConnectInfo) {
            this.sourceConnectInfo = sourceConnectInfo;
            return this;
        }
        public ListProjectsResponseBodyDataSourceConnectInfo getSourceConnectInfo() {
            return this.sourceConnectInfo;
        }

        public ListProjectsResponseBodyData setSourceEndpointType(String sourceEndpointType) {
            this.sourceEndpointType = sourceEndpointType;
            return this;
        }
        public String getSourceEndpointType() {
            return this.sourceEndpointType;
        }

        public ListProjectsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectsResponseBodyData setSteps(java.util.List<ListProjectsResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

        public ListProjectsResponseBodyData setStructTransferConfig(ListProjectsResponseBodyDataStructTransferConfig structTransferConfig) {
            this.structTransferConfig = structTransferConfig;
            return this;
        }
        public ListProjectsResponseBodyDataStructTransferConfig getStructTransferConfig() {
            return this.structTransferConfig;
        }

        public ListProjectsResponseBodyData setTransferMapping(ListProjectsResponseBodyDataTransferMapping transferMapping) {
            this.transferMapping = transferMapping;
            return this;
        }
        public ListProjectsResponseBodyDataTransferMapping getTransferMapping() {
            return this.transferMapping;
        }

        public ListProjectsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectsResponseBodyData setWorkerGradeId(String workerGradeId) {
            this.workerGradeId = workerGradeId;
            return this;
        }
        public String getWorkerGradeId() {
            return this.workerGradeId;
        }

        public ListProjectsResponseBodyData setWorkerGradeInfo(ListProjectsResponseBodyDataWorkerGradeInfo workerGradeInfo) {
            this.workerGradeInfo = workerGradeInfo;
            return this;
        }
        public ListProjectsResponseBodyDataWorkerGradeInfo getWorkerGradeInfo() {
            return this.workerGradeInfo;
        }

    }

    public static class ListProjectsResponseBodyErrorDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>Contact the administrator.</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static ListProjectsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyErrorDetail self = new ListProjectsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectsResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListProjectsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListProjectsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProjectsResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListProjectsResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListProjectsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListProjectsResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListProjectsResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListProjectsResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListProjectsResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListProjectsResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListProjectsResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
