// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceResourcesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</p>
     * <p>*   If a next request is to be performed, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the service resource.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The endpoint service ID.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static ListVpcEndpointServiceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceResourcesRequest self = new ListVpcEndpointServiceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServiceResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServiceResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointServiceResourcesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
