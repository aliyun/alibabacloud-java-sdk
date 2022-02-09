// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableMemResourceRequest extends TeaModel {
    @NameInMap("CpuNum")
    public Long cpuNum;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 租户的资源分布节点数。 其与集群的部署模式相耦合，如集群模式为2-2-2，则最后分布节点数最多为2个。
    @NameInMap("UnitNum")
    public Long unitNum;

    public static DescribeAvailableMemResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMemResourceRequest self = new DescribeAvailableMemResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMemResourceRequest setCpuNum(Long cpuNum) {
        this.cpuNum = cpuNum;
        return this;
    }
    public Long getCpuNum() {
        return this.cpuNum;
    }

    public DescribeAvailableMemResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAvailableMemResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeAvailableMemResourceRequest setUnitNum(Long unitNum) {
        this.unitNum = unitNum;
        return this;
    }
    public Long getUnitNum() {
        return this.unitNum;
    }

}
