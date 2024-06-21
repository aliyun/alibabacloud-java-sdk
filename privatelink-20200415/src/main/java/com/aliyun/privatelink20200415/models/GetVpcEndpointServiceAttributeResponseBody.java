// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointServiceAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether endpoint connection requests are automatically accepted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    /**
     * <p>The default maximum bandwidth of the endpoint connection. Unit: Mbit/s. Valid values: <strong>100</strong> to 10240.</p>
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
     * <p>2020-01-02T19:11:12Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The maximum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("MaxBandwidth")
    public Integer maxBandwidth;

    /**
     * <p>The minimum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MinBandwidth")
    public Integer minBandwidth;

    /**
     * <p>The payer of the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>Endpoint</strong>: the service consumer.</li>
     * <li><strong>EndpointService</strong>: the service provider.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The region ID of the endpoint service.</p>
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service state of the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: The endpoint service runs as expected.</li>
     * <li><strong>FinacialLocked</strong>: The endpoint service is locked due to overdue payments.</li>
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
     * <p>The endpoint service ID.</p>
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
     * <li><strong>slb</strong>: a CLB instance.</li>
     * <li><strong>alb</strong>: an ALB instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    /**
     * <p>The state of the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The endpoint service is being created.</li>
     * <li><strong>Pending</strong>: The endpoint service is being modified.</li>
     * <li><strong>Active</strong>: The endpoint service is available.</li>
     * <li><strong>Deleting</strong>: The endpoint service is being deleted.</li>
     * <li><strong>Inactive</strong>: The endpoint service is unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    /**
     * <p>Indicates whether IPv6 is enabled for the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    /**
     * <p>The type of the endpoint.</p>
     * <p>Only <strong>Interface</strong> is returned. The value indicates the interface endpoint. Then, you can specify ALB and CLB instances as service resources for the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    /**
     * <p>The zones to which the service resources belong.</p>
     */
    @NameInMap("Zones")
    public java.util.List<String> zones;

    public static GetVpcEndpointServiceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcEndpointServiceAttributeResponseBody self = new GetVpcEndpointServiceAttributeResponseBody();
        return TeaModel.build(map, self);
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

}
