// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class PublishVpnRouteEntryRequest extends TeaModel {
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

    @NameInMap("RouteType")
    @Validation(required = true)
    public String routeType;

    @NameInMap("PublishVpc")
    @Validation(required = true)
    public Boolean publishVpc;

    public static PublishVpnRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishVpnRouteEntryRequest self = new PublishVpnRouteEntryRequest();
        return TeaModel.build(map, self);
    }

}
