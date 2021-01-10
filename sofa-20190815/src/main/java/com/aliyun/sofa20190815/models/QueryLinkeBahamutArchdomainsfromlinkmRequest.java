// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutArchdomainsfromlinkmRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutArchdomainsfromlinkmRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutArchdomainsfromlinkmRequest self = new QueryLinkeBahamutArchdomainsfromlinkmRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutArchdomainsfromlinkmRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public QueryLinkeBahamutArchdomainsfromlinkmRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
