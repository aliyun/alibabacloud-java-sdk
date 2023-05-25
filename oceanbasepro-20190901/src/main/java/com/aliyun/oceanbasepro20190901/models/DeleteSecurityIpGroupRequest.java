// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupRequest extends TeaModel {
    /**
     * <p>The name of the IP address whitelist group.    </p>
     * <p>It must be 2 to 32 characters in length, start with a lowercase letter, end with a lowercase letter or digit, and contain only lowercase letters, digits, and underscores (_).</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The information of the deleted IP whitelist group.</p>
     */
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
