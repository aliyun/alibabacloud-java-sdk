// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DropPartitionShrinkRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    // 表名
    @NameInMap("TableName")
    public String tableName;

    // 需要删除的分区
    @NameInMap("PartValues")
    public String partValuesShrink;

    public static DropPartitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DropPartitionShrinkRequest self = new DropPartitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DropPartitionShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DropPartitionShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DropPartitionShrinkRequest setPartValuesShrink(String partValuesShrink) {
        this.partValuesShrink = partValuesShrink;
        return this;
    }
    public String getPartValuesShrink() {
        return this.partValuesShrink;
    }

}
