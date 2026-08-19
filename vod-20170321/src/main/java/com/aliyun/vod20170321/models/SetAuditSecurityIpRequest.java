// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpRequest extends TeaModel {
    /**
     * <p>The list of security IP addresses for review. Each group supports a maximum of 100 IP addresses. Separate multiple IP addresses with commas (,). The following formats are supported:</p>
     * <ul>
     * <li>Exact IP address: 192.168.0.1</li>
     * <li>CIDR block: 192.168.0.1/24 (Classless Inter-Domain Routing. /24 specifies the length of the prefix in the address. Valid values: <code>[1,32]</code>.)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("Ips")
    public String ips;

    /**
     * <p>The operation mode. Valid values:</p>
     * <ul>
     * <li><strong>Append</strong>: default value. Appends IP addresses to the IP address whitelist.</li>
     * <li><strong>Cover</strong>: overwrites the existing IP address whitelist.</li>
     * <li><strong>Delete</strong>: deletes IP addresses from the IP address whitelist.<blockquote>
     * <p>If the specified value is not within the valid values, the default value (Append) is used.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("OperateMode")
    public String operateMode;

    /**
     * <p>The name of the security group for review. Default value: <strong>Default</strong>. A maximum of 10 security groups are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
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
