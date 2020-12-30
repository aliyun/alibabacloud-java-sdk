// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnPbrRouteEntryResponseBody extends TeaModel {
    @NameInMap("RouteDest")
    public String routeDest;

    @NameInMap("Description")
    public String description;

    @NameInMap("VpnInstanceId")
    public String vpnInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OverlayMode")
    public String overlayMode;

    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("State")
    public String state;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("RouteSource")
    public String routeSource;

    @NameInMap("Weight")
    public Integer weight;

    public static CreateVpnPbrRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnPbrRouteEntryResponseBody self = new CreateVpnPbrRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnPbrRouteEntryResponseBody setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVpnPbrRouteEntryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpnPbrRouteEntryResponseBody setVpnInstanceId(String vpnInstanceId) {
        this.vpnInstanceId = vpnInstanceId;
        return this;
    }
    public String getVpnInstanceId() {
        return this.vpnInstanceId;
    }

    public CreateVpnPbrRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnPbrRouteEntryResponseBody setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVpnPbrRouteEntryResponseBody setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVpnPbrRouteEntryResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateVpnPbrRouteEntryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVpnPbrRouteEntryResponseBody setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public CreateVpnPbrRouteEntryResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
