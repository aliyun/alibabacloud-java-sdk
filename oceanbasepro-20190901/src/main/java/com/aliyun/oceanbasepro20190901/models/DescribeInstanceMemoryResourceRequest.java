// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMemoryResourceRequest extends TeaModel {
    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeInstanceMemoryResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMemoryResourceRequest self = new DescribeInstanceMemoryResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMemoryResourceRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeInstanceMemoryResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceMemoryResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
