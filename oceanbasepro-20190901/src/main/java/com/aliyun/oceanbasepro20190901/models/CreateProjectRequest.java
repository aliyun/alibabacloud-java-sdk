// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("CommonTransferConfig")
    public CreateProjectRequestCommonTransferConfig commonTransferConfig;

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
    @NameInMap("EnableReverseIncrTransfer")
    public Boolean enableReverseIncrTransfer;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableStructTransfer")
    public Boolean enableStructTransfer;

    @NameInMap("FullTransferConfig")
    public CreateProjectRequestFullTransferConfig fullTransferConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("IncrTransferConfig")
    public CreateProjectRequestIncrTransferConfig incrTransferConfig;

    @NameInMap("LabelIds")
    public java.util.List<String> labelIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>open_api_create_project/oacp_xxx</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("ReverseIncrTransferConfig")
    public CreateProjectRequestReverseIncrTransferConfig reverseIncrTransferConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e_4j0cz****</p>
     */
    @NameInMap("SinkEndpointId")
    public String sinkEndpointId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e_4j0c12z****</p>
     */
    @NameInMap("SourceEndpointId")
    public String sourceEndpointId;

    @NameInMap("StructTransferConfig")
    public CreateProjectRequestStructTransferConfig structTransferConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransferMapping")
    public CreateProjectRequestTransferMapping transferMapping;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MIGRATION</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseOss")
    public Boolean useOss;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>g_abcdefj***</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setCommonTransferConfig(CreateProjectRequestCommonTransferConfig commonTransferConfig) {
        this.commonTransferConfig = commonTransferConfig;
        return this;
    }
    public CreateProjectRequestCommonTransferConfig getCommonTransferConfig() {
        return this.commonTransferConfig;
    }

    public CreateProjectRequest setEnableFullTransfer(Boolean enableFullTransfer) {
        this.enableFullTransfer = enableFullTransfer;
        return this;
    }
    public Boolean getEnableFullTransfer() {
        return this.enableFullTransfer;
    }

    public CreateProjectRequest setEnableFullVerify(Boolean enableFullVerify) {
        this.enableFullVerify = enableFullVerify;
        return this;
    }
    public Boolean getEnableFullVerify() {
        return this.enableFullVerify;
    }

    public CreateProjectRequest setEnableIncrTransfer(Boolean enableIncrTransfer) {
        this.enableIncrTransfer = enableIncrTransfer;
        return this;
    }
    public Boolean getEnableIncrTransfer() {
        return this.enableIncrTransfer;
    }

    public CreateProjectRequest setEnableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
        this.enableReverseIncrTransfer = enableReverseIncrTransfer;
        return this;
    }
    public Boolean getEnableReverseIncrTransfer() {
        return this.enableReverseIncrTransfer;
    }

    public CreateProjectRequest setEnableStructTransfer(Boolean enableStructTransfer) {
        this.enableStructTransfer = enableStructTransfer;
        return this;
    }
    public Boolean getEnableStructTransfer() {
        return this.enableStructTransfer;
    }

    public CreateProjectRequest setFullTransferConfig(CreateProjectRequestFullTransferConfig fullTransferConfig) {
        this.fullTransferConfig = fullTransferConfig;
        return this;
    }
    public CreateProjectRequestFullTransferConfig getFullTransferConfig() {
        return this.fullTransferConfig;
    }

    public CreateProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateProjectRequest setIncrTransferConfig(CreateProjectRequestIncrTransferConfig incrTransferConfig) {
        this.incrTransferConfig = incrTransferConfig;
        return this;
    }
    public CreateProjectRequestIncrTransferConfig getIncrTransferConfig() {
        return this.incrTransferConfig;
    }

    public CreateProjectRequest setLabelIds(java.util.List<String> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public java.util.List<String> getLabelIds() {
        return this.labelIds;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CreateProjectRequest setReverseIncrTransferConfig(CreateProjectRequestReverseIncrTransferConfig reverseIncrTransferConfig) {
        this.reverseIncrTransferConfig = reverseIncrTransferConfig;
        return this;
    }
    public CreateProjectRequestReverseIncrTransferConfig getReverseIncrTransferConfig() {
        return this.reverseIncrTransferConfig;
    }

    public CreateProjectRequest setSinkEndpointId(String sinkEndpointId) {
        this.sinkEndpointId = sinkEndpointId;
        return this;
    }
    public String getSinkEndpointId() {
        return this.sinkEndpointId;
    }

    public CreateProjectRequest setSourceEndpointId(String sourceEndpointId) {
        this.sourceEndpointId = sourceEndpointId;
        return this;
    }
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    public CreateProjectRequest setStructTransferConfig(CreateProjectRequestStructTransferConfig structTransferConfig) {
        this.structTransferConfig = structTransferConfig;
        return this;
    }
    public CreateProjectRequestStructTransferConfig getStructTransferConfig() {
        return this.structTransferConfig;
    }

    public CreateProjectRequest setTransferMapping(CreateProjectRequestTransferMapping transferMapping) {
        this.transferMapping = transferMapping;
        return this;
    }
    public CreateProjectRequestTransferMapping getTransferMapping() {
        return this.transferMapping;
    }

    public CreateProjectRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateProjectRequest setUseOss(Boolean useOss) {
        this.useOss = useOss;
        return this;
    }
    public Boolean getUseOss() {
        return this.useOss;
    }

    public CreateProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

    public static class CreateProjectRequestCommonTransferConfigCustomColumns extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("Expression")
        public String expression;

        public static CreateProjectRequestCommonTransferConfigCustomColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestCommonTransferConfigCustomColumns self = new CreateProjectRequestCommonTransferConfigCustomColumns();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestCommonTransferConfigCustomColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateProjectRequestCommonTransferConfigCustomColumns setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

    }

    public static class CreateProjectRequestCommonTransferConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ActiveActive")
        public Boolean activeActive;

        @NameInMap("CustomColumns")
        public java.util.List<CreateProjectRequestCommonTransferConfigCustomColumns> customColumns;

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

        @NameInMap("SinkStoreFormat")
        public String sinkStoreFormat;

        @NameInMap("SourceStoreFormat")
        public String sourceStoreFormat;

        @NameInMap("SyncSchema")
        public Boolean syncSchema;

        @NameInMap("SyncSchemaColumnName")
        public String syncSchemaColumnName;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("TableCategory")
        public String tableCategory;

        public static CreateProjectRequestCommonTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestCommonTransferConfig self = new CreateProjectRequestCommonTransferConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestCommonTransferConfig setActiveActive(Boolean activeActive) {
            this.activeActive = activeActive;
            return this;
        }
        public Boolean getActiveActive() {
            return this.activeActive;
        }

        public CreateProjectRequestCommonTransferConfig setCustomColumns(java.util.List<CreateProjectRequestCommonTransferConfigCustomColumns> customColumns) {
            this.customColumns = customColumns;
            return this;
        }
        public java.util.List<CreateProjectRequestCommonTransferConfigCustomColumns> getCustomColumns() {
            return this.customColumns;
        }

        public CreateProjectRequestCommonTransferConfig setDataWorksBusinessName(String dataWorksBusinessName) {
            this.dataWorksBusinessName = dataWorksBusinessName;
            return this;
        }
        public String getDataWorksBusinessName() {
            return this.dataWorksBusinessName;
        }

        public CreateProjectRequestCommonTransferConfig setDatahubTopicType(String datahubTopicType) {
            this.datahubTopicType = datahubTopicType;
            return this;
        }
        public String getDatahubTopicType() {
            return this.datahubTopicType;
        }

        public CreateProjectRequestCommonTransferConfig setMqPartition(Integer mqPartition) {
            this.mqPartition = mqPartition;
            return this;
        }
        public Integer getMqPartition() {
            return this.mqPartition;
        }

        public CreateProjectRequestCommonTransferConfig setMqPartitionMode(String mqPartitionMode) {
            this.mqPartitionMode = mqPartitionMode;
            return this;
        }
        public String getMqPartitionMode() {
            return this.mqPartitionMode;
        }

        public CreateProjectRequestCommonTransferConfig setMqSerializerType(String mqSerializerType) {
            this.mqSerializerType = mqSerializerType;
            return this;
        }
        public String getMqSerializerType() {
            return this.mqSerializerType;
        }

        public CreateProjectRequestCommonTransferConfig setRocketMqEnableMsgTrace(Boolean rocketMqEnableMsgTrace) {
            this.rocketMqEnableMsgTrace = rocketMqEnableMsgTrace;
            return this;
        }
        public Boolean getRocketMqEnableMsgTrace() {
            return this.rocketMqEnableMsgTrace;
        }

        public CreateProjectRequestCommonTransferConfig setRocketMqMsgTags(String rocketMqMsgTags) {
            this.rocketMqMsgTags = rocketMqMsgTags;
            return this;
        }
        public String getRocketMqMsgTags() {
            return this.rocketMqMsgTags;
        }

        public CreateProjectRequestCommonTransferConfig setRocketMqProducerGroup(String rocketMqProducerGroup) {
            this.rocketMqProducerGroup = rocketMqProducerGroup;
            return this;
        }
        public String getRocketMqProducerGroup() {
            return this.rocketMqProducerGroup;
        }

        public CreateProjectRequestCommonTransferConfig setRocketMqSendMsgTimeout(Long rocketMqSendMsgTimeout) {
            this.rocketMqSendMsgTimeout = rocketMqSendMsgTimeout;
            return this;
        }
        public Long getRocketMqSendMsgTimeout() {
            return this.rocketMqSendMsgTimeout;
        }

        public CreateProjectRequestCommonTransferConfig setSinkStoreFormat(String sinkStoreFormat) {
            this.sinkStoreFormat = sinkStoreFormat;
            return this;
        }
        public String getSinkStoreFormat() {
            return this.sinkStoreFormat;
        }

        public CreateProjectRequestCommonTransferConfig setSourceStoreFormat(String sourceStoreFormat) {
            this.sourceStoreFormat = sourceStoreFormat;
            return this;
        }
        public String getSourceStoreFormat() {
            return this.sourceStoreFormat;
        }

        public CreateProjectRequestCommonTransferConfig setSyncSchema(Boolean syncSchema) {
            this.syncSchema = syncSchema;
            return this;
        }
        public Boolean getSyncSchema() {
            return this.syncSchema;
        }

        public CreateProjectRequestCommonTransferConfig setSyncSchemaColumnName(String syncSchemaColumnName) {
            this.syncSchemaColumnName = syncSchemaColumnName;
            return this;
        }
        public String getSyncSchemaColumnName() {
            return this.syncSchemaColumnName;
        }

        public CreateProjectRequestCommonTransferConfig setTableCategory(String tableCategory) {
            this.tableCategory = tableCategory;
            return this;
        }
        public String getTableCategory() {
            return this.tableCategory;
        }

    }

    public static class CreateProjectRequestFullTransferConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>true</p>
         */
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

        public static CreateProjectRequestFullTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestFullTransferConfig self = new CreateProjectRequestFullTransferConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestFullTransferConfig setAllowDestTableNotEmpty(Boolean allowDestTableNotEmpty) {
            this.allowDestTableNotEmpty = allowDestTableNotEmpty;
            return this;
        }
        public Boolean getAllowDestTableNotEmpty() {
            return this.allowDestTableNotEmpty;
        }

        public CreateProjectRequestFullTransferConfig setFullTransferSpeedMode(String fullTransferSpeedMode) {
            this.fullTransferSpeedMode = fullTransferSpeedMode;
            return this;
        }
        public String getFullTransferSpeedMode() {
            return this.fullTransferSpeedMode;
        }

        public CreateProjectRequestFullTransferConfig setFullVerifySpeedMode(String fullVerifySpeedMode) {
            this.fullVerifySpeedMode = fullVerifySpeedMode;
            return this;
        }
        public String getFullVerifySpeedMode() {
            return this.fullVerifySpeedMode;
        }

        public CreateProjectRequestFullTransferConfig setNonePkUkTruncateDstTable(Boolean nonePkUkTruncateDstTable) {
            this.nonePkUkTruncateDstTable = nonePkUkTruncateDstTable;
            return this;
        }
        public Boolean getNonePkUkTruncateDstTable() {
            return this.nonePkUkTruncateDstTable;
        }

        public CreateProjectRequestFullTransferConfig setReadWorkerNum(Integer readWorkerNum) {
            this.readWorkerNum = readWorkerNum;
            return this;
        }
        public Integer getReadWorkerNum() {
            return this.readWorkerNum;
        }

        public CreateProjectRequestFullTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public CreateProjectRequestFullTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        public CreateProjectRequestFullTransferConfig setWriteWorkerNum(Integer writeWorkerNum) {
            this.writeWorkerNum = writeWorkerNum;
            return this;
        }
        public Integer getWriteWorkerNum() {
            return this.writeWorkerNum;
        }

    }

    public static class CreateProjectRequestIncrTransferConfig extends TeaModel {
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
         * <p>1689201369</p>
         */
        @NameInMap("StartTimestamp")
        public String startTimestamp;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("StoreLogKeptHour")
        public Integer storeLogKeptHour;

        @NameInMap("SupportDDLTypes")
        public java.util.List<String> supportDDLTypes;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        public static CreateProjectRequestIncrTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestIncrTransferConfig self = new CreateProjectRequestIncrTransferConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestIncrTransferConfig setEnableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
            this.enableIncrSyncStatistics = enableIncrSyncStatistics;
            return this;
        }
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        public CreateProjectRequestIncrTransferConfig setEnableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
            this.enableSequencingWithinTxn = enableSequencingWithinTxn;
            return this;
        }
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        public CreateProjectRequestIncrTransferConfig setIncrSyncConcurrency(Integer incrSyncConcurrency) {
            this.incrSyncConcurrency = incrSyncConcurrency;
            return this;
        }
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        public CreateProjectRequestIncrTransferConfig setRecordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
            this.recordTypeWhiteList = recordTypeWhiteList;
            return this;
        }
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        public CreateProjectRequestIncrTransferConfig setStartTimestamp(String startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public String getStartTimestamp() {
            return this.startTimestamp;
        }

        public CreateProjectRequestIncrTransferConfig setStoreLogKeptHour(Integer storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public CreateProjectRequestIncrTransferConfig setSupportDDLTypes(java.util.List<String> supportDDLTypes) {
            this.supportDDLTypes = supportDDLTypes;
            return this;
        }
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        public CreateProjectRequestIncrTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public CreateProjectRequestIncrTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

    }

    public static class CreateProjectRequestReverseIncrTransferConfig extends TeaModel {
        @NameInMap("EnableIncrSyncStatistics")
        public Boolean enableIncrSyncStatistics;

        @NameInMap("EnableSequencingWithinTxn")
        public Boolean enableSequencingWithinTxn;

        @NameInMap("IncrSyncConcurrency")
        public Integer incrSyncConcurrency;

        @NameInMap("RecordTypeWhiteList")
        public java.util.List<String> recordTypeWhiteList;

        @NameInMap("StartTimestamp")
        public String startTimestamp;

        @NameInMap("StoreLogKeptHour")
        public Integer storeLogKeptHour;

        @NameInMap("SupportDDLTypes")
        public java.util.List<String> supportDDLTypes;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        public static CreateProjectRequestReverseIncrTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestReverseIncrTransferConfig self = new CreateProjectRequestReverseIncrTransferConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestReverseIncrTransferConfig setEnableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
            this.enableIncrSyncStatistics = enableIncrSyncStatistics;
            return this;
        }
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        public CreateProjectRequestReverseIncrTransferConfig setEnableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
            this.enableSequencingWithinTxn = enableSequencingWithinTxn;
            return this;
        }
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        public CreateProjectRequestReverseIncrTransferConfig setIncrSyncConcurrency(Integer incrSyncConcurrency) {
            this.incrSyncConcurrency = incrSyncConcurrency;
            return this;
        }
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        public CreateProjectRequestReverseIncrTransferConfig setRecordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
            this.recordTypeWhiteList = recordTypeWhiteList;
            return this;
        }
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        public CreateProjectRequestReverseIncrTransferConfig setStartTimestamp(String startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public String getStartTimestamp() {
            return this.startTimestamp;
        }

        public CreateProjectRequestReverseIncrTransferConfig setStoreLogKeptHour(Integer storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public CreateProjectRequestReverseIncrTransferConfig setSupportDDLTypes(java.util.List<String> supportDDLTypes) {
            this.supportDDLTypes = supportDDLTypes;
            return this;
        }
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        public CreateProjectRequestReverseIncrTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public CreateProjectRequestReverseIncrTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

    }

    public static class CreateProjectRequestStructTransferConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DO_NOTHING_IF_BYTE_USED</p>
         */
        @NameInMap("ByteCharConvertStrategy")
        public String byteCharConvertStrategy;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeferIndexCreation")
        public Boolean deferIndexCreation;

        public static CreateProjectRequestStructTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestStructTransferConfig self = new CreateProjectRequestStructTransferConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestStructTransferConfig setByteCharConvertStrategy(String byteCharConvertStrategy) {
            this.byteCharConvertStrategy = byteCharConvertStrategy;
            return this;
        }
        public String getByteCharConvertStrategy() {
            return this.byteCharConvertStrategy;
        }

        public CreateProjectRequestStructTransferConfig setDeferIndexCreation(Boolean deferIndexCreation) {
            this.deferIndexCreation = deferIndexCreation;
            return this;
        }
        public Boolean getDeferIndexCreation() {
            return this.deferIndexCreation;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_4azdil4lu7***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_table</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&lt;5</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesSpecificTables self = new CreateProjectRequestTransferMappingDatabasesSpecificTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTables setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_3wsmjv49a***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_view</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>view_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&lt;5</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesSpecificViews self = new CreateProjectRequestTransferMappingDatabasesSpecificViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViews setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_4l085bu7***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_table</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id &gt; 1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesTables self = new CreateProjectRequestTransferMappingDatabasesTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesTables setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_4himpq4z***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_view</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>view_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&gt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesViews self = new CreateProjectRequestTransferMappingDatabasesViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesViews setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabases extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cluster_name</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>gez3***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_db</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>db_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesTables> tables;

        /**
         * <strong>example:</strong>
         * <p>tenant_name</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Views")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesViews> views;

        public static CreateProjectRequestTransferMappingDatabases build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabases self = new CreateProjectRequestTransferMappingDatabases();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabases setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateProjectRequestTransferMappingDatabases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabases setSpecificTables(java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public CreateProjectRequestTransferMappingDatabases setSpecificViews(java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public CreateProjectRequestTransferMappingDatabases setTables(java.util.List<CreateProjectRequestTransferMappingDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesTables> getTables() {
            return this.tables;
        }

        public CreateProjectRequestTransferMappingDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public CreateProjectRequestTransferMappingDatabases setViews(java.util.List<CreateProjectRequestTransferMappingDatabasesViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesViews> getViews() {
            return this.views;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_4himpq4zf***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_table</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&lt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesBlackSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackSpecificTables self = new CreateProjectRequestTransferMappingDatabasesBlackSpecificTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTables setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_474hmh5iqo***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_table</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&lt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesBlackSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackSpecificViews self = new CreateProjectRequestTransferMappingDatabasesBlackSpecificViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViews setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_474hmh5iqo***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_table</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&lt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesBlackTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackTables self = new CreateProjectRequestTransferMappingDatabasesBlackTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTables setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesBlackTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema self = new CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlackViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>e_4azdil4lu7mo</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_view</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>view_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&lt;5</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectRequestTransferMappingDatabasesBlackViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlackViews self = new CreateProjectRequestTransferMappingDatabasesBlackViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViews setAdbTableSchema(CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectRequestTransferMappingDatabasesBlackViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectRequestTransferMappingDatabasesBlackViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectRequestTransferMappingDatabasesBlack extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cluster_name</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>e_3y6v5v1x94f4</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mapped_db</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>db_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackTables> tables;

        /**
         * <strong>example:</strong>
         * <p>tenant_name</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Views")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackViews> views;

        public static CreateProjectRequestTransferMappingDatabasesBlack build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMappingDatabasesBlack self = new CreateProjectRequestTransferMappingDatabasesBlack();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setSpecificTables(java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setSpecificViews(java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setTables(java.util.List<CreateProjectRequestTransferMappingDatabasesBlackTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackTables> getTables() {
            return this.tables;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public CreateProjectRequestTransferMappingDatabasesBlack setViews(java.util.List<CreateProjectRequestTransferMappingDatabasesBlackViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackViews> getViews() {
            return this.views;
        }

    }

    public static class CreateProjectRequestTransferMapping extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<CreateProjectRequestTransferMappingDatabases> databases;

        @NameInMap("DatabasesBlack")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlack> databasesBlack;

        /**
         * <strong>example:</strong>
         * <p>SPCEIFIC</p>
         */
        @NameInMap("Mode")
        public String mode;

        @NameInMap("TableAndViewBlackList")
        public java.util.List<String> tableAndViewBlackList;

        @NameInMap("TableAndViewWhiteList")
        public java.util.List<String> tableAndViewWhiteList;

        public static CreateProjectRequestTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTransferMapping self = new CreateProjectRequestTransferMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTransferMapping setDatabases(java.util.List<CreateProjectRequestTransferMappingDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        public CreateProjectRequestTransferMapping setDatabasesBlack(java.util.List<CreateProjectRequestTransferMappingDatabasesBlack> databasesBlack) {
            this.databasesBlack = databasesBlack;
            return this;
        }
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlack> getDatabasesBlack() {
            return this.databasesBlack;
        }

        public CreateProjectRequestTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateProjectRequestTransferMapping setTableAndViewBlackList(java.util.List<String> tableAndViewBlackList) {
            this.tableAndViewBlackList = tableAndViewBlackList;
            return this;
        }
        public java.util.List<String> getTableAndViewBlackList() {
            return this.tableAndViewBlackList;
        }

        public CreateProjectRequestTransferMapping setTableAndViewWhiteList(java.util.List<String> tableAndViewWhiteList) {
            this.tableAndViewWhiteList = tableAndViewWhiteList;
            return this;
        }
        public java.util.List<String> getTableAndViewWhiteList() {
            return this.tableAndViewWhiteList;
        }

    }

}
