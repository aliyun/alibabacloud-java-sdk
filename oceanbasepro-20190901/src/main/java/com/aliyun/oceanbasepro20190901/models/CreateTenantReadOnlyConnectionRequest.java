// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantReadOnlyConnectionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTenantReadOnlyConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantReadOnlyConnectionRequest self = new CreateTenantReadOnlyConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantReadOnlyConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantReadOnlyConnectionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTenantReadOnlyConnectionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
