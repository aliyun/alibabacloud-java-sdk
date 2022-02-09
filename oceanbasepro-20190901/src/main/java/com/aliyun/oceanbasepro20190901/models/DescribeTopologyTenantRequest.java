// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyTenantRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeTopologyTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyTenantRequest self = new DescribeTopologyTenantRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
