// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantSecurityIpGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

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
