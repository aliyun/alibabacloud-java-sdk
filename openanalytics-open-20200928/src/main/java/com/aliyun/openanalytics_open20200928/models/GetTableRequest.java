// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    // 表名称
    @NameInMap("TableName")
    public String tableName;

    public static GetTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableRequest self = new GetTableRequest();
        return TeaModel.build(map, self);
    }

    public GetTableRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
