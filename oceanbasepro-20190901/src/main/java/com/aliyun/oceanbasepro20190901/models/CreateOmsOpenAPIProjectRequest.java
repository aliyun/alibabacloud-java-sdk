// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsOpenAPIProjectRequest extends TeaModel {
    @NameInMap("BusinessName")
    public String businessName;

    @NameInMap("DestConfig")
    public CreateOmsOpenAPIProjectRequestDestConfig destConfig;

    @NameInMap("LabelIds")
    public java.util.List<String> labelIds;

    /**
     * <p>页序号，分页查询时生效</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>页大小，分页查询时生效</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceConfig")
    public CreateOmsOpenAPIProjectRequestSourceConfig sourceConfig;

    @NameInMap("TransferMapping")
    public CreateOmsOpenAPIProjectRequestTransferMapping transferMapping;

    @NameInMap("TransferStepConfig")
    public CreateOmsOpenAPIProjectRequestTransferStepConfig transferStepConfig;

    /**
     * <p>实例规格 ID，创建项目时生效</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static CreateOmsOpenAPIProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsOpenAPIProjectRequest self = new CreateOmsOpenAPIProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsOpenAPIProjectRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public CreateOmsOpenAPIProjectRequest setDestConfig(CreateOmsOpenAPIProjectRequestDestConfig destConfig) {
        this.destConfig = destConfig;
        return this;
    }
    public CreateOmsOpenAPIProjectRequestDestConfig getDestConfig() {
        return this.destConfig;
    }

    public CreateOmsOpenAPIProjectRequest setLabelIds(java.util.List<String> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public java.util.List<String> getLabelIds() {
        return this.labelIds;
    }

    public CreateOmsOpenAPIProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CreateOmsOpenAPIProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateOmsOpenAPIProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOmsOpenAPIProjectRequest setSourceConfig(CreateOmsOpenAPIProjectRequestSourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public CreateOmsOpenAPIProjectRequestSourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    public CreateOmsOpenAPIProjectRequest setTransferMapping(CreateOmsOpenAPIProjectRequestTransferMapping transferMapping) {
        this.transferMapping = transferMapping;
        return this;
    }
    public CreateOmsOpenAPIProjectRequestTransferMapping getTransferMapping() {
        return this.transferMapping;
    }

    public CreateOmsOpenAPIProjectRequest setTransferStepConfig(CreateOmsOpenAPIProjectRequestTransferStepConfig transferStepConfig) {
        this.transferStepConfig = transferStepConfig;
        return this;
    }
    public CreateOmsOpenAPIProjectRequestTransferStepConfig getTransferStepConfig() {
        return this.transferStepConfig;
    }

    public CreateOmsOpenAPIProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

    public static class CreateOmsOpenAPIProjectRequestDestConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("MsgTags")
        public String msgTags;

        @NameInMap("Partition")
        public Integer partition;

        @NameInMap("PartitionMode")
        public String partitionMode;

        @NameInMap("ProducerGroup")
        public String producerGroup;

        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        public String serializerType;

        @NameInMap("TopicType")
        public String topicType;

        public static CreateOmsOpenAPIProjectRequestDestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestDestConfig self = new CreateOmsOpenAPIProjectRequestDestConfig();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public CreateOmsOpenAPIProjectRequestDestConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class CreateOmsOpenAPIProjectRequestSourceConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("MsgTags")
        public String msgTags;

        @NameInMap("Partition")
        public Integer partition;

        @NameInMap("PartitionMode")
        public String partitionMode;

        @NameInMap("ProducerGroup")
        public String producerGroup;

        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        public String serializerType;

        @NameInMap("TopicType")
        public String topicType;

        public static CreateOmsOpenAPIProjectRequestSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestSourceConfig self = new CreateOmsOpenAPIProjectRequestSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public CreateOmsOpenAPIProjectRequestSourceConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema self = new CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Type")
        public String type;

        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables self = new CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setAdbTableSchema(CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateOmsOpenAPIProjectRequestTransferMappingDatabases extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Tables")
        public java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Type")
        public String type;

        public static CreateOmsOpenAPIProjectRequestTransferMappingDatabases build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestTransferMappingDatabases self = new CreateOmsOpenAPIProjectRequestTransferMappingDatabases();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabases setTables(java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables> getTables() {
            return this.tables;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public CreateOmsOpenAPIProjectRequestTransferMappingDatabases setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOmsOpenAPIProjectRequestTransferMapping extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabases> databases;

        @NameInMap("Mode")
        public String mode;

        public static CreateOmsOpenAPIProjectRequestTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestTransferMapping self = new CreateOmsOpenAPIProjectRequestTransferMapping();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestTransferMapping setDatabases(java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        public CreateOmsOpenAPIProjectRequestTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig extends TeaModel {
        @NameInMap("RecordTypeList")
        public java.util.List<String> recordTypeList;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        @NameInMap("StoreLogKeptHour")
        public Long storeLogKeptHour;

        @NameInMap("StoreTransactionEnabled")
        public Boolean storeTransactionEnabled;

        @NameInMap("TransferStepType")
        public String transferStepType;

        public static CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig self = new CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig setRecordTypeList(java.util.List<String> recordTypeList) {
            this.recordTypeList = recordTypeList;
            return this;
        }
        public java.util.List<String> getRecordTypeList() {
            return this.recordTypeList;
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig setStoreLogKeptHour(Long storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Long getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig setStoreTransactionEnabled(Boolean storeTransactionEnabled) {
            this.storeTransactionEnabled = storeTransactionEnabled;
            return this;
        }
        public Boolean getStoreTransactionEnabled() {
            return this.storeTransactionEnabled;
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig setTransferStepType(String transferStepType) {
            this.transferStepType = transferStepType;
            return this;
        }
        public String getTransferStepType() {
            return this.transferStepType;
        }

    }

    public static class CreateOmsOpenAPIProjectRequestTransferStepConfig extends TeaModel {
        @NameInMap("EnableFullSync")
        public Boolean enableFullSync;

        @NameInMap("EnableIncrSync")
        public Boolean enableIncrSync;

        @NameInMap("EnableStructSync")
        public Boolean enableStructSync;

        @NameInMap("IncrSyncStepTransferConfig")
        public CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig;

        public static CreateOmsOpenAPIProjectRequestTransferStepConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectRequestTransferStepConfig self = new CreateOmsOpenAPIProjectRequestTransferStepConfig();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfig setEnableFullSync(Boolean enableFullSync) {
            this.enableFullSync = enableFullSync;
            return this;
        }
        public Boolean getEnableFullSync() {
            return this.enableFullSync;
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfig setEnableIncrSync(Boolean enableIncrSync) {
            this.enableIncrSync = enableIncrSync;
            return this;
        }
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfig setEnableStructSync(Boolean enableStructSync) {
            this.enableStructSync = enableStructSync;
            return this;
        }
        public Boolean getEnableStructSync() {
            return this.enableStructSync;
        }

        public CreateOmsOpenAPIProjectRequestTransferStepConfig setIncrSyncStepTransferConfig(CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig) {
            this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
            return this;
        }
        public CreateOmsOpenAPIProjectRequestTransferStepConfigIncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
            return this.incrSyncStepTransferConfig;
        }

    }

}
