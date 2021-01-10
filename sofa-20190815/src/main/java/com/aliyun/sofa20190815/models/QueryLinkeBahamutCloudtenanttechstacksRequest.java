// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCloudtenanttechstacksRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutCloudtenanttechstacksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCloudtenanttechstacksRequest self = new QueryLinkeBahamutCloudtenanttechstacksRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCloudtenanttechstacksRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
