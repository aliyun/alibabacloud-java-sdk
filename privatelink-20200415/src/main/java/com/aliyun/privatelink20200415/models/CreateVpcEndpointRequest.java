// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointRequest extends TeaModel {
    /**
     * <p>The IP version of the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong>: IPv4 (default).</p>
     * </li>
     * <li><p><strong>DualStack</strong>: dual-stack.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To use the dual-stack feature, make sure that the associated endpoint service and the VPC in which the endpoint is created support the dual-stack feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>A client-generated token to ensure the idempotence of the request.</p>
     * <p>You must generate a unique value for this token. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The bandwidth for a cross-region connection, in Mbps. This parameter applies only when the endpoint and endpoint service are in different regions. Valid values:</p>
     * <ul>
     * <li><p><strong>Default</strong>: 1000 for cross-region connections within the Chinese mainland. In all other cases, the value is 100.</p>
     * </li>
     * <li><p><strong>Minimum value</strong>: 100.</p>
     * </li>
     * <li><p><strong>Maximum value</strong>: subject to your account\&quot;s quota. For more information, see <a href="https://help.aliyun.com/zh/privatelink/quotas-and-limits?spm=a2c4g.11174283.help-menu-search-120462.d_0">Quotas and limits</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To use this parameter, make sure that you are creating a cross-region endpoint.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CrossRegionBandwidth")
    public Integer crossRegionBandwidth;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run to check the request\&quot;s validity without committing the action. The system checks for required parameters, request format, and service limits. If the check passes, the <code>DryRunOperation</code> error code is returned. If it fails, an error message is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends the request. If the request is valid, the operation is performed and a 2xx HTTP status code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The description of the endpoint.</p>
     * <p>The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my Endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The name of the endpoint.</p>
     * <p>The name must be 2 to 128 characters long, start with a letter or a Chinese character, and can contain digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The type of the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Interface</strong>: an interface endpoint. You can add Application Load Balancer (ALB), Classic Load Balancer (CLB), and Network Load Balancer (NLB) instances as service resources.</p>
     * </li>
     * <li><p><strong>Reverse</strong>: a reverse endpoint. You can add a VPC NAT Gateway as a service resource.</p>
     * </li>
     * <li><p><strong>GatewayLoadBalancer</strong>: a Gateway Load Balancer endpoint. You can add a Gateway Load Balancer (GWLB) as a service resource.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Services that support reverse endpoints are provided exclusively by Alibaba Cloud and its partners. You cannot create them by default. To request access, contact your account manager.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The Resource Access Management (RAM) policy. For more information about the policy syntax, see <a href="https://help.aliyun.com/document_detail/93738.html">Basic elements of a policy</a>.</p>
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
     * <p>Specifies whether to enable managed protection. This parameter is effective only for requests made with a Security Token Service (STS) token. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables managed protection. After you enable managed protection, only the user who creates the endpoint can modify or delete it by using an STS token.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables managed protection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProtectedEnabled")
    public Boolean protectedEnabled;

    /**
     * <p>The ID of the region in which to create the endpoint.</p>
     * <p>You can obtain the region ID by calling the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of security groups to associate with the endpoint ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-hp33bw6ynvm2yb0e****</p>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>The ID of the associated endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3xdsq46ael67lo****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the associated endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The ID of the region where the endpoint service is deployed. Defaults to the endpoint\&quot;s region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointRequestTag> tag;

    /**
     * <p>The ID of the Virtual Private Cloud (VPC) where the endpoint will be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-hp356stwkxg3fn2xe****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The list of zones for the endpoint.</p>
     */
    @NameInMap("Zone")
    public java.util.List<CreateVpcEndpointRequestZone> zone;

    /**
     * <p>Specifies whether to enable zone affinity. If enabled, requests are routed to the endpoint in the same zone as the client. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables zone affinity.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables zone affinity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    /**
     * <p>The number of private IP addresses for the endpoint\&quot;s elastic network interface (ENI) in each zone. The value must be <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ZonePrivateIpAddressCount")
    public Long zonePrivateIpAddressCount;

    public static CreateVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointRequest self = new CreateVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public CreateVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcEndpointRequest setCrossRegionBandwidth(Integer crossRegionBandwidth) {
        this.crossRegionBandwidth = crossRegionBandwidth;
        return this;
    }
    public Integer getCrossRegionBandwidth() {
        return this.crossRegionBandwidth;
    }

    public CreateVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcEndpointRequest setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public CreateVpcEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateVpcEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateVpcEndpointRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreateVpcEndpointRequest setProtectedEnabled(Boolean protectedEnabled) {
        this.protectedEnabled = protectedEnabled;
        return this;
    }
    public Boolean getProtectedEnabled() {
        return this.protectedEnabled;
    }

    public CreateVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcEndpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcEndpointRequest setSecurityGroupId(java.util.List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public java.util.List<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateVpcEndpointRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateVpcEndpointRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateVpcEndpointRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public CreateVpcEndpointRequest setTag(java.util.List<CreateVpcEndpointRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpcEndpointRequestTag> getTag() {
        return this.tag;
    }

    public CreateVpcEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpcEndpointRequest setZone(java.util.List<CreateVpcEndpointRequestZone> zone) {
        this.zone = zone;
        return this;
    }
    public java.util.List<CreateVpcEndpointRequestZone> getZone() {
        return this.zone;
    }

    public CreateVpcEndpointRequest setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public CreateVpcEndpointRequest setZonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
        this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
        return this;
    }
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

    public static class CreateVpcEndpointRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVpcEndpointRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointRequestTag self = new CreateVpcEndpointRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpcEndpointRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateVpcEndpointRequestZone extends TeaModel {
        /**
         * <p>The IPv6 address of the endpoint ENI in the specified zone.</p>
         * <blockquote>
         * <p>This parameter is valid only when <code>AddressIpVersion</code> is set to <code>DualStack</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2408:4005:34d:<strong><strong>:a58b:62a3:6b55:</strong></strong></p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The ID of the vSwitch in the zone where the endpoint ENI will be created.
         * You can specify up to 10 vSwitch IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hp3uf6045ljdhd5zr****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone for the endpoint.</p>
         * <p>You can specify up to 10 zone IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The IPv4 address of the endpoint ENI in the specified zone.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("ip")
        public String ip;

        public static CreateVpcEndpointRequestZone build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointRequestZone self = new CreateVpcEndpointRequestZone();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointRequestZone setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public CreateVpcEndpointRequestZone setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateVpcEndpointRequestZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public CreateVpcEndpointRequestZone setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
