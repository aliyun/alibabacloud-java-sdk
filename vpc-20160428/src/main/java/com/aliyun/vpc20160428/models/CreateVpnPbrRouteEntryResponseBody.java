// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnPbrRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The time when the policy-based route was created.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the policy-based route.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The next hop of the policy-based route.</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The tunneling protocol. The value is **Ipsec**.</p>
     */
    @NameInMap("OverlayMode")
    public String overlayMode;

    /**
     * <p>The priority of the policy-based route.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The destination CIDR block of the policy-based route.</p>
     */
    @NameInMap("RouteDest")
    public String routeDest;

    /**
     * <p>The source CIDR block of the policy-based route.</p>
     */
    @NameInMap("RouteSource")
    public String routeSource;

    /**
     * <p>The status of the policy-based route. Valid values:</p>
     * <br>
     * <p>*   **published**: advertised to the VPC route table.</p>
     * <p>*   **normal**: not advertised to the VPC route table.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The VPN gateway ID.</p>
     */
    @NameInMap("VpnInstanceId")
    public String vpnInstanceId;

    /**
     * <p>The weight of the policy-based route. Valid values:</p>
     * <br>
     * <p>*   **100**: The IPsec-VPN connection associated with the policy-based route serves as an active connection.</p>
     * <p>*   **0**: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static CreateVpnPbrRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnPbrRouteEntryResponseBody self = new CreateVpnPbrRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnPbrRouteEntryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVpnPbrRouteEntryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpnPbrRouteEntryResponseBody setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVpnPbrRouteEntryResponseBody setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVpnPbrRouteEntryResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateVpnPbrRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnPbrRouteEntryResponseBody setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVpnPbrRouteEntryResponseBody setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public CreateVpnPbrRouteEntryResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateVpnPbrRouteEntryResponseBody setVpnInstanceId(String vpnInstanceId) {
        this.vpnInstanceId = vpnInstanceId;
        return this;
    }
    public String getVpnInstanceId() {
        return this.vpnInstanceId;
    }

    public CreateVpnPbrRouteEntryResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
