// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceResourceUnitRequest extends TeaModel {
    // OceanBase 集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 节点ID。
    @NameInMap("NodeId")
    public String nodeId;

    // OceanBase 租户ID
    @NameInMap("TenantId")
    public String tenantId;

    // 资源节点的ID
    @NameInMap("UnitId")
    public String unitId;

    public static DescribeInstanceResourceUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResourceUnitRequest self = new DescribeInstanceResourceUnitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResourceUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceResourceUnitRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeInstanceResourceUnitRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeInstanceResourceUnitRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
