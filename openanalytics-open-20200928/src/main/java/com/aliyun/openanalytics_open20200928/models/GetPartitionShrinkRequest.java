// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetPartitionShrinkRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    // 表名
    @NameInMap("TableName")
    public String tableName;

    // 分区
    @NameInMap("Values")
    public String valuesShrink;

    public static GetPartitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionShrinkRequest self = new GetPartitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetPartitionShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetPartitionShrinkRequest setValuesShrink(String valuesShrink) {
        this.valuesShrink = valuesShrink;
        return this;
    }
    public String getValuesShrink() {
        return this.valuesShrink;
    }

}
