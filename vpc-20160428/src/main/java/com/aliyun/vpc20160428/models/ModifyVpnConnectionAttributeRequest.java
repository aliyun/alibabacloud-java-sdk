// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically advertise routes. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    /**
     * <p>This parameter is supported by single-tunnel IPsec-VPN connections.</p>
     * <p>The Border Gateway Protocol (BGP) configurations:</p>
     * <ul>
     * <li><p><strong>BgpConfig.EnableBgp:</strong> specifies whether to enable BGP. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
     * </li>
     * <li><p><strong>BgpConfig.LocalAsn:</strong> the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>.</p>
     * <p>You can enter the ASN in two segments. Separate the first 16 bits of the ASN from the remaining 16 bits with a period (.). Enter the number in each segment in decimal format.</p>
     * <p>For example, if you enter 123.456, the ASN is: 123 × 65536 + 456 = 8061384.</p>
     * </li>
     * <li><p><strong>BgpConfig.TunnelCidr</strong>: the CIDR block of the IPsec tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * <blockquote>
     * <p>The CIDR block of the IPsec tunnel of each IPsec-VPN connection must be unique on a VPN gateway.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>LocalBgpIp</strong>: the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block range of the IPsec tunnel.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when the VPN gateway has dynamic BGP enabled.</li>
     * <li>Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see <a href="https://help.aliyun.com/document_detail/170235.html">BGP dynamic routing </a>.</li>
     * <li>We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. For information about the range of private ASNs, see the relevant documentation.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EnableBgp&quot;:&quot;true&quot;,&quot;LocalAsn&quot;:&quot;65530&quot;,&quot;TunnelCidr&quot;:&quot;169.254.11.0/30&quot;,&quot;LocalBgpIp&quot;:&quot;169.254.11.1&quot;}</p>
     */
    @NameInMap("BgpConfig")
    public String bgpConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: immediately starts IPsec negotiations after the configuration takes effect.</li>
     * <li><strong>false</strong>: IPsec negotiations start when inbound traffic is detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong>: enables the DPD feature. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specific period of time, the connection fails. Then, the ISAKMP SA, IPsec SA, and IPsec tunnel are deleted.</li>
     * <li><strong>false</strong>: disables the DPD feature. The initiator of the IPsec-VPN connection does not send DPD packets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>You can specify this parameter if you modify the configuration of a dual-tunnel IPsec-VPN connection.</p>
     * <p>Specifies whether to enable BGP for the tunnel. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <p>The health check configuration:</p>
     * <ul>
     * <li><strong>HealthCheckConfig.enable</strong>: specifies whether to enable health checks. Valid values: <strong>true</strong> and <strong>false</strong>.</li>
     * <li><strong>HealthCheckConfig.dip</strong>: the destination IP address that is used for health checks.</li>
     * <li><strong>HealthCheckConfig.sip</strong>: the source IP address that is used for health checks.</li>
     * <li><strong>HealthCheckConfig.interval</strong>: the interval between two consecutive health checks. Unit: seconds.</li>
     * <li><strong>HealthCheckConfig.retry</strong>: the maximum number of health check retries.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:&quot;true&quot;,&quot;dip&quot;:&quot;192.168.1.1&quot;,&quot;sip&quot;:&quot;10.1.1.1&quot;,&quot;interval&quot;:&quot;3&quot;,&quot;retry&quot;:&quot;3&quot;}</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>This parameter is supported by single-tunnel IPsec-VPN connections.</p>
     * <p>The configurations of Phase 1 negotiations:</p>
     * <ul>
     * <li><p><strong>IkeConfig.Psk</strong>: the pre-shared key that is used for authentication between the VPN gateway and the data center.</p>
     * <ul>
     * <li>It must be 1 to 100 characters in length, and can contain letters, digits, and the following characters: <code>~!`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></li>
     * <li>If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key that is generated by the system.</li>
     * </ul>
     * <blockquote>
     * <p>The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises database. Otherwise, the on-premises database and the VPN gateway cannot establish a connection.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>IkeConfig.IkeVersion</strong>: the version of the Internet Key Exchange (IKE) protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</p>
     * <p>Compared with IKEv1, IKEv2 simplifies the security association (SA) negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeMode</strong>: the negotiation mode of IKE. Valid values: <strong>main</strong> and <strong>aggressive</strong>.</p>
     * <ul>
     * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
     * <li><strong>aggressive</strong>: This mode is faster and has a higher success rate.</li>
     * </ul>
     * </li>
     * <li><p><strong>IkeConfig.IkeEncAlg</strong>: the encryption algorithm that is used in Phase 1 negotiations.</p>
     * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiations.</p>
     * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkePfs</strong>: the Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeLifetime</strong>: the security association (SA) lifetime that is determined by Phase 1 negotiations. Unit: seconds. Valid values: <strong>0 to 86400</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.LocalId</strong>: the identifier of the VPN gateway. The identifier cannot exceed 100 characters in length. The default value is the IP address of the VPN gateway.</p>
     * </li>
     * <li><p><strong>IkeConfig.RemoteId</strong>: the identifier of the customer gateway. The identifier cannot exceed 100 characters in length. The default value is the IP address of the customer gateway.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Psk&quot;:&quot;pgw6dy7d1i8i****&quot;,&quot;IkeVersion&quot;:&quot;ikev1&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400,&quot;LocalId&quot;:&quot;116.64.XX.XX&quot;,&quot;RemoteId&quot;:&quot;139.18.XX.XX&quot;}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <p>The configuration of Phase 2 negotiations:</p>
     * <ul>
     * <li><p><strong>IpsecConfig.IpsecEncAlg</strong>: the encryption algorithm that is used in Phase 2 negotiations.</p>
     * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
     * </li>
     * <li><p><strong>IpsecConfig. IpsecAuthAlg</strong>: the authentication algorithm that is used in Phase 2 negotiations.</p>
     * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
     * </li>
     * <li><p><strong>IpsecConfig. IpsecPfs</strong>: the DH key exchange algorithm that is used in Phase 1 negotiations. If you specify this parameter, packets of all protocols are forwarded. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
     * </li>
     * <li><p><strong>IpsecConfig. IpsecLifetime:</strong> the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: <strong>0 to 86400</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block used to connect the virtual private cloud (VPC) to the data center. The CIDR block is used in Phase 2 negotiations.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * <p>The following routing modes are supported:</p>
     * <ul>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.1.1.0/24,10.1.2.0/24</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region in which the IPsec-VPN connection is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.</p>
     * <p>If the VPN gateway uses a ShangMi (SM) certificate, you can modify the CA certificate used by the IPsec peer.</p>
     * <p>If the VPN gateway does not use an SM certificate, you cannot specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block on the data center side. This CIDR block is used in Phase 2 negotiations.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
     * <p>The following routing modes are supported:</p>
     * <ul>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.2.1.0/24,10.2.2.0/24</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tunnel configurations.</p>
     * <p>You can specify the parameters in <strong>TunnelOptionsSpecification</strong> if you modify the configuration of a dual-tunnel IPsec-VPN connection. You can modify both the active and standby tunnels of the IPsec-VPN connection.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public java.util.List<ModifyVpnConnectionAttributeRequestTunnelOptionsSpecification> tunnelOptionsSpecification;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-bp1bbi27hojx80nck****</p>
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
         * <p>The ASN of the tunnel on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>You can specify or modify this parameter if BGP is enabled for the IPsec-VPN connection (<strong>EnableTunnelsBgp</strong> is set to <strong>true</strong>).</li>
         * <li>Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see <a href="https://help.aliyun.com/document_detail/170235.html">VPN Gateway supports BGP dynamic routing</a>.</li>
         * <li>We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. For information about the range of private ASNs, see the relevant documentation.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP IP address of the tunnel on the Alibaba Cloud side. The address is an IP address that falls within the BGP CIDR block range.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.1</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The BGP CIDR block of the tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
         * <blockquote>
         * <p> The BGP CIDR block of a tunnel associated with a VPN gateway must be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.0/30</p>
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
         * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 1 negotiations.</p>
         * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The IKE negotiation mode. Valid values:</p>
         * <ul>
         * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
         * <li><strong>aggressive</strong>: This mode is faster and has a higher success rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</p>
         * <p>Compared with IKEv1, IKEv2 simplifies the security association (SA) negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier on the Alibaba Cloud side, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length. The default identifier is the IP address of the tunnel.</p>
         * <p>You can set <strong>LocalId</strong> to a fully qualified domain name (FQDN). In this case, we recommend that you set IkeMode to <strong>aggressive</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>47.21.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key, which is used for identity authentication between the tunnel and the tunnel peer.</p>
         * <ul>
         * <li>The key must be 1 to 100 characters in length and can contain digits, letters, and the following characters: <code>~!\\`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></li>
         * <li>If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key that is generated by the system.</li>
         * </ul>
         * <blockquote>
         * <p> The tunnel and the tunnel peer must use the same pre-shared key. Otherwise, the tunnel cannot be established.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the tunnel peer, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length. The default identifier is the IP address of the customer gateway associated with the tunnel.</p>
         * <p>You can set <strong>RemoteId</strong> to an FQDN. In this case, we recommend that you set IkeMode to <strong>aggressive</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>47.42.XX.XX</p>
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
         * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 2 negotiations.</p>
         * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Integer ipsecLifetime;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 2 negotiations.</p>
         * <p>Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
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
         * <ul>
         * <li><strong>true</strong> The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SA and IPsec SA are deleted. The security tunnel is also deleted.</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        /**
         * <p>Specifies whether to enable NAT traversal for the tunnel. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> After NAT traversal is enabled, the initiator does not check the UDP ports during Internet Key Exchange (IKE) negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>If the VPN gateway uses an SM certificate, you can modify the CA certificate used by the IPsec peer.</p>
         * <p>If the VPN gateway does not use an SM certificate, this parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The tunnel role. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: The tunnel is an active tunnel.</li>
         * <li><strong>slave</strong>: The tunnel is a standby tunnel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The Border Gateway Protocol (BGP) configurations of the tunnel.</p>
         */
        @NameInMap("TunnelBgpConfig")
        public ModifyVpnConnectionAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p><strong>TunnelOptionsSpecification</strong> parameters are supported by dual-tunnel IPsec-VPN gateways. You can modify both the active and standby tunnels of the IPsec-VPN connection.</p>
         * <p>The tunnel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tun-opsqc4d97wni27****</p>
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
