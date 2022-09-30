// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    public static DeleteSecurityIpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIpGroupRequest self = new DeleteSecurityIpGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIpGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSecurityIpGroupRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

}
