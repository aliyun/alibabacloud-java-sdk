// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTenantModesRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeInstanceTenantModes</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
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
