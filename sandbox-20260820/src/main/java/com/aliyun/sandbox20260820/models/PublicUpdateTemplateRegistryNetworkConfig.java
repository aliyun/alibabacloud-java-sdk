// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateRegistryNetworkConfig extends TeaModel {
    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vSwitchId")
    public String vSwitchId;

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
