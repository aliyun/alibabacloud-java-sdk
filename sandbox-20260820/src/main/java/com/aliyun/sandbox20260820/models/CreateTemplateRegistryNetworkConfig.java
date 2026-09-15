// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryNetworkConfig extends TeaModel {
    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vSwitchId")
    public String vSwitchId;

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
