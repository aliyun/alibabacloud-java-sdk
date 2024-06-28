// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntriesRequest extends TeaModel {
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
     * <p>The route entries.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteEntries")
    public java.util.List<CreateRouteEntriesRequestRouteEntries> routeEntries;

    public static CreateRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntriesRequest self = new CreateRouteEntriesRequest();
        return TeaModel.build(map, self);
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
         * <p>The description of the custom route entry. You can specify up to 50 descriptions.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the custom route entry. Both IPv4 and IPv6 CIDR blocks are supported. You can specify up to 50 destination CIDR blocks. Make sure that the destination CIDR block meets the following requirements:</p>
         * <ul>
         * <li>The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.</li>
         * <li>The destination CIDR block of the custom route entry is different from the destination CIDR blocks of other route entries in the same route table.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The IP version. You can specify up to 50 IP versions. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4</li>
         * <li><strong>6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The name of the custom route entry that you want to add. You can specify up to 50 names.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next hop ID of the custom route entry. You can specify up to 50 next hop IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The type of next hop. You can specify up to 50 next hop types. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong> (default): an Elastic Compute Service (ECS) instance</li>
         * <li><strong>HaVip</strong>: a high-availability virtual IP address (HAVIP).</li>
         * <li><strong>RouterInterface</strong>: a router interface.</li>
         * <li><strong>NetworkInterface</strong>: an elastic network interface (ENI).</li>
         * <li><strong>VpnGateway</strong>: a VPN gateway.</li>
         * <li><strong>IPv6Gateway</strong>: an IPv6 gateway.</li>
         * <li><strong>NatGateway</strong>: a NAT gateway.</li>
         * <li><strong>Attachment</strong>: a transit router.</li>
         * <li><strong>VpcPeer</strong>: a VPC peering connection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RouterInterface</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The ID of the route table to which you want to add a custom route entry. You can specify up to 50 route table IDs.</p>
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
