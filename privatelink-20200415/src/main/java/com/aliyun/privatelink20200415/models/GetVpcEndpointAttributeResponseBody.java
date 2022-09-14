// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    @NameInMap("EndpointDescription")
    public String endpointDescription;

    @NameInMap("EndpointDomain")
    public String endpointDomain;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("EndpointStatus")
    public String endpointStatus;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Payer")
    public String payer;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceOwner")
    public Boolean resourceOwner;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    @NameInMap("ZonePrivateIpAddressCount")
    public Long zonePrivateIpAddressCount;

    public static GetVpcEndpointAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcEndpointAttributeResponseBody self = new GetVpcEndpointAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcEndpointAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public GetVpcEndpointAttributeResponseBody setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public GetVpcEndpointAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetVpcEndpointAttributeResponseBody setEndpointBusinessStatus(String endpointBusinessStatus) {
        this.endpointBusinessStatus = endpointBusinessStatus;
        return this;
    }
    public String getEndpointBusinessStatus() {
        return this.endpointBusinessStatus;
    }

    public GetVpcEndpointAttributeResponseBody setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public GetVpcEndpointAttributeResponseBody setEndpointDomain(String endpointDomain) {
        this.endpointDomain = endpointDomain;
        return this;
    }
    public String getEndpointDomain() {
        return this.endpointDomain;
    }

    public GetVpcEndpointAttributeResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetVpcEndpointAttributeResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetVpcEndpointAttributeResponseBody setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public GetVpcEndpointAttributeResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetVpcEndpointAttributeResponseBody setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

    public GetVpcEndpointAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVpcEndpointAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcEndpointAttributeResponseBody setResourceOwner(Boolean resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public Boolean getResourceOwner() {
        return this.resourceOwner;
    }

    public GetVpcEndpointAttributeResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetVpcEndpointAttributeResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetVpcEndpointAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetVpcEndpointAttributeResponseBody setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public GetVpcEndpointAttributeResponseBody setZonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
        this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
        return this;
    }
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

}
