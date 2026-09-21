// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateRegistryNetworkConfig extends TeaModel {
    /**
     * <p>The ID of the security group used to access the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-****</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the vSwitch used to access the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC used to access the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static PublicTemplateRegistryNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateRegistryNetworkConfig self = new PublicTemplateRegistryNetworkConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateRegistryNetworkConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public PublicTemplateRegistryNetworkConfig setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public PublicTemplateRegistryNetworkConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
