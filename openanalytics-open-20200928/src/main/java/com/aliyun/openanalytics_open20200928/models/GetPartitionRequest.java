// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetPartitionRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    // 表名
    @NameInMap("TableName")
    public String tableName;

    // 分区
    @NameInMap("Values")
    public java.util.List<String> values;

    public static GetPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionRequest self = new GetPartitionRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetPartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetPartitionRequest setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
