// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    // The bandwidth of the endpoint connection. Unit: Mbit/s.
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // The status of the endpoint connection. Valid values:
    // 
    // *   **Pending**: being modified
    // *   **Connecting**: connecting
    // *   **Connected**: connected
    // *   **Disconnecting**: disconnecting
    // *   **Disconnected**: disconnected
    // *   **Deleting**: being deleted
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    // The time when the endpoint was created.
    @NameInMap("CreateTime")
    public String createTime;

    // The business status of the endpoint. Valid values:
    // 
    // *   **Normal**: normal
    // *   **FinacialLocked**: locked due to overdue payments
    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    // The description of the endpoint.
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    // The domain name of the endpoint.
    @NameInMap("EndpointDomain")
    public String endpointDomain;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The name of the endpoint.
    @NameInMap("EndpointName")
    public String endpointName;

    // The status of the endpoint. Valid values:
    // 
    // *   **Creating**: being created
    // *   **Active**: available
    // *   **Pending**: being modified
    // *   **Deleting**: being deleted
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    // The type of the endpoint.
    // 
    // The value is set to **Interface**, which indicates that the resource type of **ServiceId** is Classic Load Balancer (CLB).
    @NameInMap("EndpointType")
    public String endpointType;

    // The payer. Valid values:
    // 
    // *   **Endpoint**: the service consumer
    // *   **EndpointService**: the service provider
    @NameInMap("Payer")
    public String payer;

    // The region ID of the endpoint.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("ResourceOwner")
    public Boolean resourceOwner;

    // The ID of the endpoint service with which the endpoint is associated.
    @NameInMap("ServiceId")
    public String serviceId;

    // The name of the endpoint service that is associated with the endpoint.
    @NameInMap("ServiceName")
    public String serviceName;

    // The ID of the virtual private cloud (VPC) to which the endpoint belongs.
    @NameInMap("VpcId")
    public String vpcId;

    // Indicates whether zone affinity is enabled. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    // The number of private IP addresses that can be used by an elastic network interface (ENI) in each zone. The value is set to **1**.
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

    public GetVpcEndpointAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
