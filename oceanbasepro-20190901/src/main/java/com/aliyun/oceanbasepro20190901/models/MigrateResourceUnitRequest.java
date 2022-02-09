// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class MigrateResourceUnitRequest extends TeaModel {
    // Oceanbase集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源节点所有的observer节点。
    @NameInMap("SourceNodeId")
    public String sourceNodeId;

    // 迁到的observer目标节点。
    @NameInMap("TargetNodeId")
    public String targetNodeId;

    // Oceanbase租户ID
    @NameInMap("TenantId")
    public String tenantId;

    // 资源节点ID
    @NameInMap("UnitId")
    public String unitId;

    public static MigrateResourceUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateResourceUnitRequest self = new MigrateResourceUnitRequest();
        return TeaModel.build(map, self);
    }

    public MigrateResourceUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MigrateResourceUnitRequest setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }
    public String getSourceNodeId() {
        return this.sourceNodeId;
    }

    public MigrateResourceUnitRequest setTargetNodeId(String targetNodeId) {
        this.targetNodeId = targetNodeId;
        return this;
    }
    public String getTargetNodeId() {
        return this.targetNodeId;
    }

    public MigrateResourceUnitRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MigrateResourceUnitRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
