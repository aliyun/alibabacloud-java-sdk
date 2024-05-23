// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateProjectModifyRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Databases")
    public java.util.List<CreateProjectModifyRecordsRequestDatabases> databases;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

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

    public static class CreateProjectModifyRecordsRequestDatabasesSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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

    public static class CreateProjectModifyRecordsRequestDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public CreateProjectModifyRecordsRequestDatabasesTablesAdbTableSchema adbTableSchema;

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

        @NameInMap("PartitionLifeCycle")
        public String partitionLifeCycle;

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
        @NameInMap("Id")
        public String id;

        @NameInMap("MappedName")
        public String mappedName;

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

}
