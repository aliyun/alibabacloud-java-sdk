// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantPrimaryZoneRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户的主可用区。 其为集群部署可用区中的一个。
    @NameInMap("PrimaryZone")
    public String primaryZone;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantPrimaryZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantPrimaryZoneRequest self = new ModifyTenantPrimaryZoneRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantPrimaryZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantPrimaryZoneRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public ModifyTenantPrimaryZoneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
