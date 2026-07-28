// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntriesRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <p><strong>true</strong>: performs a dry run without deleting routes. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</p>
     * <p><strong>false</strong> (default): sends a normal request. If the check passes, a 2xx HTTP status code is returned and the routes are deleted.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the route table resides.</p>
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
     * <p>The information about the route entries to delete.</p>
     */
    @NameInMap("RouteEntries")
    public java.util.List<DeleteRouteEntriesRequestRouteEntries> routeEntries;

    public static DeleteRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntriesRequest self = new DeleteRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
         * <p>The destination CIDR block of the route entry to delete. IPv4 CIDR blocks, IPv6 CIDR blocks, and prefix list CIDR blocks are supported. You can specify up to 50 destination CIDR blocks.</p>
         * <blockquote>
         * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DstCidrBlock</strong> and <strong>NextHop</strong> parameters are required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/24</p>
         */
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        /**
         * <p>The ID of the next hop instance to delete. You can specify up to 50 instance IDs.</p>
         * <blockquote>
         * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DstCidrBlock</strong> and <strong>NextHop</strong> parameters are required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        @NameInMap("NextHop")
        public String nextHop;

        /**
         * <p>The ID of the route entry to delete. You can specify up to 50 route entry IDs.</p>
         * <blockquote>
         * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DstCidrBlock</strong> and <strong>NextHop</strong> parameters are required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rte-bp1mnnr2al0naomnpv****</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>The ID of the route table that contains the route entry to delete. You can specify up to 50 route table IDs.</p>
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
