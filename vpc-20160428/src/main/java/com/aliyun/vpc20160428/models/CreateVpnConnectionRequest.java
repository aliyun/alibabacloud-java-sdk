// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically configure routes. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    /**
     * <p>This parameter is supported when you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>BGP configuration:</p>
     * <ul>
     * <li><p><strong>BgpConfig.EnableBgp</strong>: specifies whether to enable BGP. Valid values: <strong>true</strong> and <strong>false</strong> (default).</p>
     * </li>
     * <li><p><strong>BgpConfig.LocalAsn:</strong> the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
     * <p>You can enter a value in two segments separated by a period (.). Each segment is 16 bits in length. Enter the number in each segment in decimal format.</p>
     * <p>For example, if you enter 123.456, the ASN is 8061384. The ASN is calculated by using the following formula: 123 × 65536 + 456 = 8061384.</p>
     * </li>
     * <li><p><strong>BgpConfig.TunnelCidr</strong>: The CIDR block of the IPsec tunnel. The CIDR block must belong to 169.254.0.0/16 and the subnet mask is 30 bits in length.</p>
     * <blockquote>
     * <p>The CIDR block of the IPsec tunnel for each IPsec-VPN connection on a VPN gateway must be unique.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>LocalBgpIp</strong>: the BGP address on the Alibaba Cloud side. It must be an IP address that falls within the CIDR block of the IPsec tunnel.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Before you add BGP configurations, we recommend that you learn about how BGP works and the limits. For more information, see <a href="https://help.aliyun.com/document_detail/170235.html">VPN Gateway supports BGP dynamic routing</a>.</li>
     * <li>We recommend that you use private ASN to establish BGP connections to Alibaba Cloud. Refer to the relevant documentation for the private ASN range.</li>
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
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>When you create an IPsec-VPN connection in single-tunnel mode, this parameter is required.</p>
     * <p>The ID of the customer gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>cgw-p0w2jemrcj5u61un8****</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Specifies whether to immediately start IPsec negotiations. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: immediately starts IPsec negotiations.</li>
     * <li><strong>false</strong> (default): starts IPsec negotiations when inbound traffic is detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>This parameter is available if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default) The initiator of the IPsec-VPN connection sends DPD packets to verify the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SAs and IPsec SAs are deleted. The IPsec tunnel is also deleted.</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>This parameter is available if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default) After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the VPN tunnel.</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>This parameter is available if you create an IPsec-VPN connection in dual-tunnel mode.</p>
     * <p>Specifies whether to enable the BGP feature for the tunnel. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>This parameter is available if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The health check configuration:</p>
     * <ul>
     * <li><strong>HealthCheckConfig.enable</strong>: specifies whether to enable health checks. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: false.</li>
     * <li><strong>HealthCheckConfig.dip</strong>: the destination IP address configured for health checks.</li>
     * <li><strong>HealthCheckConfig.sip:</strong> the source IP address that is used for health checks.</li>
     * <li><strong>HealthCheckConfig.interval</strong>: the time interval of health check retries. Unit: seconds. Default value: <strong>3</strong>.</li>
     * <li><strong>HealthCheckConfig.retry</strong>: the maximum number of health check retries. Default value: <strong>3</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:&quot;true&quot;,&quot;dip&quot;:&quot;192.168.10.1&quot;,&quot;sip&quot;:&quot;10.10.1.1&quot;,&quot;interval&quot;:&quot;3&quot;,&quot;retry&quot;:&quot;3&quot;}</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>This parameter is available if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The configurations of Phase 1 negotiations:</p>
     * <ul>
     * <li><p><strong>IkeConfig.Psk</strong>: The pre-shared key that is used for authentication between the VPN gateway and the on-premises database.</p>
     * <ul>
     * <li><p>The key must be 1 to 100 characters in length and can contain digits, letters, and the following characters: <code>~!\\`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></p>
     * </li>
     * <li><p>If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key that is generated by the system.</p>
     * <blockquote>
     * <p>The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises database. Otherwise, the on-premises database and the VPN gateway cannot establish a connection.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>IkeConfig.IkeVersion</strong>: the version of the Internet Key Exchange (IKE) protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>. Default value: <strong>ikev1</strong>.</p>
     * <p>Compared with IKEv1, IKEv2 simplifies the security association (SA) negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeMode</strong>: the negotiation mode of IKE. Valid values: <strong>main</strong> and <strong>aggressive</strong>. Default value: <strong>main</strong>.</p>
     * <ul>
     * <li><strong>main:</strong> This mode offers higher security during negotiations.</li>
     * <li><strong>aggressive:</strong> This mode is faster and has a higher success rate.</li>
     * </ul>
     * </li>
     * <li><p><strong>IkeConfig.IkeEncAlg</strong>: the encryption algorithm that is used in Phase 1 negotiations.</p>
     * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiations.</p>
     * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkePfs</strong>: the Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>. Default value: <strong>group2</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeLifetime</strong>: the SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.LocalId</strong>: the identifier of the VPN gateway. The value can be up to 100 characters in length. The default value is the IP address of the VPN gateway.</p>
     * </li>
     * <li><p><strong>IkeConfig.RemoteId</strong>: the identifier of the customer gateway. The value can be up to 100 characters in length. The default value is the IP address of the customer gateway.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Psk&quot;:&quot;1234****&quot;,&quot;IkeVersion&quot;:&quot;ikev1&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400,&quot;LocalId&quot;:&quot;47.XX.XX.1&quot;,&quot;RemoteId&quot;:&quot;47.XX.XX.2&quot;}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>This parameter is available if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The configurations of Phase 2 negotiations:</p>
     * <ul>
     * <li><p><strong>IpsecConfig.IpsecEncAlg</strong>: the encryption algorithm that is used in Phase 2 negotiations.</p>
     * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
     * </li>
     * <li><p><strong>IpsecConfig. IpsecAuthAlg</strong>: the authentication algorithm that is used in Phase 2 negotiations.</p>
     * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</p>
     * </li>
     * <li><p><strong>IpsecConfig. IpsecPfs</strong>: the DH key exchange algorithm that is used in Phase 2 negotiations. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>. Default value: <strong>group2</strong>.</p>
     * </li>
     * <li><p><strong>IpsecConfig. IpsecLifetime</strong>: the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block of the virtual private cloud (VPC) that needs to communicate with the on-premises database. The CIDR block is used in Phase 2 negotiations.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * <p>The following routing modes are supported:</p>
     * <ul>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
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
     * <p>The ID of the region where the IPsec-VPN connection is created. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is available if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The certificate authority (CA) certificate. If the VPN gateway is of the ShangMi (SM) type, you need to configure a CA certificate for the peer gateway device.</p>
     * <ul>
     * <li>If an SM VPN gateway is used to create the IPsec-VPN connection, this parameter is required.</li>
     * <li>If a standard VPN gateway is used to create the IPsec-VPN connection, leave this parameter empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block of the on-premises database that needs to communicate with the VPC. The CIDR block is used in Phase 2 negotiations.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
     * <p>The following routing modes are supported:</p>
     * <ul>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
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
     * <p>The tag value.</p>
     * <p>The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
     * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values in each call.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateVpnConnectionRequestTags> tags;

    /**
     * <p>The tunnel configurations.</p>
     * <ul>
     * <li>You can specify the parameters in the <strong>TunnelOptionsSpecification</strong> array if you create an IPsec-VPN connection in dual-tunnel mode.</li>
     * <li>If you create an IPsec-VPN connection in dual-tunnel mode, you need to configure an active tunnel and a standby tunnel. Each IPsec-VPN connection supports only one active tunnel and one standby tunnel.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public java.util.List<CreateVpnConnectionRequestTunnelOptionsSpecification> tunnelOptionsSpecification;

    /**
     * <p>The ID of the VPN gateway.</p>
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
         * <p>It can be at most 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values in each call.</p>
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
         * <p>The ASN on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>If you set <strong>EnableTunnelsBgp</strong> to <strong>true</strong>, this parameter is required.</li>
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
         * <p>The BGP address on the Alibaba Cloud side. The address is an IP address that falls within the BGP CIDR block range.</p>
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
         * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 1 negotiations.</p>
         * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds.</p>
         * <p>Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The negotiation mode of IKE. Valid values: <strong>main</strong> and <strong>aggressive</strong>. Default value: <strong>main</strong>.</p>
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
         * <p>The DH key exchange algorithm that is used in Phase 1 negotiations. Default value: <strong>group2</strong>.\
         * Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>. Default value: <strong>ikev1</strong>.</p>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier on the Alibaba Cloud side, which is used in Phase 1 negotiations. The value can be up to 100 characters in length. The default identifier is the IP address of the tunnel.</p>
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
         * <p>The identifier of the tunnel peer, which is used in Phase 1 negotiations. The value can be up to 100 characters in length. The default identifier is the IP address of the customer gateway associated with the tunnel.</p>
         * <p>You can set <strong>RemoteId</strong> to an FQDN. In this case, we recommend that you set IkeMode to <strong>aggressive</strong>.</p>
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
         * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
         * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 2 negotiations.</p>
         * <p>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds.</p>
         * <p>Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 2 negotiations. Default value: <strong>group2</strong>.</p>
         * <p>Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
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
         * <blockquote>
         * <ul>
         * <li>This parameter is required if the VPN gateway supports the dual-tunnel mode.</li>
         * <li>You can specify the parameters in the <strong>TunnelOptionsSpecification</strong> array if you create an IPsec-VPN connection in dual-tunnel mode.</li>
         * <li>If you create an IPsec-VPN connection in dual-tunnel mode, you need to configure an active tunnel and a standby tunnel. Each IPsec-VPN connection supports only one active tunnel and one standby tunnel.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cgw-p0wy363lucf1uyae8****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>Specifies whether to enable DPD for the tunnel. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default) The initiator of the IPsec-VPN connection sends DPD packets to verify the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SAs and IPsec SAs are deleted. The IPsec tunnel is also deleted.</li>
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
         * <li><strong>true</strong> (default) After NAT traversal is enabled, the verification process for the peer UDP port is deleted from IKE negotiations. In addition, the NAT gateway in the tunnel can be found.</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>The CA certificate. If the VPN gateway is of the SM type, you must configure a CA certificate for the peer gateway device.</p>
         * <ul>
         * <li>If an SM VPN gateway is used to create the IPsec-VPN connection, this parameter is required.</li>
         * <li>If a standard VPN gateway is used to create the IPsec-VPN connection, leave this parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The role of the tunnel. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: The tunnel is the active tunnel.</li>
         * <li><strong>slave</strong>: The tunnel is the standby tunnel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
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
