// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    /**
     * <p>The information about the Express Connect circuit associated with the VBR, including the following parameters:</p>
     * <br>
     * <p>*   **CircuitCode**: the circuit code provided by the connectivity provider for the Express Connect circuit.</p>
     * <p>*   **LocalGatewayIp**: the IP address of the gateway device on the Alibaba Cloud side.</p>
     * <p>*   **PeerGatewayIp**: the IP address of the gateway device on the customer side.</p>
     * <p>*   **PeeringSubnetMask**: the subnet mask for the IP addresses of gateway devices on the Alibaba Cloud side and the customer side.</p>
     * <p>*   **PhysicalConnectionId**: the ID of the Express Connect circuit.</p>
     */
    @NameInMap("AssociatedPhysicalConnections")
    public String associatedPhysicalConnections;

    /**
     * <p>The bandwidth value. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
     * <br>
     * <p>>  Only the owner of the Express Connect circuit can set this property.</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VBR.</p>
     * <br>
     * <p>It must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of dropped packets that is allowed by the receiver when the initiator transmits packets. This value can be used to check whether a connection works as expected.</p>
     * <br>
     * <p>Valid values: **3 to 10**.</p>
     */
    @NameInMap("DetectMultiplier")
    public Long detectMultiplier;

    /**
     * <p>Specifies whether to enable IPv6. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The IP address of the VBR.</p>
     * <br>
     * <p>Only the owner of the VBR can set or modify this parameter.</p>
     */
    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    /**
     * <p>The IPv6 address of the VBR.</p>
     */
    @NameInMap("LocalIpv6GatewayIp")
    public String localIpv6GatewayIp;

    /**
     * <p>The time interval to receive BFD packets. Valid values: **200 to 1000**. Unit: milliseconds.</p>
     */
    @NameInMap("MinRxInterval")
    public Long minRxInterval;

    /**
     * <p>The time interval to send BFD packets. Valid values: **200 to 1000**. Unit: milliseconds.</p>
     */
    @NameInMap("MinTxInterval")
    public Long minTxInterval;

    /**
     * <p>The name of the VBR.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter. It cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IP address of the gateway device in the data center.</p>
     * <br>
     * <p>Only the owner of the VBR can set or modify this parameter.</p>
     */
    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    /**
     * <p>The IPv6 address of the gateway device in the data center.</p>
     * <br>
     * <p>*   Only the owner of the VBR can set or modify this property.</p>
     * <p>*   This property is required when you create a VBR for the owner of the Express Connect circuit. You can ignore this property when you create a VBR for another Alibaba Cloud account.</p>
     */
    @NameInMap("PeerIpv6GatewayIp")
    public String peerIpv6GatewayIp;

    /**
     * <p>The subnet mask of the IPv6 addresses of the VBR and the gateway device in the data center.</p>
     * <br>
     * <p>The two IPv6 addresses must fall within the same subnet.</p>
     */
    @NameInMap("PeeringIpv6SubnetMask")
    public String peeringIpv6SubnetMask;

    /**
     * <p>The subnet mask for the IP addresses of the gateway devices on the Alibaba Cloud side and on the customer side. Only the owner of the VBR can set or modify this parameter.</p>
     * <br>
     * <p>The two IP addresses must fall within the same subnet.</p>
     */
    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    /**
     * <p>The region ID of the VBR.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The VBR ID.</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The VLAN ID of the VBR. Valid values: **0 to 2999**.</p>
     * <br>
     * <p>>  This parameter is available only to Express Connect owners. The VLAN IDs of VBRs on the same Express Connect circuit must be unique.</p>
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
