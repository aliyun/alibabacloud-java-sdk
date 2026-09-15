// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateVPCConfig extends TeaModel {
    @NameInMap("role")
    public String role;

    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("vpcId")
    public String vpcId;

    public static PublicTemplateVPCConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateVPCConfig self = new PublicTemplateVPCConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateVPCConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public PublicTemplateVPCConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public PublicTemplateVPCConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public PublicTemplateVPCConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
