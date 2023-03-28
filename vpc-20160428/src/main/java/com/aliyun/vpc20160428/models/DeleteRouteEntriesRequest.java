// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntriesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the route table.</p>
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
    public java.util.List<DeleteRouteEntriesRequestRouteEntries> routeEntries;

    public static DeleteRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntriesRequest self = new DeleteRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteRouteEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRouteEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteRouteEntriesRequest setRouteEntries(java.util.List<DeleteRouteEntriesRequestRouteEntries> routeEntries) {
        this.routeEntries = routeEntries;
        return this;
    }
    public java.util.List<DeleteRouteEntriesRequestRouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static class DeleteRouteEntriesRequestRouteEntries extends TeaModel {
        /**
         * <p>The destination CIDR block of the route entry that you want to delete. IPv4 and IPv6 CIDR blocks are supported. You can specify up to 50 destination CIDR blocks.</p>
         * <br>
         * <p>>  If the **RouteEntryId** parameter is not specified, you must specify the **DstCidrBlock** and **NextHop** parameters.</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The ID of the next hop that you want to delete. You can specify up to 50 next hop IDs.</p>
         * <br>
         * <p>>  If the **RouteEntryId** parameter is not specified, you must specify the **DstCidrBlock** and **NextHop** parameters.</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The ID of the route entry that you want to delete. You can specify up to 50 route entry IDs.</p>
         * <br>
         * <p>>  If the **RouteEntryId** parameter is not specified, you must specify the **DstCidrBlock** and **NextHop** parameters.</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>The ID of the route table in which the route entry to be deleted resides. You can specify up to 50 route table IDs.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DeleteRouteEntriesRequestRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteEntriesRequestRouteEntries self = new DeleteRouteEntriesRequestRouteEntries();
            return TeaModel.build(map, self);
        }

        public DeleteRouteEntriesRequestRouteEntries setDstCidrBlock(String dstCidrBlock) {
            this.dstCidrBlock = dstCidrBlock;
            return this;
        }
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        public DeleteRouteEntriesRequestRouteEntries setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DeleteRouteEntriesRequestRouteEntries setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DeleteRouteEntriesRequestRouteEntries setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
