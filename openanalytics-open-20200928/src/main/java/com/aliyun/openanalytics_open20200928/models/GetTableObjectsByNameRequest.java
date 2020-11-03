// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableObjectsByNameRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DBName")
    public String DBName;

    // 表名称
    @NameInMap("TableNames")
    public java.util.List<String> tableNames;

    public static GetTableObjectsByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsByNameRequest self = new GetTableObjectsByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsByNameRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GetTableObjectsByNameRequest setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

}
