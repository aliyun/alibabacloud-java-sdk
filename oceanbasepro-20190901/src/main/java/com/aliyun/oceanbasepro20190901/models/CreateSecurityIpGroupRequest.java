// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSecurityIpGroupRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the whitelist group.</p>
     */
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    /**
     * <p>The IP addresses or CIDR blocks in the IP address whitelist group.   </p>
     * <p>It is a JSON array. Each object in the array is an IP address or CIDR block. The following two formats are supported:  </p>
     * <p>- IP address: for example, 10.23.12.24. </p>
     * <p>- CIDR block: for example, 10.23.12.24/24, where 24 indicates the length of the prefix in the IP address, and the prefix is 1 to 30 characters in length.  Limit: You can set no more than 40 IP addresses or CIDR blocks for a whitelist group. A total of 200 IP addresses or CIDR blocks are supported for all whitelist groups.</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    public static CreateSecurityIpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIpGroupRequest self = new CreateSecurityIpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIpGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSecurityIpGroupRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public CreateSecurityIpGroupRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

}
