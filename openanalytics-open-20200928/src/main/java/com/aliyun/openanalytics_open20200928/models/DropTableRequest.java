// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DropTableRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    // 表名称
    @NameInMap("TableName")
    public String tableName;

    public static DropTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DropTableRequest self = new DropTableRequest();
        return TeaModel.build(map, self);
    }

    public DropTableRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DropTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
