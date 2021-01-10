// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentMiddlewareTenantRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryODPEnvironmentMiddlewareTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentMiddlewareTenantRequest self = new QueryODPEnvironmentMiddlewareTenantRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentMiddlewareTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
