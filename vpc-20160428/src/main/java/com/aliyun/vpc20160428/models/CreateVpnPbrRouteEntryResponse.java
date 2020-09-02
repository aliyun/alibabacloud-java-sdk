// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnPbrRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnInstanceId")
    @Validation(required = true)
    public String vpnInstanceId;

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

    public static CreateVpnPbrRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnPbrRouteEntryResponse self = new CreateVpnPbrRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpnPbrRouteEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnPbrRouteEntryResponse setVpnInstanceId(String vpnInstanceId) {
        this.vpnInstanceId = vpnInstanceId;
        return this;
    }
    public String getVpnInstanceId() {
        return this.vpnInstanceId;
    }

    public CreateVpnPbrRouteEntryResponse setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public CreateVpnPbrRouteEntryResponse setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVpnPbrRouteEntryResponse setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVpnPbrRouteEntryResponse setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public CreateVpnPbrRouteEntryResponse setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVpnPbrRouteEntryResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpnPbrRouteEntryResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateVpnPbrRouteEntryResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
