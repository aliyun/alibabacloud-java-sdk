// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateProjectModifyRecordsRequest extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<CreateProjectModifyRecordsRequestDatabases> databases;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np_fe****</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("TransferMapping")
    public CreateProjectModifyRecordsRequestTransferMapping transferMapping;

    public static CreateProjectModifyRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectModifyRecordsRequest self = new CreateProjectModifyRecordsRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectModifyRecordsRequest setDatabases(java.util.List<CreateProjectModifyRecordsRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<CreateProjectModifyRecordsRequestDatabases> getDatabases() {
        return this.databases;
    }

    public CreateProjectModifyRecordsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateProjectModifyRecordsRequest setTransferMapping(CreateProjectModifyRecordsRequestTransferMapping transferMapping) {
        this.transferMapping = transferMapping;
        return this;
    }
    public CreateProjectModifyRecordsRequestTransferMapping getTransferMapping() {
        return this.transferMapping;
    }

    public static class CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema extends TeaModel {
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

        public static CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>table_id</p>
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

        public static CreateProjectModifyRecordsRequestDatabasesSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesSpecificTables self = new CreateProjectModifyRecordsRequestDatabasesSpecificTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTables setAdbTableSchema(CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema extends TeaModel {
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

        public static CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>view_id</p>
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
         * <p>id &lt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectModifyRecordsRequestDatabasesSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesSpecificViews self = new CreateProjectModifyRecordsRequestDatabasesSpecificViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViews setAdbTableSchema(CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestDatabasesSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema extends TeaModel {
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

        public static CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig extends TeaModel {
        @NameInMap("PartitionSize")
        public Integer partitionSize;

        @NameInMap("PartitionType")
        public String partitionType;

        @NameInMap("VirtualColumn")
        public String virtualColumn;

        public static CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig self = new CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig setPartitionSize(Integer partitionSize) {
            this.partitionSize = partitionSize;
            return this;
        }
        public Integer getPartitionSize() {
            return this.partitionSize;
        }

        public CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig setVirtualColumn(String virtualColumn) {
            this.virtualColumn = virtualColumn;
            return this;
        }
        public String getVirtualColumn() {
            return this.virtualColumn;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>table_id</p>
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

        @NameInMap("ObkvPartitionConfig")
        public CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig obkvPartitionConfig;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>id&lt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectModifyRecordsRequestDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesTables self = new CreateProjectModifyRecordsRequestDatabasesTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setAdbTableSchema(CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setObkvPartitionConfig(CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig obkvPartitionConfig) {
            this.obkvPartitionConfig = obkvPartitionConfig;
            return this;
        }
        public CreateProjectModifyRecordsRequestDatabasesTablesObkvPartitionConfig getObkvPartitionConfig() {
            return this.obkvPartitionConfig;
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema extends TeaModel {
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

        public static CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabasesViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>view_id</p>
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
         * <p>id&lt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectModifyRecordsRequestDatabasesViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabasesViews self = new CreateProjectModifyRecordsRequestDatabasesViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabasesViews setAdbTableSchema(CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestDatabasesViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestDatabasesViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestDatabasesViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestDatabasesViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestDatabasesViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestDatabasesViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestDatabases extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>db_id</p>
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
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesTables> tables;

        @NameInMap("Views")
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesViews> views;

        public static CreateProjectModifyRecordsRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestDatabases self = new CreateProjectModifyRecordsRequestDatabases();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestDatabases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestDatabases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestDatabases setSpecificTables(java.util.List<CreateProjectModifyRecordsRequestDatabasesSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public CreateProjectModifyRecordsRequestDatabases setSpecificViews(java.util.List<CreateProjectModifyRecordsRequestDatabasesSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public CreateProjectModifyRecordsRequestDatabases setTables(java.util.List<CreateProjectModifyRecordsRequestDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesTables> getTables() {
            return this.tables;
        }

        public CreateProjectModifyRecordsRequestDatabases setViews(java.util.List<CreateProjectModifyRecordsRequestDatabasesViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestDatabasesViews> getViews() {
            return this.views;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping self = new CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping self = new CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingBlackTableRules extends TeaModel {
        @NameInMap("ObjectMapping")
        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping objectMapping;

        @NameInMap("SchemaMapping")
        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping schemaMapping;

        public static CreateProjectModifyRecordsRequestTransferMappingBlackTableRules build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingBlackTableRules self = new CreateProjectModifyRecordsRequestTransferMappingBlackTableRules();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRules setObjectMapping(CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping objectMapping) {
            this.objectMapping = objectMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRules setSchemaMapping(CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping schemaMapping) {
            this.schemaMapping = schemaMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingBlackTableRulesSchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping self = new CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping self = new CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingBlackViewRules extends TeaModel {
        @NameInMap("ObjectMapping")
        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping objectMapping;

        @NameInMap("SchemaMapping")
        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping schemaMapping;

        public static CreateProjectModifyRecordsRequestTransferMappingBlackViewRules build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingBlackViewRules self = new CreateProjectModifyRecordsRequestTransferMappingBlackViewRules();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRules setObjectMapping(CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping objectMapping) {
            this.objectMapping = objectMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRules setSchemaMapping(CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping schemaMapping) {
            this.schemaMapping = schemaMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingBlackViewRulesSchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig extends TeaModel {
        @NameInMap("PartitionSize")
        public Integer partitionSize;

        @NameInMap("PartitionType")
        public String partitionType;

        @NameInMap("VirtualColumn")
        public String virtualColumn;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig setPartitionSize(Integer partitionSize) {
            this.partitionSize = partitionSize;
            return this;
        }
        public Integer getPartitionSize() {
            return this.partitionSize;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig setVirtualColumn(String virtualColumn) {
            this.virtualColumn = virtualColumn;
            return this;
        }
        public String getVirtualColumn() {
            return this.virtualColumn;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObkvPartitionConfig")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig obkvPartitionConfig;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesTables self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setObkvPartitionConfig(CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig obkvPartitionConfig) {
            this.obkvPartitionConfig = obkvPartitionConfig;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTablesObkvPartitionConfig getObkvPartitionConfig() {
            return this.obkvPartitionConfig;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesViews self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViews setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabases extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Views")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesViews> views;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabases build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabases self = new CreateProjectModifyRecordsRequestTransferMappingDatabases();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setSpecificTables(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setSpecificViews(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setTables(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesTables> getTables() {
            return this.tables;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabases setViews(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesViews> getViews() {
            return this.views;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Views")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews> views;

        public static CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack self = new CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setSpecificTables(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setSpecificViews(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setTables(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackTables> getTables() {
            return this.tables;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack setViews(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlackViews> getViews() {
            return this.views;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables self = new CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews self = new CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig extends TeaModel {
        @NameInMap("PartitionSize")
        public Integer partitionSize;

        @NameInMap("PartitionType")
        public String partitionType;

        @NameInMap("VirtualColumn")
        public String virtualColumn;

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig self = new CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig setPartitionSize(Integer partitionSize) {
            this.partitionSize = partitionSize;
            return this;
        }
        public Integer getPartitionSize() {
            return this.partitionSize;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig setVirtualColumn(String virtualColumn) {
            this.virtualColumn = virtualColumn;
            return this;
        }
        public String getVirtualColumn() {
            return this.virtualColumn;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObkvPartitionConfig")
        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig obkvPartitionConfig;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("WhereClause")
        public String whereClause;

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasTables build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasTables self = new CreateProjectModifyRecordsRequestTransferMappingSchemasTables();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setObkvPartitionConfig(CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig obkvPartitionConfig) {
            this.obkvPartitionConfig = obkvPartitionConfig;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingSchemasTablesObkvPartitionConfig getObkvPartitionConfig() {
            return this.obkvPartitionConfig;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema self = new CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema setPartitionLifeCycle(String partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemasViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema adbTableSchema;

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

        public static CreateProjectModifyRecordsRequestTransferMappingSchemasViews build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemasViews self = new CreateProjectModifyRecordsRequestTransferMappingSchemasViews();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViews setAdbTableSchema(CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingSchemasViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemasViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingSchemas extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpecificTables")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Views")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasViews> views;

        public static CreateProjectModifyRecordsRequestTransferMappingSchemas build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingSchemas self = new CreateProjectModifyRecordsRequestTransferMappingSchemas();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setSpecificTables(java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setSpecificViews(java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setTables(java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasTables> getTables() {
            return this.tables;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingSchemas setViews(java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemasViews> getViews() {
            return this.views;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping self = new CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping self = new CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules extends TeaModel {
        @NameInMap("ObjectMapping")
        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping objectMapping;

        @NameInMap("SchemaMapping")
        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping schemaMapping;

        public static CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules self = new CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules setObjectMapping(CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping objectMapping) {
            this.objectMapping = objectMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules setSchemaMapping(CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping schemaMapping) {
            this.schemaMapping = schemaMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingWhiteTableRulesSchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping self = new CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping extends TeaModel {
        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Name")
        public String name;

        public static CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping self = new CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules extends TeaModel {
        @NameInMap("ObjectMapping")
        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping objectMapping;

        @NameInMap("SchemaMapping")
        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping schemaMapping;

        public static CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules self = new CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules setObjectMapping(CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping objectMapping) {
            this.objectMapping = objectMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules setSchemaMapping(CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping schemaMapping) {
            this.schemaMapping = schemaMapping;
            return this;
        }
        public CreateProjectModifyRecordsRequestTransferMappingWhiteViewRulesSchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

    }

    public static class CreateProjectModifyRecordsRequestTransferMapping extends TeaModel {
        @NameInMap("BlackTableRules")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingBlackTableRules> blackTableRules;

        @NameInMap("BlackViewRules")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingBlackViewRules> blackViewRules;

        @NameInMap("Databases")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabases> databases;

        @NameInMap("DatabasesBlack")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack> databasesBlack;

        /**
         * <strong>example:</strong>
         * <p>SPCEIFIC</p>
         */
        @NameInMap("Mode")
        public String mode;

        @NameInMap("Schemas")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemas> schemas;

        @NameInMap("TableAndViewBlackList")
        public java.util.List<String> tableAndViewBlackList;

        @NameInMap("TableAndViewWhiteList")
        public java.util.List<String> tableAndViewWhiteList;

        @NameInMap("WhiteTableRules")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules> whiteTableRules;

        @NameInMap("WhiteViewRules")
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules> whiteViewRules;

        public static CreateProjectModifyRecordsRequestTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectModifyRecordsRequestTransferMapping self = new CreateProjectModifyRecordsRequestTransferMapping();
            return TeaModel.build(map, self);
        }

        public CreateProjectModifyRecordsRequestTransferMapping setBlackTableRules(java.util.List<CreateProjectModifyRecordsRequestTransferMappingBlackTableRules> blackTableRules) {
            this.blackTableRules = blackTableRules;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingBlackTableRules> getBlackTableRules() {
            return this.blackTableRules;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setBlackViewRules(java.util.List<CreateProjectModifyRecordsRequestTransferMappingBlackViewRules> blackViewRules) {
            this.blackViewRules = blackViewRules;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingBlackViewRules> getBlackViewRules() {
            return this.blackViewRules;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setDatabases(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setDatabasesBlack(java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack> databasesBlack) {
            this.databasesBlack = databasesBlack;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingDatabasesBlack> getDatabasesBlack() {
            return this.databasesBlack;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setSchemas(java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemas> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingSchemas> getSchemas() {
            return this.schemas;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setTableAndViewBlackList(java.util.List<String> tableAndViewBlackList) {
            this.tableAndViewBlackList = tableAndViewBlackList;
            return this;
        }
        public java.util.List<String> getTableAndViewBlackList() {
            return this.tableAndViewBlackList;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setTableAndViewWhiteList(java.util.List<String> tableAndViewWhiteList) {
            this.tableAndViewWhiteList = tableAndViewWhiteList;
            return this;
        }
        public java.util.List<String> getTableAndViewWhiteList() {
            return this.tableAndViewWhiteList;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setWhiteTableRules(java.util.List<CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules> whiteTableRules) {
            this.whiteTableRules = whiteTableRules;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingWhiteTableRules> getWhiteTableRules() {
            return this.whiteTableRules;
        }

        public CreateProjectModifyRecordsRequestTransferMapping setWhiteViewRules(java.util.List<CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules> whiteViewRules) {
            this.whiteViewRules = whiteViewRules;
            return this;
        }
        public java.util.List<CreateProjectModifyRecordsRequestTransferMappingWhiteViewRules> getWhiteViewRules() {
            return this.whiteViewRules;
        }

    }

}
