// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcijobbranchlogRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutAppcustomcijobbranchlogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcijobbranchlogRequest self = new QueryLinkeBahamutAppcustomcijobbranchlogRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
