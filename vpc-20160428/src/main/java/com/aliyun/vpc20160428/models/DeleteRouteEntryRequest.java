// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryRequest extends TeaModel {
    /**
     * <p>The destination CIDR block of the route. IPv4 CIDR blocks, IPv6 CIDR blocks, prefix list CIDR blocks, and prefix list instance IDs are supported. This parameter is mutually exclusive with the RouteEntryId parameter.</p>
     * <blockquote>
     * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DestinationCidrBlock</strong> and <strong>RouteTableId</strong> parameters are required. Configure the <strong>NextHopId</strong> or <strong>NextHopList</strong> parameter as needed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX/16</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <p><strong>true</strong>: performs a dry run without deleting the route. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</p>
     * <p><strong>false</strong> (default): sends a normal request. After the check succeeds, a 2xx HTTP status code is returned and the route is deleted.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the next hop instance.</p>
     * <ul>
     * <li>To delete a non-ECMP route, specify <strong>NextHopId</strong>. Do not specify <strong>NextHopList</strong>.</li>
     * <li>To delete an ECMP route, specify <strong>NextHopList</strong>. Do not specify <strong>NextHopId</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ri-2zeo3xzyf38r4urzd****</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The information about the next hop instances of the ECMP route. A maximum of 16 next hop instances are supported.</p>
     */
    @NameInMap("NextHopList")
    public java.util.List<DeleteRouteEntryRequestNextHopList> nextHopList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the route table resides.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The ID of the route that you want to delete. This parameter is mutually exclusive with the DestinationCidrBlock parameter.</p>
     * <blockquote>
     * <p>If the <strong>DestinationCidrBlock</strong> parameter is not specified, the <strong>RouteEntryId</strong> parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rte-bp1mnnr2al0naomnpv****</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    /**
     * <p>The ID of the route table that contains the route.  </p>
     * <blockquote>
     * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DestinationCidrBlock</strong> and <strong>RouteTableId</strong> parameters are required. Configure the <strong>NextHopId</strong> or <strong>NextHopList</strong> parameter as needed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vtb-2ze3jgygk9bmsj23s****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static DeleteRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryRequest self = new DeleteRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DeleteRouteEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteRouteEntryRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public DeleteRouteEntryRequest setNextHopList(java.util.List<DeleteRouteEntryRequestNextHopList> nextHopList) {
        this.nextHopList = nextHopList;
        return this;
    }
    public java.util.List<DeleteRouteEntryRequestNextHopList> getNextHopList() {
        return this.nextHopList;
    }

    public DeleteRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteRouteEntryRequest setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public DeleteRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static class DeleteRouteEntryRequestNextHopList extends TeaModel {
        /**
         * <p>The ID of the next hop instance of the ECMP route. A maximum of 16 next hop instances are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf38r43cd****</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of the next hop of the ECMP route. Set the value to <strong>RouterInterface</strong> (router interface). A maximum of 16 next hop instances are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>RouterInterface</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        public static DeleteRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteEntryRequestNextHopList self = new DeleteRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

        public DeleteRouteEntryRequestNextHopList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DeleteRouteEntryRequestNextHopList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

    }

}
