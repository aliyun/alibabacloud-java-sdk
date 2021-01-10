// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcijobbranchRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutAppcustomcijobbranchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcijobbranchRequest self = new QueryLinkeBahamutAppcustomcijobbranchRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcijobbranchRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryLinkeBahamutAppcustomcijobbranchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
