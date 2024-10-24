// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteEntryRequest extends TeaModel {
    /**
     * <p>The description of the route entry.</p>
     * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EntryDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block of the route entry. Only IPv4 CIDR blocks, IPv6 CIDR blocks, and prefix lists are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The ID of the new next hop instance.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp17y37ytsenqyim****</p>
     */
    @NameInMap("NewNextHopId")
    public String newNextHopId;

    /**
     * <p>The new next hop type of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>NetworkInterface</p>
     */
    @NameInMap("NewNextHopType")
    public String newNextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the route belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the custom route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>rte-acfvgfsghfdd****</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    /**
     * <p>The name of the route entry.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EntryName</p>
     */
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    /**
     * <p>The ID of the route table to which the route entry belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1nk7zk65du3pni8z9td</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static ModifyRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteEntryRequest self = new ModifyRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouteEntryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public ModifyRouteEntryRequest setNewNextHopId(String newNextHopId) {
        this.newNextHopId = newNextHopId;
        return this;
    }
    public String getNewNextHopId() {
        return this.newNextHopId;
    }

    public ModifyRouteEntryRequest setNewNextHopType(String newNextHopType) {
        this.newNextHopType = newNextHopType;
        return this;
    }
    public String getNewNextHopType() {
        return this.newNextHopType;
    }

    public ModifyRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRouteEntryRequest setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public ModifyRouteEntryRequest setRouteEntryName(String routeEntryName) {
        this.routeEntryName = routeEntryName;
        return this;
    }
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public ModifyRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
