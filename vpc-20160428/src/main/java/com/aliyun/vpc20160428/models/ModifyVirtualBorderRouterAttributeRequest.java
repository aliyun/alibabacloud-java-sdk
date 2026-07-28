// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    /**
     * <p>The list of Express Connect circuits associated with the VBR, which contains the following parameters:</p>
     * <ul>
     * <li><strong>VlanId</strong>: The VLAN ID of the VBR instance.</li>
     * <li><strong>CircuitCode</strong>: The circuit encoding provided by the carrier for the Express Connect circuit.</li>
     * <li><strong>LocalGatewayIp</strong>: The Alibaba Cloud-side IP address of the VBR instance.</li>
     * <li><strong>PeerGatewayIp</strong>: The client-side IP address of the VBR instance.</li>
     * <li><strong>PeeringSubnetMask</strong>: The subnet mask for the Alibaba Cloud-side and client-side IP addresses of the VBR instance.</li>
     * <li><strong>LocalIpv6GatewayIp</strong>: The Alibaba Cloud-side IPv6 address of the VBR instance.</li>
     * <li><strong>PeerIpv6GatewayIp</strong>: The client-side IPv6 address of the VBR instance.</li>
     * <li><strong>PeeringIpv6SubnetMask</strong>: The subnet mask for the Alibaba Cloud-side and client-side IPv6 addresses of the VBR instance.</li>
     * <li><strong>ipv6Enable</strong>: Enables IPv6.</li>
     * <li><strong>PhysicalConnectionId</strong>: The Express Connect circuit instance ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;VlanId&quot;: &quot;5&quot;,
     *     &quot;CircuitCode&quot;: &quot;longtel001&quot;,
     *     &quot;LocalGatewayIp&quot;: &quot;192.168.XX.XX&quot;,
     *     &quot;PeerGatewayIp&quot;: &quot;192.168.XX.XX&quot;,
     *     &quot;PeeringSubnetMask&quot;: &quot;255.255.255.252&quot;,
     *     &quot;LocalIpv6GatewayIp&quot;: &quot;fd00:XXXX:1030:3f41::1&quot;,
     *     &quot;PeerIpv6GatewayIp&quot;: &quot;fd00:XXXX:1030:3f41::2&quot;,
     *     &quot;PeeringIpv6SubnetMask&quot;: &quot;fd00:0:1030:3f41::/126&quot;,
     *     &quot;ipv6Enable&quot;: true,
     *     &quot;PhysicalConnectionId&quot;: &quot;pc-kojok19****&quot;
     *   }
     * ]</p>
     */
    @NameInMap("AssociatedPhysicalConnections")
    public String associatedPhysicalConnections;

    /**
     * <p>The bandwidth value. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

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
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VBR.</p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The detection multiplier, which specifies the maximum number of consecutive packet losses allowed by the receiver from the sender. This parameter is used to detect whether the link is normal.</p>
     * <p>Valid values: <strong>3 to 10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DetectMultiplier")
    public Long detectMultiplier;

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
     * <p>false</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The Alibaba Cloud-side IP address of the VBR instance.</p>
     * <p>This property can be specified or modified only by the VBR owner.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    /**
     * <p>The Alibaba Cloud-side IPv6 address of the VBR instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
     */
    @NameInMap("LocalIpv6GatewayIp")
    public String localIpv6GatewayIp;

    /**
     * <p>The receive interval of BFD packets. Valid values: <strong>200 to 1000</strong>. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MinRxInterval")
    public Long minRxInterval;

    /**
     * <p>The alert interval for sending Bidirectional Forwarding Detection (BFD) packets. Valid values: <strong>200 to 1000</strong>. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MinTxInterval")
    public Long minTxInterval;

    /**
     * <p>The MTU value supported by the VBR. Valid values: 1500 and 8500.
     * This value can be set only when the VBR is attached to an Express Connect Router (ECR). This value also affects all other VBRs and VPCs within the same ECR.</p>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("Mtu")
    public Integer mtu;

    /**
     * <p>The name of the VBR.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The client-side IP address of the VBR instance.</p>
     * <p>This property can be specified or modified only by the VBR owner.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.X</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The client-side IPv6 address of the VBR instance.</p>
     * <ul>
     * <li><p>This property can be specified or modified only by the VBR owner.</p>
     * </li>
     * <li><p>This parameter is required when the Express Connect circuit owner creates a VBR instance. It is not required when creating a VBR instance for another account.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:3c4d:0015:0000:0000:0000:2a2b</p>
     */
    @NameInMap("PeerIpv6GatewayIp")
    public String peerIpv6GatewayIp;

    /**
     * <p>The subnet mask for the Alibaba Cloud-side and client-side IPv6 addresses of the VBR instance.</p>
     * <p>The two IPv6 addresses must be in the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:4004:cc:400::/56</p>
     */
    @NameInMap("PeeringIpv6SubnetMask")
    public String peeringIpv6SubnetMask;

    /**
     * <p>The subnet mask for the Alibaba Cloud-side and client-side IP addresses of the VBR instance. This property can be specified or modified only by the VBR owner.</p>
     * <p>The two IP addresses must be in the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.252</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The region ID of the VBR.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to allow inter-IDC service access. Valid values:</p>
     * <ul>
     * <li><p>true: Allowed.</p>
     * </li>
     * <li><p>false (default): Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SitelinkEnable")
    public Boolean sitelinkEnable;

    /**
     * <p>The VBR instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp1lhl0taikrte****</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The VLAN ID of the VBR. Valid values: <strong>0 to 2999</strong>. </p>
     * <blockquote>
     * <p>Only the owner of the Express Connect circuit can specify this parameter. The VLAN IDs of two VBRs on the same Express Connect circuit must be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VlanId")
    public Integer vlanId;

    public static ModifyVirtualBorderRouterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBorderRouterAttributeRequest self = new ModifyVirtualBorderRouterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBorderRouterAttributeRequest setAssociatedPhysicalConnections(String associatedPhysicalConnections) {
        this.associatedPhysicalConnections = associatedPhysicalConnections;
        return this;
    }
    public String getAssociatedPhysicalConnections() {
        return this.associatedPhysicalConnections;
    }

    public ModifyVirtualBorderRouterAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifyVirtualBorderRouterAttributeRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public ModifyVirtualBorderRouterAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVirtualBorderRouterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVirtualBorderRouterAttributeRequest setDetectMultiplier(Long detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
        return this;
    }
    public Long getDetectMultiplier() {
        return this.detectMultiplier;
    }

    public ModifyVirtualBorderRouterAttributeRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public ModifyVirtualBorderRouterAttributeRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
        this.localIpv6GatewayIp = localIpv6GatewayIp;
        return this;
    }
    public String getLocalIpv6GatewayIp() {
        return this.localIpv6GatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setMinRxInterval(Long minRxInterval) {
        this.minRxInterval = minRxInterval;
        return this;
    }
    public Long getMinRxInterval() {
        return this.minRxInterval;
    }

    public ModifyVirtualBorderRouterAttributeRequest setMinTxInterval(Long minTxInterval) {
        this.minTxInterval = minTxInterval;
        return this;
    }
    public Long getMinTxInterval() {
        return this.minTxInterval;
    }

    public ModifyVirtualBorderRouterAttributeRequest setMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }
    public Integer getMtu() {
        return this.mtu;
    }

    public ModifyVirtualBorderRouterAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVirtualBorderRouterAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVirtualBorderRouterAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeerGatewayIp(String peerGatewayIp) {
        this.peerGatewayIp = peerGatewayIp;
        return this;
    }
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
        this.peerIpv6GatewayIp = peerIpv6GatewayIp;
        return this;
    }
    public String getPeerIpv6GatewayIp() {
        return this.peerIpv6GatewayIp;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
        this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
        return this;
    }
    public String getPeeringIpv6SubnetMask() {
        return this.peeringIpv6SubnetMask;
    }

    public ModifyVirtualBorderRouterAttributeRequest setPeeringSubnetMask(String peeringSubnetMask) {
        this.peeringSubnetMask = peeringSubnetMask;
        return this;
    }
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    public ModifyVirtualBorderRouterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVirtualBorderRouterAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setSitelinkEnable(Boolean sitelinkEnable) {
        this.sitelinkEnable = sitelinkEnable;
        return this;
    }
    public Boolean getSitelinkEnable() {
        return this.sitelinkEnable;
    }

    public ModifyVirtualBorderRouterAttributeRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public ModifyVirtualBorderRouterAttributeRequest setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Integer getVlanId() {
        return this.vlanId;
    }

}
