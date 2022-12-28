// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesResponseBody extends TeaModel {
    // The number of entries to return on each page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If **NextToken** is empty, no next query is to be sent.
    // *   If a value of **NextToken** is returned, the value is the token that is used for the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The list of endpoint services.
    @NameInMap("Services")
    public java.util.List<ListVpcEndpointServicesResponseBodyServices> services;

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

    public static class ListVpcEndpointServicesResponseBodyServicesTags extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
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
        // Specifies whether endpoint connection requests are automatically accepted. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("AutoAcceptEnabled")
        public Boolean autoAcceptEnabled;

        // The default maximum bandwidth of the endpoint connection. Unit: Mbit/s.
        @NameInMap("ConnectBandwidth")
        public Integer connectBandwidth;

        // The time when the endpoint service was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The maximum bandwidth of the endpoint connection. Unit: Mbit/s.
        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        // The minimum bandwidth of the endpoint connection. Unit: Mbit/s.
        @NameInMap("MinBandwidth")
        public Integer minBandwidth;

        // The payer of the endpoint service. Valid values:
        // 
        // *   **Endpoint**: the service consumer.
        // *   **EndpointService**: the service provider.
        @NameInMap("Payer")
        public String payer;

        // The ID of the region to which the endpoint service belongs.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The business status of the endpoint service. Valid values:
        // 
        // *   **Normal**: running as expected.
        // *   **FinacialLocked**: locked due to overdue payments.
        @NameInMap("ServiceBusinessStatus")
        public String serviceBusinessStatus;

        // The description of the endpoint service.
        @NameInMap("ServiceDescription")
        public String serviceDescription;

        // The domain name of the endpoint service.
        @NameInMap("ServiceDomain")
        public String serviceDomain;

        // The ID of the endpoint service.
        @NameInMap("ServiceId")
        public String serviceId;

        // The name of the endpoint service.
        @NameInMap("ServiceName")
        public String serviceName;

        // The type of the service resource.
        // 
        // Set the value to **slb**, which specifies Classic Load Balancer (CLB).
        @NameInMap("ServiceResourceType")
        public String serviceResourceType;

        // The status of the endpoint service. Valid values:
        // 
        // *   **Creating**: being created.
        // *   **Pending**: being modified.
        // *   **Active**: available.
        // *   **Deleting**: being deleted.
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        // Indicates whether the endpoint service supports IPv6. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("ServiceSupportIPv6")
        public Boolean serviceSupportIPv6;

        // The type of the endpoint service.
        // 
        // The value is set to **Interface**. This value is used when **ServiceResourceType** is set to **slb**. The value slb indicates the CLB endpoint type.
        @NameInMap("ServiceType")
        public String serviceType;

        // The tags of the resource.
        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointServicesResponseBodyServicesTags> tags;

        // Specifies whether to enable zone affinity. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
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
