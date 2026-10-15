// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateRegistryNetworkConfig extends TeaModel {
    /**
     * <p>The ID of the security group used to access the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1abc123</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the vSwitch where the repository resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1abc123</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC where the repository resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1abc123</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static PublicUpdateTemplateRegistryNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateRegistryNetworkConfig self = new PublicUpdateTemplateRegistryNetworkConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateRegistryNetworkConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public PublicUpdateTemplateRegistryNetworkConfig setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public PublicUpdateTemplateRegistryNetworkConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
