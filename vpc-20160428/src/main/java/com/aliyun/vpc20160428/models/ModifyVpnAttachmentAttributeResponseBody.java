// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnAttachmentAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the transit router associated with the IPsec-VPN connection belongs.</p>
     */
    @NameInMap("AttachInstanceId")
    public String attachInstanceId;

    /**
     * <p>The type of resource that is associated with the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **CEN:** indicates that the IPsec-VPN connection is associated with a transit router.</p>
     * <p>*   **VPNGW:** indicates that the IPsec-VPN connection is associated with a VPN gateway.</p>
     * <p>*   **NO_ASSOCIATED:** indicates that the IPsec-VPN connection is not associated with any resource.</p>
     */
    @NameInMap("AttachType")
    public String attachType;

    /**
     * <p>The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the customer gateway associated with the IPsec-VPN connection.</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>The description of the IPsec-VPN connection.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether IPsec negotiations immediately start after the configuration is complete. Valid values:</p>
     * <br>
     * <p>*   **true:** IPsec negotiations immediately start after the configuration is complete.</p>
     * <p>*   **false:** IPsec negotiations start when inbound traffic is detected.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Indicates whether the DPD feature is enabled for the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **true:** The DPD feature is enabled.</p>
     * <p>*   **false:** The DPD feature is disabled.</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Indicates whether NAT traversal is enabled for the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **true:** NAT traversal is enabled.</p>
     * <p>*   **false:** NAT traversal is disabled.</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>The configurations of Phase 1 negotiations.</p>
     */
    @NameInMap("IkeConfig")
    public ModifyVpnAttachmentAttributeResponseBodyIkeConfig ikeConfig;

    /**
     * <p>The configurations of Phase 2 negotiations.</p>
     */
    @NameInMap("IpsecConfig")
    public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig ipsecConfig;

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
     * <p>The network type of the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **public:** Internet.</p>
     * <p>*   **private:** private networks.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

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
     * <p>The bandwidth specification of the IPsec-VPN connection.</p>
     * <br>
     * <p>**M** in the response indicates **Mbit/s**.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the IPsec-VPN connection.</p>
     * <br>
     * <p>*   **ike_sa_not_established:** Phase 1 negotiations failed.</p>
     * <p>*   **ike_sa_established:** Phase 1 negotiations were successful.</p>
     * <p>*   **ipsec_sa_not_established:** Phase 2 negotiations failed.</p>
     * <p>*   **ipsec_sa_established:** Phase 2 negotiations were successful.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The health check configurations of the IPsec-VPN connection.</p>
     */
    @NameInMap("VcoHealthCheck")
    public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck vcoHealthCheck;

    /**
     * <p>The BGP configurations of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnBgpConfig")
    public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig vpnBgpConfig;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    /**
     * <p>The ID of the VPN gateway associated with the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static ModifyVpnAttachmentAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnAttachmentAttributeResponseBody self = new ModifyVpnAttachmentAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpnAttachmentAttributeResponseBody setAttachInstanceId(String attachInstanceId) {
        this.attachInstanceId = attachInstanceId;
        return this;
    }
    public String getAttachInstanceId() {
        return this.attachInstanceId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setAttachType(String attachType) {
        this.attachType = attachType;
        return this;
    }
    public String getAttachType() {
        return this.attachType;
    }

    public ModifyVpnAttachmentAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyVpnAttachmentAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpnAttachmentAttributeResponseBody setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public ModifyVpnAttachmentAttributeResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyVpnAttachmentAttributeResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyVpnAttachmentAttributeResponseBody setIkeConfig(ModifyVpnAttachmentAttributeResponseBodyIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public ModifyVpnAttachmentAttributeResponseBody setIpsecConfig(ModifyVpnAttachmentAttributeResponseBodyIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public ModifyVpnAttachmentAttributeResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifyVpnAttachmentAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnAttachmentAttributeResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ModifyVpnAttachmentAttributeResponseBody setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public ModifyVpnAttachmentAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ModifyVpnAttachmentAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVcoHealthCheck(ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVpnBgpConfig(ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class ModifyVpnAttachmentAttributeResponseBodyIkeConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that was used in Phase 1 negotiations.</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that was used in Phase 1 negotiations.</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime that was determined by Phase 1 negotiations. Unit: seconds.</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The negotiation mode.</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman key exchange algorithm that was used in Phase 1 negotiations.</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol.</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier on the Alibaba Cloud side.</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key that was used for identity authentication between the VPN gateway and the data center.</p>
         * <br>
         * <p>>  The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier on the data center side.</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static ModifyVpnAttachmentAttributeResponseBodyIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyIkeConfig self = new ModifyVpnAttachmentAttributeResponseBodyIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyVpnAttachmentAttributeResponseBodyIpsecConfig extends TeaModel {
        /**
         * <p>The authentication algorithm that was used in Phase 2 negotiations.</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that was used in Phase 2 negotiations.</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime that was determined by Phase 2 negotiations. Unit: seconds.</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The Diffie-Hellman key exchange algorithm that was used in Phase 2 negotiations.</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyVpnAttachmentAttributeResponseBodyIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyIpsecConfig self = new ModifyVpnAttachmentAttributeResponseBodyIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck extends TeaModel {
        /**
         * <p>The destination IP address that was used for health checks.</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>Indicates whether the health check feature is enabled for the IPsec-VPN connection.</p>
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
         * <p>Indicates whether published routes are withdrawn when the health check fails.</p>
         * <br>
         * <p>*   **revoke_route:** Published routes were withdrawn when the health check failed.</p>
         * <p>*   **reserve_route:** Published routes were not withdrawn when the health check failed.</p>
         */
        @NameInMap("Policy")
        public String policy;

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

        public static ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck self = new ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

    }

    public static class ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig extends TeaModel {
        /**
         * <p>Indicates whether BGP is enabled for the IPsec-VPN connection.</p>
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
        public Long localAsn;

        /**
         * <p>The BGP IP address on the Alibaba Cloud side.</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The ASN on the data center side.</p>
         */
        @NameInMap("PeerAsn")
        public Long peerAsn;

        /**
         * <p>The BGP IP address on the data center side.</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The negotiation status of BGP.</p>
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

        public static ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig self = new ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setPeerAsn(Long peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

}
