// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryNetworkConfig extends TeaModel {
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

    public static CreateTemplateRegistryNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRegistryNetworkConfig self = new CreateTemplateRegistryNetworkConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRegistryNetworkConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateTemplateRegistryNetworkConfig setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateTemplateRegistryNetworkConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
