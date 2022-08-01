// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetProjectLogsRequest extends TeaModel {
    @NameInMap("powerSql")
    public Boolean powerSql;

    @NameInMap("query")
    public String query;

    public static GetProjectLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectLogsRequest self = new GetProjectLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectLogsRequest setPowerSql(Boolean powerSql) {
        this.powerSql = powerSql;
        return this;
    }
    public Boolean getPowerSql() {
        return this.powerSql;
    }

    public GetProjectLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
