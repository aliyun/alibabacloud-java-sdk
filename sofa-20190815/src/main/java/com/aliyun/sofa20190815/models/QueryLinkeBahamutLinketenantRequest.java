// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutLinketenantRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutLinketenantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutLinketenantRequest self = new QueryLinkeBahamutLinketenantRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutLinketenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
