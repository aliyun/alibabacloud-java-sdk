// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TableSchema extends TeaModel {
    @NameInMap("schema")
    public Schema schema;

    @NameInMap("tableName")
    public String tableName;

    public static TableSchema build(java.util.Map<String, ?> map) throws Exception {
        TableSchema self = new TableSchema();
        return TeaModel.build(map, self);
    }

    public TableSchema setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
    public Schema getSchema() {
        return this.schema;
    }

    public TableSchema setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
