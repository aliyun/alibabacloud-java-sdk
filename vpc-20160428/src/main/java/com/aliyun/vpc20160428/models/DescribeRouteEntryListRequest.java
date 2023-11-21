// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListRequest extends TeaModel {
    /**
     * <p>The destination CIDR blocks of the routes.</p>
     */
    @NameInMap("DestCidrBlockList")
    public java.util.List<String> destCidrBlockList;

    /**
     * <p>The destination CIDR block of the route. IPv4 and IPv6 CIDR blocks are supported.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The IP version. Valid values:</p>
     * <br>
     * <p>*   **IPv4**</p>
     * <p>*   **IPv6**</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The number of entries per page. Valid values: **1** to **100**. Default value: **10**.</p>
     */
    @NameInMap("MaxResult")
    public Integer maxResult;

    /**
     * <p>The ID of the next hop.</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The type of the next hop. Valid values:</p>
     * <br>
     * <p>*   **Instance** (default): an Elastic Compute Service (ECS) instance</p>
     * <p>*   **HaVip**: a high-availability virtual IP address (HAVIP).</p>
     * <p>*   **VpnGateway**: a VPN gateway</p>
     * <p>*   **NatGateway**: a NAT gateway</p>
     * <p>*   **NetworkInterface**: a secondary elastic network interface (ENI)</p>
     * <p>*   **RouterInterface**: a router interface</p>
     * <p>*   **IPv6Gateway**: an IPv6 gateway</p>
     * <p>*   **Attachment**: a transit router</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

    /**
     * <p>The ID of the route that you want to query.</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    /**
     * <p>The name of the route entry.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    /**
     * <p>The route type. Valid values:</p>
     * <br>
     * <p>*   **Custom**</p>
     * <p>*   **System**</p>
     * <p>*   **BGP**</p>
     * <p>*   **CEN**</p>
     */
    @NameInMap("RouteEntryType")
    public String routeEntryType;

    /**
     * <p>The ID of the route table that you want to query.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>Specifies whether to host the route. If the parameter is empty, the route is not hosted.</p>
     * <br>
     * <p>Set the value to **TR**, which specifies that the route is hosted by a transit router.</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static DescribeRouteEntryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteEntryListRequest self = new DescribeRouteEntryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRouteEntryListRequest setDestCidrBlockList(java.util.List<String> destCidrBlockList) {
        this.destCidrBlockList = destCidrBlockList;
        return this;
    }
    public java.util.List<String> getDestCidrBlockList() {
        return this.destCidrBlockList;
    }

    public DescribeRouteEntryListRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DescribeRouteEntryListRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeRouteEntryListRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public DescribeRouteEntryListRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public DescribeRouteEntryListRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public DescribeRouteEntryListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRouteEntryListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRouteEntryListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRouteEntryListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRouteEntryListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRouteEntryListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRouteEntryListRequest setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public DescribeRouteEntryListRequest setRouteEntryName(String routeEntryName) {
        this.routeEntryName = routeEntryName;
        return this;
    }
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public DescribeRouteEntryListRequest setRouteEntryType(String routeEntryType) {
        this.routeEntryType = routeEntryType;
        return this;
    }
    public String getRouteEntryType() {
        return this.routeEntryType;
    }

    public DescribeRouteEntryListRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public DescribeRouteEntryListRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
