// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableNatGatewayEcsMetricRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    public static EnableNatGatewayEcsMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableNatGatewayEcsMetricRequest self = new EnableNatGatewayEcsMetricRequest();
        return TeaModel.build(map, self);
    }

    public EnableNatGatewayEcsMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableNatGatewayEcsMetricRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableNatGatewayEcsMetricRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
