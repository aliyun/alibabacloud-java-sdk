// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterRequest extends TeaModel {
    /**
     * <p>The bandwidth of the VBR instance. Unit: Mbit/s.</p>
     * <ul>
     * <li>When you create a VBR instance for a dedicated Express Connect circuit, valid values are <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>300</strong>, <strong>400</strong>, <strong>500</strong>, <strong>1000</strong>, <strong>2048</strong>, <strong>5120</strong>, <strong>8192</strong>, <strong>10240</strong>, <strong>20480</strong>, <strong>40960</strong>, <strong>50120</strong>, <strong>61440</strong>, and <strong>102400</strong>.</li>
     * <li>When you create a VBR instance for shared Express Connect circuits, you do not need to configure this parameter. The bandwidth of the VBR is the bandwidth of the shared Express Connect circuits that is specified in Settings when the shared Express Connect circuits are created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The circuit code provided by the carrier for the Express Connect circuit. </p>
     * <blockquote>
     * <p>Only the owner of the Express Connect circuit can specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>longtel001</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>The client generates the value of this parameter. Make sure that the value is unique among different requests.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VBR instance.  </p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable IPv6. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The Alibaba Cloud-side IP address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
     * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    /**
     * <p>The Alibaba Cloud-side IPv6 address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
     * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
     */
    @NameInMap("LocalIpv6GatewayIp")
    public String localIpv6GatewayIp;

    /**
     * <p>The name of the VBR instance.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The customer-side IP address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
     * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>116.62.XX.XX</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The customer-side IPv6 address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
     * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:4:4:4:4:4:4</p>
     */
    @NameInMap("PeerIpv6GatewayIp")
    public String peerIpv6GatewayIp;

    /**
     * <p>The subnet mask for the Alibaba Cloud-side and customer-side IPv6 addresses of the VBR instance. </p>
     * <p>The two IPv6 addresses must be in the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:4004:cc:400::/56</p>
     */
    @NameInMap("PeeringIpv6SubnetMask")
    public String peeringIpv6SubnetMask;

    /**
     * <p>The subnet mask for the Alibaba Cloud-side and customer-side IP addresses of the VBR instance. </p>
     * <p>The two IP addresses must be in the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.252</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The instance ID of the Express Connect circuit. </p>
     * <p>You can create a VBR instance for a dedicated Express Connect circuit or for shared Express Connect circuits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zextbehcx****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateVirtualBorderRouterRequestTags> tags;

    /**
     * <p>The account ID of the VBR instance owner.</p>
     * <p>The default value is the Alibaba Cloud account ID used for logon.</p>
     * 
     * <strong>example:</strong>
     * <p>168811111****</p>
     */
    @NameInMap("VbrOwnerId")
    public Long vbrOwnerId;

    /**
     * <p>The VLAN ID of the VBR instance. Valid values: <strong>0 to 2999</strong>. </p>
     * <blockquote>
     * <p>Only the owner of the Express Connect circuit can specify this parameter. The VLAN IDs of two VBR instances on the same Express Connect circuit must be different.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VlanId")
    public Integer vlanId;

    public static CreateVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterRequest self = new CreateVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBorderRouterRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateVirtualBorderRouterRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public CreateVirtualBorderRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVirtualBorderRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVirtualBorderRouterRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public CreateVirtualBorderRouterRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    public CreateVirtualBorderRouterRequest setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
        this.localIpv6GatewayIp = localIpv6GatewayIp;
        return this;
    }
    public String getLocalIpv6GatewayIp() {
        return this.localIpv6GatewayIp;
    }

    public CreateVirtualBorderRouterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVirtualBorderRouterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVirtualBorderRouterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVirtualBorderRouterRequest setPeerGatewayIp(String peerGatewayIp) {
        this.peerGatewayIp = peerGatewayIp;
        return this;
    }
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    public CreateVirtualBorderRouterRequest setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
        this.peerIpv6GatewayIp = peerIpv6GatewayIp;
        return this;
    }
    public String getPeerIpv6GatewayIp() {
        return this.peerIpv6GatewayIp;
    }

    public CreateVirtualBorderRouterRequest setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
        this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
        return this;
    }
    public String getPeeringIpv6SubnetMask() {
        return this.peeringIpv6SubnetMask;
    }

    public CreateVirtualBorderRouterRequest setPeeringSubnetMask(String peeringSubnetMask) {
        this.peeringSubnetMask = peeringSubnetMask;
        return this;
    }
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    public CreateVirtualBorderRouterRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreateVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVirtualBorderRouterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVirtualBorderRouterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVirtualBorderRouterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVirtualBorderRouterRequest setTags(java.util.List<CreateVirtualBorderRouterRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateVirtualBorderRouterRequestTags> getTags() {
        return this.tags;
    }

    public CreateVirtualBorderRouterRequest setVbrOwnerId(Long vbrOwnerId) {
        this.vbrOwnerId = vbrOwnerId;
        return this;
    }
    public Long getVbrOwnerId() {
        return this.vbrOwnerId;
    }

    public CreateVirtualBorderRouterRequest setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Integer getVlanId() {
        return this.vlanId;
    }

    public static class CreateVirtualBorderRouterRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You must specify at least 1 tag key and can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVirtualBorderRouterRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualBorderRouterRequestTags self = new CreateVirtualBorderRouterRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateVirtualBorderRouterRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVirtualBorderRouterRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
