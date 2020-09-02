// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewaySpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyNatGatewaySpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewaySpecRequest self = new ModifyNatGatewaySpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewaySpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNatGatewaySpecRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatGatewaySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ModifyNatGatewaySpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNatGatewaySpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
