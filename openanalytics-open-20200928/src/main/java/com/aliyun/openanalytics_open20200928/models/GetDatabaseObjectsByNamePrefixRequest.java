// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByNamePrefixRequest extends TeaModel {
    // 数据库名称模式
    @NameInMap("DbNamePattern")
    public String dbNamePattern;

    public static GetDatabaseObjectsByNamePrefixRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByNamePrefixRequest self = new GetDatabaseObjectsByNamePrefixRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByNamePrefixRequest setDbNamePattern(String dbNamePattern) {
        this.dbNamePattern = dbNamePattern;
        return this;
    }
    public String getDbNamePattern() {
        return this.dbNamePattern;
    }

}
