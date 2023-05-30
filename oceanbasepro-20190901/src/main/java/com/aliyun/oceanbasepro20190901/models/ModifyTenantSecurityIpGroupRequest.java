// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantSecurityIpGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    @NameInMap("SecurityIps")
    public String securityIps;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantSecurityIpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantSecurityIpGroupRequest self = new ModifyTenantSecurityIpGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantSecurityIpGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantSecurityIpGroupRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public ModifyTenantSecurityIpGroupRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public ModifyTenantSecurityIpGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
