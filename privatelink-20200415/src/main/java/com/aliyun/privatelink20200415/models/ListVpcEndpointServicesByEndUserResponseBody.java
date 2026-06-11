// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>If this parameter is empty, all results have been returned.</p>
     * </li>
     * <li><p>If a value is returned, use it in a subsequent request to retrieve the next page of results.</p>
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
     * <p>The endpoint services.</p>
     */
    @NameInMap("Services")
    public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> services;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListVpcEndpointServicesByEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesByEndUserResponseBody self = new ListVpcEndpointServicesByEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesByEndUserResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setServices(java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> getServices() {
        return this.services;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListVpcEndpointServicesByEndUserResponseBodyServicesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointServicesByEndUserResponseBodyServicesTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesByEndUserResponseBodyServicesTags self = new ListVpcEndpointServicesByEndUserResponseBodyServicesTags();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServicesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServicesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVpcEndpointServicesByEndUserResponseBodyServices extends TeaModel {
        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong>: The service supports IPv4.</p>
         * </li>
         * <li><p><strong>DualStack</strong>: The service supports both IPv4 and IPv6 (dual stack).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        /**
         * <p>Specifies whether connection requests are automatically accepted. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Connection requests are automatically accepted.</p>
         * </li>
         * <li><p><strong>false</strong>: Connection requests must be manually accepted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoAcceptEnabled")
        public Boolean autoAcceptEnabled;

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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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
         * <p>The service resource type.</p>
         * <ul>
         * <li><p><strong>slb</strong>: A Classic Load Balancer (CLB) instance.</p>
         * </li>
         * <li><p><strong>alb</strong>: An Application Load Balancer (ALB) instance.</p>
         * </li>
         * <li><p><strong>nlb</strong>: A Network Load Balancer (NLB) instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ServiceResourceType")
        public String serviceResourceType;

        /**
         * <p>Specifies whether the endpoint service supports IPv6. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The endpoint service supports IPv6.</p>
         * </li>
         * <li><p><strong>false</strong>: The endpoint service does not support IPv6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ServiceSupportIPv6")
        public Boolean serviceSupportIPv6;

        /**
         * <p>The type of the endpoint service.</p>
         * <p>The value is always <strong>Interface</strong>. This indicates an interface endpoint where you can add service resources such as Application Load Balancer (ALB), Classic Load Balancer (CLB), and Network Load Balancer (NLB).</p>
         * 
         * <strong>example:</strong>
         * <p>Interface</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServicesTags> tags;

        @NameInMap("VpcEndpointPolicySupported")
        public Boolean vpcEndpointPolicySupported;

        /**
         * <p>Specifies whether zone affinity is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Zone affinity is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Zone affinity is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ZoneAffinityEnabled")
        public Boolean zoneAffinityEnabled;

        /**
         * <p>The zones where the endpoint service is available.</p>
         */
        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static ListVpcEndpointServicesByEndUserResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesByEndUserResponseBodyServices self = new ListVpcEndpointServicesByEndUserResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }
        public Boolean getAutoAcceptEnabled() {
            return this.autoAcceptEnabled;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setPayer(String payer) {
            this.payer = payer;
            return this;
        }
        public String getPayer() {
            return this.payer;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceDomain(String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }
        public String getServiceDomain() {
            return this.serviceDomain;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceResourceType(String serviceResourceType) {
            this.serviceResourceType = serviceResourceType;
            return this;
        }
        public String getServiceResourceType() {
            return this.serviceResourceType;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceSupportIPv6(Boolean serviceSupportIPv6) {
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }
        public Boolean getServiceSupportIPv6() {
            return this.serviceSupportIPv6;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setTags(java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServicesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServicesTags> getTags() {
            return this.tags;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setVpcEndpointPolicySupported(Boolean vpcEndpointPolicySupported) {
            this.vpcEndpointPolicySupported = vpcEndpointPolicySupported;
            return this;
        }
        public Boolean getVpcEndpointPolicySupported() {
            return this.vpcEndpointPolicySupported;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }
        public Boolean getZoneAffinityEnabled() {
            return this.zoneAffinityEnabled;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
