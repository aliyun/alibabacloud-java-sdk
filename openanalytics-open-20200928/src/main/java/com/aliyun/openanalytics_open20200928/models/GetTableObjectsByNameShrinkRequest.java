// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableObjectsByNameShrinkRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DBName")
    public String DBName;

    // 表名称
    @NameInMap("TableNames")
    public String tableNamesShrink;

    public static GetTableObjectsByNameShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsByNameShrinkRequest self = new GetTableObjectsByNameShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsByNameShrinkRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GetTableObjectsByNameShrinkRequest setTableNamesShrink(String tableNamesShrink) {
        this.tableNamesShrink = tableNamesShrink;
        return this;
    }
    public String getTableNamesShrink() {
        return this.tableNamesShrink;
    }

}
