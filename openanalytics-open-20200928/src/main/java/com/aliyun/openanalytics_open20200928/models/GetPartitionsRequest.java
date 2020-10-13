// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetPartitionsRequest extends TeaModel {
    // 数据库名
    @NameInMap("DbName")
    public String dbName;

    // 表名
    @NameInMap("TableName")
    public String tableName;

    // 获取多少分区
    @NameInMap("MaxParts")
    public Integer maxParts;

    public static GetPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionsRequest self = new GetPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetPartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetPartitionsRequest setMaxParts(Integer maxParts) {
        this.maxParts = maxParts;
        return this;
    }
    public Integer getMaxParts() {
        return this.maxParts;
    }

}
