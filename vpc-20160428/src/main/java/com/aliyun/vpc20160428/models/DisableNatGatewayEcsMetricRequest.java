// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableNatGatewayEcsMetricRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    public static DisableNatGatewayEcsMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableNatGatewayEcsMetricRequest self = new DisableNatGatewayEcsMetricRequest();
        return TeaModel.build(map, self);
    }

}
