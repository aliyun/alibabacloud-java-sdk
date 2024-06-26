// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectModifyRecordsResponseBody extends TeaModel {
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
     * <p>30</p>
     */
    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<ListProjectModifyRecordsResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public ListProjectModifyRecordsResponseBodyErrorDetail errorDetail;

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
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListProjectModifyRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectModifyRecordsResponseBody self = new ListProjectModifyRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectModifyRecordsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ListProjectModifyRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectModifyRecordsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ListProjectModifyRecordsResponseBody setData(java.util.List<ListProjectModifyRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectModifyRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectModifyRecordsResponseBody setErrorDetail(ListProjectModifyRecordsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ListProjectModifyRecordsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ListProjectModifyRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectModifyRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectModifyRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectModifyRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectModifyRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectModifyRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema self = new ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>comments</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <strong>example:</strong>
         * <p>PRI</p>
         */
        @NameInMap("ColumnKey")
        public String columnKey;

        /**
         * <strong>example:</strong>
         * <p>col_name</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>FLOAT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

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
         * <p>null</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>utf16</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsGenerateField")
        public Boolean isGenerateField;

        /**
         * <strong>example:</strong>
         * <p>mapped_name</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Nullable")
        public Boolean nullable;

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
        @NameInMap("RawColumnType")
        public String rawColumnType;

        /**
         * <strong>example:</strong>
         * <p>INT8</p>
         */
        @NameInMap("RecordFieldType")
        public String recordFieldType;

        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns self = new ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setColumnKey(String columnKey) {
            this.columnKey = columnKey;
            return this;
        }
        public String getColumnKey() {
            return this.columnKey;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setIsGenerateField(Boolean isGenerateField) {
            this.isGenerateField = isGenerateField;
            return this;
        }
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setRawColumnType(String rawColumnType) {
            this.rawColumnType = rawColumnType;
            return this;
        }
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setRecordFieldType(String recordFieldType) {
            this.recordFieldType = recordFieldType;
            return this;
        }
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema adbTableSchema;

        @NameInMap("Columns")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns> columns;

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
         * <p>mapped_name</p>
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
         * <p>id&lt;3</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables self = new ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setAdbTableSchema(ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setColumns(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTablesColumns> getColumns() {
            return this.columns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema self = new ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>comments</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <strong>example:</strong>
         * <p>PRI</p>
         */
        @NameInMap("ColumnKey")
        public String columnKey;

        /**
         * <strong>example:</strong>
         * <p>col_name</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>FLOAT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

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
         * <p>null</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>utf16</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsGenerateField")
        public Boolean isGenerateField;

        /**
         * <strong>example:</strong>
         * <p>mapped_name</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

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
        @NameInMap("Position")
        public Integer position;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RawColumnType")
        public String rawColumnType;

        /**
         * <strong>example:</strong>
         * <p>INT8</p>
         */
        @NameInMap("RecordFieldType")
        public String recordFieldType;

        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns self = new ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setColumnKey(String columnKey) {
            this.columnKey = columnKey;
            return this;
        }
        public String getColumnKey() {
            return this.columnKey;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setIsGenerateField(Boolean isGenerateField) {
            this.isGenerateField = isGenerateField;
            return this;
        }
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setRawColumnType(String rawColumnType) {
            this.rawColumnType = rawColumnType;
            return this;
        }
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setRecordFieldType(String recordFieldType) {
            this.recordFieldType = recordFieldType;
            return this;
        }
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema adbTableSchema;

        @NameInMap("Columns")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns> columns;

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
         * <p>mapped_name</p>
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
         * <p>id &lt; 1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews self = new ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setAdbTableSchema(ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setColumns(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViewsColumns> getColumns() {
            return this.columns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema self = new ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>comments</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <strong>example:</strong>
         * <p>PRI</p>
         */
        @NameInMap("ColumnKey")
        public String columnKey;

        /**
         * <strong>example:</strong>
         * <p>col_name</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>FLOAT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

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
         * <p>null</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsGenerateField")
        public Boolean isGenerateField;

        /**
         * <strong>example:</strong>
         * <p>mapped_col</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

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
        @NameInMap("Position")
        public Integer position;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RawColumnType")
        public String rawColumnType;

        /**
         * <strong>example:</strong>
         * <p>INT8</p>
         */
        @NameInMap("RecordFieldType")
        public String recordFieldType;

        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns self = new ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setColumnKey(String columnKey) {
            this.columnKey = columnKey;
            return this;
        }
        public String getColumnKey() {
            return this.columnKey;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setIsGenerateField(Boolean isGenerateField) {
            this.isGenerateField = isGenerateField;
            return this;
        }
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setRawColumnType(String rawColumnType) {
            this.rawColumnType = rawColumnType;
            return this;
        }
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setRecordFieldType(String recordFieldType) {
            this.recordFieldType = recordFieldType;
            return this;
        }
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("Columns")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns> columns;

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
         * <p>mapped_name</p>
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
         * <p>id &lt; 1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesTables self = new ListProjectModifyRecordsResponseBodyDataDatabasesTables();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setAdbTableSchema(ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public ListProjectModifyRecordsResponseBodyDataDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setColumns(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesTablesColumns> getColumns() {
            return this.columns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>PARTITION BY VALUE(\&quot;id\&quot;)</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema self = new ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>comments</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <strong>example:</strong>
         * <p>PRI</p>
         */
        @NameInMap("ColumnKey")
        public String columnKey;

        /**
         * <strong>example:</strong>
         * <p>col_name</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>FLOAT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

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
         * <p>null</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>utf16</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsGenerateField")
        public Boolean isGenerateField;

        /**
         * <strong>example:</strong>
         * <p>mapped_name</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Nullable")
        public Boolean nullable;

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
        @NameInMap("RawColumnType")
        public String rawColumnType;

        /**
         * <strong>example:</strong>
         * <p>INT8</p>
         */
        @NameInMap("RecordFieldType")
        public String recordFieldType;

        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns self = new ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setColumnKey(String columnKey) {
            this.columnKey = columnKey;
            return this;
        }
        public String getColumnKey() {
            return this.columnKey;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setIsGenerateField(Boolean isGenerateField) {
            this.isGenerateField = isGenerateField;
            return this;
        }
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setRawColumnType(String rawColumnType) {
            this.rawColumnType = rawColumnType;
            return this;
        }
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setRecordFieldType(String recordFieldType) {
            this.recordFieldType = recordFieldType;
            return this;
        }
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabasesViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema adbTableSchema;

        @NameInMap("Columns")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns> columns;

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
         * <p>mapped_view</p>
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

        public static ListProjectModifyRecordsResponseBodyDataDatabasesViews build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabasesViews self = new ListProjectModifyRecordsResponseBodyDataDatabasesViews();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setAdbTableSchema(ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public ListProjectModifyRecordsResponseBodyDataDatabasesViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setColumns(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesViewsColumns> getColumns() {
            return this.columns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabasesViews setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataDatabases extends TeaModel {
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
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables> specificTables;

        @NameInMap("SpecificViews")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews> specificViews;

        @NameInMap("Tables")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesTables> tables;

        @NameInMap("Views")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesViews> views;

        public static ListProjectModifyRecordsResponseBodyDataDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataDatabases self = new ListProjectModifyRecordsResponseBodyDataDatabases();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataDatabases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabases setSpecificTables(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables> specificTables) {
            this.specificTables = specificTables;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabases setSpecificViews(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews> specificViews) {
            this.specificViews = specificViews;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabases setTables(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesTables> getTables() {
            return this.tables;
        }

        public ListProjectModifyRecordsResponseBodyDataDatabases setViews(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabasesViews> getViews() {
            return this.views;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataErrorDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INNER_ERROR</p>
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
         * <p>null</p>
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

        public static ListProjectModifyRecordsResponseBodyDataErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataErrorDetail self = new ListProjectModifyRecordsResponseBodyDataErrorDetail();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListProjectModifyRecordsResponseBodyDataErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>schema_name</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables self = new ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>schema_name</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack self = new ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>view_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>schema_name</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews self = new ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>view_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>schema_name</p>
         */
        @NameInMap("Schema")
        public String schema;

        public static ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack self = new ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo extends TeaModel {
        @NameInMap("Tables")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables> tables;

        @NameInMap("TablesBlack")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack> tablesBlack;

        @NameInMap("Views")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews> views;

        @NameInMap("ViewsBlack")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack> viewsBlack;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WildcardMode")
        public Boolean wildcardMode;

        public static ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo self = new ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo setTables(java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTables> getTables() {
            return this.tables;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo setTablesBlack(java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack> tablesBlack) {
            this.tablesBlack = tablesBlack;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoTablesBlack> getTablesBlack() {
            return this.tablesBlack;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo setViews(java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViews> getViews() {
            return this.views;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo setViewsBlack(java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack> viewsBlack) {
            this.viewsBlack = viewsBlack;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfoViewsBlack> getViewsBlack() {
            return this.viewsBlack;
        }

        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo setWildcardMode(Boolean wildcardMode) {
            this.wildcardMode = wildcardMode;
            return this;
        }
        public Boolean getWildcardMode() {
            return this.wildcardMode;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dest_name</p>
         */
        @NameInMap("DestName")
        public String destName;

        /**
         * <strong>example:</strong>
         * <p>source_name</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>source_schema</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        /**
         * <strong>example:</strong>
         * <p>source_table</p>
         */
        @NameInMap("SourceTable")
        public String sourceTable;

        public static ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings self = new ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings setSourceTable(String sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public String getSourceTable() {
            return this.sourceTable;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mapped_schema</p>
         */
        @NameInMap("DestName")
        public String destName;

        /**
         * <strong>example:</strong>
         * <p>source_name</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        public static ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings self = new ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dest_name</p>
         */
        @NameInMap("DestName")
        public String destName;

        /**
         * <strong>example:</strong>
         * <p>source_name</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>source_schema</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        public static ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings self = new ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dest_name</p>
         */
        @NameInMap("DestName")
        public String destName;

        /**
         * <strong>example:</strong>
         * <p>source_name</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>schema_name</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        public static ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings self = new ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo extends TeaModel {
        @NameInMap("ColumnMappings")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings> columnMappings;

        @NameInMap("SchemaMappings")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings> schemaMappings;

        @NameInMap("TableMappings")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings> tableMappings;

        @NameInMap("ViewMappings")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings> viewMappings;

        public static ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo self = new ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo setColumnMappings(java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings> columnMappings) {
            this.columnMappings = columnMappings;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoColumnMappings> getColumnMappings() {
            return this.columnMappings;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo setSchemaMappings(java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings> schemaMappings) {
            this.schemaMappings = schemaMappings;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoSchemaMappings> getSchemaMappings() {
            return this.schemaMappings;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo setTableMappings(java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings> tableMappings) {
            this.tableMappings = tableMappings;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoTableMappings> getTableMappings() {
            return this.tableMappings;
        }

        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo setViewMappings(java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings> viewMappings) {
            this.viewMappings = viewMappings;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfoViewMappings> getViewMappings() {
            return this.viewMappings;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyDataTableEtlList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>db_name</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <strong>example:</strong>
         * <p>dest_db</p>
         */
        @NameInMap("DestDatabase")
        public String destDatabase;

        /**
         * <strong>example:</strong>
         * <p>dest_name</p>
         */
        @NameInMap("DestName")
        public String destName;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("LogicTableId")
        public String logicTableId;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SourceEndpointId")
        public String sourceEndpointId;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>tenant_name</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <strong>example:</strong>
         * <p>id&gt;1</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static ListProjectModifyRecordsResponseBodyDataTableEtlList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyDataTableEtlList self = new ListProjectModifyRecordsResponseBodyDataTableEtlList();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setDestDatabase(String destDatabase) {
            this.destDatabase = destDatabase;
            return this;
        }
        public String getDestDatabase() {
            return this.destDatabase;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setLogicTableId(String logicTableId) {
            this.logicTableId = logicTableId;
            return this;
        }
        public String getLogicTableId() {
            return this.logicTableId;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setSourceEndpointId(String sourceEndpointId) {
            this.sourceEndpointId = sourceEndpointId;
            return this;
        }
        public String getSourceEndpointId() {
            return this.sourceEndpointId;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ListProjectModifyRecordsResponseBodyDataTableEtlList setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyData extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabases> databases;

        @NameInMap("ErrorDetail")
        public ListProjectModifyRecordsResponseBodyDataErrorDetail errorDetail;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T06:26:15</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>344000005</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("MergeRequestId")
        public Long mergeRequestId;

        @NameInMap("MigrationObjectsInfo")
        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo migrationObjectsInfo;

        @NameInMap("OmsProjectMappingInfo")
        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo omsProjectMappingInfo;

        /**
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>np_598qm***</p>
         */
        @NameInMap("SubProjectId")
        public String subProjectId;

        @NameInMap("TableEtlList")
        public java.util.List<ListProjectModifyRecordsResponseBodyDataTableEtlList> tableEtlList;

        /**
         * <strong>example:</strong>
         * <p>INCREASE_OBJECT</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("UpdateRequestId")
        public Long updateRequestId;

        public static ListProjectModifyRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyData self = new ListProjectModifyRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyData setDatabases(java.util.List<ListProjectModifyRecordsResponseBodyDataDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataDatabases> getDatabases() {
            return this.databases;
        }

        public ListProjectModifyRecordsResponseBodyData setErrorDetail(ListProjectModifyRecordsResponseBodyDataErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public ListProjectModifyRecordsResponseBodyDataErrorDetail getErrorDetail() {
            return this.errorDetail;
        }

        public ListProjectModifyRecordsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectModifyRecordsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectModifyRecordsResponseBodyData setMergeRequestId(Long mergeRequestId) {
            this.mergeRequestId = mergeRequestId;
            return this;
        }
        public Long getMergeRequestId() {
            return this.mergeRequestId;
        }

        public ListProjectModifyRecordsResponseBodyData setMigrationObjectsInfo(ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo migrationObjectsInfo) {
            this.migrationObjectsInfo = migrationObjectsInfo;
            return this;
        }
        public ListProjectModifyRecordsResponseBodyDataMigrationObjectsInfo getMigrationObjectsInfo() {
            return this.migrationObjectsInfo;
        }

        public ListProjectModifyRecordsResponseBodyData setOmsProjectMappingInfo(ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo omsProjectMappingInfo) {
            this.omsProjectMappingInfo = omsProjectMappingInfo;
            return this;
        }
        public ListProjectModifyRecordsResponseBodyDataOmsProjectMappingInfo getOmsProjectMappingInfo() {
            return this.omsProjectMappingInfo;
        }

        public ListProjectModifyRecordsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectModifyRecordsResponseBodyData setSubProjectId(String subProjectId) {
            this.subProjectId = subProjectId;
            return this;
        }
        public String getSubProjectId() {
            return this.subProjectId;
        }

        public ListProjectModifyRecordsResponseBodyData setTableEtlList(java.util.List<ListProjectModifyRecordsResponseBodyDataTableEtlList> tableEtlList) {
            this.tableEtlList = tableEtlList;
            return this;
        }
        public java.util.List<ListProjectModifyRecordsResponseBodyDataTableEtlList> getTableEtlList() {
            return this.tableEtlList;
        }

        public ListProjectModifyRecordsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectModifyRecordsResponseBodyData setUpdateRequestId(Long updateRequestId) {
            this.updateRequestId = updateRequestId;
            return this;
        }
        public Long getUpdateRequestId() {
            return this.updateRequestId;
        }

    }

    public static class ListProjectModifyRecordsResponseBodyErrorDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INNER_ERROR</p>
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

        public static ListProjectModifyRecordsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ListProjectModifyRecordsResponseBodyErrorDetail self = new ListProjectModifyRecordsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListProjectModifyRecordsResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
