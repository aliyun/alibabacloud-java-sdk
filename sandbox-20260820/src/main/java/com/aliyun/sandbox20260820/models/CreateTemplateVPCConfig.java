// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateVPCConfig extends TeaModel {
    /**
     * <p>The ARN of the RAM role assumed by the sandboxed container instance when accessing the VPC. Format: acs:ram::{account ID}:role/{role name}.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890123456:role/aliyunfcdefaultrole</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The ID of the security group used by the sandboxed container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-****</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The list of vSwitch IDs that the sandboxed container instance connects to. Configure vSwitches in multiple zones to improve availability.</p>
     */
    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The ID of the VPC that the sandboxed container instance connects to.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static CreateTemplateVPCConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateVPCConfig self = new CreateTemplateVPCConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateVPCConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateTemplateVPCConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateTemplateVPCConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateTemplateVPCConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
