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
     * <p>The Border Gateway Protocol (BGP) configuration:</p>
     * <br>
     * <p>*   **BgpConfig.EnableBgp**: specifies whether to enable BGP. Valid values: **true** and **false**. Default value: false.</p>
     * <p>*   **BgpConfig.LocalAsn**: the ASN on the Alibaba Cloud side. Valid values: **1** to **4294967295**. Default value: **45104**.</p>
     * <p>*   **BgpConfig.TunnelCidr**: the CIDR block of the IPsec tunnel. The CIDR block must fall within 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * <p>*   **LocalBgpIp**: the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is required when the VPN gateway has dynamic BGP enabled.</p>
     * <br>
     * <p>*   Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).</p>
     * <p>*   We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. Refer to the relevant documentation for the private ASN range.</p>
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
     * <p>是否为隧道开启BGP功能。取值：**true**或**false**（默认值）。</p>
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
     * <p>The configuration of Phase 1 negotiations:</p>
     * <br>
     * <p>*   **IkeConfig.Psk**: The pre-shared key that is used for authentication between the VPN gateway and the data center. The key must be 1 to 100 characters in length.</p>
     * <br>
     * <p>        If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the DescribeVpnConnection operation to query the pre-shared key generated by the system. </p>
     * <br>
     * <p>          The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, the connection between the data center and the VPN gateway cannot be established. </p>
     * <br>
     * <p>*   **IkeConfig.IkeVersion**: the IKE version. Valid values: **ikev1** and **ikev2**. Default value: **ikev1**.</p>
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
     * <p>The configurations of Phase 2 negotiations:</p>
     * <br>
     * <p>*   **IpsecConfig.IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
     * <p>*   **IpsecConfig. IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
     * <p>*   **IpsecConfig. IpsecPfs**: the Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.</p>
     * <p>*   **IpsecConfig. IpsecLifetime**: the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The CIDR block on the virtual private cloud (VPC) side. The CIDR block is used in Phase 2 negotiations.</p>
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
     * <p>The ID of the region where the IPsec-VPN connection is created. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The peer CA certificate when a ShangMi (SM) VPN gateway is used to establish the IPsec-VPN connection.</p>
     * <br>
     * <p>*   This parameter is required when an SM VPN gateway is used to establish the IPsec-VPN connection.</p>
     * <p>*   You can ignore this parameter when a standard VPN gateway is used to create the IPsec-VPN connection.</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block on the data center side. This CIDR block is used in Phase 2 negotiations.</p>
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
     * <p>配置隧道。</p>
     * <br>
     * <p>如果当前VPN网关实例支持创建双隧道模式的IPsec-VPN连接，您必须同时为IPsec-VPN连接添加主隧道和备隧道的配置（即配置**TunnelOptionsSpecification**数组下的参数）。一个IPsec-VPN连接下仅支持添加主备两条隧道。</p>
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
         * <p>隧道本端（阿里云侧）的自治系统号。自治系统号取值范围：**1**~**4294967295**。默认值：**45104**。</p>
         * <br>
         * <p>> - 当您为IPsec连接开启BGP功能后（即指定**EnableTunnelsBgp**参数的值为**true**）需要配置该参数。</p>
         * <p>- 在添加BGP配置前，建议您先了解BGP动态路由功能的工作机制和使用限制。更多信息，请参见[VPN网关支持BGP动态路由公告](~~170235~~)。</p>
         * <p>- 建议您使用自治系统号的私有号码与阿里云建立BGP连接。自治系统号的私有号码范围请自行查阅文档。</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>隧道本端（阿里云侧）的BGP地址。该地址为BGP网段内的一个IP地址。</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>隧道的BGP网段。该网段需是一个在169.254.0.0/16内的掩码长度为30的网段。</p>
         * <br>
         * <p>>在一个VPN网关实例下，每个隧道的BGP网段需保持唯一。</p>
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
         * <p>第一阶段协商的认证算法。</p>
         * <br>
         * <p><props="intl"><ph>取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为普通型，则取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm3**（默认值）。</ph></props></p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>第一阶段协商的加密算法。</p>
         * <br>
         * <p><props="intl"><ph>取值：**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。 </ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为普通型，则取值为**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。</ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm4**（默认值）。</ph></props></p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>第一阶段协商出的SA的生存周期。单位：秒。</p>
         * <br>
         * <p>取值范围：**0**~**86400**。默认值：**86400**。</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>IKE版本的协商模式。取值：**main**或**aggressive**。默认值：**main**。   </p>
         * <br>
         * <p>- **main**：主模式，协商过程安全性高。</p>
         * <p>- **aggressive**：野蛮模式，协商快速且协商成功率高。</p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为国密型，则协商模式仅支持**main**。</ph></props></p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>第一阶段协商使用的Diffie-Hellman密钥交换算法。默认值：**group2**。   </p>
         * <p>取值：**group1**、**group2**、**group5**、**group14**。</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>IKE协议的版本。取值：**ikev1**或**ikev2**。默认值：**ikev1**。</p>
         * <br>
         * <p>相对于IKEv1版本，IKEv2版本简化了SA的协商过程并且对于多网段的场景提供了更好的支持。</p>
         * <p>   </p>
         * <p><props="china"><ph>如果VPN网关实例类型为国密型，则IKE版本仅支持**ikev1**。</ph></props></p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>隧道本端（阿里云侧）的标识，用于第一阶段的协商。长度限制为100个字符。默认值为隧道的IP地址。</p>
         * <br>
         * <p>**LocalId**支持FQDN格式，如果您使用FQDN格式，协商模式建议选择为**aggressive**（野蛮模式）。</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>预共享密钥，用于隧道与隧道对端之间的身份认证。</p>
         * <br>
         * <p>    - 密钥长度为1~100个字符，支持数字、大小写英文字母以及以下字符。```~!\`@#$%^&*()_-+={}[]|;:\",.<>/?```</p>
         * <p>    - 若您未指定预共享密钥，系统会随机生成一个16位的字符串作为预共享密钥。您可以调用[DescribeVpnConnection](~~120374~~)接口查询系统自动生成的预共享密钥。     </p>
         * <br>
         * <p>        > 隧道及隧道对端的预共享密钥需一致，否则系统无法正常建立隧道。</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>隧道对端的标识，用于第一阶段的协商。长度限制为100个字符。默认值为隧道关联的用户网关的IP地址。</p>
         * <br>
         * <p>**RemoteId**支持FQDN格式，如果您使用FQDN格式，协商模式建议选择为**aggressive**（野蛮模式）。</p>
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
         * <p>第二阶段协商的认证算法。</p>
         * <br>
         * <p><props="intl"><ph>取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为普通型，则取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm3**（默认值）。</ph></props></p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>第二阶段协商的加密算法。</p>
         * <br>
         * <p><props="intl"><ph>取值：**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。 </ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为普通型，则取值为**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。</ph></props></p>
         * <br>
         * <p><props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm4**（默认值）。</ph></props></p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>第二阶段协商出的SA的生存周期。单位：秒。</p>
         * <br>
         * <p>取值范围：**0**~**86400**。默认值：**86400**。</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>第二阶段协商使用的Diffie-Hellman密钥交换算法。默认值：**group2**。   </p>
         * <br>
         * <p>取值：**disabled**、**group1**、**group2**、**group5**、**group14**。</p>
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
         * <p>隧道关联的用户网关ID。</p>
         * <br>
         * <p>> - 在VPN网关实例支持创建双隧道模式的IPsec-VPN连接的场景下，本参数必填。</p>
         * <p>- 如果当前VPN网关实例支持创建双隧道模式的IPsec-VPN连接，您必须同时为IPsec-VPN连接添加主隧道和备隧道的配置（即配置**TunnelOptionsSpecification**数组下的参数）。一个IPsec-VPN连接仅支持添加主备两条隧道。</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>是否为隧道开启DPD（对等体存活检测）功能。取值：</p>
         * <br>
         * <p>- **true**（默认值）：开启DPD功能。IPsec发起端会发送DPD报文用来检测对端的设备是否存活，如果在设定时间内未收到正确回应则认为对端已经断线，IPsec将删除ISAKMP SA和相应的IPsec SA，安全隧道同样也会被删除。</p>
         * <br>
         * <p>- **false**：不开启DPD功能，IPsec发起端不会发送DPD探测报文。</p>
         */
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        /**
         * <p>是否为隧道开启NAT穿越功能。取值：</p>
         * <br>
         * <p>- **true**（默认值）：开启NAT穿越功能。开启后，IKE协商过程会删除对UDP端口号的验证过程，同时实现对隧道中NAT网关设备的发现功能。</p>
         * <br>
         * <p>- **false**：不开启NAT穿越功能。</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>如果当前VPN网关实例为国密型VPN网关，您需要为隧道配置对端的CA证书。</p>
         * <br>
         * <p>- 对于国密型VPN网关，此项必填。</p>
         * <br>
         * <p>- 对于普通型VPN网关，此项需要为空。</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>隧道的角色。取值：</p>
         * <br>
         * <p>- **master**：表示当前隧道为主隧道。</p>
         * <p>- **slave**：表示当前隧道为备隧道。</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>为隧道添加BGP配置。</p>
         */
        @NameInMap("TunnelBgpConfig")
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>第一阶段协商的配置信息。</p>
         */
        @NameInMap("TunnelIkeConfig")
        public CreateVpnConnectionRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>第二阶段协商的配置信息。</p>
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
