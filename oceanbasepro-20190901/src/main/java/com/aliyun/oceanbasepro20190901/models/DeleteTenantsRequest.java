// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantsRequest extends TeaModel {
    /**
     * <p>You can call this operation to delete one or more tenants from an OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <pre><code>http(s)://[Endpoint]/?Action=DeleteTenants
     * &amp;TenantIds=[&quot;ob2mr3oae0****&quot;, &quot;ob2mr3oae1****&quot;]
     * &amp;InstanceId=ob317v4uif****
     * &amp;Common request parameters
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ob2mr3oae0****&quot;, &quot;ob2mr3oae1****&quot;]</p>
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
