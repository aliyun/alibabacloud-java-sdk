// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteTableAttributesRequest extends TeaModel {
    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("RouteTableName")
    public String routeTableName;

    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("KbpsBandwidth")
    public String kbpsBandwidth;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceBid")
    public String resourceBid;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRouteTableAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteTableAttributesRequest self = new ModifyRouteTableAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouteTableAttributesRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public ModifyRouteTableAttributesRequest setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public ModifyRouteTableAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyRouteTableAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRouteTableAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRouteTableAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRouteTableAttributesRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public ModifyRouteTableAttributesRequest setKbpsBandwidth(String kbpsBandwidth) {
        this.kbpsBandwidth = kbpsBandwidth;
        return this;
    }
    public String getKbpsBandwidth() {
        return this.kbpsBandwidth;
    }

    public ModifyRouteTableAttributesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyRouteTableAttributesRequest setResourceBid(String resourceBid) {
        this.resourceBid = resourceBid;
        return this;
    }
    public String getResourceBid() {
        return this.resourceBid;
    }

    public ModifyRouteTableAttributesRequest setResourceUid(Long resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public Long getResourceUid() {
        return this.resourceUid;
    }

    public ModifyRouteTableAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
