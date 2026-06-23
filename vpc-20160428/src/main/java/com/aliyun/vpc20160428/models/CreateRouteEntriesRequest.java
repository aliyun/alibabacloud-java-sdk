// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntriesRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <p><strong>true</strong>: Sends a request to check whether the request is valid. The system checks whether your AccessKey is valid, whether the RAM user is authorized, and whether the required parameters are specified. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</p>
     * <p><strong>false</strong> (default): Sends a normal request. After the request passes the check, a 2xx HTTP status code is returned and the routes are created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the route table is located.</p>
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
     * <p>The list of route information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteEntries")
    public java.util.List<CreateRouteEntriesRequestRouteEntries> routeEntries;

    public static CreateRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntriesRequest self = new CreateRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRouteEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRouteEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRouteEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRouteEntriesRequest setRouteEntries(java.util.List<CreateRouteEntriesRequestRouteEntries> routeEntries) {
        this.routeEntries = routeEntries;
        return this;
    }
    public java.util.List<CreateRouteEntriesRequestRouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static class CreateRouteEntriesRequestRouteEntries extends TeaModel {
        /**
         * <p>The description of the custom route. You can specify up to 50 descriptions.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the custom route. Both IPv4 and IPv6 CIDR blocks are supported. You can specify up to 50 destination CIDR blocks. The destination CIDR blocks must meet the following requirements:</p>
         * <ul>
         * <li><p>The destination CIDR block cannot point to 100.64.0.0/10 or be a subset of 100.64.0.0/10.</p>
         * </li>
         * <li><p>The destination CIDR blocks of different routes in the same route table cannot be the same.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The IP protocol version. You can specify up to 50 IP protocol versions. Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: IPv4.</p>
         * </li>
         * <li><p><strong>6</strong>: IPv6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The name of the custom route that you want to add. You can specify up to 50 names.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the next hop instance for the custom route. You can specify up to 50 instance IDs.</p>
         * <blockquote>
         * <p>If you set NextHopType to Ecr, call the <a href="https://help.aliyun.com/document_detail/2712069.html">DescribeExpressConnectRouterAssociation</a> operation to obtain the AssociationId and use it as the next hop ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The type of the next hop for the custom route. You can specify up to 50 next hop types. Valid values:</p>
         * <ul>
         * <li><p><strong>Instance</strong> (default): an ECS instance.</p>
         * </li>
         * <li><p><strong>HaVip</strong>: a high-availability virtual IP address (HAVIP).</p>
         * </li>
         * <li><p><strong>RouterInterface</strong>: a router interface.</p>
         * </li>
         * <li><p><strong>NetworkInterface</strong>: an elastic network interface (ENI).</p>
         * </li>
         * <li><p><strong>VpnGateway</strong>: a VPN Gateway.</p>
         * </li>
         * <li><p><strong>IPv6Gateway</strong>: an IPv6 Gateway.</p>
         * </li>
         * <li><p><strong>NatGateway</strong>: a NAT Gateway.</p>
         * </li>
         * <li><p><strong>Attachment</strong>: a transit router.</p>
         * </li>
         * <li><p><strong>VpcPeer</strong>: a VPC peering connection.</p>
         * </li>
         * <li><p><strong>Ipv4Gateway</strong>: an IPv4 gateway.</p>
         * </li>
         * <li><p><strong>GatewayEndpoint</strong>: a gateway endpoint.</p>
         * </li>
         * <li><p><strong>CenBasic</strong>: CEN does not support transit routers.</p>
         * </li>
         * <li><p><strong>Ecr</strong>: an Express Connect Router (ECR).</p>
         * </li>
         * <li><p><strong>GatewayLoadBalancerEndpoint</strong>: a Gateway Load Balancer endpoint (GWLBe).</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RouterInterface</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The ID of the route table to which you want to add custom routes. You can specify up to 50 route table IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzd****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static CreateRouteEntriesRequestRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteEntriesRequestRouteEntries self = new CreateRouteEntriesRequestRouteEntries();
            return TeaModel.build(map, self);
        }

        public CreateRouteEntriesRequestRouteEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRouteEntriesRequestRouteEntries setDstCidrBlock(String dstCidrBlock) {
            this.dstCidrBlock = dstCidrBlock;
            return this;
        }
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        public CreateRouteEntriesRequestRouteEntries setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public CreateRouteEntriesRequestRouteEntries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRouteEntriesRequestRouteEntries setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public CreateRouteEntriesRequestRouteEntries setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public CreateRouteEntriesRequestRouteEntries setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
