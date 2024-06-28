// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnAttachmentAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the transit router associated with the IPsec-VPN connection belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-c2r3m3zxkumoqz****</p>
     */
    @NameInMap("AttachInstanceId")
    public String attachInstanceId;

    /**
     * <p>The type of the resource that is associated with the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>CEN</strong>: The IPsec-VPN connection is associated with a transit router.</li>
     * <li><strong>VPNGW</strong>: The IPsec-VPN connection is associated with a VPN gateway.</li>
     * <li><strong>NO_ASSOCIATED</strong>: The IPsec-VPN connection is not associated with any resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CEN</p>
     */
    @NameInMap("AttachType")
    public String attachType;

    /**
     * <p>The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1658201810000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the customer gateway associated with the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>cgw-p0w2jemrcj5u61un8****</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>The description of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether IPsec negotiations immediately start after the configuration takes effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Indicates whether the DPD feature is enabled for the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Indicates whether NAT traversal is enabled for the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>The configuration of Phase 1 negotiations.</p>
     */
    @NameInMap("IkeConfig")
    public ModifyVpnAttachmentAttributeResponseBodyIkeConfig ikeConfig;

    /**
     * <p>The configuration of Phase 2 negotiations.</p>
     */
    @NameInMap("IpsecConfig")
    public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig ipsecConfig;

    /**
     * <p>The CIDR block of the VPC with which the data center can communicate.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.1.0/24,10.1.2.0/24</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
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

    /**
     * <p>The CIDR block of the data center with which the VPC can communicate.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.3.0/24,10.1.4.0/24</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35822A84-867F-3936-A2E6-A4C4E3ED11C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the IPsec-VPN connection belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The bandwidth specification of the IPsec-VPN connection.</p>
     * <p>A value of <strong>M</strong> in the response indicates <strong>Mbit/s</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1000M</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The state of the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>ike_sa_not_established</strong>: Phase 1 negotiations failed.</li>
     * <li><strong>ike_sa_established</strong>: Phase 1 negotiations succeeded.</li>
     * <li><strong>ipsec_sa_not_established</strong>: Phase 2 negotiations failed.</li>
     * <li><strong>ipsec_sa_established</strong>: Phase 2 negotiations succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ike_sa_not_established</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The health check configuration of the IPsec-VPN connection.</p>
     */
    @NameInMap("VcoHealthCheck")
    public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck vcoHealthCheck;

    /**
     * <p>The BGP configuration of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnBgpConfig")
    public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig vpnBgpConfig;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-p0w5112fgnl2ihlmf****</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    /**
     * <p>The ID of the VPN gateway associated with the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-p0wa1c1018pmeb6cu****</p>
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

    public ModifyVpnAttachmentAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <p>The authentication algorithm that is used in Phase 1 negotiations.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 1 negotiations.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The negotiation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 1 negotiations.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier of the IPsec-VPN connection on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.1</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key that is used for identity authentication between the VPN gateway and the data center.</p>
         * <blockquote>
         * <p> The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234***</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the IPsec-VPN connection on the data center side.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.2</p>
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
         * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm that is used in Phase 2 negotiations.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The DH key exchange algorithm that is used in Phase 2 negotiations.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
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
         * <p>The destination IP address that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>Indicates whether the health check feature is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The interval between two consecutive health check retries. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Indicates whether advertised routes are withdrawn when the health check fails. Valid values:</p>
         * <ul>
         * <li><strong>revoke_route</strong>: Advertised routes are withdrawn.</li>
         * <li><strong>reserve_route</strong>: Advertised routes are not withdrawn.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>revoke_route</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The maximum number of health check retries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Retry")
        public Integer retry;

        /**
         * <p>The source IP address that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
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
         * <p>Indicates whether BGP is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableBgp")
        public String enableBgp;

        /**
         * <p>The ASN on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>45104</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP IP address on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.1</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The ASN on the data center side.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("PeerAsn")
        public Long peerAsn;

        /**
         * <p>The BGP IP address on the data center side.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.2</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The negotiation state of BGP. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: normal</li>
         * <li><strong>false</strong>: abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The CIDR block of the IPsec tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.0/30</p>
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
