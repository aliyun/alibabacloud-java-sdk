// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantRequest extends TeaModel {
    /**
     * <p>The status of the Internet address for accessing the tenant. Valid values:   </p>
     * <ul>
     * <li>CLOSED: The address is disabled.   </li>
     * <li>ALLOCATING_INTERNET_ADDRESS: An address is being applied for.   </li>
     * <li>PENDING_OFFLINE_INTERNET_ADDRESS: The address is being disabled.   </li>
     * <li>ONLINE: The address is in service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether to enable transaction splitting.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantRequest self = new DescribeTenantRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
