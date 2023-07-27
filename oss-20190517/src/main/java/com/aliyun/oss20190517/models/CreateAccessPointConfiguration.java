// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CreateAccessPointConfiguration extends TeaModel {
    @NameInMap("AccessPointName")
    public String accessPointName;

    @NameInMap("NetworkOrigin")
    public String networkOrigin;

    @NameInMap("VpcConfiguration")
    public AccessPointVpcConfiguration vpcConfiguration;

    public static CreateAccessPointConfiguration build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessPointConfiguration self = new CreateAccessPointConfiguration();
        return TeaModel.build(map, self);
    }

    public CreateAccessPointConfiguration setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }
    public String getAccessPointName() {
        return this.accessPointName;
    }

    public CreateAccessPointConfiguration setNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
        return this;
    }
    public String getNetworkOrigin() {
        return this.networkOrigin;
    }

    public CreateAccessPointConfiguration setVpcConfiguration(AccessPointVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }
    public AccessPointVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

}
