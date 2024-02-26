// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next requests are performed.</p>
     * <p>*   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The endpoint services.</p>
     */
    @NameInMap("Services")
    public java.util.List<ListVpcEndpointServicesResponseBodyServices> services;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListVpcEndpointServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesResponseBody self = new ListVpcEndpointServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointServicesResponseBody setServices(java.util.List<ListVpcEndpointServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListVpcEndpointServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public ListVpcEndpointServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListVpcEndpointServicesResponseBodyServicesTags extends TeaModel {
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

        public static ListVpcEndpointServicesResponseBodyServicesTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesResponseBodyServicesTags self = new ListVpcEndpointServicesResponseBodyServicesTags();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesResponseBodyServicesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointServicesResponseBodyServicesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVpcEndpointServicesResponseBodyServices extends TeaModel {
        /**
         * <p>Indicates whether endpoint connection requests are automatically accepted. Valid values:</p>
         * <br>
         * <p>*   **true**: Endpoint connection requests are automatically accepted.</p>
         * <p>*   **false**: Endpoint connection requests are not automatically accepted.</p>
         */
        @NameInMap("AutoAcceptEnabled")
        public Boolean autoAcceptEnabled;

        /**
         * <p>The default maximum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         */
        @NameInMap("ConnectBandwidth")
        public Integer connectBandwidth;

        /**
         * <p>The time when the endpoint service was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The maximum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         */
        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        /**
         * <p>The minimum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         */
        @NameInMap("MinBandwidth")
        public Integer minBandwidth;

        /**
         * <p>The payer. Valid values:</p>
         * <br>
         * <p>*   **Endpoint**: service consumer</p>
         * <p>*   **EndpointService**: service provider</p>
         */
        @NameInMap("Payer")
        public String payer;

        /**
         * <p>The region ID of the endpoint service.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The service state of the endpoint service. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The endpoint service runs as expected.</p>
         * <p>*   **FinancialLocked**: The endpoint service is locked due to overdue payments.</p>
         */
        @NameInMap("ServiceBusinessStatus")
        public String serviceBusinessStatus;

        /**
         * <p>The description of the endpoint service.</p>
         */
        @NameInMap("ServiceDescription")
        public String serviceDescription;

        /**
         * <p>The domain name of the endpoint service.</p>
         */
        @NameInMap("ServiceDomain")
        public String serviceDomain;

        /**
         * <p>The ID of the endpoint service.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The name of the endpoint service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The type of the service resource. Valid values:</p>
         * <br>
         * <p>*   **slb**: Classic Load Balancer (CLB) instance</p>
         * <p>*   **alb**: Application Load Balancer (ALB) instance</p>
         * <p>*   **nlb**: Network Load Balancer (NLB) instance</p>
         */
        @NameInMap("ServiceResourceType")
        public String serviceResourceType;

        /**
         * <p>The state of the endpoint service. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The endpoint service is being created.</p>
         * <p>*   **Pending**: The endpoint service is being modified.</p>
         * <p>*   **Active**: The endpoint service is available.</p>
         * <p>*   **Deleting**: The endpoint service is being deleted.</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ServiceSupportIPv6")
        public Boolean serviceSupportIPv6;

        /**
         * <p>The type of the endpoint service.</p>
         * <br>
         * <p>*   Only **Interface** may be returned. You can specify CLB, ALB, and NLB instances as the service resources of the endpoint service.</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The tags added to the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointServicesResponseBodyServicesTags> tags;

        /**
         * <p>Indicates whether zone affinity is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ZoneAffinityEnabled")
        public Boolean zoneAffinityEnabled;

        public static ListVpcEndpointServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesResponseBodyServices self = new ListVpcEndpointServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesResponseBodyServices setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }
        public Boolean getAutoAcceptEnabled() {
            return this.autoAcceptEnabled;
        }

        public ListVpcEndpointServicesResponseBodyServices setConnectBandwidth(Integer connectBandwidth) {
            this.connectBandwidth = connectBandwidth;
            return this;
        }
        public Integer getConnectBandwidth() {
            return this.connectBandwidth;
        }

        public ListVpcEndpointServicesResponseBodyServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpcEndpointServicesResponseBodyServices setMaxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

        public ListVpcEndpointServicesResponseBodyServices setMinBandwidth(Integer minBandwidth) {
            this.minBandwidth = minBandwidth;
            return this;
        }
        public Integer getMinBandwidth() {
            return this.minBandwidth;
        }

        public ListVpcEndpointServicesResponseBodyServices setPayer(String payer) {
            this.payer = payer;
            return this;
        }
        public String getPayer() {
            return this.payer;
        }

        public ListVpcEndpointServicesResponseBodyServices setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcEndpointServicesResponseBodyServices setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceBusinessStatus(String serviceBusinessStatus) {
            this.serviceBusinessStatus = serviceBusinessStatus;
            return this;
        }
        public String getServiceBusinessStatus() {
            return this.serviceBusinessStatus;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceDomain(String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }
        public String getServiceDomain() {
            return this.serviceDomain;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceResourceType(String serviceResourceType) {
            this.serviceResourceType = serviceResourceType;
            return this;
        }
        public String getServiceResourceType() {
            return this.serviceResourceType;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceSupportIPv6(Boolean serviceSupportIPv6) {
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }
        public Boolean getServiceSupportIPv6() {
            return this.serviceSupportIPv6;
        }

        public ListVpcEndpointServicesResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListVpcEndpointServicesResponseBodyServices setTags(java.util.List<ListVpcEndpointServicesResponseBodyServicesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpcEndpointServicesResponseBodyServicesTags> getTags() {
            return this.tags;
        }

        public ListVpcEndpointServicesResponseBodyServices setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }
        public Boolean getZoneAffinityEnabled() {
            return this.zoneAffinityEnabled;
        }

    }

}
