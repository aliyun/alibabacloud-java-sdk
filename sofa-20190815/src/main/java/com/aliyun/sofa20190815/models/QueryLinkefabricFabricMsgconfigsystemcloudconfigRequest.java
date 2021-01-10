// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgconfigsystemcloudconfigRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkefabricFabricMsgconfigsystemcloudconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgconfigsystemcloudconfigRequest self = new QueryLinkefabricFabricMsgconfigsystemcloudconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
