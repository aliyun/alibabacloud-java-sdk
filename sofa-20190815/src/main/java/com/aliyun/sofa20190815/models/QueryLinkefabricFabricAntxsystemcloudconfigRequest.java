// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricAntxsystemcloudconfigRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    public static QueryLinkefabricFabricAntxsystemcloudconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricAntxsystemcloudconfigRequest self = new QueryLinkefabricFabricAntxsystemcloudconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
