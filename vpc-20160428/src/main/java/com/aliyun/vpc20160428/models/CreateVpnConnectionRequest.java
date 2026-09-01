// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically configure routes. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): Automatically configures routes.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not automatically configure routes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The BGP configuration:</p>
     * <ul>
     * <li><p><strong>BgpConfig.EnableBgp</strong>: specifies whether to enable BGP. Valid values: <strong>true</strong> or <strong>false</strong> (default).</p>
     * </li>
     * <li><p><strong>BgpConfig.LocalAsn</strong>: the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
     * <p>  You can enter the ASN in the two-segment notation: the first 16 bits.the last 16 bits. Each segment is entered in decimal format.</p>
     * <p>  For example, if you enter 123.456, the ASN is 123 × 65536 + 456 = 8061384.</p>
     * </li>
     * <li><p><strong>BgpConfig.TunnelCidr</strong>: the CIDR block of the IPsec tunnel. The CIDR block must be a /30 subnet within 169.254.0.0/16, and cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, or 169.254.169.252/30.</p>
     * <blockquote>
     * <p>The IPsec tunnel CIDR block of each IPsec-VPN connection under a VPN gateway instance must be unique.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>LocalBgpIp</strong>: the BGP IP address on the Alibaba Cloud side. This address must be an IP address within the IPsec tunnel CIDR block.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Before you configure BGP, we recommend that you familiarize yourself with how BGP dynamic routing works and its limits. For more information, see <a href="https://help.aliyun.com/document_detail/2638220.html">Configure BGP dynamic routing</a>.</li>
     * <li>We recommend that you use a private ASN to establish a BGP connection with Alibaba Cloud. Refer to the relevant documentation for the private ASN range.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EnableBgp&quot;:&quot;true&quot;,&quot;LocalAsn&quot;:&quot;45104&quot;,&quot;TunnelCidr&quot;:&quot;169.254.11.0/30&quot;,&quot;LocalBgpIp&quot;:&quot;169.254.11.1&quot;}</p>
     */
    @NameInMap("BgpConfig")
    public String bgpConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is supported and required when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * 
     * <strong>example:</strong>
     * <p>cgw-p0w2jemrcj5u61un8****</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the IPsec-VPN connection configuration takes effect immediately. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The system immediately initiates IPsec protocol negotiation after the configuration is complete.</p>
     * </li>
     * <li><p><strong>false</strong> (default): The system initiates IPsec protocol negotiation only when inbound traffic is detected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Specifies whether to enable the Dead Peer Detection (DPD) feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): DPD is enabled. The IPsec initiator sends DPD packets to check whether the peer device is alive. If no correct response is received within the specified period of time, the peer is considered disconnected. The ISAKMP SA and the corresponding IPsec SA are deleted, and the security tunnel is also deleted.</p>
     * </li>
     * <li><p><strong>false</strong>: DPD is disabled. The IPsec initiator does not send DPD probe packets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): Enables NAT traversal. After NAT traversal is enabled, the IKE negotiation process skips UDP port number verification and can discover NAT gateway devices in the VPN tunnel.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables NAT traversal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in dual-tunnel mode.</p>
     * <p>Specifies whether to enable BGP for the tunnel. Valid values: <strong>true</strong> or <strong>false</strong> (default).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Health check configuration:</p>
     * <ul>
     * <li><p><strong>HealthCheckConfig.enable</strong>: Specifies whether to enable health checks. Valid values: <strong>true</strong> or <strong>false</strong> (default).</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.dip</strong>: The destination IP address of the health check.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.sip</strong>: The source IP address of the health check.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.interval</strong>: The retry interval of the health check. Unit: seconds. Default value: <strong>3</strong>.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.retry</strong>: The number of retry packets sent during the health check. Default value: <strong>3</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:&quot;true&quot;,&quot;dip&quot;:&quot;192.168.10.1&quot;,&quot;sip&quot;:&quot;10.10.1.1&quot;,&quot;interval&quot;:&quot;3&quot;,&quot;retry&quot;:&quot;3&quot;}</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Phase 1 negotiation configuration:</p>
     * <ul>
     * <li><p><strong>IkeConfig.Psk</strong>: The pre-shared key used for identity authentication between the VPN gateway and the on-premises data center.</p>
     * <ul>
     * <li><p>The key must be 1 to 100 characters in length and can contain digits, uppercase letters, lowercase letters, and the following characters. It cannot contain spaces. <code>~!\\`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></p>
     * </li>
     * <li><p>If you do not specify a pre-shared key, the system generates a random string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key automatically generated by the system.     </p>
     * <blockquote>
     * <p>The pre-shared key on the IPsec-VPN connection side must be the same as the authentication key on the on-premises data center side. Otherwise, the connection between the on-premises data center and the VPN gateway cannot be established.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>IkeConfig.IkeVersion</strong>: The version of the Internet Key Exchange protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>. Default value: <strong>ikev1</strong>.  </p>
     * <p>  Compared with IKEv1, IKEv2 simplifies the SA negotiation process and provides better support for multi-CIDR-block scenarios.</p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, only <strong>ikev1</strong> is supported for the IKE version.</ph></p>
     * </li>
     * <li><p><strong>IkeConfig.IkeMode</strong>: The negotiation mode of the IKE version. Valid values: <strong>main</strong> and <strong>aggressive</strong>. Default value: <strong>main</strong>.   </p>
     * <ul>
     * <li><strong>main</strong>: Main mode. This mode offers high negotiation security.</li>
     * <li><strong>aggressive</strong>: Aggressive mode. This mode supports rapid negotiation and a higher success rate.</li>
     * </ul>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, only <strong>main</strong> is supported for the negotiation mode.</ph></p>
     * </li>
     * <li><p><strong>IkeConfig.IkeEncAlg</strong>: The encryption algorithm used in Phase 1 negotiation.</p>
     * <p> &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>. </ph></p>
     * <p> &lt;props=&quot;china&quot;&gt;If the VPN gateway instance type is normal, valid values are <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, the value is <strong>sm4</strong> (default).</ph></p>
     * </li>
     * <li><p><strong>IkeConfig.IkeAuthAlg</strong>: The authentication algorithm used in Phase 1 negotiation.</p>
     * <p> &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is normal, valid values are <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, the value is <strong>sm3</strong> (default).</ph></p>
     * </li>
     * <li><p><strong>IkeConfig.IkePfs</strong>: The Diffie-Hellman key exchange algorithm used in Phase 1 negotiation. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>. Default value: <strong>group2</strong>.   </p>
     * </li>
     * <li><p><strong>IkeConfig.IkeLifetime</strong>: The lifetime of the SA generated in Phase 1 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.   </p>
     * </li>
     * <li><p><strong>IkeConfig.LocalId</strong>: The identifier of the VPN gateway. The value is limited to 100 characters and cannot contain spaces. Default value: the IP address of the VPN gateway. </p>
     * </li>
     * <li><p><strong>IkeConfig.RemoteId</strong>: The identifier of the customer gateway. The value is limited to 100 characters and cannot contain spaces. Default value: the IP address of the customer gateway.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Psk&quot;:&quot;1234****&quot;,&quot;IkeVersion&quot;:&quot;ikev1&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400,&quot;LocalId&quot;:&quot;47.XX.XX.1&quot;,&quot;RemoteId&quot;:&quot;47.XX.XX.2&quot;}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>This parameter is supported when you create a single-tunnel IPsec-VPN connection.</p>
     * <p>The configuration of Phase 2 negotiation:</p>
     * <ul>
     * <li><p><strong>IpsecConfig.IpsecEncAlg</strong>: The encryption algorithm used in Phase 2 negotiation.</p>
     * <p> &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>. Default value: <strong>aes</strong>. </ph></p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Standard, valid values are <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>. Default value: <strong>aes</strong>.</ph></p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM, the value is <strong>sm4</strong> (default).</ph></p>
     * </li>
     * <li><p><strong>IpsecConfig.IpsecAuthAlg</strong>: The authentication algorithm used in Phase 2 negotiation.</p>
     * <p> &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, or <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Standard, valid values are <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, or <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
     * <p> &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM, the value is <strong>sm3</strong> (default).</ph></p>
     * </li>
     * <li><p><strong>IpsecConfig.IpsecPfs</strong>: The Diffie-Hellman key exchange algorithm used in Phase 2 negotiation. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, or <strong>group14</strong>. Default value: <strong>group2</strong>.</p>
     * </li>
     * <li><p><strong>IpsecConfig.IpsecLifetime</strong>: The lifetime of the security association (SA) established in Phase 2 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block on the VPC side that needs to communicate with the on-premises data center. This is used for Phase 2 negotiation.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * <p>Description of the routing mode for the IPsec-VPN connection:</p>
     * <ul>
     * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to 0.0.0.0/0, the destination routing mode is used.</li>
     * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to specific CIDR blocks, the protected data flow mode is used.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.1.0/24,10.10.2.0/24</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>IPsec</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the IPsec-VPN connection. You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block of the on-premises data center that needs to communicate with the VPC. This is used for Phase 2 negotiation.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
     * <p>Description of the IPsec-VPN connection routing mode:</p>
     * <ul>
     * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to 0.0.0.0/0, the destination routing mode is used.</li>
     * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to specific CIDR blocks, the protected data flow mode is used.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.3.0/24,10.10.4.0/24</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags to add to the IPsec-VPN connection.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateVpnConnectionRequestTags> tags;

    /**
     * <p>The tunnel configurations.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public java.util.List<CreateVpnConnectionRequestTunnelOptionsSpecification> tunnelOptionsSpecification;

    /**
     * <p>The instance ID of the VPN gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1q8bgx4xnkm****</p>
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

    public CreateVpnConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
         * <p>The tag key. This value cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
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
         * <p>The autonomous system number (ASN) on the Alibaba Cloud side of the tunnel. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when BGP is enabled for the IPsec-VPN connection (the <strong>EnableTunnelsBgp</strong> parameter is set to <strong>true</strong>).</li>
         * <li>Before you configure BGP, we recommend that you familiarize yourself with how BGP dynamic routing works and its limits. For more information, see <a href="https://help.aliyun.com/document_detail/2638220.html">Configure BGP dynamic routing</a>.</li>
         * <li>Use a private ASN to establish a BGP connection with Alibaba Cloud. Refer to the relevant documentation for the private ASN range.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP address of the tunnel on the Alibaba Cloud side. The address is an IP address within the BGP CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.1</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The BGP CIDR block of the tunnel. The CIDR block must be a CIDR block within 169.254.0.0/16 with a mask length of 30 and cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, or 169.254.169.252/30.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.0/30</p>
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
         * <p>The authentication algorithm used in Phase 1 negotiations.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is ShangMi, the value is <strong>sm3</strong> (default).</ph></p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm used in Phase 1 negotiations.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>. Default value: <strong>aes</strong>. </ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values are <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>. Default value: <strong>aes</strong>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is ShangMi (China Cryptographic Algorithm), the value is <strong>sm4</strong> (default value).</ph></p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The lifetime of the Security Association (SA) negotiated in Phase 1. Unit: seconds.</p>
         * <p>Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The negotiation mode of the IKE version. Valid values: <strong>main</strong> and <strong>aggressive</strong>. Default value: <strong>main</strong>.</p>
         * <ul>
         * <li><strong>main</strong>: Main mode. This mode offers high negotiation security.</li>
         * <li><strong>aggressive</strong>: Aggressive mode. This mode offers fast negotiation and a high negotiation success rate.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is China Encryption, only <strong>main</strong> is supported as the negotiation mode.</ph></p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman key exchange algorithm used in the first-phase negotiation. Default value: <strong>group2</strong>.</p>
         * <p>Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol. Valid values: <strong>ikev1</strong> or <strong>ikev2</strong>. Default value: <strong>ikev1</strong>.</p>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and provides better support for multi-CIDR-block scenarios.</p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is China Encryption, only <strong>ikev1</strong> is supported for the IKE version.</ph></p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier of the tunnel on the Alibaba Cloud side, which is used for Phase 1 negotiation. The value can be up to 100 characters in length and cannot contain spaces. The default value is the IP address of the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>47.21.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key, which is used for identity authentication between the tunnel and the tunnel peer.</p>
         * <ul>
         * <li><p>The key must be 1 to 100 characters in length and can contain digits, uppercase letters, lowercase letters, and the following characters. It cannot contain spaces. <code>~!\\`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></p>
         * </li>
         * <li><p>If you do not specify a pre-shared key, the system randomly generates a 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key automatically generated by the system.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The pre-shared keys of the tunnel and the tunnel peer must be the same. Otherwise, the tunnel cannot be established.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the tunnel peer, which is used for Phase 1 negotiation. The value can be up to 100 characters in length and cannot contain spaces. The default value is the IP address of the customer gateway associated with the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>47.42.XX.XX</p>
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
         * <p>The authentication algorithm used in Phase 2 negotiations.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is ShangMi, the value is <strong>sm3</strong> (default).</ph></p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm used in Phase 2 negotiations.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>. Default value: <strong>aes</strong>. </ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values are <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>. Default value: <strong>aes</strong>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is ShangMi, the value is <strong>sm4</strong> (default value).</ph></p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The lifetime of the SA negotiated in Phase 2. Unit: seconds.</p>
         * <p>Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The Diffie-Hellman key exchange algorithm used in the second phase of negotiation. Default value: <strong>group2</strong>.</p>
         * <p>Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
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
         * 
         * <strong>example:</strong>
         * <p>cgw-p0wy363lucf1uyae8****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>Specifies whether to enable the Dead Peer Detection (DPD) feature for the tunnel. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): Enables the DPD feature. The IPsec initiator sends DPD packets to check whether the peer device is alive. If no correct response is received within the specified period of time, the peer is considered disconnected. The ISAKMP SA and the corresponding IPsec SA are deleted, and the security tunnel is also deleted.</p>
         * </li>
         * <li><p><strong>false</strong>: Disables the DPD feature. The IPsec initiator does not send DPD packets.</p>
         * </li>
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
         * <li><p><strong>true</strong> (default): Enables NAT traversal. After NAT traversal is enabled, the IKE negotiation process skips UDP port number verification and can discover NAT gateway devices in the tunnel.</p>
         * </li>
         * <li><p><strong>false</strong>: Disables NAT traversal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>If the current VPN gateway instance is a Chinese SM-based VPN gateway, you must configure the peer CA certificate for the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The role of the tunnel. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The BGP configuration for the tunnel.</p>
         */
        @NameInMap("TunnelBgpConfig")
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>The Phase 1 negotiation configuration.</p>
         */
        @NameInMap("TunnelIkeConfig")
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>The Phase 2 negotiation configuration.</p>
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
