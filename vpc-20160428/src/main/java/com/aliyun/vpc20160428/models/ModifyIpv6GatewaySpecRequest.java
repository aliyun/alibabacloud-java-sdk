// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewaySpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyIpv6GatewaySpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewaySpecRequest self = new ModifyIpv6GatewaySpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6GatewaySpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIpv6GatewaySpecRequest setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public ModifyIpv6GatewaySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ModifyIpv6GatewaySpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
