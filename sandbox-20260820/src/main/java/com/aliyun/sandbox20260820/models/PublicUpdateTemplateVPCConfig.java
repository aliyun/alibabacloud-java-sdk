// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateVPCConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:ram::123456789012:role/sandbox-vpc-role</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>sg-bp1abc123</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1abc123</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static PublicUpdateTemplateVPCConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateVPCConfig self = new PublicUpdateTemplateVPCConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateVPCConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public PublicUpdateTemplateVPCConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public PublicUpdateTemplateVPCConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public PublicUpdateTemplateVPCConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
