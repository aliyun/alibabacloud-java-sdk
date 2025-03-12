// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUserRolesRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the tenant. If you specify the ID of a tenant in MySQL mode, the privilege configuration of the regular user in MySQL mode is returned. If you specify the ID of a tenant in Oracle mode, the privilege configuration of the regular user in Oracle mode is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>t4pnum****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTenantUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUserRolesRequest self = new DescribeTenantUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUserRolesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTenantUserRolesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
