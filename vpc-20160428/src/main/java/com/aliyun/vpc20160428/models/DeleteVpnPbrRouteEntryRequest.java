// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnPbrRouteEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("RouteSource")
    @Validation(required = true)
    public String routeSource;

    @NameInMap("RouteDest")
    @Validation(required = true)
    public String routeDest;

    @NameInMap("NextHop")
    @Validation(required = true)
    public String nextHop;

    @NameInMap("Weight")
    @Validation(required = true)
    public Integer weight;

    @NameInMap("OverlayMode")
    public String overlayMode;

    public static DeleteVpnPbrRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnPbrRouteEntryRequest self = new DeleteVpnPbrRouteEntryRequest();
        return TeaModel.build(map, self);
    }

}
