// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsRequest extends TeaModel {
    /**
     * <p>The ID of the endpoint connection.</p>
     * <br>
     * <p>> This parameter is required only when a gateway is used for load balancing.</p>
     */
    @NameInMap("ConnectionId")
    public Long connectionId;

    /**
     * <p>The state of the endpoint connection. Valid values:</p>
     * <br>
     * <p>*   **Pending**: The endpoint connection is being modified.</p>
     * <p>*   **Connecting**: The endpoint connection is being established.</p>
     * <p>*   **Connected**: The endpoint connection is established.</p>
     * <p>*   **Disconnecting**: The endpoint is being disconnected from the endpoint service.</p>
     * <p>*   **Disconnected**: The endpoint is disconnected from the endpoint service.</p>
     * <p>*   **Deleting**: The connection is being deleted.</p>
     * <p>*   **ServiceDeleted**: The corresponding endpoint service has been deleted.</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The endpoint ID.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the endpoint belongs.</p>
     */
    @NameInMap("EndpointOwnerId")
    public Long endpointOwnerId;

    /**
     * <p>The ID of the endpoint elastic network interface (ENI).</p>
     */
    @NameInMap("EniId")
    public String eniId;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</p>
     * <p>*   If a next request is to be performed, set the value to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the endpoint connection.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replaced service resource in smooth migration scenarios.</p>
     */
    @NameInMap("ReplacedResourceId")
    public String replacedResourceId;

    /**
     * <p>The ID of the resource group to which the endpoint belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service resource ID.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The endpoint service ID.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static ListVpcEndpointConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointConnectionsRequest self = new ListVpcEndpointConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointConnectionsRequest setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public Long getConnectionId() {
        return this.connectionId;
    }

    public ListVpcEndpointConnectionsRequest setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public ListVpcEndpointConnectionsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcEndpointConnectionsRequest setEndpointOwnerId(Long endpointOwnerId) {
        this.endpointOwnerId = endpointOwnerId;
        return this;
    }
    public Long getEndpointOwnerId() {
        return this.endpointOwnerId;
    }

    public ListVpcEndpointConnectionsRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }
    public String getEniId() {
        return this.eniId;
    }

    public ListVpcEndpointConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointConnectionsRequest setReplacedResourceId(String replacedResourceId) {
        this.replacedResourceId = replacedResourceId;
        return this;
    }
    public String getReplacedResourceId() {
        return this.replacedResourceId;
    }

    public ListVpcEndpointConnectionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpcEndpointConnectionsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListVpcEndpointConnectionsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
