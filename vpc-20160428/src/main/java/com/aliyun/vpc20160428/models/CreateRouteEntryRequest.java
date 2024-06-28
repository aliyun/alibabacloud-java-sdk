// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the custom route entry.</p>
     * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block of the custom route entry. Both IPv4 and IPv6 CIDR blocks are supported. Make sure that the destination CIDR block meets the following requirements:</p>
     * <ul>
     * <li>The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.</li>
     * <li>The destination CIDR block of the custom route entry is different from the destination CIDR blocks of other route entries in the same route table.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The ID of the next hop.</p>
     * 
     * <strong>example:</strong>
     * <p>i-j6c2fp57q8rr4jlu****</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The next hop list.</p>
     */
    @NameInMap("NextHopList")
    public java.util.List<CreateRouteEntryRequestNextHopList> nextHopList;

    /**
     * <p>The type of next hop of the custom route entry. Valid values:</p>
     * <ul>
     * <li><strong>Instance</strong>: an Elastic Compute Service (ECS) instance. This is the default value.</li>
     * <li><strong>HaVip</strong>: a high-availability virtual IP address (HAVIP).</li>
     * <li><strong>RouterInterface</strong>: a router interface.</li>
     * <li><strong>NetworkInterface</strong>: an elastic network interface (ENI).</li>
     * <li><strong>VpnGateway</strong>: a VPN gateway.</li>
     * <li><strong>IPv6Gateway</strong>: an IPv6 gateway.</li>
     * <li><strong>NatGateway</strong>: a NAT gateway.</li>
     * <li><strong>Attachment</strong>: a transit router.</li>
     * <li><strong>VpcPeer</strong>: a VPC peering connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RouterInterface</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the route table.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The name of the custom route entry that you want to add.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    /**
     * <p>The ID of the route table to which you want to add a custom route entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp145q7glnuzd****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static CreateRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryRequest self = new CreateRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteEntryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateRouteEntryRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public CreateRouteEntryRequest setNextHopList(java.util.List<CreateRouteEntryRequestNextHopList> nextHopList) {
        this.nextHopList = nextHopList;
        return this;
    }
    public java.util.List<CreateRouteEntryRequestNextHopList> getNextHopList() {
        return this.nextHopList;
    }

    public CreateRouteEntryRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public CreateRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRouteEntryRequest setRouteEntryName(String routeEntryName) {
        this.routeEntryName = routeEntryName;
        return this;
    }
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public CreateRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static class CreateRouteEntryRequestNextHopList extends TeaModel {
        /**
         * <p>The ID of the next hop of the ECMP route.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf3cd8r4****</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of next hop of the ECMP route entry. Set the value to <strong>RouterInterface</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>RouterInterface</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The weight of the next hop of the ECMP route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteEntryRequestNextHopList self = new CreateRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

        public CreateRouteEntryRequestNextHopList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public CreateRouteEntryRequestNextHopList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public CreateRouteEntryRequestNextHopList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
