// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4.</li>
     * <li><strong>DualStack</strong>: dual-stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The endpoint connection status. Valid values:</p>
     * <ul>
     * <li><p><strong>Pending</strong>: being modified.</p>
     * </li>
     * <li><p><strong>Connecting</strong>: connecting.</p>
     * </li>
     * <li><p><strong>Connected</strong>: connected.</p>
     * </li>
     * <li><p><strong>Disconnecting</strong>: disconnecting.</p>
     * </li>
     * <li><p><strong>Disconnected</strong>: disconnected.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: being deleted.</p>
     * </li>
     * <li><p><strong>ServiceDeleted</strong>: the corresponding endpoint service has been deleted.</p>
     * </li>
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
     * <p>The cross-region bandwidth of the endpoint. Unit: Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CrossRegionBandwidth")
    public Integer crossRegionBandwidth;

    /**
     * <p>The business status of the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Normal.</p>
     * </li>
     * <li><p><strong>FinancialLocked</strong>: Financial lock.</p>
     * </li>
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
     * <p>The endpoint domain name.</p>
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
     * <p>The status of the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: being created.</p>
     * </li>
     * <li><p><strong>Active</strong>: available.</p>
     * </li>
     * <li><p><strong>Pending</strong>: being modified.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The endpoint type. Valid values:</p>
     * <ul>
     * <li><p><strong>Interface</strong>: interface endpoint.</p>
     * </li>
     * <li><p><strong>Reverse</strong>: reverse endpoint.</p>
     * </li>
     * <li><p><strong>GatewayLoadBalancer</strong>: Gateway Load Balancer endpoint (GWLBe).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The payer. Valid values:</p>
     * <ul>
     * <li><p><strong>Endpoint</strong>: the service consumer.</p>
     * </li>
     * <li><p><strong>EndpointService</strong>: the service provider.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The RAM access policy. For more information about the policy definition, see <a href="https://help.aliyun.com/document_detail/93738.html">Policy elements</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;Version&quot;: &quot;1&quot;,
     *   &quot;Statement&quot;: [
     *     {
     *       &quot;Effect&quot;: &quot;Allow&quot;,
     *       &quot;Action&quot;: [
     *         &quot;oss:List*&quot;,
     *         &quot;oss:PutObject&quot;,
     *         &quot;oss:GetObject&quot;
     *       ],
     *       &quot;Resource&quot;: [
     *         &quot;acs:oss:oss-<em>:</em>:pvl-policy-test/policy-test.txt&quot;
     *       ],
     *       &quot;Principal&quot;: {
     *         &quot;RAM&quot;: [
     *           &quot;acs:ram::14199xxxxxx:*&quot;
     *         ]
     *       }
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>Indicates whether managed protection is enabled. This parameter takes effect only when the STS calling method is used. Valid values:</p>
     * <p><strong>true</strong>: enabled. After managed protection is enabled, only the same user who created the endpoint can modify or delete the endpoint by using STS.</p>
     * <p><strong>false</strong>: disabled.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProtectedEnabled")
    public Boolean protectedEnabled;

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
     * <li><p><strong>true</strong>: The endpoint and the endpoint service belong to the same account.</p>
     * </li>
     * <li><p><strong>false</strong>: The endpoint and the endpoint service belong to different accounts.</p>
     * </li>
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
     * <p>The region ID of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-fdfhkjafhjvcvdjf****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Indicates whether zone affinity is enabled for the endpoint domain name to resolve to the connected service. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    /**
     * <p>The number of private IP addresses assigned to the endpoint elastic network interface (ENI) in each zone. The value is fixed to <strong>1</strong>.</p>
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

    public GetVpcEndpointAttributeResponseBody setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
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

    public GetVpcEndpointAttributeResponseBody setCrossRegionBandwidth(Integer crossRegionBandwidth) {
        this.crossRegionBandwidth = crossRegionBandwidth;
        return this;
    }
    public Integer getCrossRegionBandwidth() {
        return this.crossRegionBandwidth;
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

    public GetVpcEndpointAttributeResponseBody setProtectedEnabled(Boolean protectedEnabled) {
        this.protectedEnabled = protectedEnabled;
        return this;
    }
    public Boolean getProtectedEnabled() {
        return this.protectedEnabled;
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

    public GetVpcEndpointAttributeResponseBody setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
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
