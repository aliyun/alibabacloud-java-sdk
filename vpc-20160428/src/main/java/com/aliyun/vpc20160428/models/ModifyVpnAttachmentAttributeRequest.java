// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnAttachmentAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically configure routes. Valid values:</p>
     * <br>
     * <p>*   **true:** automatically configures routes.</p>
     * <p>*   **false:** does not automatically configure routes.</p>
     */
    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    /**
     * <p>The Border Gateway Protocol (BGP) configurations:</p>
     * <br>
     * <p>*   **BgpConfig.EnableBgp:** specifies whether to enable BGP. Valid values:</p>
     * <br>
     * <p>    *   **true:** enables BGP.</p>
     * <p>    *   **false:** disables BGP.</p>
     * <br>
     * <p>*   **BgpConfig.LocalAsn:** the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: **1** to **4294967295**.</p>
     * <br>
     * <p>*   **BgpConfig.TunnelCidr:** the CIDR block of the IPsec tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * <br>
     * <p>*   **LocalBgpIp:** the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.</p>
     * <br>
     * <p>> </p>
     * <p>*   Before you configure BGP, we recommend that you learn about how BGP works and the limits. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).</p>
     * <p>*   We recommend that you use a private ASN to establish a connection to Alibaba Cloud over BGP. Refer to the relevant documentation for the private ASN range.</p>
     */
    @NameInMap("BgpConfig")
    public String bgpConfig;

    /**
     * <p>The client token that you want to use to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system uses the value of **RequestId** as the value of **ClientToken**. The value of the **RequestId** parameter may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The customer gateways to be associated with the IPsec-VPN connections.</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Specifies whether to immediately start IPsec negotiations after the configuration is complete. Valid values:</p>
     * <br>
     * <p>*   **true:** immediately starts IPsec negotiations after the configuration is complete.</p>
     * <p>*   **false:** starts IPsec negotiations when inbound traffic is detected.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
     * <br>
     * <p>*   **true:** enables the DPD feature. The initiator of the IPsec-VPN connection sends DPD packets to verify the peer is active. If no feedback is received from the peer within a specified period of time, the connection fails, and ISAKMP SA, IPsec SA, and security tunnel are deleted.</p>
     * <p>*   **false:** disables the DPD feature. The initiator of the IPsec-VPN connection does not send DPD packets.</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <br>
     * <p>*   **true:** enables NAT traversal. After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.</p>
     * <p>*   **false:** disables NAT traversal.</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>The health check configurations:</p>
     * <br>
     * <p>*   **HealthCheckConfig.enable:** specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>    *   **true:** enables the health check feature.</p>
     * <p>    *   **false:** disables the health check feature.</p>
     * <br>
     * <p>*   **HealthCheckConfig.dip:** the destination IP address that is used for health checks. Enter the IP address on the data center side that the VPC can communicate with through the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **HealthCheckConfig.sip:** the source IP address that is used for health checks. Enter the IP address on the VPC side that the data center can communicate with through the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **HealthCheckConfig.interval:** the interval between two consecutive health checks. Unit: seconds.</p>
     * <br>
     * <p>*   **HealthCheckConfig.retry:** the maximum number of health check retries.</p>
     * <br>
     * <p>*   **HealthCheckConfig.Policy:** specifies whether to withdraw published routes when health checks fail. Valid values:</p>
     * <br>
     * <p>    *   **revoke_route:** withdraw published routes when health checks fail.</p>
     * <p>    *   **reserve_route:** does not withdraw published routes when health checks fail.</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>The configurations of Phase 1 negotiations:</p>
     * <br>
     * <p>*   **IkeConfig.Psk:** The pre-shared key that is used for authentication between the VPN gateway and the data center. The key must be 1 to 100 characters in length.</p>
     * <br>
     * <p>    The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.</p>
     * <br>
     * <p>*   **IkeConfig.IkeVersion:** the version of the IKE protocol. Valid values: **ikev1** and **ikev2**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeMode:** the negotiation mode. Valid values: **main** and **aggressive**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeEncAlg:** the encryption algorithm that is used in Phase 1 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeAuthAlg:** the authentication algorithm that is used in Phase 1 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.</p>
     * <br>
     * <p>*   **IkeConfig.IkePfs:** the Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeLifetime:** the security association (SA) lifetime that is determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**.</p>
     * <br>
     * <p>*   **IkeConfig.LocalIdIPsec:** the identifier on the Alibaba Cloud side. The identifier cannot exceed 100 characters in length.</p>
     * <br>
     * <p>*   **IkeConfig.RemoteId:** the identifier on the data center side. The identifier cannot exceed 100 characters in length.</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The configurations of Phase 2 negotiations:</p>
     * <br>
     * <p>*   **IpsecConfig.IpsecEncAlg:** the encryption algorithm that is used in Phase 2 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.</p>
     * <p>*   **IpsecConfig. IpsecAuthAlg:** the authentication algorithm that is used in Phase 2 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.</p>
     * <p>*   **IpsecConfig. IpsecPfs:** the Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**.</p>
     * <p>*   **IpsecConfig. IpsecLifetime:** the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**.</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block on the VPC side. The CIDR block is used in Phase 2 negotiations.</p>
     * <br>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * <br>
     * <p>The following routing modes are supported:</p>
     * <br>
     * <p>*   If you set **LocalSubnet** and **RemoteSubnet** to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</p>
     * <p>*   If you set **LocalSubnet** and **RemoteSubnet** to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     * <br>
     * <p>The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the IPsec-VPN connection. Valid values:</p>
     * <br>
     * <p>*   **public:** an encrypted connection over the Internet.</p>
     * <p>*   **private:** an encrypted connection over private networks.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    /**
     * <p>The ID of the region to which the IPsec-VPN connection belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the IDs of available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The peer CA certificate when a ShangMi (SM) VPN gateway is used to create the IPsec-VPN connection.</p>
     */
    @NameInMap("RemoteCaCert")
    public String remoteCaCert;

    /**
     * <p>The CIDR block on the data center side. This CIDR block is used in Phase 2 negotiations.</p>
     * <br>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
     * <br>
     * <p>The following routing modes are supported:</p>
     * <br>
     * <p>*   If you set **LocalSubnet** and **RemoteSubnet** to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</p>
     * <p>*   If you set **LocalSubnet** and **RemoteSubnet** to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static ModifyVpnAttachmentAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnAttachmentAttributeRequest self = new ModifyVpnAttachmentAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpnAttachmentAttributeRequest setAutoConfigRoute(Boolean autoConfigRoute) {
        this.autoConfigRoute = autoConfigRoute;
        return this;
    }
    public Boolean getAutoConfigRoute() {
        return this.autoConfigRoute;
    }

    public ModifyVpnAttachmentAttributeRequest setBgpConfig(String bgpConfig) {
        this.bgpConfig = bgpConfig;
        return this;
    }
    public String getBgpConfig() {
        return this.bgpConfig;
    }

    public ModifyVpnAttachmentAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpnAttachmentAttributeRequest setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyVpnAttachmentAttributeRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public ModifyVpnAttachmentAttributeRequest setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyVpnAttachmentAttributeRequest setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyVpnAttachmentAttributeRequest setHealthCheckConfig(String healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public String getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public ModifyVpnAttachmentAttributeRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public ModifyVpnAttachmentAttributeRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public ModifyVpnAttachmentAttributeRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifyVpnAttachmentAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnAttachmentAttributeRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ModifyVpnAttachmentAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVpnAttachmentAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpnAttachmentAttributeRequest setRemoteCaCert(String remoteCaCert) {
        this.remoteCaCert = remoteCaCert;
        return this;
    }
    public String getRemoteCaCert() {
        return this.remoteCaCert;
    }

    public ModifyVpnAttachmentAttributeRequest setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public ModifyVpnAttachmentAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVpnAttachmentAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVpnAttachmentAttributeRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

}
