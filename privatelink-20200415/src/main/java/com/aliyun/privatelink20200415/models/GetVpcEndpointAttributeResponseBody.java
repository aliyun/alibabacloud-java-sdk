// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The description of the endpoint.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The ID of the endpoint service with which the endpoint is associated.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The business status of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Normal**: normal</p>
     * <p>*   **FinacialLocked**: locked due to overdue payments</p>
     */
    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    /**
     * <p>The name of the endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
     */
    @NameInMap("EndpointDomain")
    public String endpointDomain;

    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The time when the endpoint was created.</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The operation that you want to perform. Set the value to **GetVpcEndpointAttribute**.</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The payer. Valid values:</p>
     * <br>
     * <p>*   **Endpoint**: the service consumer</p>
     * <p>*   **EndpointService**: the service provider</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The name of the endpoint service that is associated with the endpoint.</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The number of private IP addresses that can be used by an elastic network interface (ENI) in each zone. The value is set to **1**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the endpoint.</p>
     * <br>
     * <p>The value is set to **Interface**, which indicates that the resource type of **ServiceId** is Classic Load Balancer (CLB).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Queries the details about a specified endpoint.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The region ID of the endpoint.</p>
     */
    @NameInMap("ResourceOwner")
    public Boolean resourceOwner;

    /**
     * <p>Indicates whether zone affinity is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The status of the endpoint connection. Valid values:</p>
     * <br>
     * <p>*   **Pending**: being modified</p>
     * <p>*   **Connecting**: connecting</p>
     * <p>*   **Connected**: connected</p>
     * <p>*   **Disconnecting**: disconnecting</p>
     * <p>*   **Disconnected**: disconnected</p>
     * <p>*   **Deleting**: being deleted</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The domain name of the endpoint.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    /**
     * <p>The region ID of the endpoint.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.</p>
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
