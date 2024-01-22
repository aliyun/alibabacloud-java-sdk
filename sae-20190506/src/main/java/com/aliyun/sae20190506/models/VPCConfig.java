// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class VPCConfig extends TeaModel {
    @NameInMap("anytunnelViaENI")
    public Boolean anytunnelViaENI;

    @NameInMap("role")
    public String role;

    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("vpcId")
    public String vpcId;

    public static VPCConfig build(java.util.Map<String, ?> map) throws Exception {
        VPCConfig self = new VPCConfig();
        return TeaModel.build(map, self);
    }

    public VPCConfig setAnytunnelViaENI(Boolean anytunnelViaENI) {
        this.anytunnelViaENI = anytunnelViaENI;
        return this;
    }
    public Boolean getAnytunnelViaENI() {
        return this.anytunnelViaENI;
    }

    public VPCConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public VPCConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public VPCConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public VPCConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
