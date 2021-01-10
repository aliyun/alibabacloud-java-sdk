// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetmembersRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Query")
    public String query;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutWebapigetmembersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetmembersRequest self = new GetLinkeBahamutWebapigetmembersRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetmembersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutWebapigetmembersRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetLinkeBahamutWebapigetmembersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
