// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVcoRouteEntryWeightRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("NewWeight")
    public Integer newWeight;

    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("OverlayMode")
    public String overlayMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouteDest")
    public String routeDest;

    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    @NameInMap("Weight")
    public Integer weight;

    public static ModifyVcoRouteEntryWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVcoRouteEntryWeightRequest self = new ModifyVcoRouteEntryWeightRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVcoRouteEntryWeightRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVcoRouteEntryWeightRequest setNewWeight(Integer newWeight) {
        this.newWeight = newWeight;
        return this;
    }
    public Integer getNewWeight() {
        return this.newWeight;
    }

    public ModifyVcoRouteEntryWeightRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ModifyVcoRouteEntryWeightRequest setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public ModifyVcoRouteEntryWeightRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVcoRouteEntryWeightRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVcoRouteEntryWeightRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVcoRouteEntryWeightRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVcoRouteEntryWeightRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public ModifyVcoRouteEntryWeightRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public ModifyVcoRouteEntryWeightRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
