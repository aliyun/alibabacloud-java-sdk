// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("CommonTransferConfig")
    public CreateProjectRequestCommonTransferConfig commonTransferConfig;

    @NameInMap("EnableFullTransfer")
    public Boolean enableFullTransfer;

    @NameInMap("EnableFullVerify")
    public Boolean enableFullVerify;

    @NameInMap("EnableIncrTransfer")
    public Boolean enableIncrTransfer;

    @NameInMap("EnableReverseIncrTransfer")
    public Boolean enableReverseIncrTransfer;

    @NameInMap("EnableStructTransfer")
    public Boolean enableStructTransfer;

    @NameInMap("FullTransferConfig")
    public CreateProjectRequestFullTransferConfig fullTransferConfig;

    @NameInMap("IncrTransferConfig")
    public CreateProjectRequestIncrTransferConfig incrTransferConfig;

    @NameInMap("LabelIds")
    public java.util.List<String> labelIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("SinkEndpointId")
    public String sinkEndpointId;

    @NameInMap("SourceEndpointId")
    public String sourceEndpointId;

    @NameInMap("StructTransferConfig")
    public CreateProjectRequestStructTransferConfig structTransferConfig;

    @NameInMap("TransferMapping")
    public CreateProjectRequestTransferMapping transferMapping;

    @NameInMap("Type")
    public String type;

    @NameInMap("UseOss")
    public Boolean useOss;

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

    public static class CreateProjectRequestCommonTransferConfig extends TeaModel {
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

        public CreateProjectRequestCommonTransferConfig setTableCategory(String tableCategory) {
            this.tableCategory = tableCategory;
            return this;
        }
        public String getTableCategory() {
            return this.tableCategory;
        }

    }

    public static class CreateProjectRequestFullTransferConfig extends TeaModel {
        @NameInMap("AllowDestTableNotEmpty")
        public Boolean allowDestTableNotEmpty;

        @NameInMap("FullTransferSpeedMode")
        public String fullTransferSpeedMode;

        @NameInMap("FullVerifySpeedMode")
        public String fullVerifySpeedMode;

        @NameInMap("NonePkUkTruncateDstTable")
        public Boolean nonePkUkTruncateDstTable;

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

    }

    public static class CreateProjectRequestIncrTransferConfig extends TeaModel {
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

    }

    public static class CreateProjectRequestStructTransferConfig extends TeaModel {
        @NameInMap("ByteCharConvertStrategy")
        public String byteCharConvertStrategy;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesTables> tables;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectRequestTransferMappingDatabasesBlackTables> tables;

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
