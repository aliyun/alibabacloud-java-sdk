// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociatePhysicalConnectionToVirtualBorderRouterRequest extends TeaModel {
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
     * <p>The client generates the value of this parameter. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
    public String enableIpv6;

    /**
     * <p>The Alibaba Cloud-side IP address of the VBR instance.</p>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The client-side IP address of the VBR instance.</p>
     * <ul>
     * <li><p>Only the VBR owner can specify or modify this property.</p>
     * </li>
     * <li><p>This parameter is required when you create a VBR instance for the Express Connect circuit owner.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The client-side IPv6 address of the VBR instance.</p>
     * <ul>
     * <li><p>Only the VBR owner can specify or modify this property.</p>
     * </li>
     * <li><p>This parameter is required when you create a VBR instance for the Express Connect circuit owner.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2001:XXXX:4:4:4:4:4:4</p>
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
     * <p>The subnet mask for the Alibaba Cloud-side and client-side IP addresses of the VBR instance.</p>
     * <p>The two IP addresses must be in the same subnet.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.0</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The Express Connect circuit instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1qrb3044eqixog****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/448570.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The VBR instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp186tnz6rijyhj******</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The VLAN ID of the VBR. Valid values: <strong>0 to 2999</strong>. </p>
     * <blockquote>
     * <p>Only the owner of the Express Connect circuit can specify this parameter. The VLAN IDs of two VBRs on the same Express Connect circuit must be different.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("VlanId")
    public String vlanId;

    public static AssociatePhysicalConnectionToVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociatePhysicalConnectionToVirtualBorderRouterRequest self = new AssociatePhysicalConnectionToVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setEnableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public String getEnableIpv6() {
        return this.enableIpv6;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
        this.localIpv6GatewayIp = localIpv6GatewayIp;
        return this;
    }
    public String getLocalIpv6GatewayIp() {
        return this.localIpv6GatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeerGatewayIp(String peerGatewayIp) {
        this.peerGatewayIp = peerGatewayIp;
        return this;
    }
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
        this.peerIpv6GatewayIp = peerIpv6GatewayIp;
        return this;
    }
    public String getPeerIpv6GatewayIp() {
        return this.peerIpv6GatewayIp;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
        this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
        return this;
    }
    public String getPeeringIpv6SubnetMask() {
        return this.peeringIpv6SubnetMask;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPeeringSubnetMask(String peeringSubnetMask) {
        this.peeringSubnetMask = peeringSubnetMask;
        return this;
    }
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public AssociatePhysicalConnectionToVirtualBorderRouterRequest setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

}
