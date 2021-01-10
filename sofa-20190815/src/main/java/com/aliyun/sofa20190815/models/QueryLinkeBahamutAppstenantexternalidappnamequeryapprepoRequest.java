// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoRequest self = new QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
