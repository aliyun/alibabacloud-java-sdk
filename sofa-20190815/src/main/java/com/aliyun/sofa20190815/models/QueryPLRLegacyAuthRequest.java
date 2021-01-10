// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryPLRLegacyAuthRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryPLRLegacyAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPLRLegacyAuthRequest self = new QueryPLRLegacyAuthRequest();
        return TeaModel.build(map, self);
    }

    public QueryPLRLegacyAuthRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
