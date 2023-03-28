// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeResponseBody extends TeaModel {
    /**
     * <p>The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the customer gateway.</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>The description of the IPsec-VPN connection.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether IPsec negotiations immediately start after the configuration takes effect. Valid values:</p>
     * <br>
     * <p>*   **true:** IPsec negotiations immediately start after the configuration takes effect.</p>
     * <p>*   **false:** IPsec negotiations start when inbound traffic is detected.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Indicates whether DPD is enabled. Valid values:</p>
     * <br>
     * <p>*   **false:** The DPD feature is disabled.</p>
     * <p>*   **true:** The DPD feature is enabled.</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Indicates whether NAT traversal is enabled. Valid values:</p>
     * <br>
     * <p>*   **false:** NAT traversal is disabled.</p>
     * <p>*   **true:** NAT traversal is enabled.</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>The configurations of Phase 1 negotiations.</p>
     */
    @NameInMap("IkeConfig")
    public ModifyVpnConnectionAttributeResponseBodyIkeConfig ikeConfig;

    /**
     * <p>The configurations of Phase 2 negotiations.</p>
     */
    @NameInMap("IpsecConfig")
    public ModifyVpnConnectionAttributeResponseBodyIpsecConfig ipsecConfig;

    /**
     * <p>The CIDR block on the VPC side.</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The CIDR block on the data center side.</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The health check configurations.</p>
     */
    @NameInMap("VcoHealthCheck")
    public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck vcoHealthCheck;

    /**
     * <p>The BGP configurations.</p>
     */
    @NameInMap("VpnBgpConfig")
    public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig vpnBgpConfig;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static ModifyVpnConnectionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnConnectionAttributeResponseBody self = new ModifyVpnConnectionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpnConnectionAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyVpnConnectionAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyVpnConnectionAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpnConnectionAttributeResponseBody setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public ModifyVpnConnectionAttributeResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyVpnConnectionAttributeResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyVpnConnectionAttributeResponseBody setIkeConfig(ModifyVpnConnectionAttributeResponseBodyIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public ModifyVpnConnectionAttributeResponseBody setIpsecConfig(ModifyVpnConnectionAttributeResponseBodyIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public ModifyVpnConnectionAttributeResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifyVpnConnectionAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnConnectionAttributeResponseBody setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public ModifyVpnConnectionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVpnConnectionAttributeResponseBody setVcoHealthCheck(ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public ModifyVpnConnectionAttributeResponseBody setVpnBgpConfig(ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public ModifyVpnConnectionAttributeResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public ModifyVpnConnectionAttributeResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class ModifyVpnConnectionAttributeResponseBodyIkeConfig extends TeaModel {
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
         * <p>The IKE negotiation mode. Valid values:</p>
         * <br>
         * <p>*   **main:** This mode offers higher security during negotiations.</p>
         * <p>*   **aggressive:** This mode is faster and has a higher success rate.</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman group.</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol.</p>
         * <br>
         * <p>*   **ikev1**</p>
         * <p>*   **ikev2**</p>
         * <br>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier on the VPC side. The default value is the IP address of the VPN gateway. The value can be an FQDN or an IP address.</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier on the data center side. The default value is the IP address of the customer gateway. The value can be a fully qualified domain name (FQDN) or an IP address.</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static ModifyVpnConnectionAttributeResponseBodyIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyIkeConfig self = new ModifyVpnConnectionAttributeResponseBodyIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseBodyIpsecConfig extends TeaModel {
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
         * <p>The Diffie-Hellman group.</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyVpnConnectionAttributeResponseBodyIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyIpsecConfig self = new ModifyVpnConnectionAttributeResponseBodyIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck extends TeaModel {
        /**
         * <p>The destination IP address that was used for health checks.</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true:** The health check feature is enabled.</p>
         * <p>*   **false:** The health check feature is disabled.</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The interval between two consecutive health check retries. Unit: seconds.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The maximum number of health check retries.</p>
         */
        @NameInMap("Retry")
        public Integer retry;

        /**
         * <p>The source IP address that was used for health checks.</p>
         */
        @NameInMap("Sip")
        public String sip;

        public static ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck self = new ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig extends TeaModel {
        /**
         * <p>Indicates whether BGP is enabled. Valid values:</p>
         * <br>
         * <p>*   **true:** BGP is enabled.</p>
         * <p>*   **false:** BGP is disabled.</p>
         */
        @NameInMap("EnableBgp")
        public String enableBgp;

        /**
         * <p>The ASN on the Alibaba Cloud side.</p>
         */
        @NameInMap("LocalAsn")
        public Integer localAsn;

        /**
         * <p>The BGP IP address on the Alibaba Cloud side.</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The ASN on the data center side.</p>
         */
        @NameInMap("PeerAsn")
        public Integer peerAsn;

        /**
         * <p>The BGP IP address on the data center side.</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The negotiation status of BGP. Valid values:</p>
         * <br>
         * <p>*   **success:** normal.</p>
         * <p>*   **false:** abnormal.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The CIDR block of the IPsec tunnel.</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig self = new ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setLocalAsn(Integer localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Integer getLocalAsn() {
            return this.localAsn;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setPeerAsn(Integer peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Integer getPeerAsn() {
            return this.peerAsn;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

}
