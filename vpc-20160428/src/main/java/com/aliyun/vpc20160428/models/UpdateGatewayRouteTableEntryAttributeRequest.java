// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTableEntryAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IPv4GatewayRouteTableId")
    public String IPv4GatewayRouteTableId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateGatewayRouteTableEntryAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTableEntryAttributeRequest self = new UpdateGatewayRouteTableEntryAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setIPv4GatewayRouteTableId(String IPv4GatewayRouteTableId) {
        this.IPv4GatewayRouteTableId = IPv4GatewayRouteTableId;
        return this;
    }
    public String getIPv4GatewayRouteTableId() {
        return this.IPv4GatewayRouteTableId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateGatewayRouteTableEntryAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
