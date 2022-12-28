// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointServiceAttributeResponseBody extends TeaModel {
    // Indicates whether endpoint connection requests are automatically accepted. Valid values:
    // 
    // *   **true**: automatically accepts endpoint connection requests.
    // *   **false**: does not automatically accept endpoint connection requests.
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    // The default maximum bandwidth of the endpoint connection. Unit: Mbit/s. Valid values: **100** to 10240.
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

    // The region to which the endpoint service belongs.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Specifies the ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The business status of the endpoint service. Valid values:
    // 
    // *   **Normal**: The endpoint service runs as expected.
    // *   **FinacialLocked**: The endpoint service is locked due to overdue payments.
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
    // The value is set to **slb**, which indicates CLB.
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    // The state of the endpoint service. Valid values:
    // 
    // *   **Creating**: The endpoint service is being created.
    // *   **Pending**: The endpoint service is being modified.
    // *   **Active**: The endpoint service is available.
    // *   **Deleting**: The endpoint service is being deleted.
    // *   **Inactive**: The endpoint service is unavailable.
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    // Indicates whether the endpoint service supports IPv6. Valid values:
    // 
    // *   **true**: The endpoint service supports IPv6.
    // *   **false**: The endpoint service does not support IPv6. This is the default value.
    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    // The type of the endpoint service.
    // 
    // The value is set to **Interface**. This value is used when **ServiceResourceType** is set to **slb**. The value indicates the Classic Load Balancer (CLB) type.
    @NameInMap("ServiceType")
    public String serviceType;

    // Specifies whether to enable zone affinity. Valid values:
    // 
    // *   **true**: enables zone affinity.
    // *   **false**: disables zone affinity.
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    // The zones to which the service resource belongs.
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
