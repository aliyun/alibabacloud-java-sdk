// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpRequest extends TeaModel {
    /**
     * <p>The IP addresses that you want to add to the review security group. You can add a maximum of 100 IP addresses to a review security group. Separate multiple IP addresses with commas (,). You can add IP addresses in the following formats to review security groups:</p>
     * <ul>
     * <li>IP address: 192.168.0.1</li>
     * <li>CIDR block: 192.168.0.1/24. /24 indicates that the prefix of the CIDR block is 24 bits in length. You can replace 24 with a value that ranges <code>from 1 to 32</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("Ips")
    public String ips;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><strong>Append</strong> (default): adds the IP addresses to the original whitelist.</li>
     * <li><strong>Cover</strong>: overwrites the original whitelist.</li>
     * <li><strong>Delete</strong>: removes the IP addresses from the original whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("OperateMode")
    public String operateMode;

    /**
     * <p>The name of the review security group. Default value: <strong>Default</strong>. You can specify a maximum of 10 review security groups.</p>
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
