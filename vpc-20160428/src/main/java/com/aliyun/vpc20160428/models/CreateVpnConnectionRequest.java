// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically configure routes. Valid values:</p>
     * <br>
     * <p>*   **true** (default)</p>
     * <p>*   **false**</p>
     */
    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    /**
     * <p>The Border Gateway Protocol (BGP) configurations:</p>
     * <br>
     * <p>*   **BgpConfig.EnableBgp**: specifies whether to enable BGP. Valid values: **true** and **false**. Default value: false.</p>
     * <br>
     * <p>*   **BgpConfig.LocalAsn**: the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: **1** to **4294967295**. Default value: **45104**.</p>
     * <br>
     * <p>*   **BgpConfig.TunnelCidr**: the CIDR block of the IPsec tunnel. The CIDR block must fall within the 169.254.0.0/16 range. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * <br>
     * <p>    The CIDR block of an IPsec tunnel associated with a VPN gateway must be unique.</p>
     * <br>
     * <p>*   **LocalBgpIp**: the BGP address on the Alibaba Cloud side. This IP address must fall within the CIDR block range of the IPsec tunnel.</p>
     * <br>
     * <p>> *   Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).</p>
     * <p>>*   We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. For information about the range of private ASNs, see the relevant documentation.</p>
     */
    @NameInMap("BgpConfig")
    public String bgpConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the customer gateway.</p>
     * <br>
     * <p>>  If the VPN gateway supports only the single-tunnel mode, this parameter is required.</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Specify whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:</p>
     * <br>
     * <p>*   **true**: immediately starts IPsec negotiations after the configuration is complete.</p>
     * <p>*   **false** (default): starts IPsec negotiations when inbound traffic is received.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
     * <br>
     * <p>*   **true** (default) The initiator of the IPsec-VPN connection sends DPD packets to verify the existence and availability of the peer. If no response is received from the peer within a specified period of time, the connection fails. ISAKMP SAs and IPsec SAs are deleted. The IPsec tunnel is also deleted.</p>
     * <p>*   **false**: disables DPD. The IPsec initiator does not send DPD packets.</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <br>
     * <p>*   **true** (default) After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the VPN tunnel.</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>Specifies whether to enable the BGP feature for the tunnel. Valid values: **true** and **false**. Default value: false.</p>
     */
    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>The health check configuration:</p>
     * <br>
     * <p>*   **HealthCheckConfig.enable**: specifies whether to enable health checks. Valid values: **true** and **false**. Default value: false.</p>
     * <p>*   **HealthCheckConfig.dip**: the destination IP address configured for health checks.</p>
     * <p>*   **HealthCheckConfig.sip:** the source IP address that is used for health checks.</p>
     * <p>*   **HealthCheckConfig.interval**: the time interval of health check retries. Unit: seconds. Default value: **3**.</p>
     * <p>*   **HealthCheckConfig.retry**: the maximum number of health check retries. Default value: **3**.</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>The configurations of Phase 1 negotiations:</p>
     * <br>
     * <p>*   **IkeConfig.Psk**: The pre-shared key that is used for authentication between the VPN gateway and the on-premises database.</p>
     * <br>
     * <p>    *   The key must be 1 to 100 characters in length and can contain digits, letters, and the following characters: ``~!\`@#$%^&*()_-+={}[]|;:\",.<>/?``</p>
     * <br>
     * <p>    *   If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the [DescribeVpnConnection](~~120374~~) operation to query the pre-shared key that is generated by the system.</p>
     * <p>       >The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises database. Otherwise, the on-premises database and the VPN gateway cannot establish a connection.</p>
     * <br>
     * <p>*   **IkeConfig.IkeVersion**: the version of the Internet Key Exchange (IKE) protocol. Valid values: **ikev1** and **ikev2**. Default value: **ikev1**.</p>
     * <br>
     * <p>    Compared with IKEv1, IKEv2 simplifies the security association (SA) negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
     * <br>
     * <p>*   **IkeConfig.IkeMode**: the negotiation mode of IKE. Valid values: **main** and **aggressive**. Default value: **main**.</p>
     * <br>
     * <p>    *   **main:** This mode offers higher security during negotiations.</p>
     * <p>    *   **aggressive:** This mode is faster and has a higher success rate.</p>
     * <br>
     * <p>*   **IkeConfig.IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiations.</p>
     * <br>
     * <p>    Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations.</p>
     * <br>
     * <p>    Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
     * <br>
     * <p>*   **IkeConfig.IkePfs**: the Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeLifetime**: the SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     * <br>
     * <p>*   **IkeConfig.LocalId**: the identifier of the VPN gateway. The value can be up to 100 characters in length. The default value is the IP address of the VPN gateway.</p>
     * <br>
     * <p>*   **IkeConfig.RemoteId**: the identifier of the customer gateway. The value can be up to 100 characters in length. The default value is the IP address of the customer gateway.</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The configurations of Phase 2 negotiations:</p>
     * <br>
     * <p>*   **IpsecConfig.IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiations.</p>
     * <br>
     * <p>    Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
     * <br>
     * <p>*   **IpsecConfig. IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiations.</p>
     * <br>
     * <p>    Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
     * <br>
     * <p>*   **IpsecConfig. IpsecPfs**: the DH key exchange algorithm that is used in Phase 2 negotiations. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.</p>
     * <br>
     * <p>*   **IpsecConfig. IpsecLifetime**: the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block of the virtual private cloud (VPC) that needs to communicate with the on-premises database. The CIDR block is used in Phase 2 negotiations.</p>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the IPsec-VPN connection is created. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The certificate authority (CA) certificate. If the VPN gateway is of the ShangMi (SM) type, you need to configure a CA certificate for the peer gateway device.</p>
     * <br>
     * <p>*   If an SM VPN gateway is used to create the IPsec-VPN connection, this parameter is required.</p>
     * <p>*   If a standard VPN gateway is used to create the IPsec-VPN connection, leave this parameter empty.</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block of the on-premises database that needs to communicate with the VPC. The CIDR block is used in Phase 2 negotiations.</p>
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
     * <p>The tag value.</p>
     * <br>
     * <p>The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
     * <br>
     * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values in each call.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateVpnConnectionRequestTags> tags;

    /**
     * <p>The tunnel configurations.</p>
     * <br>
     * <p>If the VPN gateway supports the dual-tunnel mode, you must configure the active tunnel and standby tunnel by specifying **TunnelOptionsSpecification**. Each IPsec-VPN connection supports only one active tunnel and one standby tunnel.</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public java.util.List<CreateVpnConnectionRequestTunnelOptionsSpecification> tunnelOptionsSpecification;

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

    public CreateVpnConnectionRequest setEnableTunnelsBgp(Boolean enableTunnelsBgp) {
        this.enableTunnelsBgp = enableTunnelsBgp;
        return this;
    }
    public Boolean getEnableTunnelsBgp() {
        return this.enableTunnelsBgp;
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

    public CreateVpnConnectionRequest setTunnelOptionsSpecification(java.util.List<CreateVpnConnectionRequestTunnelOptionsSpecification> tunnelOptionsSpecification) {
        this.tunnelOptionsSpecification = tunnelOptionsSpecification;
        return this;
    }
    public java.util.List<CreateVpnConnectionRequestTunnelOptionsSpecification> getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
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

    public static class CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig extends TeaModel {
        /**
         * <p>The ASN on the Alibaba Cloud side. Valid values: **1** to **4294967295**. Default value: **45104**.</p>
         * <br>
         * <p>> *   If you set **EnableTunnelsBgp** to **true**, this parameter is required.</p>
         * <p>> *   Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).</p>
         * <p>> *   We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. For information about the range of private ASNs, see the relevant documentation.</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP address on the Alibaba Cloud side. The address is an IP address that falls within the BGP CIDR block range.</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The BGP CIDR block of the tunnel. The CIDR block must fall within the 169.254.0.0/16 range. The subnet mask of the CIDR block must be 30 bits in length.</p>
         * <br>
         * <p>>  The BGP CIDR block of a tunnel associated with a VPN gateway must be unique.</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig self = new CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in Phase 1 negotiations.</p>
         * <br>
         * <p>Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 1 negotiations.</p>
         * <br>
         * <p>Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **0** to **86400**. Default value: **86400**.</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The negotiation mode of IKE. Valid values: **main** and **aggressive**. Default value: **main**.</p>
         * <br>
         * <p>*   **main**: This mode offers higher security during negotiations.</p>
         * <p>*   **aggressive**: This mode is faster and has a higher success rate.</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 1 negotiations. Default value: **group2**.\</p>
         * <p>Valid values: **group1**, **group2**, **group5**, and **group14**.</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol. Valid values: **ikev1** and **ikev2**. Default value: **ikev1**.</p>
         * <br>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier on the Alibaba Cloud side, which is used in Phase 1 negotiations. The value can be up to 100 characters in length. The default identifier is the IP address of the tunnel.</p>
         * <br>
         * <p>You can set **LocalId** to a fully qualified domain name (FQDN). In this case, we recommend that you set IkeMode to **aggressive**.</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key, which is used for identity authentication between the tunnel and the tunnel peer.</p>
         * <br>
         * <p>   - The key must be 1 to 100 characters in length and can contain digits, letters, and the following characters: ```~!\`@#$%^&*()_-+={}[]|;:\",.<>/?```</p>
         * <p>   - If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the DescribeVpnConnection (~~120374~~) operation to query the pre-shared key that is generated by the system.      </p>
         * <br>
         * <p>   > The pre-shared key of the tunnel and that of the tunnel peer must be the same. Otherwise, the system cannot establish the tunnel.</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the tunnel peer, which is used in Phase 1 negotiations. The value can be up to 100 characters in length. The default identifier is the IP address of the customer gateway associated with the tunnel.</p>
         * <br>
         * <p>You can set **RemoteId** to an FQDN. In this case, we recommend that you set IkeMode to **aggressive**.</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig self = new CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
         * <br>
         * <p>Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 2 negotiations.</p>
         * <br>
         * <p>Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **0** to **86400**. Default value: **86400**.</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 2 negotiations. Default value: **group2**.</p>
         * <br>
         * <p>Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**.</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig self = new CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class CreateVpnConnectionRequestTunnelOptionsSpecification extends TeaModel {
        /**
         * <p>The ID of the customer gateway associated with the tunnel.</p>
         * <br>
         * <br>
         * <br>
         * <p>> *   This parameter is required if the VPN gateway supports the dual-tunnel mode.</p>
         * <p>> *   If the VPN gateway supports the dual-tunnel mode, you must configure the active tunnel and standby tunnel by specifying **TunnelOptionsSpecification**. Each IPsec-VPN connection supports only one active tunnel and one standby tunnel.</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>Specifies whether to enable the Dead Peer Detection (DPD) feature for the tunnel. Valid values:</p>
         * <br>
         * <p>*   **true** (default): The DPD feature is enabled. The initiator of the IPsec-VPN connection sends DPD packets to verify the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SAs and IPsec SAs are deleted. The IPsec tunnel is also deleted.</p>
         * <p>*   **false**: The DPD feature is disabled. The initiator of the IPsec-VPN connection does not send DPD packets.</p>
         */
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        /**
         * <p>Specifies whether to enable NAT traversal for the tunnel. Valid values:</p>
         * <br>
         * <p>*   **true** (default): NAT traversal is enabled. After NAT traversal is enabled, the verification process for the peer UDP port is deleted from IKE negotiations. In addition, the NAT gateway in the tunnel can be found.</p>
         * <p>*   **false**: NAT traversal is disabled.</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>The CA certificate. If the VPN gateway is of the SM type, you must configure a CA certificate for the peer gateway device.</p>
         * <br>
         * <p>*   If an SM VPN gateway is used to create the IPsec-VPN connection, this parameter is required.</p>
         * <p>*   If a standard VPN gateway is used to create the IPsec-VPN connection, leave this parameter empty.</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The role of the tunnel. Valid values:</p>
         * <br>
         * <p>*   **master**: The tunnel is the active tunnel.</p>
         * <p>*   **slave**: The tunnel is the standby tunnel.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The BGP configurations for the tunnel.</p>
         */
        @NameInMap("TunnelBgpConfig")
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>The configurations of Phase 1 negotiations.</p>
         */
        @NameInMap("TunnelIkeConfig")
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("TunnelIpsecConfig")
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig;

        public static CreateVpnConnectionRequestTunnelOptionsSpecification build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnConnectionRequestTunnelOptionsSpecification self = new CreateVpnConnectionRequestTunnelOptionsSpecification();
            return TeaModel.build(map, self);
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setTunnelBgpConfig(CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setTunnelIkeConfig(CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        public CreateVpnConnectionRequestTunnelOptionsSpecification setTunnelIpsecConfig(CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

    }

}
