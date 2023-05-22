// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The region ID of the gateway endpoint.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If **NextToken** is returned, the value is the token that is used for the next query.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of entries to return per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static ListVpcEndpointServicesByEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesByEndUserRequest self = new ListVpcEndpointServicesByEndUserRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesByEndUserRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServicesByEndUserRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServicesByEndUserRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListVpcEndpointServicesByEndUserRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListVpcEndpointServicesByEndUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointServicesByEndUserRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListVpcEndpointServicesByEndUserRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListVpcEndpointServicesByEndUserRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
