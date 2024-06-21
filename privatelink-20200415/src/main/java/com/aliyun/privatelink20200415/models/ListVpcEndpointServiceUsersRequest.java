// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceUsersRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1 to 50</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
     * <li>If a next request is to be performed, set the value to the value of <strong>NextToken</strong> that is returned from the last call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the endpoint service that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The endpoint service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The ID of the Alibaba Cloud account in the whitelist of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("UserId")
    public Long userId;

    /**
     * <p>The type of the user list in the whitelist of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>Users</p>
     */
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
