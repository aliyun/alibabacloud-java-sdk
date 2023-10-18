// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnPbrRouteEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The next hop of the policy-based route.</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The tunneling protocol. Set the value to **Ipsec**.</p>
     */
    @NameInMap("OverlayMode")
    public String overlayMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The priority of the policy-based route.</p>
     * <br>
     * <p>*   If the route was not assigned a priority, this parameter is optional.</p>
     * <br>
     * <p>*   If the route was assigned a priority, this parameter is optional.</p>
     * <br>
     * <p>        If you specify this parameter, set the value to the priority configured for the policy-based route. Otherwise, the operation cannot be performed.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the region where the VPN gateway is created. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>The weight of the policy-based route.</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static DeleteVpnPbrRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnPbrRouteEntryRequest self = new DeleteVpnPbrRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpnPbrRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVpnPbrRouteEntryRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public DeleteVpnPbrRouteEntryRequest setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public DeleteVpnPbrRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteVpnPbrRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVpnPbrRouteEntryRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public DeleteVpnPbrRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVpnPbrRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteVpnPbrRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteVpnPbrRouteEntryRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public DeleteVpnPbrRouteEntryRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public DeleteVpnPbrRouteEntryRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DeleteVpnPbrRouteEntryRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
