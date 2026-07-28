// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntriesRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <p><strong>true</strong>: performs a dry run without creating routes. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</p>
     * <p><strong>false</strong> (default): sends a Normal request. If the check passes, a 2xx HTTP status code is returned and the routes are created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the route table.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>The list of route entry information.</p>
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
         * <p>The description of the custom route entry. You can specify a maximum of 50 descriptions.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the custom route entry. Both IPv4 and IPv6 destination CIDR blocks are supported. You can specify a maximum of 50 destination CIDR blocks. The following requirements must be met:</p>
         * <ul>
         * <li><p>The destination CIDR block cannot point to or be contained by 100.64.0.0/10.  </p>
         * </li>
         * <li><p>The destination CIDR blocks of different route entries in the same route table must be unique.</p>
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
         * <p>The version of the IP protocol. You can specify a maximum of 50 IP protocol versions. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4.</li>
         * <li><strong>6</strong>: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The name of the custom route entry to add. You can specify a maximum of 50 names.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the next hop instance for the custom route entry. You can specify a maximum of 50 instance IDs.</p>
         * <blockquote>
         * <p>If NextHopType is set to ECR, you can call <a href="https://help.aliyun.com/document_detail/2712069.html">DescribeExpressConnectRouterAssociation</a> to obtain the AssociationId as the next hop ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The type of the next hop for the custom route entry. You can specify a maximum of 50 next hop types. Valid values: </p>
         * <ul>
         * <li><p><strong>Instance</strong> (default): ECS instance. Forwards traffic to an ECS instance.</p>
         * </li>
         * <li><p><strong>HaVip</strong>: high-availability virtual IP address.  </p>
         * </li>
         * <li><p><strong>RouterInterface</strong>: vRouter interface.</p>
         * </li>
         * <li><p><strong>NetworkInterface</strong>: elastic network interfaces (ENIs).</p>
         * </li>
         * <li><p><strong>VpnGateway</strong>: VPN gateway.</p>
         * </li>
         * <li><p><strong>IPv6Gateway</strong>: IPv6 gateway.</p>
         * </li>
         * <li><p><strong>NatGateway</strong>: NAT gateway.</p>
         * </li>
         * <li><p><strong>Attachment</strong>: transit router. Forwards traffic to a transit router.</p>
         * </li>
         * <li><p><strong>VpcPeer</strong>: VPC peering connection.</p>
         * </li>
         * <li><p><strong>Ipv4Gateway</strong>: IPv4 gateway.</p>
         * </li>
         * <li><p><strong>GatewayEndpoint</strong>: gateway endpoint.</p>
         * </li>
         * <li><p><strong>CenBasic</strong>: CEN that does not support transit routers.</p>
         * </li>
         * <li><p><strong>Ecr</strong>: Express Connect Router (ECR).</p>
         * </li>
         * <li><p><strong>GatewayLoadBalancerEndpoint</strong>: Gateway Load Balancer endpoint (GWLBe).</p>
         * </li>
         * <li><p><strong>RouteTargetGroup</strong>: routing target group.</p>
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
         * <p>The ID of the route table to which you want to add the custom route entry. You can specify a maximum of 50 route table IDs.</p>
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
