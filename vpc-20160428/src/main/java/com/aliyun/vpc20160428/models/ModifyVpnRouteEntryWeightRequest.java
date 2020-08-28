// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnRouteEntryWeightRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("RouteDest")
    @Validation(required = true)
    public String routeDest;

    @NameInMap("NextHop")
    @Validation(required = true)
    public String nextHop;

    @NameInMap("Weight")
    @Validation(required = true)
    public Integer weight;

    @NameInMap("NewWeight")
    @Validation(required = true)
    public Integer newWeight;

    @NameInMap("OverlayMode")
    public String overlayMode;

    public static ModifyVpnRouteEntryWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnRouteEntryWeightRequest self = new ModifyVpnRouteEntryWeightRequest();
        return TeaModel.build(map, self);
    }

}
