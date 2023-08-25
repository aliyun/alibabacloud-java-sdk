// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DataExtraInfoSubCondsValue extends TeaModel {
    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("Database")
    public String database;

    @NameInMap("DestDatabase")
    public String destDatabase;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("DestName")
    public String destName;

    @NameInMap("WhereClause")
    public String whereClause;

    @NameInMap("FilterColumns")
    public java.util.List<String> filterColumns;

    @NameInMap("ShardColumns")
    public java.util.List<String> shardColumns;

    @NameInMap("LogicTableId")
    public String logicTableId;

    @NameInMap("SourceEndpointId")
    public String sourceEndpointId;

    @NameInMap("SourceClientId")
    public String sourceClientId;

    public static DataExtraInfoSubCondsValue build(java.util.Map<String, ?> map) throws Exception {
        DataExtraInfoSubCondsValue self = new DataExtraInfoSubCondsValue();
        return TeaModel.build(map, self);
    }

    public DataExtraInfoSubCondsValue setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public DataExtraInfoSubCondsValue setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DataExtraInfoSubCondsValue setDestDatabase(String destDatabase) {
        this.destDatabase = destDatabase;
        return this;
    }
    public String getDestDatabase() {
        return this.destDatabase;
    }

    public DataExtraInfoSubCondsValue setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DataExtraInfoSubCondsValue setDestName(String destName) {
        this.destName = destName;
        return this;
    }
    public String getDestName() {
        return this.destName;
    }

    public DataExtraInfoSubCondsValue setWhereClause(String whereClause) {
        this.whereClause = whereClause;
        return this;
    }
    public String getWhereClause() {
        return this.whereClause;
    }

    public DataExtraInfoSubCondsValue setFilterColumns(java.util.List<String> filterColumns) {
        this.filterColumns = filterColumns;
        return this;
    }
    public java.util.List<String> getFilterColumns() {
        return this.filterColumns;
    }

    public DataExtraInfoSubCondsValue setShardColumns(java.util.List<String> shardColumns) {
        this.shardColumns = shardColumns;
        return this;
    }
    public java.util.List<String> getShardColumns() {
        return this.shardColumns;
    }

    public DataExtraInfoSubCondsValue setLogicTableId(String logicTableId) {
        this.logicTableId = logicTableId;
        return this;
    }
    public String getLogicTableId() {
        return this.logicTableId;
    }

    public DataExtraInfoSubCondsValue setSourceEndpointId(String sourceEndpointId) {
        this.sourceEndpointId = sourceEndpointId;
        return this;
    }
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    public DataExtraInfoSubCondsValue setSourceClientId(String sourceClientId) {
        this.sourceClientId = sourceClientId;
        return this;
    }
    public String getSourceClientId() {
        return this.sourceClientId;
    }

}
