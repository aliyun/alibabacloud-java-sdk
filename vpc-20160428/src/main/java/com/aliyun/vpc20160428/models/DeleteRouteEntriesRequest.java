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
     * <p>The information about the routes that you want to delete.</p>
     */
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
         * <p>The destination CIDR block of the route that you want to delete. IPv4 and IPv6 CIDR blocks are supported. You can specify up to 50 destination CIDR blocks.</p>
         * <blockquote>
         * <p> If <strong>RouteEntryId</strong> is not specified, <strong>DstCidrBlock</strong> and <strong>NextHop</strong> are required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/24</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The ID of the next hop that you want to delete. You can specify up to 50 next hop IDs.</p>
         * <blockquote>
         * <p> If <strong>RouteEntryId</strong> is not specified, <strong>DstCidrBlock</strong> and <strong>NextHop</strong> are required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The ID of the route that you want to delete. You can specify up to 50 route IDs.</p>
         * <blockquote>
         * <p> If <strong>RouteEntryId</strong> is not specified, <strong>DstCidrBlock</strong> and <strong>NextHop</strong> are required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rte-bp1mnnr2al0naomnpv****</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>The ID of the route table to which the routes to be deleted belongs. You can specify up to 50 route table IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-2ze3jgygk9bmsj23s****</p>
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
