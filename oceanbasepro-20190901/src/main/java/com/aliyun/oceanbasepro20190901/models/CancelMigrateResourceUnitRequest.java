// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelMigrateResourceUnitRequest extends TeaModel {
    // Oceanbase集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    // Oceanbase租户ID
    @NameInMap("TenantId")
    public String tenantId;

    // 资源节点ID
    @NameInMap("UnitId")
    public String unitId;

    public static CancelMigrateResourceUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrateResourceUnitRequest self = new CancelMigrateResourceUnitRequest();
        return TeaModel.build(map, self);
    }

    public CancelMigrateResourceUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelMigrateResourceUnitRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CancelMigrateResourceUnitRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
