// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantSecurityIpGroupRequest extends TeaModel {
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
     * <p>The list of IP addresses in the whitelist group.</p>
     * <br>
     * <p>It is a JSON array. Each object in the array is an IP address or a CIDR block. You can have up to 40 whitelists.</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static CreateTenantSecurityIpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantSecurityIpGroupRequest self = new CreateTenantSecurityIpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantSecurityIpGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantSecurityIpGroupRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public CreateTenantSecurityIpGroupRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public CreateTenantSecurityIpGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
