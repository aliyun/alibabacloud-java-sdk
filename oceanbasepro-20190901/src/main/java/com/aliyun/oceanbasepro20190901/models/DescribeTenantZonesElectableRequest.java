// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantZonesElectableRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTenantZonesElectableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantZonesElectableRequest self = new DescribeTenantZonesElectableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantZonesElectableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTenantZonesElectableRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
