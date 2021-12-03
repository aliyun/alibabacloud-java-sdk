// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointServiceAttributeResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    public String requestId;

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

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

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
