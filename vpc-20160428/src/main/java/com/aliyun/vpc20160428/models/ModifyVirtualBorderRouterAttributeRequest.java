// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    /**
     * <p>The information about the Express Connect circuit associated with the VBR, including the following parameters:</p>
     * <ul>
     * <li><strong>CircuitCode</strong>: the circuit code provided by the connectivity provider for the Express Connect circuit.</li>
     * <li><strong>LocalGatewayIp</strong>: the IP address of the gateway device on the Alibaba Cloud side.</li>
     * <li><strong>PeerGatewayIp</strong>: the IP address of the gateway device on the customer side.</li>
     * <li><strong>PeeringSubnetMask</strong>: the subnet mask for the IP addresses of gateway devices on the Alibaba Cloud side and the customer side.</li>
     * <li><strong>PhysicalConnectionId</strong>: the ID of the Express Connect circuit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[   {     &quot;CircuitCode &quot;: &quot;longtel001&quot;,     &quot; LocalGatewayIp &quot;: &quot;192.168.XX.XX&quot;,     &quot;PeerGatewayIp&quot; : &quot;192.168.XX.XX&quot;,     &quot; PeeringSubnetMask &quot;: &quot;255.255.255.252&quot;,     &quot; PhysicalConnectionId &quot;: &quot;pc-kojok19****&quot;   } ]</p>
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
     * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
     * <blockquote>
     * <p> Only the owner of the Express Connect circuit can set this property.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>longtel001</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VBR.</p>
     * <p>It must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of dropped packets that is allowed by the receiver when the initiator transmits packets. This value can be used to check whether a connection works as expected.</p>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The IP address of the VBR.</p>
     * <p>Only the owner of the VBR can set or modify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    /**
     * <p>The IPv6 address of the VBR.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
     */
    @NameInMap("LocalIpv6GatewayIp")
    public String localIpv6GatewayIp;

    /**
     * <p>The time interval to receive BFD packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MinRxInterval")
    public Long minRxInterval;

    /**
     * <p>The time interval to send BFD packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MinTxInterval")
    public Long minTxInterval;

    /**
     * <p>The name of the VBR.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter. It cannot start with <code>http://</code> or <code>https://</code>.</p>
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
     * <p>The IP address of the gateway device in the data center.</p>
     * <p>Only the owner of the VBR can set or modify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.X</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The IPv6 address of the gateway device in the data center.</p>
     * <ul>
     * <li>Only the owner of the VBR can set or modify this property.</li>
     * <li>This property is required when you create a VBR for the owner of the Express Connect circuit. You can ignore this property when you create a VBR for another Alibaba Cloud account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:3c4d:0015:0000:0000:0000:2a2b</p>
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
     * <p>The subnet mask for the IP addresses of the gateway devices on the Alibaba Cloud side and on the customer side. Only the owner of the VBR can set or modify this parameter.</p>
     * <p>The two IP addresses must fall within the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.252</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The region ID of the VBR.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    @NameInMap("SitelinkEnable")
    public Boolean sitelinkEnable;

    /**
     * <p>The VBR ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp1lhl0taikrte****</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The VLAN ID of the VBR. Valid values: <strong>0 to 2999</strong>.</p>
     * <blockquote>
     * <p> This parameter is available only to Express Connect owners. The VLAN IDs of VBRs on the same Express Connect circuit must be unique.</p>
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
