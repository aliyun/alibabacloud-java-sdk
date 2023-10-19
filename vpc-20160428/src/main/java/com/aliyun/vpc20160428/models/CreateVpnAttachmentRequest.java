// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnAttachmentRequest extends TeaModel {
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
     * <p>*   **BgpConfig.TunnelCidr**: the CIDR block of the IPsec tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
     * <p>*   **LocalBgpIp:** the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.</p>
     * <p> >- Before you configure BGP, we recommend that you learn about how BGP works and the limits. For more information, see [BGP dynamic routing ](~~170235~~).</p>
     * <p> >- We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. Refer to the relevant documentation for the private ASN range.</p>
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
     * <p>Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:</p>
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
     * <p>*   **false**</p>
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
     * <p>The health check configuration:</p>
     * <br>
     * <p>*   **HealthCheckConfig.enable**: specifies whether to enable health checks. Valid values: **true** and **false**. Default value: false.</p>
     * <br>
     * <p>*   **HealthCheckConfig.dip**: the destination IP address configured for health checks. Enter the IP address on the data center side that the VPC can communicate with through the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **HealthCheckConfig.sip**: the source IP address configured for health checks. Enter the IP address on the VPC side that the data center can communicate with through the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **HealthCheckConfig.interval**: the time interval of health check retries. Unit: seconds. Default value: **3**.</p>
     * <br>
     * <p>*   **HealthCheckConfig.retry**: the maximum number of health check retries. Default value: **3**.</p>
     * <br>
     * <p>*   **HealthCheckConfig.Policy**: specifies whether to withdraw published routes when health checks fail. Valid values:</p>
     * <br>
     * <p>    *   **revoke_route** (default): withdraws published routes.</p>
     * <p>    *   **reserve_route**: does not withdraw published routes.</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    /**
     * <p>The configuration of Phase 1 negotiations:</p>
     * <br>
     * <p>*   **IkeConfig.Psk**: The pre-shared key that is used for authentication between the VPN gateway and the data center.</p>
     * <br>
     * <p>    *   It must be 1 to 100 characters in length, and can contain letters, digits, and the following characters: ``~!`@#$%^&*()_-+={}[]|;:\",.<>/?``</p>
     * <p>    *   If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the [DescribeVpnConnection](~~120374~~) operation to query the pre-shared key that is generated by the system.</p>
     * <br>
     * <p>    >The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, a connection cannot be established between the data center and the VPN gateway.</p>
     * <br>
     * <p>*   **IkeConfig.IkeVersion**: the IKE version. Valid values: **ikev1** and **ikev2**. Default value: **ikev1**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeMode**: the negotiation mode. Valid values: **main** and **aggressive**. Default value: **main**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeEncAlg:** the encryption algorithm that is used in Phase 1 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.</p>
     * <br>
     * <p>*   **IkeConfig.IkePfs**: The Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.</p>
     * <br>
     * <p>*   **IkeConfig.IkeLifetime**: the SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     * <br>
     * <p>*   **IkeConfig.LocalId**: the identifier on the Alibaba Cloud side. The identifier cannot exceed 100 characters in length. This parameter is empty by default.</p>
     * <br>
     * <p>*   **IkeConfig.RemoteId**: the identifier on the data center side. The identifier cannot exceed 100 characters in length. The default value is the IP address of the customer gateway.</p>
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
     * <p>*   **public** (default)</p>
     * <p>*   **private**</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    /**
     * <p>The ID of the region where the IPsec-VPN connection is established.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent list of regions.</p>
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

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
    public java.util.List<CreateVpnAttachmentRequestTags> tags;

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

    public static class CreateVpnAttachmentRequestTags extends TeaModel {
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

}
