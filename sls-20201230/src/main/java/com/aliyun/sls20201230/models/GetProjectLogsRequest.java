// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetProjectLogsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the Dedicated SQL feature. For more information, see <a href="https://help.aliyun.com/document_detail/223777.html">Enable Dedicated SQL</a>. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default): enables the Standard SQL feature.</li>
     * </ul>
     * <p>You can use the powerSql or <strong>query</strong> parameter to configure Dedicated SQL.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The standard SQL statement. In this example, the SQL statement queries the number of page views (PVs) from 2022-03-01 10:41:40 to 2022-03-01 10:56:40 in a Logstore whose name is nginx-moni.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT COUNT(*) as pv FROM nginx-moni where <strong>time</strong> &gt; 1646102500 and <strong>time</strong> &lt; 1646103400</p>
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
