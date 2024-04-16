// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyTunnelAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the customer gateway associated with the customer gateway.</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Indicates whether DPD is enabled. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <p>*   **true**</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Indicates whether NAT traversal is enabled. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <p>*   **true**</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>The tunnel IP address.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The peer CA certificate when a VPN gateway that uses an SM certificate is used to create the IPsec connection.</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tunnel role. Valid values:</p>
     * <br>
     * <p>*   **master**</p>
     * <p>*   **slave**</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The tunnel status. Valid values:</p>
     * <br>
     * <p>*   **active**</p>
     * <p>*   **updating**</p>
     * <p>*   **deleting**</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The BGP configuration.</p>
     */
    @NameInMap("TunnelBgpConfig")
    public ModifyTunnelAttributeResponseBodyTunnelBgpConfig tunnelBgpConfig;

    /**
     * <p>The tunnel ID.</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    /**
     * <p>The Phase 1 configuration.</p>
     */
    @NameInMap("TunnelIkeConfig")
    public ModifyTunnelAttributeResponseBodyTunnelIkeConfig tunnelIkeConfig;

    /**
     * <p>The configurations of IPsec Phase 2.</p>
     */
    @NameInMap("TunnelIpsecConfig")
    public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig tunnelIpsecConfig;

    /**
     * <p>The tunnel zone.</p>
     */
    @NameInMap("ZoneNo")
    public String zoneNo;

    public static ModifyTunnelAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTunnelAttributeResponseBody self = new ModifyTunnelAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTunnelAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyTunnelAttributeResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyTunnelAttributeResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyTunnelAttributeResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifyTunnelAttributeResponseBody setRemoteCaCertificate(String remoteCaCertificate) {
        this.remoteCaCertificate = remoteCaCertificate;
        return this;
    }
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    public ModifyTunnelAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTunnelAttributeResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ModifyTunnelAttributeResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ModifyTunnelAttributeResponseBody setTunnelBgpConfig(ModifyTunnelAttributeResponseBodyTunnelBgpConfig tunnelBgpConfig) {
        this.tunnelBgpConfig = tunnelBgpConfig;
        return this;
    }
    public ModifyTunnelAttributeResponseBodyTunnelBgpConfig getTunnelBgpConfig() {
        return this.tunnelBgpConfig;
    }

    public ModifyTunnelAttributeResponseBody setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public ModifyTunnelAttributeResponseBody setTunnelIkeConfig(ModifyTunnelAttributeResponseBodyTunnelIkeConfig tunnelIkeConfig) {
        this.tunnelIkeConfig = tunnelIkeConfig;
        return this;
    }
    public ModifyTunnelAttributeResponseBodyTunnelIkeConfig getTunnelIkeConfig() {
        return this.tunnelIkeConfig;
    }

    public ModifyTunnelAttributeResponseBody setTunnelIpsecConfig(ModifyTunnelAttributeResponseBodyTunnelIpsecConfig tunnelIpsecConfig) {
        this.tunnelIpsecConfig = tunnelIpsecConfig;
        return this;
    }
    public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig getTunnelIpsecConfig() {
        return this.tunnelIpsecConfig;
    }

    public ModifyTunnelAttributeResponseBody setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo;
        return this;
    }
    public String getZoneNo() {
        return this.zoneNo;
    }

    public static class ModifyTunnelAttributeResponseBodyTunnelBgpConfig extends TeaModel {
        /**
         * <p>Indicates whether the BGP feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableBgp")
        public Boolean enableBgp;

        /**
         * <p>The local ASN.</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP IP address of the tunnel.</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The peer ASN.</p>
         */
        @NameInMap("PeerAsn")
        public Long peerAsn;

        /**
         * <p>The BGP IP address of the peer.</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The CIDR block to which the tunnel BGP IP address belongs.</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static ModifyTunnelAttributeResponseBodyTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeResponseBodyTunnelBgpConfig self = new ModifyTunnelAttributeResponseBodyTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setEnableBgp(Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Boolean getEnableBgp() {
            return this.enableBgp;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setPeerAsn(Long peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class ModifyTunnelAttributeResponseBodyTunnelIkeConfig extends TeaModel {
        /**
         * <p>The IKE authentication algorithm.</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The IKE encryption algorithm.</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The IKE lifetime. Unit: seconds.</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The IKE negotiation mode.</p>
         * <br>
         * <p>*   **main:** This mode offers higher security during negotiations.</p>
         * <p>*   **aggressive**: This mode is faster and has a higher success rate.</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The DH group.</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The IKE version.</p>
         * <br>
         * <p>*   **ikev1**</p>
         * <p>*   **ikev2**</p>
         * <br>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and provides better support for scenarios with multiple CIDR blocks.</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The tunnel identifier. The identifier supports FQDNs and IP addresses. The default value is the tunnel IP address.</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The peer identifier. The identifier supports FQDNs and IP addresses. The default identifier is the IP address of the customer gateway associated with the tunnel.</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static ModifyTunnelAttributeResponseBodyTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeResponseBodyTunnelIkeConfig self = new ModifyTunnelAttributeResponseBodyTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyTunnelAttributeResponseBodyTunnelIpsecConfig extends TeaModel {
        /**
         * <p>The IPsec authentication algorithm.</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The IPsec encryption algorithm.</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The IPsec lifetime. Unit: seconds.</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The DH group.</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyTunnelAttributeResponseBodyTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeResponseBodyTunnelIpsecConfig self = new ModifyTunnelAttributeResponseBodyTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

}
