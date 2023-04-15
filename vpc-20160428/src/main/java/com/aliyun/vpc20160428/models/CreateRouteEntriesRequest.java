// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntriesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the route table is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the custom route entry. Both IPv4 and IPv6 CIDR blocks are supported. You can specify up to 50 destination CIDR blocks. Make sure that the destination CIDR block meets the following requirements:</p>
         * <br>
         * <p>*   The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.</p>
         * <p>*   The destination CIDR block of the custom route entry is different from the destination CIDR blocks of other route entries in the same route table.</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The version of the IP protocol. You can specify up to 50 IP protocol versions. Valid values:</p>
         * <br>
         * <p>*   **IPv4**</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The name of the custom route entry that you want to add. You can specify up to 50 names.</p>
         * <br>
         * <p>The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the next hop of the custom route entry. You can specify up to 50 next hop IDs.</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The type of next hop. You can specify up to 50 next hop types. Valid values:</p>
         * <br>
         * <p>*   **Instance**: Elastic Compute Service (ECS) instance. This is the default value.</p>
         * <p>*   **HaVip**: high-availability virtual IP address (HAVIP).</p>
         * <p>*   **RouterInterface**: router interface.</p>
         * <p>*   **NetworkInterface**: elastic network interface (ENI).</p>
         * <p>*   **VpnGateway**: VPN gateway.</p>
         * <p>*   **IPv6Gateway**: IPv6 gateway.</p>
         * <p>*   **NatGateway**: NAT gateway.</p>
         * <p>*   **Attachment**: transit router.</p>
         * <p>*   **VpcPeer**: VPC peering connection.</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The ID of the route table to which you want to add the custom route entry. You can specify up to 50 route table IDs.</p>
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
