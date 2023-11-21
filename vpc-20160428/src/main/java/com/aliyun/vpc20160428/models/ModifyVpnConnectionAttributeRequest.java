// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically advertise routes. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <br>
     * <p>The Border Gateway Protocol (BGP) configuration:</p>
     * <br>
     * <p>*   **BgpConfig.EnableBgp:** specifies whether to enable BGP. Valid values: **true** and **false**.</p>
     * <br>
     * <p>*   **BgpConfig.LocalAsn**: the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: **1** to **4294967295**.</p>
     * <br>
     * <p>*   **BgpConfig.TunnelCidr:** the CIDR block of the IPsec tunnel. The CIDR block falls within 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * <br>
     * <p>    >The CIDR block of the IPsec tunnel of each IPsec-VPN connection must be unique on a VPN gateway.</p>
     * <br>
     * <p>*   **LocalBgpIp**: the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.</p>
     * <br>
     * <p>> *   This parameter is required when the VPN gateway has dynamic BGP enabled.</p>
     * <p>>*   Before you configure BGP, we recommend that you learn how BGP dynamic routing works and the limits of using BGP dynamic routing. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).</p>
     * <p>>*   We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. Refer to the relevant documentation for the private ASN range.</p>
     */
    @NameInMap("BgpConfig")
    public String bgpConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:</p>
     * <br>
     * <p>*   **true**: immediately starts IPsec negotiations after the configuration takes effect.</p>
     * <p>*   **false**: IPsec negotiations start when inbound traffic is detected.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <br>
     * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
     * <br>
     * <p>*   **true:**: enables the DPD feature. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specific period of time, the connection fails. Then, the ISAKMP SA, IPsec SA, and IPsec tunnel are deleted.</p>
     * <p>*   **false**: disables the DPD feature. The initiator of the IPsec-VPN connection does not send DPD packets.</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <br>
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <br>
     * <p>*   **true** After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>You can specify this parameter if you modify the configuration of a dual-tunnel IPsec-VPN connection.</p>
     * <br>
     * <p>Specifies whether to enable BGP for the tunnel. Valid values: **true** and **false**.</p>
     */
    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <br>
     * <p>The health check configuration:</p>
     * <br>
     * <p>*   **HealthCheckConfig.enable**: specifies whether to enable health checks. Valid values: **true** and **false**.</p>
     * <p>*   **HealthCheckConfig.dip**: the destination IP address that is used for health checks.</p>
     * <p>*   **HealthCheckConfig.sip**: the source IP address that is used for health checks.</p>
     * <p>*   **HealthCheckConfig.interval**: the interval between two consecutive health checks. Unit: seconds.</p>
     * <p>*   **HealthCheckConfig.retry**: the maximum number of health check retries.</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>This parameter is supported by single-tunnel IPsec-VPN connections.</p>
     * <br>
     * <p>The configurations of Phase 1 negotiations:</p>
     * <br>
     * <p>*   **IkeConfig.Psk**: the pre-shared key that is used for authentication between the VPN gateway and the data center.</p>
     * <br>
     * <p>    *   It must be 1 to 100 characters in length, and can contain letters, digits, and the following characters: ``~!`@#$%^&*()_-+={}[]|;:\",.<>/?``</p>
     * <p>    *   If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the [DescribeVpnConnection](~~448847~~) operation to query the pre-shared key that is generated by the system.</p>
     * <br>
     * <p>     > The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises database. Otherwise, the on-premises database and the VPN gateway cannot establish a connection.</p>
     * <br>
     * <p>*   **IkeConfig.IkeVersion**: the version of the Internet Key Exchange (IKE) protocol. Valid values: **ikev1** and **ikev2**.</p>
     * <br>
     * <p>    Compared with IKEv1, IKEv2 simplifies the security association (SA) negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
     * <br>
     * <p>*   **IkeConfig.IkeMode**: the negotiation mode of IKE. Valid values: **main** and **aggressive**.</p>
     * <br>
     * <p>    *   **main**: This mode offers higher security during negotiations.</p>
     * <p>    *   **aggressive**: This mode is faster and has a higher success rate.</p>
     * <br>
     * <p>*   **IkeConfig.IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiations.</p>
     * <br>
     * <p>    Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations.</p>
     * <br>
     * <p>    Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.</p>
     * <br>
     * <p>*   **IkeConfig.IkePfs**: the Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeLifetime**: the security association (SA) lifetime that is determined by Phase 1 negotiations. Unit: seconds. Valid values: **0 to 86400**.</p>
     * <br>
     * <p>*   **IkeConfig.LocalId**: the identifier of the VPN gateway. The identifier cannot exceed 100 characters in length. The default value is the IP address of the VPN gateway.</p>
     * <br>
     * <p>*   **IkeConfig.RemoteId**: the identifier of the customer gateway. The identifier cannot exceed 100 characters in length. The default value is the IP address of the customer gateway.</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <br>
     * <p>The configuration of Phase 2 negotiations:</p>
     * <br>
     * <p>*   **IpsecConfig.IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiations.</p>
     * <br>
     * <p>    Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.</p>
     * <br>
     * <p>*   **IpsecConfig. IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiations.</p>
     * <br>
     * <p>    Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.</p>
     * <br>
     * <p>*   **IpsecConfig. IpsecPfs**: the DH key exchange algorithm that is used in Phase 1 negotiations. If you specify this parameter, packets of all protocols are forwarded. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**.</p>
     * <br>
     * <p>*   **IpsecConfig. IpsecLifetime:** the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0 to 86400**.</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block used to connect the virtual private cloud (VPC) to the data center. The CIDR block is used in Phase 2 negotiations.</p>
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
     * <p>The ID of the region in which the IPsec-VPN connection is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <br>
     * <p>If the VPN gateway uses a ShangMi (SM) certificate, you can modify the CA certificate used by the IPsec peer.</p>
     * <br>
     * <p>If the VPN gateway does not use an SM certificate, you cannot specify this parameter.</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

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
     * <p>The tunnel configurations.</p>
     * <br>
     * <p>You can specify the parameters in **TunnelOptionsSpecification** if you modify the configuration of a dual-tunnel IPsec-VPN connection. You can modify both the active and standby tunnels of the IPsec-VPN connection.</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public java.util.List<ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification> tunnelOptionsSpecification;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static ModifyVpnConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnConnectionAttributeRequest self = new ModifyVpnConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpnConnectionAttributeRequest setAutoConfigRoute(Boolean autoConfigRoute) {
        this.autoConfigRoute = autoConfigRoute;
        return this;
    }
    public Boolean getAutoConfigRoute() {
        return this.autoConfigRoute;
    }

    public ModifyVpnConnectionAttributeRequest setBgpConfig(String bgpConfig) {
        this.bgpConfig = bgpConfig;
        return this;
    }
    public String getBgpConfig() {
        return this.bgpConfig;
    }

    public ModifyVpnConnectionAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpnConnectionAttributeRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public ModifyVpnConnectionAttributeRequest setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyVpnConnectionAttributeRequest setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyVpnConnectionAttributeRequest setEnableTunnelsBgp(Boolean enableTunnelsBgp) {
        this.enableTunnelsBgp = enableTunnelsBgp;
        return this;
    }
    public Boolean getEnableTunnelsBgp() {
        return this.enableTunnelsBgp;
    }

    public ModifyVpnConnectionAttributeRequest setHealthCheckConfig(String healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public String getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public ModifyVpnConnectionAttributeRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public ModifyVpnConnectionAttributeRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public ModifyVpnConnectionAttributeRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifyVpnConnectionAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnConnectionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVpnConnectionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVpnConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpnConnectionAttributeRequest setRemoteCaCertificate(String remoteCaCertificate) {
        this.remoteCaCertificate = remoteCaCertificate;
        return this;
    }
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    public ModifyVpnConnectionAttributeRequest setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public ModifyVpnConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVpnConnectionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVpnConnectionAttributeRequest setTunnelOptionsSpecification(java.util.List<ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification> tunnelOptionsSpecification) {
        this.tunnelOptionsSpecification = tunnelOptionsSpecification;
        return this;
    }
    public java.util.List<ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification> getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    public ModifyVpnConnectionAttributeRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static class ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig extends TeaModel {
        /**
         * <p>The ASN on the Alibaba Cloud side. Valid values: **1** to **4294967295**. Default value: **45104**.</p>
         * <br>
         * <p>> *   You can specify or modify this parameter if BGP is enabled for the IPsec-VPN connection (**EnableTunnelsBgp** is set to **true**).</p>
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
         * <p>The BGP CIDR block of the tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
         * <br>
         * <p>>  The BGP CIDR block of a tunnel associated with a VPN gateway must be unique.</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig self = new ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in Phase 1 negotiations.</p>
         * <br>
         * <p>Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 1 negotiations.</p>
         * <br>
         * <p>Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**.</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The negotiation mode of IKE. Valid values:</p>
         * <br>
         * <p>*   **main**: This mode offers higher security during negotiations.</p>
         * <p>*   **aggressive**: This mode is faster and has a higher success rate.</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**.</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol. Valid values: **ikev1** and **ikev2**.</p>
         * <br>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier on the Alibaba Cloud side, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length. The default identifier is the IP address of the tunnel.</p>
         * <br>
         * <p>You can set **LocalId** to a fully qualified domain name (FQDN). In this case, we recommend that you set IkeMode to **aggressive**.</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key, which is used for identity authentication between the tunnel and the tunnel peer.</p>
         * <br>
         * <p>*   It must be 1 to 100 characters in length, and can contain letters, digits, and the following characters: ``~!\`@#$%^&*()_-+={}[]|;:\",.<>/?``</p>
         * <p>*   If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the [DescribeVpnConnection](~~448847~~) operation to query the pre-shared key that is generated by the system.</p>
         * <br>
         * <p>>  The tunnel and the tunnel peer must use the same pre-shared key. Otherwise, the tunnel cannot be established.</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the tunnel peer, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length. The default identifier is the IP address of the customer gateway associated with the tunnel.</p>
         * <br>
         * <p>You can set **RemoteId** to an FQDN. In this case, we recommend that you set IkeMode to **aggressive**.</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig self = new ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
         * <br>
         * <p>Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 2 negotiations.</p>
         * <br>
         * <p>Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**.</p>
         */
        @NameInMap("IpsecLifetime")
        public Integer ipsecLifetime;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 2 negotiations.</p>
         * <br>
         * <p>Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**.</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig self = new ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecLifetime(Integer ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Integer getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification extends TeaModel {
        /**
         * <p>Specifies whether to enable the Dead Peer Detection (DPD) feature for the tunnel. Valid values:</p>
         * <br>
         * <p>*   **true** The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SA and IPsec SA are deleted. The security tunnel is also deleted.</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        /**
         * <p>Specifies whether to enable NAT traversal for the tunnel. Valid values:</p>
         * <br>
         * <p>*   **true** After NAT traversal is enabled, the initiator does not check the UDP ports during Internet Key Exchange (IKE) negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>If the VPN gateway uses an SM certificate, you can modify the CA certificate used by the IPsec peer.</p>
         * <br>
         * <p>If the VPN gateway does not use an SM certificate, this parameter is not supported.</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The tunnel role. Valid values:</p>
         * <br>
         * <p>- **master**: The tunnel is an active tunnel.</p>
         * <p>- **slave**: The tunnel is a standby tunnel.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The Border Gateway Protocol (BGP) configurations of the tunnel.</p>
         */
        @NameInMap("TunnelBgpConfig")
        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>**TunnelOptionsSpecification** parameters are supported by dual-tunnel IPsec-VPN gateways. You can modify both the active and standby tunnels of the IPsec-VPN connection.</p>
         * <br>
         * <p>The tunnel ID.</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <p>The configurations of Phase 1 negotiations.</p>
         */
        @NameInMap("TunnelIkeConfig")
        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("TunnelIpsecConfig")
        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig;

        public static ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification self = new ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setTunnelBgpConfig(ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }
        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setTunnelIkeConfig(ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }
        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification setTunnelIpsecConfig(ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }
        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

    }

}
