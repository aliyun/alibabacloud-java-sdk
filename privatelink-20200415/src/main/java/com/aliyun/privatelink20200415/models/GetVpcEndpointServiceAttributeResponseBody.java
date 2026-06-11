// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointServiceAttributeResponseBody extends TeaModel {
    /**
     * <p>The IP address version. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong>: The IPv4 address family.</p>
     * </li>
     * <li><p><strong>DualStack</strong>: The dual stack IP address family.</p>
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
     * <li><p><strong>true</strong>: Endpoint connections are automatically accepted.</p>
     * </li>
     * <li><p><strong>false</strong>: Endpoint connections are not automatically accepted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    /**
     * <p>The default maximum bandwidth of an endpoint connection, in Mbps. Valid values are <strong>100 to 10,240</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3072</p>
     */
    @NameInMap("ConnectBandwidth")
    public Integer connectBandwidth;

    /**
     * <p>The time the service was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-02T19:11:12Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The maximum bandwidth of the endpoint connection, in Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("MaxBandwidth")
    public Integer maxBandwidth;

    /**
     * <p>The minimum bandwidth of the endpoint connection, in Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MinBandwidth")
    public Integer minBandwidth;

    /**
     * <p>The party that pays for the service. Valid values:</p>
     * <ul>
     * <li><p><strong>Endpoint</strong>: The service consumer.</p>
     * </li>
     * <li><p><strong>EndpointService</strong>: The service provider.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The region where the service is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D8992C1-6712-423C-BAC5-E5E817484C6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The business status of the service. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: The service is operating normally.</p>
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
     * <p>The description of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my EndpointService.</p>
     */
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    /**
     * <p>The domain name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****.cn-huhehaote.privatelink.aliyuncs.com</p>
     */
    @NameInMap("ServiceDomain")
    public String serviceDomain;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The type of the service resource. Valid values:</p>
     * <ul>
     * <li><p><strong>slb</strong>: The service resource is a Classic Load Balancer (CLB).</p>
     * </li>
     * <li><p><strong>alb</strong>: The service resource is an Application Load Balancer (ALB).</p>
     * </li>
     * <li><p><strong>nlb</strong>: The service resource is a Network Load Balancer (NLB).</p>
     * </li>
     * <li><p><strong>gwlb</strong>: The service resource is a Gateway Load Balancer (GWLB).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The service is being created.</p>
     * </li>
     * <li><p><strong>Pending</strong>: The service is being updated.</p>
     * </li>
     * <li><p><strong>Active</strong>: The service is available.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The service is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    /**
     * <p>Specifies whether the service supports IPv6. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The service supports IPv6.</p>
     * </li>
     * <li><p><strong>false</strong> (default): The service does not support IPv6.</p>
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
     * <p>The endpoint type.</p>
     * <ul>
     * <li><p><strong>Interface</strong>: An interface endpoint. You can add Classic Load Balancer (CLB), Application Load Balancer (ALB), and Network Load Balancer (NLB) instances as service resources.</p>
     * </li>
     * <li><p><strong>GatewayLoadBalancer</strong>: A gateway endpoint. You can add Gateway Load Balancer (GWLB) instances as service resources.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The regions where the service is supported. Service consumers can create endpoint connections to the service from these regions.</p>
     */
    @NameInMap("SupportedRegionSet")
    public java.util.List<GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet> supportedRegionSet;

    /**
     * <p>Specifies whether zone affinity is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): Zone affinity is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Zone affinity is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    /**
     * <p>The zones where the service is available.</p>
     */
    @NameInMap("Zones")
    public java.util.List<String> zones;

    public static GetVpcEndpointServiceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcEndpointServiceAttributeResponseBody self = new GetVpcEndpointServiceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcEndpointServiceAttributeResponseBody setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public GetVpcEndpointServiceAttributeResponseBody setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
        this.autoAcceptEnabled = autoAcceptEnabled;
        return this;
    }
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    public GetVpcEndpointServiceAttributeResponseBody setConnectBandwidth(Integer connectBandwidth) {
        this.connectBandwidth = connectBandwidth;
        return this;
    }
    public Integer getConnectBandwidth() {
        return this.connectBandwidth;
    }

    public GetVpcEndpointServiceAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetVpcEndpointServiceAttributeResponseBody setMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }
    public Integer getMaxBandwidth() {
        return this.maxBandwidth;
    }

    public GetVpcEndpointServiceAttributeResponseBody setMinBandwidth(Integer minBandwidth) {
        this.minBandwidth = minBandwidth;
        return this;
    }
    public Integer getMinBandwidth() {
        return this.minBandwidth;
    }

    public GetVpcEndpointServiceAttributeResponseBody setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

    public GetVpcEndpointServiceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVpcEndpointServiceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcEndpointServiceAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceBusinessStatus(String serviceBusinessStatus) {
        this.serviceBusinessStatus = serviceBusinessStatus;
        return this;
    }
    public String getServiceBusinessStatus() {
        return this.serviceBusinessStatus;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceDomain(String serviceDomain) {
        this.serviceDomain = serviceDomain;
        return this;
    }
    public String getServiceDomain() {
        return this.serviceDomain;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceResourceType(String serviceResourceType) {
        this.serviceResourceType = serviceResourceType;
        return this;
    }
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    @Deprecated
    public GetVpcEndpointServiceAttributeResponseBody setServiceSupportIPv6(Boolean serviceSupportIPv6) {
        this.serviceSupportIPv6 = serviceSupportIPv6;
        return this;
    }
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    public GetVpcEndpointServiceAttributeResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetVpcEndpointServiceAttributeResponseBody setSupportedRegionSet(java.util.List<GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet> supportedRegionSet) {
        this.supportedRegionSet = supportedRegionSet;
        return this;
    }
    public java.util.List<GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet> getSupportedRegionSet() {
        return this.supportedRegionSet;
    }

    public GetVpcEndpointServiceAttributeResponseBody setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public GetVpcEndpointServiceAttributeResponseBody setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public static class GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet extends TeaModel {
        /**
         * <p>The business status of the endpoint service in the supported region. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: The service is operating normally in the supported region.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: The endpoint service is locked due to an overdue payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("RegionBusinessStatus")
        public String regionBusinessStatus;

        /**
         * <p>The status of the endpoint service in the supported region. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: The supported region is being modified.</p>
         * </li>
         * <li><p><strong>Available</strong>: The service is available in the supported region.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The supported region is being deleted.</p>
         * </li>
         * <li><p><strong>Failed</strong>: The service failed to be deployed in the supported region.</p>
         * </li>
         * <li><p><strong>Closed</strong>: The endpoint service is not available in the supported region.</p>
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
         * <p>The ID of the supported region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SupportedRegionId")
        public String supportedRegionId;

        public static GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet build(java.util.Map<String, ?> map) throws Exception {
            GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet self = new GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet();
            return TeaModel.build(map, self);
        }

        public GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet setRegionBusinessStatus(String regionBusinessStatus) {
            this.regionBusinessStatus = regionBusinessStatus;
            return this;
        }
        public String getRegionBusinessStatus() {
            return this.regionBusinessStatus;
        }

        public GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet setRegionServiceStatus(String regionServiceStatus) {
            this.regionServiceStatus = regionServiceStatus;
            return this;
        }
        public String getRegionServiceStatus() {
            return this.regionServiceStatus;
        }

        @Deprecated
        public GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet setServiceRegionId(String serviceRegionId) {
            this.serviceRegionId = serviceRegionId;
            return this;
        }
        public String getServiceRegionId() {
            return this.serviceRegionId;
        }

        public GetVpcEndpointServiceAttributeResponseBodySupportedRegionSet setSupportedRegionId(String supportedRegionId) {
            this.supportedRegionId = supportedRegionId;
            return this;
        }
        public String getSupportedRegionId() {
            return this.supportedRegionId;
        }

    }

}
