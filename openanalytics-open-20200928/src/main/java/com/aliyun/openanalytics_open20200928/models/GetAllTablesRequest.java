// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetAllTablesRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DbName")
    public String dbName;

    public static GetAllTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllTablesRequest self = new GetAllTablesRequest();
        return TeaModel.build(map, self);
    }

    public GetAllTablesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
