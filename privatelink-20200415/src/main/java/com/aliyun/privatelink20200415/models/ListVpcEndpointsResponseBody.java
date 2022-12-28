// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponseBody extends TeaModel {
    // The list of endpoints.
    @NameInMap("Endpoints")
    public java.util.List<ListVpcEndpointsResponseBodyEndpoints> endpoints;

    // The number of entries returned per page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If the value returned of **NextToken** is empty, it indicates that no next query is to be sent.
    // *   If the value returned of **NextToken** is not empty, the value indicates the token that is used for the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListVpcEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsResponseBody self = new ListVpcEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsResponseBody setEndpoints(java.util.List<ListVpcEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListVpcEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListVpcEndpointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpcEndpointsResponseBodyEndpointsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointsResponseBodyEndpointsTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsResponseBodyEndpointsTags self = new ListVpcEndpointsResponseBodyEndpointsTags();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsResponseBodyEndpointsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointsResponseBodyEndpointsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVpcEndpointsResponseBodyEndpoints extends TeaModel {
        // The maximum bandwidth of the endpoint connection. Unit: Mbit/s.
        @NameInMap("Bandwidth")
        public Long bandwidth;

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

        // The time when the endpoint was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The business status of the endpoint. Valid values:
        // 
        // *   **Normal**: normal
        // *   **FinacialLocked**: locked due to overdue payments
        @NameInMap("EndpointBusinessStatus")
        public String endpointBusinessStatus;

        // The description of the endpoint.
        @NameInMap("EndpointDescription")
        public String endpointDescription;

        // The domain name of the endpoint.
        @NameInMap("EndpointDomain")
        public String endpointDomain;

        // The ID of the endpoint.
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
        // Set the value to **Interface**, which indicates that **slb** is set for the **ServiceId** parameter. The value slb indicates the CLB endpoint type.
        @NameInMap("EndpointType")
        public String endpointType;

        // The region ID of the endpoint.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("ResourceOwner")
        public Boolean resourceOwner;

        // The ID of the endpoint service that is associated with the endpoint.
        @NameInMap("ServiceId")
        public String serviceId;

        // The name of the endpoint service that is associated with the endpoint.
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointsResponseBodyEndpointsTags> tags;

        // The VPC to which the endpoint belongs.
        @NameInMap("VpcId")
        public String vpcId;

        // Indicates whether zone affinity is enabled. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("ZoneAffinityEnabled")
        public Boolean zoneAffinityEnabled;

        public static ListVpcEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsResponseBodyEndpoints self = new ListVpcEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsResponseBodyEndpoints setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public ListVpcEndpointsResponseBodyEndpoints setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListVpcEndpointsResponseBodyEndpoints setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }
        public String getEndpointBusinessStatus() {
            return this.endpointBusinessStatus;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }
        public String getEndpointDescription() {
            return this.endpointDescription;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }
        public String getEndpointDomain() {
            return this.endpointDomain;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListVpcEndpointsResponseBodyEndpoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setResourceOwner(Boolean resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public Boolean getResourceOwner() {
            return this.resourceOwner;
        }

        public ListVpcEndpointsResponseBodyEndpoints setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcEndpointsResponseBodyEndpoints setTags(java.util.List<ListVpcEndpointsResponseBodyEndpointsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpcEndpointsResponseBodyEndpointsTags> getTags() {
            return this.tags;
        }

        public ListVpcEndpointsResponseBodyEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }
        public Boolean getZoneAffinityEnabled() {
            return this.zoneAffinityEnabled;
        }

    }

}
