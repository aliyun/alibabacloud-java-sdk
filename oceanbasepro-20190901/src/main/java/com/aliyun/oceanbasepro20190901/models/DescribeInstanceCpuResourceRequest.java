// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceCpuResourceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeInstanceCpuResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCpuResourceRequest self = new DescribeInstanceCpuResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCpuResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceCpuResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
