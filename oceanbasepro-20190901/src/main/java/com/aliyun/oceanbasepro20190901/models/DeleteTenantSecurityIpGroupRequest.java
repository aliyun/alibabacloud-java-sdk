// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantSecurityIpGroupRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The group name of the whitelist group of IP addresses.</p>
     * <br>
     * <p>It starts with lowercase letters and ends with lowercase letters or numbers. It can only contain lowercase letters, numbers, and underscores, and should be 2~32 characters in length.</p>
     */
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteTenantSecurityIpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantSecurityIpGroupRequest self = new DeleteTenantSecurityIpGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTenantSecurityIpGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteTenantSecurityIpGroupRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public DeleteTenantSecurityIpGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
