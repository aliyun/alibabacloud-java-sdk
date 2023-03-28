// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically configure routes. Valid values:</p>
     * <br>
     * <p>*   **true** (default): automatically configures routes.</p>
     * <p>*   **false**: does not automatically configure routes.</p>
     */
    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    /**
     * <p>The Border Gateway Protocol (BGP) configuration:</p>
     * <br>
     * <p>*   **BgpConfig.EnableBgp**: specifies whether to enable BGP. Valid values: **true** and **false**. Default value: false.</p>
     * <p>*   **BgpConfig.LocalAsn**: the autonomous system number (ASN) of Alibaba Cloud. Valid values: **1** to **4294967295**. Default value: **45104**.</p>
     * <p>*   **BgpConfig.TunnelCidr**: the CIDR block of the IPsec tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * <p>*   **LocalBgpIp**: the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is required when the VPN gateway has dynamic BGP enabled.</p>
     * <p>*   Before you configure BGP, we recommend that you learn about how BGP works and the limits. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).</p>
     * <p>*   We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. Refer to the relevant documentation for the valid range of a private ASN.</p>
     */
    @NameInMap("BgpConfig")
    public String bgpConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the customer gateway.</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Specifies whether to immediately start IPsec negotiations. Valid values:</p>
     * <br>
     * <p>*   **true**: immediately starts IPsec negotiations after the configuration is complete.</p>
     * <p>*   **false**: starts IPsec negotiations when inbound traffic is detected. This is the default value.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
     * <br>
     * <p>*   **true** (default): enables DPD. The initiator of the IPsec-VPN connection sends DPD packets to verify the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SAs and IPsec SAs are deleted. The IPsec tunnel is also deleted.</p>
     * <p>*   **false**: disables DPD. The initiator of the IPsec-VPN connection does not send DPD packets.</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <br>
     * <p>*   **true** (default): yes After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the VPN tunnel.</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>The health check configuration:</p>
     * <br>
     * <p>*   **HealthCheckConfig.enable**: specifies whether to enable health checks. Valid values: **true** and **false**. Default value: false.</p>
     * <p>*   **HealthCheckConfig.dip**: the destination IP address configured for health checks.</p>
     * <p>*   **HealthCheckConfig.sip**: the source IP address configured for health checks.</p>
     * <p>*   **HealthCheckConfig.interval**: the time interval of health check retries. Unit: seconds. Default value: **3**.</p>
     * <p>*   **HealthCheckConfig.retry**: the maximum number of health check retries. Default value: **3**.</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>The configuration of Phase 1 negotiations:</p>
     * <br>
     * <p>*   **IkeConfig.Psk**: The pre-shared key that is used for authentication between the VPN gateway and the data center. The key must be 1 to 100 characters in length.</p>
     * <br>
     * <p>    If you do not specify a pre-shared key, the system generates a random 16-bit string as the pre-shared key. You can call the [DescribeVpnConnection](~~120374~~) operation to query the pre-shared key that is generated by the system.</p>
     * <br>
     * <p>> The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.</p>
     * <br>
     * <p>*   **IkeConfig.IkeVersion**: the version of the IKE protocol. Valid values: **ikev1** and **ikev2**. Default value: **ikev1**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeMode**: the negotiation mode of IKEv1. Valid values: **main** and **aggressive**. Default value: **main**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
     * <br>
     * <p>*   **IkeConfig.IkePfs**: The Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeLifetime**: the SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     * <br>
     * <p>*   **IkeConfig.LocalId**: the identifier of the VPN gateway. The identifier of the VPN gateway cannot exceed 100 characters in length. The default value is the IP address of the VPN gateway.</p>
     * <br>
     * <p>*   **IkeConfig.RemoteId**: the identifier of the customer gateway. The identifier of the customer gateway cannot exceed 100 characters in length. The default value is the IP address of the customer gateway.</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The configuration of Phase 2 negotiations:</p>
     * <br>
     * <p>*   **IpsecConfig.IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
     * <p>*   **IpsecConfig. IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
     * <p>*   **IpsecConfig. IpsecPfs**: the Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.</p>
     * <p>*   **IpsecConfig. IpsecLifetime**: the SA lifetime determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block on the VPC side. The CIDR block is used in Phase 2 negotiations.</p>
     * <br>
     * <p>Separate CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where you want to create the IPsec-VPN connection. You can call the [DescribeRegions](~~36063~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The certificate authority (CA) certificate of the peer when a ShangMi (SM) VPN gateway is used to create the IPsec-VPN connection.</p>
     * <br>
     * <p>*   This parameter is required when an SM VPN gateway is used to create the IPsec-VPN connection.</p>
     * <p>*   You can ignore this parameter when a standard VPN gateway is used to create the IPsec-VPN connection.</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block of the data center. This CIDR block is used in Phase 2 negotiations.</p>
     * <br>
     * <p>Separate CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
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

    @NameInMap("Tags")
    public java.util.List<CreateVpnConnectionRequestTags> tags;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static CreateVpnConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnConnectionRequest self = new CreateVpnConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpnConnectionRequest setAutoConfigRoute(Boolean autoConfigRoute) {
        this.autoConfigRoute = autoConfigRoute;
        return this;
    }
    public Boolean getAutoConfigRoute() {
        return this.autoConfigRoute;
    }

    public CreateVpnConnectionRequest setBgpConfig(String bgpConfig) {
        this.bgpConfig = bgpConfig;
        return this;
    }
    public String getBgpConfig() {
        return this.bgpConfig;
    }

    public CreateVpnConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpnConnectionRequest setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public CreateVpnConnectionRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public CreateVpnConnectionRequest setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public CreateVpnConnectionRequest setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public CreateVpnConnectionRequest setHealthCheckConfig(String healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public String getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public CreateVpnConnectionRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public CreateVpnConnectionRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public CreateVpnConnectionRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public CreateVpnConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpnConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpnConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpnConnectionRequest setRemoteCaCertificate(String remoteCaCertificate) {
        this.remoteCaCertificate = remoteCaCertificate;
        return this;
    }
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    public CreateVpnConnectionRequest setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public CreateVpnConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpnConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpnConnectionRequest setTags(java.util.List<CreateVpnConnectionRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateVpnConnectionRequestTags> getTags() {
        return this.tags;
    }

    public CreateVpnConnectionRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class CreateVpnConnectionRequestTags extends TeaModel {
        /**
         * <p>The tag key. The tag key cannot be an empty string.</p>
         * <br>
         * <p>It can be at most 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify at most 20 tag keys in each call.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVpnConnectionRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnConnectionRequestTags self = new CreateVpnConnectionRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateVpnConnectionRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpnConnectionRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
