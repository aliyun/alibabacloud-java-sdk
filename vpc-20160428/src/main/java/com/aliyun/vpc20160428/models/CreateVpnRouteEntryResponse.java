// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnInstanceId")
    @Validation(required = true)
    public String vpnInstanceId;

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
    @Validation(required = true)
    public String overlayMode;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("State")
    @Validation(required = true)
    public String state;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    public static CreateVpnRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnRouteEntryResponse self = new CreateVpnRouteEntryResponse();
        return TeaModel.build(map, self);
    }

}
