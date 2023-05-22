// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGatewayRouteTableEntriesRequest extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.</p>
     */
    @NameInMap("GatewayRouteTableId")
    public String gatewayRouteTableId;

    /**
     * <p>The ID of the gateway route table that you want to query.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The destination CIDR block of the route in the gateway route table.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query and no next queries are to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListGatewayRouteTableEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteTableEntriesRequest self = new ListGatewayRouteTableEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteTableEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public ListGatewayRouteTableEntriesRequest setGatewayRouteTableId(String gatewayRouteTableId) {
        this.gatewayRouteTableId = gatewayRouteTableId;
        return this;
    }
    public String getGatewayRouteTableId() {
        return this.gatewayRouteTableId;
    }

    public ListGatewayRouteTableEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGatewayRouteTableEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGatewayRouteTableEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListGatewayRouteTableEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListGatewayRouteTableEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListGatewayRouteTableEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListGatewayRouteTableEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
