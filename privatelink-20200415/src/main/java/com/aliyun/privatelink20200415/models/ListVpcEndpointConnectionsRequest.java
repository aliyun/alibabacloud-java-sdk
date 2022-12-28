// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsRequest extends TeaModel {
    // The ID of the endpoint connection.
    // 
    // >  This parameter is required only when a gateway is used for load balancing.
    @NameInMap("ConnectionId")
    public Long connectionId;

    // The status of the endpoint connection. Valid values:
    // 
    // *   **Pending**: being modified.
    // *   **Connecting**: connecting.
    // *   **Connected**: connected.
    // *   **Disconnecting**: disconnecting.
    // *   **Disconnected**: disconnected.
    // *   **Deleting**: being deleted.
    // *   **ServiceDeleted**: The corresponding endpoint service is deleted.
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The ID of the Alibaba Cloud account to which the endpoint belongs.
    @NameInMap("EndpointOwnerId")
    public Long endpointOwnerId;

    // The ID of the endpoint elastic network interface (ENI).
    @NameInMap("EniId")
    public String eniId;

    // The number of entries returned per page. Valid values: **1** to **50**. Default value: **50**.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If this is your first query or no next query is to be sent, ignore this parameter.
    // *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
    @NameInMap("NextToken")
    public String nextToken;

    // The region ID of the endpoint connection.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the replaced service resource in smooth migration scenarios.
    @NameInMap("ReplacedResourceId")
    public String replacedResourceId;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The ID of the service resource.
    @NameInMap("ResourceId")
    public String resourceId;

    // The ID of the endpoint service.
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
