// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsRequest extends TeaModel {
    // The status of the endpoint connection. Valid values:
    // 
    // *   **Pending**: being modified
    // *   **Connecting**: connecting
    // *   **Connected**: connected
    // *   **Disconnecting**: disconnecting
    // *   **Disconnected**: disconnected
    // *   **Deleting**: being deleted
    // *   **ServiceDeleted**: The corresponding service is deleted.
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    // The ID of the endpoint that you want to query.
    @NameInMap("EndpointId")
    public String endpointId;

    // The name of the endpoint.
    @NameInMap("EndpointName")
    public String endpointName;

    // The status of the endpoint. Valid values:
    // 
    // *   **Creating**: being created
    // *   **Active**: available
    // *   **Pending**: being modified
    // *   **Deleting**: being deleted
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    // The type of the endpoint.
    // 
    // Set the value to **Interface**, which specifies **slb** for the **ServiceId** parameter. The value slb specifies the Classic Load Balancer (CLB) endpoint type.
    @NameInMap("EndpointType")
    public String endpointType;

    // The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If this is your first query or no next query is to be sent, ignore this parameter.
    // *   If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.
    @NameInMap("NextToken")
    public String nextToken;

    // The region ID of the endpoints.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies the ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The name of the endpoint service that is associated with the endpoint to be queried.
    @NameInMap("ServiceName")
    public String serviceName;

    // The tags of the instances you want to query. You can specify up to 20 tags.
    @NameInMap("Tag")
    public java.util.List<ListVpcEndpointsRequestTag> tag;

    // The virtual private cloud (VPC) to which the endpoint belongs.
    @NameInMap("VpcId")
    public String vpcId;

    public static ListVpcEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsRequest self = new ListVpcEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsRequest setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public ListVpcEndpointsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcEndpointsRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public ListVpcEndpointsRequest setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public ListVpcEndpointsRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public ListVpcEndpointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpcEndpointsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListVpcEndpointsRequest setTag(java.util.List<ListVpcEndpointsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVpcEndpointsRequestTag> getTag() {
        return this.tag;
    }

    public ListVpcEndpointsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListVpcEndpointsRequestTag extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsRequestTag self = new ListVpcEndpointsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
