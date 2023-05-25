// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTenantModesRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **DescribeInstanceTenantModes**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceTenantModesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTenantModesRequest self = new DescribeInstanceTenantModesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTenantModesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
