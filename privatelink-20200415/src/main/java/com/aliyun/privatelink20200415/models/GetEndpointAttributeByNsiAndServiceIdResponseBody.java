// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetEndpointAttributeByNsiAndServiceIdResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ConnectionStatus")
    public String connectionStatus;

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

    // Id of the request
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

    public static GetEndpointAttributeByNsiAndServiceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointAttributeByNsiAndServiceIdResponseBody self = new GetEndpointAttributeByNsiAndServiceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setResourceOwner(Boolean resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public Boolean getResourceOwner() {
        return this.resourceOwner;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public GetEndpointAttributeByNsiAndServiceIdResponseBody setZonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
        this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
        return this;
    }
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

}
