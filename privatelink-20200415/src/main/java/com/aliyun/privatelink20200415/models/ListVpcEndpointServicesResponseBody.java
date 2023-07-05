// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<ListVpcEndpointServicesResponseBodyServices> services;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AutoAcceptEnabled")
        public Boolean autoAcceptEnabled;

        @NameInMap("ConnectBandwidth")
        public Integer connectBandwidth;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        @NameInMap("MinBandwidth")
        public Integer minBandwidth;

        @NameInMap("Payer")
        public String payer;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceBusinessStatus")
        public String serviceBusinessStatus;

        @NameInMap("ServiceDescription")
        public String serviceDescription;

        @NameInMap("ServiceDomain")
        public String serviceDomain;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServiceResourceType")
        public String serviceResourceType;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("ServiceSupportIPv6")
        public Boolean serviceSupportIPv6;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointServicesResponseBodyServicesTags> tags;

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
