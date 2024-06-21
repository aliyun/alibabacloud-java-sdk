// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The state of the endpoint connection. Valid values:</p>
     * <ul>
     * <li><strong>Pending</strong>: The connection is being modified.</li>
     * <li><strong>Connecting</strong>: The connection is being established.</li>
     * <li><strong>Connected</strong>: The connection is established.</li>
     * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
     * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
     * <li><strong>Deleting</strong>: The connection is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connected</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The time when the endpoint was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-24T18:00:07Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The service state of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: The endpoint runs as expected.</li>
     * <li><strong>FinancialLocked</strong>: The endpoint is locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    /**
     * <p>The description of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my Endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The domain name of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****.epsrv-hp3xdsq46ael67lo****.cn-huhehaote.privatelink.aliyuncs.com</p>
     */
    @NameInMap("EndpointDomain")
    public String endpointDomain;

    /**
     * <p>The endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The state of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The endpoint is being created.</li>
     * <li><strong>Active</strong>: The endpoint is available.</li>
     * <li><strong>Pending</strong>: The endpoint is being modified.</li>
     * <li><strong>Deleting</strong>: The endpoint is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The type of the endpoint.</p>
     * <p><strong>Interface</strong> is returned. The value indicates the interface endpoint with which the Classic Load Balancer (CLB) instances are associated.</p>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The payer. Valid values:</p>
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

    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The region ID of the endpoint.</p>
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
     * <p>rg-acfmz7nocpei***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The endpoint and the endpoint service belong to the same Alibaba Cloud account.</li>
     * <li><strong>false</strong>: The endpoint and the endpoint service do not belong to the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceOwner")
    public Boolean resourceOwner;

    /**
     * <p>The ID of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3xdsq46ael67lo****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-fdfhkjafhjvcvdjf****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    /**
     * <p>The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only <strong>1</strong> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public GetVpcEndpointAttributeResponseBody setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
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
