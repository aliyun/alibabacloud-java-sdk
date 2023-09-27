// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The state of the endpoint connection. Valid values:</p>
     * <br>
     * <p>*   **Pending**: The connection is being modified.</p>
     * <p>*   **Connecting**: The connection is being established.</p>
     * <p>*   **Connected**: The connection is established.</p>
     * <p>*   **Disconnecting**: The endpoint is being disconnected from the endpoint service.</p>
     * <p>*   **Disconnected**: The endpoint is disconnected from the endpoint service.</p>
     * <p>*   **Deleting**: The connection is being deleted.</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The time when the endpoint was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The service state of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Normal**: The endpoint runs as expected.</p>
     * <p>*   **FinacialLocked**: The endpoint is locked due to overdue payments.</p>
     */
    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    /**
     * <p>The description of the endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The domain name of the endpoint.</p>
     */
    @NameInMap("EndpointDomain")
    public String endpointDomain;

    /**
     * <p>The endpoint ID.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint.</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The state of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Creating**: The endpoint is being created.</p>
     * <p>*   **Active**: The endpoint is available.</p>
     * <p>*   **Pending**: The endpoint is being modified.</p>
     * <p>*   **Deleting**: The endpoint is being deleted.</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The type of the endpoint.</p>
     * <br>
     * <p>**Interface** is returned. The value indicates the interface endpoint with which the Classic Load Balancer (CLB) instances are associated.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The payer. Valid values:</p>
     * <br>
     * <p>*   **Endpoint**: the service consumer.</p>
     * <p>*   **EndpointService**: the service provider.</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The region ID of the endpoint.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
     * <br>
     * <p>*   **true**: The endpoint and the endpoint service belong to the same Alibaba Cloud account.</p>
     * <p>*   **false**: The endpoint and the endpoint service do not belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("ResourceOwner")
    public Boolean resourceOwner;

    /**
     * <p>The ID of the endpoint service with which the endpoint is associated.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the endpoint service with which the endpoint is associated.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Indicates whether zone affinity is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: Zone affinity is enabled.</p>
     * <p>*   **false**: Zone affinity is disabled.</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    /**
     * <p>The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only **1** is returned.</p>
     */
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
