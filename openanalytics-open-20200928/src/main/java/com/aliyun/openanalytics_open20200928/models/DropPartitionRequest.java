// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DropPartitionRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    // 表名
    @NameInMap("TableName")
    public String tableName;

    // 需要删除的分区
    @NameInMap("PartValues")
    public java.util.List<String> partValues;

    public static DropPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DropPartitionRequest self = new DropPartitionRequest();
        return TeaModel.build(map, self);
    }

    public DropPartitionRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DropPartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DropPartitionRequest setPartValues(java.util.List<String> partValues) {
        this.partValues = partValues;
        return this;
    }
    public java.util.List<String> getPartValues() {
        return this.partValues;
    }

}
