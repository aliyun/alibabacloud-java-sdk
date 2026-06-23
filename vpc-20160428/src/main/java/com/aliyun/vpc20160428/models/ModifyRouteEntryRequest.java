// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteEntryRequest extends TeaModel {
    /**
     * <p>The description of the route entry.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EntryDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IPv4 CIDR block of the route entry. IPv4 and IPv6 CIDR blocks are supported.</p>
     * <blockquote>
     * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DestinationCidrBlock</strong> and <strong>RouteTableId</strong> parameters are required.
     * To change the IPv4 CIDR block of a route to a <strong>prefix list</strong>, specify the <strong>RouteEntryId</strong> parameter. The <strong>DestinationCidrBlock</strong> parameter does not support prefix list CIDR blocks or prefix list instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <p><strong>true</strong>: sends the request without modifying the route. The system checks whether the AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</p>
     * <p><strong>false</strong> (default): sends a Normal request. After the request passes the check, a 2xx HTTP status code is returned and the route is modified.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The new next hop instance ID of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp17y37ytsenqyim****</p>
     */
    @NameInMap("NewNextHopId")
    public String newNextHopId;

    /**
     * <p>The new next hop type of the route. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong>: ECS instance.</p>
     * </li>
     * <li><p><strong>HaVip</strong>: high-availability virtual IP address.  </p>
     * </li>
     * <li><p><strong>RouterInterface</strong>: vRouter interface.</p>
     * </li>
     * <li><p><strong>NetworkInterface</strong>: elastic network interface (ENI).</p>
     * </li>
     * <li><p><strong>VpnGateway</strong>: VPN gateway.</p>
     * </li>
     * <li><p><strong>IPv6Gateway</strong>: IPv6 gateway.</p>
     * </li>
     * <li><p><strong>NatGateway</strong>: NAT gateway.</p>
     * </li>
     * <li><p><strong>Attachment</strong>: transit router.</p>
     * </li>
     * <li><p><strong>VpcPeer</strong>: VPC peering connection.</p>
     * </li>
     * <li><p><strong>Ipv4Gateway</strong>: IPv4 gateway.</p>
     * </li>
     * <li><p><strong>GatewayEndpoint</strong>: gateway endpoint.</p>
     * </li>
     * <li><p><strong>Ecr</strong>: Express Connect Router (ECR).</p>
     * </li>
     * <li><p><strong>GatewayLoadBalancerEndpoint</strong>: Gateway Load Balancer endpoint (GWLBe).</p>
     * </li>
     * </ul>
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
     * <p>The region ID of the route entry.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EntryName</p>
     */
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    /**
     * <p>The route table ID.</p>
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

    public ModifyRouteEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
