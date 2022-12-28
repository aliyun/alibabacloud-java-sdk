// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointZonesRequest extends TeaModel {
    // The ID of the endpoint for which you want to query zones.
    // 
    // After you specify an endpoint ID, the system queries the zones of the specified endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If this is your first query or no next query is to be sent, ignore this parameter.
    // *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the region in which you want to query the zones of an endpoint.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    public static ListVpcEndpointZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointZonesRequest self = new ListVpcEndpointZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointZonesRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcEndpointZonesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointZonesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
