// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVcoRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The timestamp when the destination-based route was created. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the destination-based route.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The next hop of the destination-based route.</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The tunneling protocol.</p>
     * <br>
     * <p>The value is set to **Ipsec**, which indicates the IPsec tunneling protocol.</p>
     */
    @NameInMap("OverlayMode")
    public String overlayMode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The destination CIDR block of the destination-based route.</p>
     */
    @NameInMap("RouteDest")
    public String routeDest;

    /**
     * <p>The status of the destination-based route.</p>
     * <br>
     * <p>Only **published** is returned, which indicates that the current route is published to the transit router.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    /**
     * <p>The weight of the destination-based route. Valid values:</p>
     * <br>
     * <p>*   **0**: a low priority.</p>
     * <p>*   **100**: a high priority.</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static CreateVcoRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVcoRouteEntryResponseBody self = new CreateVcoRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVcoRouteEntryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVcoRouteEntryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVcoRouteEntryResponseBody setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVcoRouteEntryResponseBody setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVcoRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVcoRouteEntryResponseBody setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVcoRouteEntryResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateVcoRouteEntryResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public CreateVcoRouteEntryResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
