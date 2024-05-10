// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetProjectLogsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the Dedicated SQL feature. For more information, see [Enable Dedicated SQL](https://help.aliyun.com/document_detail/223777.html). Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default): enables the Standard SQL feature.</p>
     * <br>
     * <p>You can use the powerSql or **query** parameter to configure Dedicated SQL.</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The standard SQL statement. In this example, the SQL statement queries the number of page views (PVs) from 2022-03-01 10:41:40 to 2022-03-01 10:56:40 in a Logstore whose name is nginx-moni.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
