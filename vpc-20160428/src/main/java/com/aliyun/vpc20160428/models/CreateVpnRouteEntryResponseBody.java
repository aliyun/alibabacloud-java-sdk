// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnRouteEntryResponseBody extends TeaModel {
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

    @NameInMap("Weight")
    public Integer weight;

    public static CreateVpnRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnRouteEntryResponseBody self = new CreateVpnRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnRouteEntryResponseBody setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVpnRouteEntryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpnRouteEntryResponseBody setVpnInstanceId(String vpnInstanceId) {
        this.vpnInstanceId = vpnInstanceId;
        return this;
    }
    public String getVpnInstanceId() {
        return this.vpnInstanceId;
    }

    public CreateVpnRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnRouteEntryResponseBody setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVpnRouteEntryResponseBody setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVpnRouteEntryResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateVpnRouteEntryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVpnRouteEntryResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
