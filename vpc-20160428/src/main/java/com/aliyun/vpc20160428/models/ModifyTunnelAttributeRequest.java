// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyTunnelAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the <strong>client token</strong>. The value of <strong>RequestId</strong> is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region in which the IPsec connection is established.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tunnel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tun-gbyz2e070xzo93****</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    /**
     * <p>The tunnel configurations.</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public ModifyTunnelAttributeRequestTunnelOptionsSpecification tunnelOptionsSpecification;

    /**
     * <p>The ID of the IPsec connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-gw69vm1i71y354****</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static ModifyTunnelAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTunnelAttributeRequest self = new ModifyTunnelAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTunnelAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTunnelAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTunnelAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTunnelAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTunnelAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTunnelAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTunnelAttributeRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public ModifyTunnelAttributeRequest setTunnelOptionsSpecification(ModifyTunnelAttributeRequestTunnelOptionsSpecification tunnelOptionsSpecification) {
        this.tunnelOptionsSpecification = tunnelOptionsSpecification;
        return this;
    }
    public ModifyTunnelAttributeRequestTunnelOptionsSpecification getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    public ModifyTunnelAttributeRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig extends TeaModel {
        /**
         * <p>The local autonomous system number (ASN). Valid values: <strong>1</strong> to <strong>4294967295</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP IP address of the tunnel. The IP address must fall into the <strong>CIDR block</strong> of the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.1</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The CIDR block of the tunnel.</p>
         * <p>The CIDR block must fall into 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.0/30</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig self = new ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in IKE Phase 1 negotiations.</p>
         * <ul>
         * <li>Valid values when the IPsec connection is attached to a standard VPN gateway: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</li>
         * <li>Valid values when the IPsec connection is attached to a VPN gateway that uses an SM certificate: <strong>sm3</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that is used in IKE Phase 1 negotiations.</p>
         * <ul>
         * <li>Valid values when the IPsec connection is attached to a standard VPN gateway: <strong>aes</strong>, <strong>aes192</strong>, <strong>sha256</strong>, <strong>des</strong>, and <strong>3des</strong>.</li>
         * <li>Valid values when the IPsec connection is attached to a VPN gateway that uses an SM certificate: <strong>sm4</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime that is used in IKE Phase 1 negotiations. Unit: seconds. Valid values: <strong>0 to 86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The IKE negotiation mode. Valid values:</p>
         * <ul>
         * <li><strong>main:</strong> This mode offers higher security during negotiations.</li>
         * <li><strong>aggressive:</strong> This mode is faster and has a higher success rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman (DH) key exchange algorithm that is used in IKE Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The IKE version. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev2</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The tunnel identifier. The identifier can be up to 100 characters in length, and supports fully qualified domain names (FQDNs) and IP addresses. The default identifier is the tunnel IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.87</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key that is used to verify identities between the tunnel and peer.</p>
         * <ul>
         * <li>It must be 1 to 100 characters in length, and can contain letters, digits, and the following characters: <code>~!`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></li>
         * <li>If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/120374.html">DescribeVpnConnection</a> operation to query the pre-shared key that is generated by the system.</li>
         * </ul>
         * <blockquote>
         * <p> The pre-shared key that is configured for the tunnel and the tunnel peer must be the same. Otherwise, the system cannot establish the tunnel.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The peer identifier. The identifier can be up to 100 characters in length, and supports FQDNs and IP addresses. The default identifier is the IP address of the customer gateway associated with the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.207</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig self = new ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that is used in IPsec Phase 2 negotiations.</p>
         * <ul>
         * <li>Valid values when the IPsec connection is attached to a standard VPN gateway: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</li>
         * <li>Valid values when the IPsec connection is attached to a VPN gateway that uses an SM certificate: <strong>sm3</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that is used in IPsec Phase 2 negotiations.</p>
         * <ul>
         * <li>Valid values when the IPsec connection is attached to a standard VPN gateway: <strong>aes</strong>, <strong>aes192</strong>, <strong>sha256</strong>, <strong>des</strong>, and <strong>3des</strong>.</li>
         * <li>Valid values when the IPsec connection is attached to a VPN gateway that uses an SM certificate: <strong>sm4</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime that is used in IPsec Phase 2 negotiations. Unit: seconds. Valid values: <strong>0 to 86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The DH key exchange algorithm that is used in IPsec Phase 2 negotiations. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig self = new ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecification extends TeaModel {
        /**
         * <p>Specifies whether to enable the dead peer detection (DPD) feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: DPD is enabled. The IPsec initiator sends DPD packets to verify the existence and availability of the IPsec peer. If no response is received from the peer within a specified period of time, the IPsec peer is considered disconnected. Then, the ISAKMP SA, IPsec SA, and IPsec tunnel are deleted.</li>
         * <li><strong>false</strong>: DPD is disabled. The IPsec initiator does not send DPD packets.</li>
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
         * <li><strong>true</strong>: NAT traversal is enabled. After NAT traversal is enabled, the initiator does not check the UDP ports during Internet Key Exchange (IKE) negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.</li>
         * <li><strong>false</strong>: NAT traversal is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>The peer certificate authority (CA) certificate when you want to attach the IPsec connection to a virtual private network (VPN) gateway that uses a ShangMi (SM) certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The Border Gateway Protocol (BGP) configurations of the tunnel.</p>
         * <p>If the BGP feature is not enabled for the tunnel, you must call the <a href="https://help.aliyun.com/document_detail/120381.html">ModifyVpnConnectionAttribute</a> operation to enable the BGP feature for the tunnel and configure BGP.</p>
         */
        @NameInMap("TunnelBgpConfig")
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>The configurations of IKE Phase 1.</p>
         */
        @NameInMap("TunnelIkeConfig")
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>The configurations of IPsec Phase 2.</p>
         */
        @NameInMap("TunnelIpsecConfig")
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecification build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecification self = new ModifyTunnelAttributeRequestTunnelOptionsSpecification();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setTunnelBgpConfig(ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setTunnelIkeConfig(ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setTunnelIpsecConfig(ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

    }

}
