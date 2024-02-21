// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponseBody extends TeaModel {
    /**
     * <p>The information about the endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListVpcEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</p>
     * <p>*   If a next request is to be performed, set the parameter to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListVpcEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListVpcEndpointsResponseBodyEndpointsTags extends TeaModel {
        /**
         * <p>The key of the tag added to the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag added to the resource.</p>
         */
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
        /**
         * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The state of the endpoint connection. Valid values:</p>
         * <br>
         * <p>*   **Pending**: The endpoint connection is being modified.</p>
         * <p>*   **Connecting**: The endpoint connection is being established.</p>
         * <p>*   **Connected**: The endpoint connection is established.</p>
         * <p>*   **Disconnecting**: The endpoint is being disconnected from the endpoint service.</p>
         * <p>*   **Disconnected**: The endpoint is disconnected from the endpoint service.</p>
         * <p>*   **Deleting**: The endpoint connection is being deleted.</p>
         * <p>*   **ServiceDeleted**: The corresponding service is deleted.</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The time when the endpoint was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The service state of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The endpoint runs as expected.</p>
         * <p>*   **FinancialLocked**: The endpoint is locked due to overdue payments.</p>
         */
        @NameInMap("EndpointBusinessStatus")
        public String endpointBusinessStatus;

        /**
         * <p>The description of the endpoint.</p>
         */
        @NameInMap("EndpointDescription")
        public String endpointDescription;

        /**
         * <p>The domain name of the endpoint.</p>
         */
        @NameInMap("EndpointDomain")
        public String endpointDomain;

        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The name of the endpoint.</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The state of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The endpoint is being created.</p>
         * <p>*   **Active**: The endpoint is available.</p>
         * <p>*   **Pending**: The endpoint is being modified.</p>
         * <p>*   **Deleting**: The endpoint is being deleted.</p>
         */
        @NameInMap("EndpointStatus")
        public String endpointStatus;

        /**
         * <p>The type of the endpoint.</p>
         * <br>
         * <p>Only **Interface** may be returned, which indicates an interface endpoint. You can specify Application Load Balancer (ALB) instances, Classic Load Balancer (CLB) instances, and Network Load Balancer (NLB) instances as service resources.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The region ID of the endpoint.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ResourceOwner")
        public Boolean resourceOwner;

        /**
         * <p>The ID of the endpoint service that is associated with the endpoint.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The name of the endpoint service that is associated with the endpoint.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The tags added to the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointsResponseBodyEndpointsTags> tags;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
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
