// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsclouddrmurlRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkefabricFabricUrlsclouddrmurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsclouddrmurlRequest self = new QueryLinkefabricFabricUrlsclouddrmurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsclouddrmurlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
