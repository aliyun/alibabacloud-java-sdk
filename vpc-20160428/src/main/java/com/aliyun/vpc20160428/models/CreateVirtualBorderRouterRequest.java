// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterRequest extends TeaModel {
    /**
     * <p>The bandwidth of the VBR. Unit: Mbit/s.</p>
     * <ul>
     * <li>When you create a VBR for a dedicated connection, valid values are <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>300</strong>, <strong>400</strong>, <strong>500</strong>, <strong>1000</strong>, <strong>2048</strong>, <strong>5120</strong>, <strong>8192</strong>, <strong>10240</strong>, <strong>20480</strong>, <strong>40960</strong>, <strong>50120</strong>, <strong>61440</strong>, and <strong>102400</strong>.</li>
     * <li>You do not need to set this parameter when you create a VBR for a hosted connection. The bandwidth is already configured when the hosted connection is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
     * <blockquote>
     * <p> Only the owner of the Express Connect circuit can set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>longtel001</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the system automatically sets <strong>ClientToken</strong> to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VBR.</p>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable IPv6. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables IPv6.</li>
     * <li><strong>false</strong> (default): disables IPv6.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The IP address of the VBR. Only the owner of the VBR can set or modify this parameter.</p>
     * <p>When you create a VBR for the owner of the Express Connect circuit, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    /**
     * <p>The IPv6 address of the VBR. Only the owner of the VBR can set or modify this parameter.</p>
     * <p>When you create a VBR for the owner of the Express Connect circuit, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
     */
    @NameInMap("LocalIpv6GatewayIp")
    public String localIpv6GatewayIp;

    /**
     * <p>The name of the VBR.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
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
     * <p>The IP address of the gateway device in the data center. Only the owner of the VBR can set or modify this parameter.</p>
     * <p>When you create a VBR for the owner of the Express Connect circuit, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>116.62.XX.XX</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The IPv6 address of the gateway device in the data center. Only the owner of the VBR can set or modify this parameter.</p>
     * <p>When you create a VBR for the owner of the Express Connect circuit, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:4:4:4:4:4:4</p>
     */
    @NameInMap("PeerIpv6GatewayIp")
    public String peerIpv6GatewayIp;

    /**
     * <p>The subnet mask of the IPv6 addresses of the VBR and the gateway device in the data center.</p>
     * <p>The two IPv6 addresses must fall within the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:4004:cc:400::/56</p>
     */
    @NameInMap("PeeringIpv6SubnetMask")
    public String peeringIpv6SubnetMask;

    /**
     * <p>The subnet mask of the IP addresses of the VBR and the gateway device in the data center.</p>
     * <p>The two IP addresses must fall within the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.252</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     * <p>You can create a VBR for a dedicated connection or a hosted connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zextbehcx****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource group, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateVirtualBorderRouterRequestTags> tags;

    /**
     * <p>The account ID of the VBR owner.</p>
     * <p>The default value is the ID of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>168811111****</p>
     */
    @NameInMap("VbrOwnerId")
    public Long vbrOwnerId;

    /**
     * <p>The VLAN ID of the VBR. Valid values: <strong>0 to 2999</strong>.</p>
     * <blockquote>
     * <p> Only the owner of the Express Connect circuit can set this parameter. The VLAN IDs of two VBRs of the same the Express Connect circuit must be different.</p>
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
         * <p>The tag key. You must enter at least one tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be at most 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
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
