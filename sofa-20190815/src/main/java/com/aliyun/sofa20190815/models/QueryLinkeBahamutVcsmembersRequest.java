// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutVcsmembersRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Query")
    public String query;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutVcsmembersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutVcsmembersRequest self = new QueryLinkeBahamutVcsmembersRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutVcsmembersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutVcsmembersRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryLinkeBahamutVcsmembersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
