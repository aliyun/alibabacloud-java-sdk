// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetProjectLogsRequest extends TeaModel {
    // 是否使用SQL独享版。更多信息，请参见开启SQL独享版。
    // 
    // true：使用SQL独享版。
    // false（默认值）：使用SQL普通版。
    // 除通过powerSql参数配置SQL独享版外，您还可以使用query参数。
    @NameInMap("powerSql")
    public Boolean powerSql;

    // 标准SQL语句。例如日志库名称为nginx-moni，查询时间区间在2022-03-01 10:41:40到2022-03-01 10:56:40之间的访问数量。
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
