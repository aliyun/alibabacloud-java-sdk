// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointSecurityGroupsRequest extends TeaModel {
    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The number of entries to return on each page. Valid values:**1** to **50**. Default value: **50**.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The query token. Set this parameter to the NextToken parameter value that is returned in the last API call. If no subsequent queries are to be sent, you can leave the parameter empty.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the region where the endpoint is created. You can call the [DescribeRegions](~~120468~~) operation to query region IDs.
    @NameInMap("RegionId")
    public String regionId;

    public static ListVpcEndpointSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointSecurityGroupsRequest self = new ListVpcEndpointSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointSecurityGroupsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcEndpointSecurityGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointSecurityGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointSecurityGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
