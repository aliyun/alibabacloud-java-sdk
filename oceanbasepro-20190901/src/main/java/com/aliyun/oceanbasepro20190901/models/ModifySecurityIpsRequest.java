// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the IP address whitelist group.   </p>
     * <p>It must be 2 to 32 characters in length, start with a lowercase letter, end with a lowercase letter or digit, and contain only lowercase letters, digits, and underscores (_).</p>
     */
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    /**
     * <p>The list of IP addresses and CIDR blocks in the whitelist.   </p>
     * <p>It is a JSON array. Each object in the array is an IP address or CIDR block. You can specify at most 40 IP addresses or CIDR blocks.</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    public static ModifySecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsRequest self = new ModifySecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySecurityIpsRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public ModifySecurityIpsRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

}
