// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsOpenAPIProjectRequest extends TeaModel {
    /**
     * <p>The business system identifier, which is optional and is a specific field of the Post message.</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>The settings of the destination data source.</p>
     */
    @NameInMap("DestConfig")
    public CreateOmsOpenAPIProjectRequestDestConfig destConfig;

    /**
     * <p>A collection of label IDs.</p>
     */
    @NameInMap("LabelIds")
    public java.util.List<String> labelIds;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the project.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The settings of the source data source.</p>
     */
    @NameInMap("SourceConfig")
    public CreateOmsOpenAPIProjectRequestSourceConfig sourceConfig;

    /**
     * <p>The mappings for the synchronization objects.</p>
     */
    @NameInMap("TransferMapping")
    public CreateOmsOpenAPIProjectRequestTransferMapping transferMapping;

    /**
     * <p>The settings of synchronization steps.</p>
     */
    @NameInMap("TransferStepConfig")
    public CreateOmsOpenAPIProjectRequestTransferStepConfig transferStepConfig;

    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
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
        /**
         * <p>Specifies whether to enable message tracing when the destination data source is RocketMQ.</p>
         */
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The tag of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("MsgTags")
        public String msgTags;

        /**
         * <p>The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.</p>
         */
        @NameInMap("Partition")
        public Integer partition;

        /**
         * <p>The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.</p>
         */
        @NameInMap("PartitionMode")
        public String partitionMode;

        /**
         * <p>The producer group of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("ProducerGroup")
        public String producerGroup;

        /**
         * <p>The timeout period for a single Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        /**
         * <p>Specifies whether to enable message sequencing when the destination data source is DataHub.</p>
         */
        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        /**
         * <p>The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.</p>
         */
        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        /**
         * <p>The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, Canal, Dataworks, SharePlex, and DefaultExtendColumnType.</p>
         */
        @NameInMap("SerializerType")
        public String serializerType;

        /**
         * <p>The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.</p>
         */
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
        /**
         * <p>Specifies whether to enable message tracing when the destination data source is RocketMQ.</p>
         */
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The tag of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("MsgTags")
        public String msgTags;

        /**
         * <p>The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.</p>
         */
        @NameInMap("Partition")
        public Integer partition;

        /**
         * <p>The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.</p>
         */
        @NameInMap("PartitionMode")
        public String partitionMode;

        /**
         * <p>The producer group of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("ProducerGroup")
        public String producerGroup;

        /**
         * <p>The timeout period for a single Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        /**
         * <p>Specifies whether to enable message sequencing when the destination data source is DataHub.</p>
         */
        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        /**
         * <p>The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.</p>
         */
        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        /**
         * <p>The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, Canal, Dataworks, SharePlex, and DefaultExtendColumnType.</p>
         */
        @NameInMap("SerializerType")
        public String serializerType;

        /**
         * <p>The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.</p>
         */
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
        /**
         * <p>The list of distribution key columns.</p>
         */
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <p>The lifecycle of the table.</p>
         */
        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        /**
         * <p>The partitioning expression.</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        /**
         * <p>The list of primary key columns.</p>
         */
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
        /**
         * <p>The schema of the ADB table. If the destination data source is ADB, you need to configure additional information for schema synchronization.</p>
         */
        @NameInMap("AdbTableSchema")
        public CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        /**
         * <p>The list of filter columns, which are the columns to be synchronized.</p>
         */
        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <p>The name of the mapped-to table or topic. If the destination data source is a database, this parameter specifies the name of the mapped-to table. If the destination data source is a message queue system, this parameter specifies the name of the mapped-to topic.</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <p>The list of sharding key columns. This parameter applies to scenarios where the destination data source is a message queue system.</p>
         */
        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <p>The ID of the table. This parameter takes effect when the source data source is IDB.</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>Valid values: DATABASE and TABLE.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The row filter conditions.</p>
         */
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
        /**
         * <p>The ID of the database. This parameter takes effect when the source data source is IDB.</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The mapped-to database. This parameter takes effect when the destination data source is a database.</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <p>The settings for the target table objects in the current database.</p>
         */
        @NameInMap("Tables")
        public java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabasesTables> tables;

        /**
         * <p>The mapped-to tenant. This parameter takes effect when the source data source is OceanBase Database.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>Valid values: DATABASE and TABLE.</p>
         */
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
        /**
         * <p>The table mapping in the source data source, which is a conventional mapping scheme and takes effect only when Mode is set to NORMAL.</p>
         */
        @NameInMap("Databases")
        public java.util.List<CreateOmsOpenAPIProjectRequestTransferMappingDatabases> databases;

        /**
         * <p>The mapping type. Valid values: \"NORMAL\" and \"WHITE_AND_BLACK_LIST\".</p>
         */
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
        /**
         * <p>The list of data types of incremental data synchronized in incremental synchronization.</p>
         */
        @NameInMap("RecordTypeList")
        public java.util.List<String> recordTypeList;

        /**
         * <p>The start time for incremental synchronization. The value is a timestamp in seconds.</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The retention time of logs when incremental synchronization is enabled and the incremental log pull component is Store.</p>
         */
        @NameInMap("StoreLogKeptHour")
        public Long storeLogKeptHour;

        /**
         * <p>Specifies whether to enable intra-transaction sequencing when incremental synchronization is enabled and the incremental log pull component is Store.</p>
         */
        @NameInMap("StoreTransactionEnabled")
        public Boolean storeTransactionEnabled;

        /**
         * <p>Valid values: STRUCT, FULL, and INCR.</p>
         */
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
        /**
         * <p>Specifies whether to enable full migration.</p>
         */
        @NameInMap("EnableFullSync")
        public Boolean enableFullSync;

        /**
         * <p>Specifies whether to enable incremental synchronization.</p>
         */
        @NameInMap("EnableIncrSync")
        public Boolean enableIncrSync;

        /**
         * <p>Specifies whether to enable schema synchronization.</p>
         */
        @NameInMap("EnableStructSync")
        public Boolean enableStructSync;

        /**
         * <p>The settings of incremental synchronization steps.</p>
         */
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
