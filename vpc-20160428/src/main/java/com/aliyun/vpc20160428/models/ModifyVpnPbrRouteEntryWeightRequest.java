// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnPbrRouteEntryWeightRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("RouteSource")
    public String routeSource;

    @NameInMap("RouteDest")
    public String routeDest;

    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("Weight")
    public Integer weight;

    @NameInMap("NewWeight")
    public Integer newWeight;

    @NameInMap("OverlayMode")
    public String overlayMode;

    public static ModifyVpnPbrRouteEntryWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnPbrRouteEntryWeightRequest self = new ModifyVpnPbrRouteEntryWeightRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpnPbrRouteEntryWeightRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setNewWeight(Integer newWeight) {
        this.newWeight = newWeight;
        return this;
    }
    public Integer getNewWeight() {
        return this.newWeight;
    }

    public ModifyVpnPbrRouteEntryWeightRequest setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

}
