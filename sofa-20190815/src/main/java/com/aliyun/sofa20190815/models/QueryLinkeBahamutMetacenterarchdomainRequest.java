// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutMetacenterarchdomainRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutMetacenterarchdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutMetacenterarchdomainRequest self = new QueryLinkeBahamutMetacenterarchdomainRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutMetacenterarchdomainRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
