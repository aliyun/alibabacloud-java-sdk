// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpRequest extends TeaModel {
    // The IP addresses to be added to a review security group. You can add a maximum of 100 IP addresses to each review security group. Separate multiple IP addresses with commas (,). You can enter individual IP addresses or a CIDR block.
    // 
    // *   Individual IP address: for example, 10.23.12.24
    // *   CIDR block: for example, 10.23.12.24/24, where /24 indicates that the prefix of the CIDR block is 24 bits in length. You can replace 24 with a value that ranges from `1 to 32`.
    @NameInMap("Ips")
    public String ips;

    // The operation type. Valid values:
    // 
    // *   **Append**: adds the IP addresses to the original whitelist. This is the default value.
    // *   **Cover**: overwrites the original whitelist.
    // *   **Delete**: removes the IP addresses from the original whitelist.
    @NameInMap("OperateMode")
    public String operateMode;

    // The name of the review security group. Default value: **Default**. You can specify a maximum of 10 review security groups.
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    public static SetAuditSecurityIpRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAuditSecurityIpRequest self = new SetAuditSecurityIpRequest();
        return TeaModel.build(map, self);
    }

    public SetAuditSecurityIpRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

    public SetAuditSecurityIpRequest setOperateMode(String operateMode) {
        this.operateMode = operateMode;
        return this;
    }
    public String getOperateMode() {
        return this.operateMode;
    }

    public SetAuditSecurityIpRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

}
