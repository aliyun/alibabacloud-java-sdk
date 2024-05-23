// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantsRequest extends TeaModel {
    /**
     * <p>You can call this operation to delete one or more tenants from an OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=DeleteTenants</p>
     * <p>&TenantIds=["ob2mr3oae0****", "ob2mr3oae1****"]</p>
     * <p>&InstanceId=ob317v4uif****</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
     * <br>
     * <p>This parameter is required.</p>
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
