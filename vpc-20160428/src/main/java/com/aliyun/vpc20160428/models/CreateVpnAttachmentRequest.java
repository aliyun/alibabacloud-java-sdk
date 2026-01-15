// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnAttachmentRequest extends TeaModel {
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
     * <li><p><strong>BgpConfig.LocalAsn</strong>: the ASN on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
     * <p>You can enter a value in two segments separated by a period (.). Each segment is 16 bits in length. Enter the number in each segment in decimal format.</p>
     * <p>For example, if you enter 123.456, the ASN is 8061384. The ASN is calculated by using the following formula: 123 × 65536 + 456 = 8061384.</p>
     * </li>
     * <li><p><strong>BgpConfig.TunnelCidr</strong>: The CIDR block of the IPsec tunnel. The CIDR block must fall into 169.254.0.0/16 and the mask of the CIDR block must be 30 bits in length. The CIDR block cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, or 169.254.169.252/30.</p>
     * </li>
     * <li><p><strong>LocalBgpIp</strong>: the BGP address on the Alibaba Cloud side. It must be an IP address that falls within the CIDR block of the IPsec tunnel.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Before you add BGP configurations, we recommend that you learn about how BGP works and the limits. For more information, see <a href="https://help.aliyun.com/document_detail/445767.html">Configure BGP dynamic routing</a>.</li>
     * <li>We recommend that you use a private ASN to establish BGP connections to Alibaba Cloud. Refer to the relevant documentation for the private ASN range.</li>
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
     * <p>123e4567-e89b-12d3-a456-4266****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The customer gateway ID.</p>
     * <blockquote>
     * <p> This parameter is required only when you create a single-tunnel IPsec-VPN connection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cgw-p0w2jemrcj5u61un8****</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: immediately starts IPsec negotiations after the configuration is complete.</li>
     * <li><strong>false</strong> (default): starts IPsec negotiations when inbound traffic is received.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>This parameter is supported if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Specifies whether to enable DPD. Valid values: Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables DPD. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within the specified period of time, the connection fails. In this case, ISAKMP SA and IPsec SA are deleted along with the security tunnel.</li>
     * <li><strong>false</strong>: disables DPD. The initiator of the IPsec-VPN connection does not send DPD packets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>This parameter is supported if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>Specifies whether to enable NAT traversal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables NAT traversal. After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.</li>
     * <li><strong>false</strong>: disables NAT traversal.</li>
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
     * <blockquote>
     * <p> Before you add BGP configurations, we recommend that you learn about how BGP works and the limits. For more information, see <a href="https://help.aliyun.com/document_detail/445767.html">Configure BGP dynamic routing</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>This parameter is supported if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The health check configurations:</p>
     * <ul>
     * <li><p><strong>HealthCheckConfig.enable</strong>: indicates whether the health check is enabled. Valid values: <strong>true</strong> and <strong>false</strong> (default).</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.dip</strong>: the destination IP address configured for health checks. Enter the IP address of the on-premises data center that the VPC can access through the IPsec connection.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.sip</strong>: the source IP address configured for health checks. Enter the IP address of the VPC that the on-premises data center can access through the IPsec connection.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.interval</strong>: the time interval of health check retries. Unit: seconds. Default value: <strong>3</strong>.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.retry</strong>: the maximum number of health check retries. Default value: <strong>3</strong>.</p>
     * </li>
     * <li><p><strong>HealthCheckConfig.Policy</strong>: specifies whether to withdraw published routes when health checks fail. Valid values:</p>
     * <ul>
     * <li><strong>revoke_route</strong> (default): withdraws published routes.</li>
     * <li><strong>reserve_route</strong>: does not withdraw published routes.</li>
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
     * <p>This parameter is supported if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The configurations of Phase 1 negotiations:</p>
     * <ul>
     * <li><p><strong>IkeConfig.Psk</strong>: the pre-shared key that is used for identity authentication between the VPN gateway and the on-premises data center.</p>
     * <ul>
     * <li>The key cannot contain space characters. The key must be 1 to 100 characters in length, and can contain digits, letters, and the following special characters: <code>~!`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></li>
     * <li>If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key that is automatically generated by the system.</li>
     * </ul>
     * <blockquote>
     * <p>The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>IkeConfig.IkeVersion</strong>: the version of the Internet Key Exchange (IKE) protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>. Default value: <strong>ikev1</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeMode</strong>: the negotiation mode. Valid values: <strong>main</strong> and <strong>aggressive</strong>. Default value: <strong>main</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeEncAlg:</strong> the encryption algorithm that is used in Phase 1 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkePfs</strong>: the Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>. Default value: <strong>group2</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.IkeLifetime</strong>: the SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
     * </li>
     * <li><p><strong>IkeConfig.LocalId</strong>: the identifier on the Alibaba Cloud side. The identifier cannot exceed 100 characters in length and cannot contain space characters. This parameter is empty by default.</p>
     * </li>
     * <li><p><strong>IkeConfig.RemoteId</strong>: the identifier on the data center side. The identifier cannot exceed 100 characters in length and cannot contain space characters. The default value is the IP address of the customer gateway.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Psk&quot;:&quot;1234****&quot;,&quot;IkeVersion&quot;:&quot;ikev1&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400,&quot;LocalId&quot;:&quot;47.XX.XX.1&quot;,&quot;RemoteId&quot;:&quot;47.XX.XX.2&quot;}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>This parameter is supported if you create an IPsec-VPN connection in single-tunnel mode.</p>
     * <p>The configurations of Phase 2 negotiations:</p>
     * <ul>
     * <li><strong>IpsecConfig.IpsecEncAlg</strong>: the encryption algorithm that is used in Phase 2 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</li>
     * <li><strong>IpsecConfig. IpsecAuthAlg</strong>: the authentication algorithm that is used in Phase 2 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>md5</strong>.</li>
     * <li><strong>IpsecConfig. IpsecPfs</strong>: The Diffie-Hellman key exchange algorithm used in the second phase negotiation. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>. Default value: <strong>group2</strong>.</li>
     * <li><strong>IkeConfig.IkeLifetime</strong>: the SA lifetime determined by Phase 2 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block on the VPC side. The CIDR block is used in Phase 2 negotiations.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * <p>The following routing modes are supported:</p>
     * <ul>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <li><strong>public</strong> (default)</li>
     * <li><strong>private</strong></li>
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
     * <p>The region ID of the IPsec-VPN connection.</p>
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
     * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
     */
    @NameInMap("RemoteCaCert")
    public String remoteCaCert;

    /**
     * <p>The CIDR block on the data center side. This CIDR block is used in Phase 2 negotiations.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
     * <p>The following routing modes are supported:</p>
     * <ul>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
     * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.3.0/24,10.1.4.0/24</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    /**
     * <p>The ID of the resource group to which the IPsec-VPN connection belongs.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource group IDs.</li>
     * <li>If you do not specify a resource group ID, the IPsec-VPN connection belongs to the default resource group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
    public java.util.List<CreateVpnAttachmentRequestTags> tags;

    @NameInMap("TunnelBandwidth")
    public String tunnelBandwidth;

    /**
     * <p>The tunnel configurations.</p>
     * <ul>
     * <li>You can specify parameters in the <strong>TunnelOptionsSpecification</strong> array when you create an IPsec-VPN connection in dual tunnel mode.</li>
     * <li>When you create a IPsec-VPN connection in dual-tunnel mode, you must add both tunnels to IPsec-VPN connection to ensure that the IPsec-VPN connection has connection redundancy. Each IPsec-VPN connection supports only two tunnels.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public java.util.List<CreateVpnAttachmentRequestTunnelOptionsSpecification> tunnelOptionsSpecification;

    public static CreateVpnAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnAttachmentRequest self = new CreateVpnAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpnAttachmentRequest setAutoConfigRoute(Boolean autoConfigRoute) {
        this.autoConfigRoute = autoConfigRoute;
        return this;
    }
    public Boolean getAutoConfigRoute() {
        return this.autoConfigRoute;
    }

    public CreateVpnAttachmentRequest setBgpConfig(String bgpConfig) {
        this.bgpConfig = bgpConfig;
        return this;
    }
    public String getBgpConfig() {
        return this.bgpConfig;
    }

    public CreateVpnAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpnAttachmentRequest setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public CreateVpnAttachmentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpnAttachmentRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public CreateVpnAttachmentRequest setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public CreateVpnAttachmentRequest setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public CreateVpnAttachmentRequest setEnableTunnelsBgp(Boolean enableTunnelsBgp) {
        this.enableTunnelsBgp = enableTunnelsBgp;
        return this;
    }
    public Boolean getEnableTunnelsBgp() {
        return this.enableTunnelsBgp;
    }

    public CreateVpnAttachmentRequest setHealthCheckConfig(String healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public String getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public CreateVpnAttachmentRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public CreateVpnAttachmentRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public CreateVpnAttachmentRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public CreateVpnAttachmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnAttachmentRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateVpnAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpnAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpnAttachmentRequest setRemoteCaCert(String remoteCaCert) {
        this.remoteCaCert = remoteCaCert;
        return this;
    }
    public String getRemoteCaCert() {
        return this.remoteCaCert;
    }

    public CreateVpnAttachmentRequest setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public CreateVpnAttachmentRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpnAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpnAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpnAttachmentRequest setTags(java.util.List<CreateVpnAttachmentRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateVpnAttachmentRequestTags> getTags() {
        return this.tags;
    }

    public CreateVpnAttachmentRequest setTunnelBandwidth(String tunnelBandwidth) {
        this.tunnelBandwidth = tunnelBandwidth;
        return this;
    }
    public String getTunnelBandwidth() {
        return this.tunnelBandwidth;
    }

    public CreateVpnAttachmentRequest setTunnelOptionsSpecification(java.util.List<CreateVpnAttachmentRequestTunnelOptionsSpecification> tunnelOptionsSpecification) {
        this.tunnelOptionsSpecification = tunnelOptionsSpecification;
        return this;
    }
    public java.util.List<CreateVpnAttachmentRequestTunnelOptionsSpecification> getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    public static class CreateVpnAttachmentRequestTags extends TeaModel {
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

        public static CreateVpnAttachmentRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnAttachmentRequestTags self = new CreateVpnAttachmentRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateVpnAttachmentRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpnAttachmentRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig extends TeaModel {
        /**
         * <p>The ANS of the tunnel on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
         * <blockquote>
         * <p> We recommend that you use a private ASN to establish BGP connections to Alibaba Cloud. Refer to the relevant documentation for the private ASN range.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP IP address of the tunnel on the Alibaba Cloud side. The address is an IP address that falls within the BGP CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.1</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The BGP CIDR block of the tunnel. The CIDR block must fall into 169.254.0.0/16 and the mask of the CIDR block must be 30 bits in length. The CIDR block cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, or 169.254.169.252/30.</p>
         * <blockquote>
         * <p> The two tunnels of an IPsec-VPN connection must use different CIDR blocks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.0/30</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig self = new CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in Phase 1 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>sha1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 1 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime as a result of Phase 1 negotiations. Unit: seconds.</p>
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
         * <li><strong>main:</strong> This mode offers higher security during negotiations.</li>
         * <li><strong>aggressive</strong>: This mode is faster with a higher success rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Default value: <strong>group2</strong>.\
         * Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>. Default value: <strong>ikev2</strong>.</p>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and provides better support for scenarios with multiple CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev2</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier of the tunnel on the Alibaba Cloud side, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length and cannot contain spaces. The default value is the IP address of the tunnel.</p>
         * <p><strong>LocalId</strong> supports fully qualified domain names (FQDNs). If you use an FQDN, we recommend that you set the negotiation mode to <strong>aggressive</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.1</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key that is used for identity authentication between the tunnel and the tunnel peer.</p>
         * <ul>
         * <li>The key cannot contain spaces. The key must be 1 to 100 characters in length, and can contain digits, letters, and the following special characters: <code>~!\\`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></li>
         * <li>If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526939.html">DescribeVpnAttachments</a> operation to query the pre-shared key that is automatically generated by the system.</li>
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
         * <p>The identifier of the tunnel peer, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length and cannot contain spaces. The default value is the IP address of the customer gateway that is associated with the tunnel.</p>
         * <p><strong>RemoteId</strong> supports FQDNs. If you use an FQDN, we recommend that you set the negotiation mode to <strong>aggressive</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.2</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig self = new CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
         * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>. Default value: <strong>sha1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 2 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>. Default value: <strong>aes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime as a result of Phase 2 negotiations. Unit: seconds.</p>
         * <p>Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations. Default value: <strong>group2</strong>.</p>
         * <p>Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig self = new CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class CreateVpnAttachmentRequestTunnelOptionsSpecification extends TeaModel {
        /**
         * <p>The ID of the customer gateway that is associated with the tunnel.</p>
         * <blockquote>
         * <p> This parameter is required when you create a dual-tunnel IPsec-VPN connection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cgw-p0w2jemrcj5u61un8****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>Specifies whether to enable the DPD feature for the tunnel. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables DPD. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within the specified period of time, the connection fails. In this case, ISAKMP SA and IPsec SA are deleted along with the security tunnel.</li>
         * <li><strong>false</strong>: disables DPD. The initiator of the IPsec-VPN connection does not send DPD packets.</li>
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
         * <li><strong>true</strong> (default): enables NAT traversal. After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.</li>
         * <li><strong>false</strong>: disables NAT traversal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>The BGP configurations of the tunnel.</p>
         * <blockquote>
         * <p> If you enable BGP for an IPsec-VPN connection, you must set <strong>EnableTunnelsBgp</strong> parameter to <strong>true</strong>.</p>
         * </blockquote>
         */
        @NameInMap("TunnelBgpConfig")
        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>The configurations of Phase 1 negotiations.</p>
         */
        @NameInMap("TunnelIkeConfig")
        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>The order in which the tunnel was created.</p>
         * <ul>
         * <li><strong>1</strong>: Tunnel 1.</li>
         * <li><strong>2</strong>: Tunnel 2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TunnelIndex")
        public Integer tunnelIndex;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("TunnelIpsecConfig")
        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig;

        public static CreateVpnAttachmentRequestTunnelOptionsSpecification build(java.util.Map<String, ?> map) throws Exception {
            CreateVpnAttachmentRequestTunnelOptionsSpecification self = new CreateVpnAttachmentRequestTunnelOptionsSpecification();
            return TeaModel.build(map, self);
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecification setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecification setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecification setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecification setTunnelBgpConfig(CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }
        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecification setTunnelIkeConfig(CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }
        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecification setTunnelIndex(Integer tunnelIndex) {
            this.tunnelIndex = tunnelIndex;
            return this;
        }
        public Integer getTunnelIndex() {
            return this.tunnelIndex;
        }

        public CreateVpnAttachmentRequestTunnelOptionsSpecification setTunnelIpsecConfig(CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }
        public CreateVpnAttachmentRequestTunnelOptionsSpecificationTunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

    }

}
