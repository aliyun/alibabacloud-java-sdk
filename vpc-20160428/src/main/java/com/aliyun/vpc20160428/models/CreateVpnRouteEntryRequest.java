// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnRouteEntryRequest extends TeaModel {
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

    @NameInMap("PublishVpc")
    @Validation(required = true)
    public Boolean publishVpc;

    @NameInMap("Description")
    public String description;

    @NameInMap("OverlayMode")
    public String overlayMode;

    public static CreateVpnRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnRouteEntryRequest self = new CreateVpnRouteEntryRequest();
        return TeaModel.build(map, self);
    }

}
