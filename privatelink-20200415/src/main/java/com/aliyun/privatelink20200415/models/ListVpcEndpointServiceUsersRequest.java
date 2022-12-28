// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceUsersRequest extends TeaModel {
    // The number of entries to return on each page. Valid values: **1 to 50**. Default value: **50**.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If this is your first query or no next query is to be sent, ignore this parameter.
    // *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the region in which the endpoint service that you want to query resides.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserListType")
    public String userListType;

    public static ListVpcEndpointServiceUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceUsersRequest self = new ListVpcEndpointServiceUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServiceUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServiceUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointServiceUsersRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListVpcEndpointServiceUsersRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ListVpcEndpointServiceUsersRequest setUserListType(String userListType) {
        this.userListType = userListType;
        return this;
    }
    public String getUserListType() {
        return this.userListType;
    }

}
