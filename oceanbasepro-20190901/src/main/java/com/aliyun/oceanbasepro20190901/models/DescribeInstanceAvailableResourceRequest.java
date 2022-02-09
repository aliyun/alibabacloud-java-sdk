// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceAvailableResourceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeInstanceAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAvailableResourceRequest self = new DescribeInstanceAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAvailableResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceAvailableResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
