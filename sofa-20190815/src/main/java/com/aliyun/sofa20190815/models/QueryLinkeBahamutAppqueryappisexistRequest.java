// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppqueryappisexistRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutAppqueryappisexistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppqueryappisexistRequest self = new QueryLinkeBahamutAppqueryappisexistRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppqueryappisexistRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutAppqueryappisexistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
