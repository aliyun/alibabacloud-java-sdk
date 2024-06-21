// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The description of the endpoint.</p>
     * <p>The description must be 2 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my Endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The name of the endpoint.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The type of the endpoint.</p>
     * <p>Set the value to <strong>Interface</strong>. Then, you can specify Application Load Balancer (ALB) and Classic Load Balancer (CLB) instances as service resources for the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables user authentication. After user authentication is enabled, only the user who creates the endpoint can modify or delete the endpoint in STS mode.</li>
     * <li><strong>false</strong> (default): disables user authentication.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProtectedEnabled")
    public Boolean protectedEnabled;

    /**
     * <p>The region ID of the endpoint.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of security groups that are associated with the endpoint elastic network interface (ENI).</p>
     * 
     * <strong>example:</strong>
     * <p>sg-hp33bw6ynvm2yb0e****</p>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>The ID of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3xdsq46ael67lo****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The tags to add to the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-hp356stwkxg3fn2xe****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zones where the endpoint is deployed.</p>
     */
    @NameInMap("Zone")
    public java.util.List<CreateVpcEndpointRequestZone> zone;

    /**
     * <p>The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Set the value to <strong>1</strong>.</p>
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

    public CreateVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CreateVpcEndpointRequest setZonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
        this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
        return this;
    }
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

    public static class CreateVpcEndpointRequestTag extends TeaModel {
        /**
         * <p>The key of the tag to add to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag to add to the resource.</p>
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
         * <p>The ID of the vSwitch where you want to create the endpoint ENI in the zone. You can specify up to 10 vSwitch IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hp3uf6045ljdhd5zr****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone in which the endpoint is deployed.</p>
         * <p>You can specify up to 10 zone IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The IP address of the zone in which the endpoint is deployed.</p>
         * <p>You can specify up to 10 IP addresses.</p>
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
