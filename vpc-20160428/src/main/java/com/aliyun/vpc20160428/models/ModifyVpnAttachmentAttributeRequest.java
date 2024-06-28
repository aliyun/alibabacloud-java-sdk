// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnAttachmentAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically configure routes. Valid values:</p>
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
     * <p>The Border Gateway Protocol (BGP) configuration:</p>
     * <ul>
     * <li><p><strong>BgpConfig.EnableBgp</strong>: specifies whether to enable BGP. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>BgpConfig.LocalAsn</strong>: the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>.</p>
     * <p>You can enter the ASN in two segments. Separate the first 16 bits of the ASN from the remaining 16 bits with a period (.). Enter the number in each segment in decimal format.</p>
     * <p>For example, if you enter 123.456, the ASN is: 123 × 65536 + 456 = 8061384.</p>
     * </li>
     * <li><p><strong>BgpConfig.TunnelCidr:</strong> the CIDR block of the IPsec tunnel. The CIDR block falls within 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * </li>
     * <li><p><strong>LocalBgpIp:</strong> the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Before you configure BGP, we recommend that you learn how BGP dynamic routing works and the limits of using BGP dynamic routing. For more information, see <a href="https://help.aliyun.com/document_detail/170235.html">BGP dynamic routing </a>.</li>
     * <li>We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. Refer to the relevant documentation for the private ASN range.</li>
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
     * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-4266****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The customer gateway associated with the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>cgw-p0w2jemrcj5u61un8****</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: immediately starts IPsec negotiations after the configuration is complete.</li>
     * <li><strong>false</strong>: starts IPsec negotiations when inbound traffic is detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the DPD feature. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specific period of time, the connection fails. Then, the ISAKMP SA, IPsec SA, and IPsec tunnel are deleted.</li>
     * <li><strong>false</strong>: disables the DPD feature. The initiator of the IPsec-VPN connection does not send DPD packets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
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
     * <p>The health check configurations:</p>
     * <ul>
     * <li><p><strong>HealthCheckConfig.enable</strong>: specifies whether to enable the health check feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>HealthCheckConfig.dip</strong>: the destination IP address that is used for health checks. Enter the IP address on the data center side that the VPC can communicate with through the IPsec-VPN connection.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.sip</strong>: the source IP address that is used for health checks. Enter the IP address on the VPC side that the data center can communicate with through the IPsec-VPN connection.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.interval</strong>: the interval between two consecutive health checks. Unit: seconds.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.retry:</strong> the maximum number of health check retries.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.Policy</strong>: specifies whether to withdraw advertised routes when health checks fail. Valid values:</p>
     * <ul>
     * <li><strong>revoke_route</strong></li>
     * <li><strong>reserve_route</strong></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:&quot;true&quot;,&quot;dip&quot;:&quot;192.168.1.1&quot;,&quot;sip&quot;:&quot;10.1.1.1&quot;,&quot;interval&quot;:&quot;3&quot;,&quot;retry&quot;:&quot;3&quot;,&quot;Policy&quot;: &quot;revoke_route&quot;}</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>The configuration of Phase 1 negotiations:</p>
     * <ul>
     * <li><p><strong>IkeConfig.Psk</strong>: The pre-shared key that is used for authentication between the VPN gateway and the data center.</p>
     * <ul>
     * <li>The pre-shared key must be 1 to 100 characters in length and can contain letters, digits, and the following characters: <code>~ ! ` @ # $ % ^ &amp; * () _ - + = {} [] | ; : \\&quot; , . &lt; &gt; / ?</code></li>
     * <li>If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/120374.html">DescribeVpnConnection</a> operation to query the pre-shared key that is generated by the system.</li>
     * </ul>
     * <blockquote>
     * <p>The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>IkeConfig.IkeVersion</strong>: the Internet Key Exchange (IKE) version. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeMode</strong>: the negotiation mode. Valid values: <strong>main</strong> and <strong>aggressive</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeEncAlg</strong>: the encryption algorithm that is used in Phase 1 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkePfs</strong>: the Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeLifetime</strong>: the security association (SA) lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.LocalIdIPsec</strong>: the identifier of the IPsec-VPN connection on the Alibaba Cloud side. The identifier can be up to 100 characters in length.</p>
     * </li>
     * <li><p><strong>IkeConfig.RemoteId</strong>: the identifier of the IPsec-VPN connection on the data center side. The identifier can be up to 100 characters in length.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Psk&quot;:&quot;1234****&quot;,&quot;IkeVersion&quot;:&quot;ikev1&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400,&quot;LocalId&quot;:&quot;47.XX.XX.1&quot;,&quot;RemoteId&quot;:&quot;47.XX.XX.2&quot;}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The configuration of Phase 2 negotiations:</p>
     * <ul>
     * <li><strong>IpsecConfig.IpsecEncAlg:</strong> the encryption algorithm that is used in Phase 2 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</li>
     * <li><strong>IpsecConfig. IpsecAuthAlg:</strong> the authentication algorithm that is used in Phase 2 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</li>
     * <li><strong>IpsecConfig. IpsecPfs:</strong> the DH key exchange algorithm that is used in Phase 2 negotiations. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</li>
     * <li><strong>IpsecConfig. IpsecLifetime</strong>: the SA lifetime determined by Phase 2 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block of the virtual private cloud (VPC) that communicates with the data center. The CIDR block is used in Phase 2 negotiations.</p>
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

    /**
     * <p>The network type of the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>public</strong>: an encrypted connection over the Internet</li>
     * <li><strong>private</strong>: an encrypted connection over private networks</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    /**
     * <p>The ID of the region in which the IPsec-VPN connection is established.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The peer CA certificate when a ShangMi (SM) VPN gateway is used to create the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>c20ycDI1NnYxIENBIChURVNUIFN****</p>
     */
    @NameInMap("RemoteCaCert")
    public String remoteCaCert;

    /**
     * <p>The CIDR block of the data center that communicates with the VPC. This CIDR block is used in Phase 2 negotiations.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
     * <p>The following routing modes are supported:</p>
     * <ul>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.1.3.0/24,10.1.4.0/24</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-p0w5112fgnl2ihlmf****</p>
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
