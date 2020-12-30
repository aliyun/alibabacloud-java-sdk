// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class PublishVpnRouteEntryRequest extends TeaModel {
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

    @NameInMap("RouteDest")
    public String routeDest;

    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("RouteType")
    public String routeType;

    @NameInMap("PublishVpc")
    public Boolean publishVpc;

    public static PublishVpnRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishVpnRouteEntryRequest self = new PublishVpnRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public PublishVpnRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public PublishVpnRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PublishVpnRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PublishVpnRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PublishVpnRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PublishVpnRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PublishVpnRouteEntryRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public PublishVpnRouteEntryRequest setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public PublishVpnRouteEntryRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public PublishVpnRouteEntryRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public PublishVpnRouteEntryRequest setPublishVpc(Boolean publishVpc) {
        this.publishVpc = publishVpc;
        return this;
    }
    public Boolean getPublishVpc() {
        return this.publishVpc;
    }

}
