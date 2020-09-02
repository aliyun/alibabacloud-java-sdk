// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatGatewayRequest self = new DeleteNatGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNatGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNatGatewayRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DeleteNatGatewayRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
