// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token for the next query. Valid values:</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, no further results exist.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> has a value, use it as the starting token for the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The collection of endpoint services.</p>
     */
    @NameInMap("Services")
    public java.util.List<ListVpcEndpointServicesResponseBodyServices> services;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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

    public static class ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet extends TeaModel {
        /**
         * <p>The business status of the region supported by the endpoint service. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Normal.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: Locked due to an overdue payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("RegionBusinessStatus")
        public String regionBusinessStatus;

        /**
         * <p>The status of the region supported by the endpoint service. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: The status is being updated.</p>
         * </li>
         * <li><p><strong>Available</strong>: The region is available.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The region is being deleted.</p>
         * </li>
         * <li><p><strong>Failed</strong>: The operation failed.</p>
         * </li>
         * <li><p><strong>Closed</strong>: The region is closed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("RegionServiceStatus")
        public String regionServiceStatus;

        @NameInMap("ServiceRegionId")
        @Deprecated
        public String serviceRegionId;

        /**
         * <p>The ID of the region supported by the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SupportedRegionId")
        public String supportedRegionId;

        public static ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet self = new ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet setRegionBusinessStatus(String regionBusinessStatus) {
            this.regionBusinessStatus = regionBusinessStatus;
            return this;
        }
        public String getRegionBusinessStatus() {
            return this.regionBusinessStatus;
        }

        public ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet setRegionServiceStatus(String regionServiceStatus) {
            this.regionServiceStatus = regionServiceStatus;
            return this;
        }
        public String getRegionServiceStatus() {
            return this.regionServiceStatus;
        }

        @Deprecated
        public ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet setServiceRegionId(String serviceRegionId) {
            this.serviceRegionId = serviceRegionId;
            return this;
        }
        public String getServiceRegionId() {
            return this.serviceRegionId;
        }

        public ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet setSupportedRegionId(String supportedRegionId) {
            this.supportedRegionId = supportedRegionId;
            return this;
        }
        public String getSupportedRegionId() {
            return this.supportedRegionId;
        }

    }

    public static class ListVpcEndpointServicesResponseBodyServicesTags extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
         * <p>The IP address version. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong>: IPv4 type.</p>
         * </li>
         * <li><p><strong>DualStack</strong>: Dual-stack type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        /**
         * <p>Specifies whether to automatically accept endpoint connections. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Automatically accept endpoint connections.</p>
         * </li>
         * <li><p><strong>false</strong>: Do not automatically accept endpoint connections.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoAcceptEnabled")
        public Boolean autoAcceptEnabled;

        /**
         * <p>The default maximum bandwidth. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ConnectBandwidth")
        public Integer connectBandwidth;

        /**
         * <p>The time when the endpoint service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-24T17:15:10Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The maximum bandwidth of the endpoint connection. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        /**
         * <p>The minimum bandwidth of the endpoint connection. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MinBandwidth")
        public Integer minBandwidth;

        /**
         * <p>The payer. Valid values:</p>
         * <ul>
         * <li><p><strong>Endpoint</strong>: the service consumer.</p>
         * </li>
         * <li><p><strong>EndpointService</strong>: the service provider.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Endpoint</p>
         */
        @NameInMap("Payer")
        public String payer;

        /**
         * <p>The region where the endpoint service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The business status of the endpoint service. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: The endpoint service is running as expected.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: The endpoint service is locked due to an overdue payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("ServiceBusinessStatus")
        public String serviceBusinessStatus;

        /**
         * <p>The description of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my EndpointService.</p>
         */
        @NameInMap("ServiceDescription")
        public String serviceDescription;

        /**
         * <p>The domain name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****.cn-huhehaote.privatelink.aliyuncs.com</p>
         */
        @NameInMap("ServiceDomain")
        public String serviceDomain;

        /**
         * <p>The ID of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The type of the service resource. Valid values:</p>
         * <ul>
         * <li><p><strong>slb</strong>: The service resource is a CLB instance.</p>
         * </li>
         * <li><p><strong>alb</strong>: The service resource is an ALB instance.</p>
         * </li>
         * <li><p><strong>nlb</strong>: The service resource is an NLB instance.</p>
         * </li>
         * <li><p><strong>gwlb</strong>: The service resource is a GWLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ServiceResourceType")
        public String serviceResourceType;

        /**
         * <p>The status of the endpoint service. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The endpoint service is being created.</p>
         * </li>
         * <li><p><strong>Pending</strong>: The endpoint service is being modified.</p>
         * </li>
         * <li><p><strong>Active</strong>: The endpoint service is available.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The endpoint service is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ServiceSupportIPv6")
        @Deprecated
        public Boolean serviceSupportIPv6;

        /**
         * <p>The type of the endpoint service. Valid values:</p>
         * <ul>
         * <li><p><strong>Interface</strong>: an interface endpoint. You can add CLB, ALB, and NLB instances as service resources.</p>
         * </li>
         * <li><p><strong>GatewayLoadBalancer</strong>: a Gateway Load Balancer endpoint. You can add GWLB instances as service resources.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Interface</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The list of regions supported by the endpoint service. Service consumers can initiate endpoint connections from these regions.</p>
         */
        @NameInMap("SupportedRegionSet")
        public java.util.List<ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet> supportedRegionSet;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointServicesResponseBodyServicesTags> tags;

        /**
         * <p>Specifies whether zonal affinity is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ZoneAffinityEnabled")
        public Boolean zoneAffinityEnabled;

        public static ListVpcEndpointServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesResponseBodyServices self = new ListVpcEndpointServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesResponseBodyServices setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
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

        @Deprecated
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

        public ListVpcEndpointServicesResponseBodyServices setSupportedRegionSet(java.util.List<ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet> supportedRegionSet) {
            this.supportedRegionSet = supportedRegionSet;
            return this;
        }
        public java.util.List<ListVpcEndpointServicesResponseBodyServicesSupportedRegionSet> getSupportedRegionSet() {
            return this.supportedRegionSet;
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
