// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DataExtraInfoSubDbsValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cluster_name</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>tenant_name</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DatabaseId")
    public String databaseId;

    /**
     * <strong>example:</strong>
     * <p>db_name</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>mapped_db</p>
     */
    @NameInMap("MappingDatabaseName")
    public String mappingDatabaseName;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("SourceClientId")
    public String sourceClientId;

    @NameInMap("Tables")
    public java.util.List<DataExtraInfoSubDbsValueTables> tables;

    public static DataExtraInfoSubDbsValue build(java.util.Map<String, ?> map) throws Exception {
        DataExtraInfoSubDbsValue self = new DataExtraInfoSubDbsValue();
        return TeaModel.build(map, self);
    }

    public DataExtraInfoSubDbsValue setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DataExtraInfoSubDbsValue setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public DataExtraInfoSubDbsValue setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public DataExtraInfoSubDbsValue setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DataExtraInfoSubDbsValue setMappingDatabaseName(String mappingDatabaseName) {
        this.mappingDatabaseName = mappingDatabaseName;
        return this;
    }
    public String getMappingDatabaseName() {
        return this.mappingDatabaseName;
    }

    public DataExtraInfoSubDbsValue setSourceClientId(String sourceClientId) {
        this.sourceClientId = sourceClientId;
        return this;
    }
    public String getSourceClientId() {
        return this.sourceClientId;
    }

    public DataExtraInfoSubDbsValue setTables(java.util.List<DataExtraInfoSubDbsValueTables> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<DataExtraInfoSubDbsValueTables> getTables() {
        return this.tables;
    }

    public static class DataExtraInfoSubDbsValueTablesColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Position")
        public Integer position;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RecordFieldType")
        public String recordFieldType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RawColumnType")
        public String rawColumnType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ColumnKey")
        public String columnKey;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Nullable")
        public Boolean nullable;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DataLength")
        public Long dataLength;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DataScale")
        public Integer dataScale;

        /**
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <strong>example:</strong>
         * <p>comments</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsGenerateField")
        public Boolean isGenerateField;

        public static DataExtraInfoSubDbsValueTablesColumns build(java.util.Map<String, ?> map) throws Exception {
            DataExtraInfoSubDbsValueTablesColumns self = new DataExtraInfoSubDbsValueTablesColumns();
            return TeaModel.build(map, self);
        }

        public DataExtraInfoSubDbsValueTablesColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DataExtraInfoSubDbsValueTablesColumns setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public DataExtraInfoSubDbsValueTablesColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public DataExtraInfoSubDbsValueTablesColumns setRecordFieldType(String recordFieldType) {
            this.recordFieldType = recordFieldType;
            return this;
        }
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        public DataExtraInfoSubDbsValueTablesColumns setRawColumnType(String rawColumnType) {
            this.rawColumnType = rawColumnType;
            return this;
        }
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        public DataExtraInfoSubDbsValueTablesColumns setColumnKey(String columnKey) {
            this.columnKey = columnKey;
            return this;
        }
        public String getColumnKey() {
            return this.columnKey;
        }

        public DataExtraInfoSubDbsValueTablesColumns setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public DataExtraInfoSubDbsValueTablesColumns setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DataExtraInfoSubDbsValueTablesColumns setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public DataExtraInfoSubDbsValueTablesColumns setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public DataExtraInfoSubDbsValueTablesColumns setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public DataExtraInfoSubDbsValueTablesColumns setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DataExtraInfoSubDbsValueTablesColumns setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public DataExtraInfoSubDbsValueTablesColumns setIsGenerateField(Boolean isGenerateField) {
            this.isGenerateField = isGenerateField;
            return this;
        }
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

    }

    public static class DataExtraInfoSubDbsValueTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fexg***</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <strong>example:</strong>
         * <p>db_name</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>mapped_table</p>
         */
        @NameInMap("MappingTableName")
        public String mappingTableName;

        /**
         * <strong>example:</strong>
         * <p>g_i4kat***</p>
         */
        @NameInMap("Instance")
        public String instance;

        @NameInMap("Columns")
        public java.util.List<DataExtraInfoSubDbsValueTablesColumns> columns;

        public static DataExtraInfoSubDbsValueTables build(java.util.Map<String, ?> map) throws Exception {
            DataExtraInfoSubDbsValueTables self = new DataExtraInfoSubDbsValueTables();
            return TeaModel.build(map, self);
        }

        public DataExtraInfoSubDbsValueTables setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public DataExtraInfoSubDbsValueTables setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DataExtraInfoSubDbsValueTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DataExtraInfoSubDbsValueTables setMappingTableName(String mappingTableName) {
            this.mappingTableName = mappingTableName;
            return this;
        }
        public String getMappingTableName() {
            return this.mappingTableName;
        }

        public DataExtraInfoSubDbsValueTables setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public DataExtraInfoSubDbsValueTables setColumns(java.util.List<DataExtraInfoSubDbsValueTablesColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<DataExtraInfoSubDbsValueTablesColumns> getColumns() {
            return this.columns;
        }

    }

}
