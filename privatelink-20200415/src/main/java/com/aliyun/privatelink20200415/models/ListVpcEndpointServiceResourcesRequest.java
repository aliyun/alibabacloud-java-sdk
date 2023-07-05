// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceResourcesRequest extends TeaModel {
    /**
     * <p>The virtual private cloud (VPC) to which the service resource belongs.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the service resource.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
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
