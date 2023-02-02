// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantsRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of tenant IDs.   </p>
     * <p>It is a JSON array. Each object in the array is a tenant name string.</p>
     */
    @NameInMap("TenantIds")
    public String tenantIds;

    public static DeleteTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantsRequest self = new DeleteTenantsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTenantsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteTenantsRequest setTenantIds(String tenantIds) {
        this.tenantIds = tenantIds;
        return this;
    }
    public String getTenantIds() {
        return this.tenantIds;
    }

}
