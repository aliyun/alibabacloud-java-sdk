// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the CEN instance to which the transit router belongs.</p>
     */
    @NameInMap("AttachInstanceId")
    public String attachInstanceId;

    /**
     * <p>The type of resource that is associated with the IPsec-VPN connection. Valid values:</p>
     * <br>
     * <p>*   **CEN**: indicates that the IPsec-VPN connection is associated with a transit router of a Cloud Enterprise Network (CEN) instance.</p>
     * <p>*   **NO_ASSOCIATED**: indicates that the IPsec-VPN connection is not associated with a resource.</p>
     * <p>*   **VPNGW**: indicates that the IPsec-VPN connection is associated with a VPN gateway.</p>
     */
    @NameInMap("AttachType")
    public String attachType;

    /**
     * <p>The timestamp that indicates when the IPsec-VPN connection was established. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether the IPsec-VPN connection is associated with a transit router that belongs to another Alibaba Cloud account. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("CrossAccountAuthorized")
    public Boolean crossAccountAuthorized;

    /**
     * <p>The ID of the customer gateway.</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Indicates whether IPsec negotiations immediately start.</p>
     * <br>
     * <p>*   **true**: Negotiations are reinitiated after the configuration is changed.</p>
     * <p>*   **false**: Negotiations are reinitiated when traffic is detected.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Indicates whether dead peer detection (DPD) is enabled.</p>
     * <br>
     * <p>*   **false**: disabled</p>
     * <p>*   **true**: enabled</p>
     * <br>
     * <p>After you enable DPD, the initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no response is received from the peer within a specified period of time, the connection fails. Then, the ISAKMP SA, IPsec SA, and IPsec tunnel are deleted.</p>
     */
    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    /**
     * <p>Indicates whether NAT traversal is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: NAT traversal is enabled.</p>
     * <p>*   **false**: NAT traversal is disabled.</p>
     * <br>
     * <p>After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the VPN tunnel.</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>The configurations of Phase 1 negotiations.</p>
     */
    @NameInMap("IkeConfig")
    public DescribeVpnConnectionResponseBodyIkeConfig ikeConfig;

    /**
     * <p>The gateway IP address of the IPsec-VPN connection.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The configuration of phase 2 negotiations.</p>
     */
    @NameInMap("IpsecConfig")
    public DescribeVpnConnectionResponseBodyIpsecConfig ipsecConfig;

    /**
     * <p>The CIDR block on the Alibaba Cloud side.</p>
     * <br>
     * <p>CIDR blocks are separated with commas (,).</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the IPsec-VPN connection. Valid values:</p>
     * <br>
     * <p>*   **public**: an encrypted connection over the Internet.</p>
     * <p>*   **private**: an encrypted connection over private networks.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The CA certificate of the peer.</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block on the data center side.</p>
     * <br>
     * <p>CIDR blocks are separated with commas (,).</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The bandwidth specification of the IPsec-VPN connection. Unit: **Mbit/s**.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The association status of the IPsec-VPN connection. Valid values:</p>
     * <br>
     * <p>*   **active**: The IPsec-VPN connection is associated with a VPN gateway.</p>
     * <p>*   **init**: The IPsec-VPN connection is not associated with a resource and is being initialized.</p>
     * <p>*   **attaching**: The IPsec-VPN connection is being associated with a transit router.</p>
     * <p>*   **attached**: The IPsec-VPN connection is associated with a transit router.</p>
     * <p>*   **detaching**: The IPsec-VPN connection is being disassociated from a transit router.</p>
     * <p>*   **financialLocked**: The IPsec-VPN connection is locked due to overdue payments.</p>
     * <p>*   **provisioning**: The IPsec-VPN connection is being prepared.</p>
     * <p>*   **updating**: The IPsec-VPN connection is being updated.</p>
     * <p>*   **Upgrading**: The IPsec-VPN connection is being upgraded.</p>
     * <p>*   **deleted**: The IPsec-VPN connection is deleted.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The status of the IPsec-VPN connection. Valid values:</p>
     * <br>
     * <p>*   **ike_sa_not_established**: Phase 1 negotiations failed.</p>
     * <p>*   **ike_sa_established**: Phase 1 negotiations were successful.</p>
     * <p>*   **ipsec_sa_not_established**: Phase 2 negotiations failed.</p>
     * <p>*   **ipsec_sa_established**: Phase 2 negotiations were successful.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags added to the IPsec-VPN connection.</p>
     */
    @NameInMap("Tags")
    public DescribeVpnConnectionResponseBodyTags tags;

    /**
     * <p>The ID of the transit router with which the IPsec-VPN connection is associated.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The name of the transit router.</p>
     */
    @NameInMap("TransitRouterName")
    public String transitRouterName;

    @NameInMap("TunnelOptionsSpecification")
    public DescribeVpnConnectionResponseBodyTunnelOptionsSpecification tunnelOptionsSpecification;

    /**
     * <p>The information about health checks.</p>
     */
    @NameInMap("VcoHealthCheck")
    public DescribeVpnConnectionResponseBodyVcoHealthCheck vcoHealthCheck;

    /**
     * <p>The configurations of the BGP routing protocol.</p>
     */
    @NameInMap("VpnBgpConfig")
    public DescribeVpnConnectionResponseBodyVpnBgpConfig vpnBgpConfig;

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

    /**
     * <p>The ID of the zone where the IPsec-VPN connection is deployed.</p>
     * <br>
     * <p>You can call [DescribeZones](~~36064~~) to query zone IDs.</p>
     */
    @NameInMap("ZoneNo")
    public String zoneNo;

    public static DescribeVpnConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionResponseBody self = new DescribeVpnConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionResponseBody setAttachInstanceId(String attachInstanceId) {
        this.attachInstanceId = attachInstanceId;
        return this;
    }
    public String getAttachInstanceId() {
        return this.attachInstanceId;
    }

    public DescribeVpnConnectionResponseBody setAttachType(String attachType) {
        this.attachType = attachType;
        return this;
    }
    public String getAttachType() {
        return this.attachType;
    }

    public DescribeVpnConnectionResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeVpnConnectionResponseBody setCrossAccountAuthorized(Boolean crossAccountAuthorized) {
        this.crossAccountAuthorized = crossAccountAuthorized;
        return this;
    }
    public Boolean getCrossAccountAuthorized() {
        return this.crossAccountAuthorized;
    }

    public DescribeVpnConnectionResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public DescribeVpnConnectionResponseBody setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public DescribeVpnConnectionResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public DescribeVpnConnectionResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public DescribeVpnConnectionResponseBody setEnableTunnelsBgp(Boolean enableTunnelsBgp) {
        this.enableTunnelsBgp = enableTunnelsBgp;
        return this;
    }
    public Boolean getEnableTunnelsBgp() {
        return this.enableTunnelsBgp;
    }

    public DescribeVpnConnectionResponseBody setIkeConfig(DescribeVpnConnectionResponseBodyIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public DescribeVpnConnectionResponseBodyIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public DescribeVpnConnectionResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public DescribeVpnConnectionResponseBody setIpsecConfig(DescribeVpnConnectionResponseBodyIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public DescribeVpnConnectionResponseBodyIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public DescribeVpnConnectionResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public DescribeVpnConnectionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpnConnectionResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeVpnConnectionResponseBody setRemoteCaCertificate(String remoteCaCertificate) {
        this.remoteCaCertificate = remoteCaCertificate;
        return this;
    }
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    public DescribeVpnConnectionResponseBody setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public DescribeVpnConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnConnectionResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeVpnConnectionResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeVpnConnectionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpnConnectionResponseBody setTags(DescribeVpnConnectionResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVpnConnectionResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeVpnConnectionResponseBody setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public DescribeVpnConnectionResponseBody setTransitRouterName(String transitRouterName) {
        this.transitRouterName = transitRouterName;
        return this;
    }
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    public DescribeVpnConnectionResponseBody setTunnelOptionsSpecification(DescribeVpnConnectionResponseBodyTunnelOptionsSpecification tunnelOptionsSpecification) {
        this.tunnelOptionsSpecification = tunnelOptionsSpecification;
        return this;
    }
    public DescribeVpnConnectionResponseBodyTunnelOptionsSpecification getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    public DescribeVpnConnectionResponseBody setVcoHealthCheck(DescribeVpnConnectionResponseBodyVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public DescribeVpnConnectionResponseBodyVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public DescribeVpnConnectionResponseBody setVpnBgpConfig(DescribeVpnConnectionResponseBodyVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public DescribeVpnConnectionResponseBodyVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public DescribeVpnConnectionResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public DescribeVpnConnectionResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DescribeVpnConnectionResponseBody setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo;
        return this;
    }
    public String getZoneNo() {
        return this.zoneNo;
    }

    public static class DescribeVpnConnectionResponseBodyIkeConfig extends TeaModel {
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
         * <p>*   **main**: This mode offers higher security during negotiations.</p>
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
         * <p>The identifier on the data center side.</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier on the Alibaba Cloud side.</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static DescribeVpnConnectionResponseBodyIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyIkeConfig self = new DescribeVpnConnectionResponseBodyIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionResponseBodyIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DescribeVpnConnectionResponseBodyIpsecConfig extends TeaModel {
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

        public static DescribeVpnConnectionResponseBodyIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyIpsecConfig self = new DescribeVpnConnectionResponseBodyIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DescribeVpnConnectionResponseBodyIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVpnConnectionResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTagsTag self = new DescribeVpnConnectionResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnConnectionResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpnConnectionResponseBodyTagsTag> tag;

        public static DescribeVpnConnectionResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTags self = new DescribeVpnConnectionResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTags setTag(java.util.List<DescribeVpnConnectionResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnConnectionResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig extends TeaModel {
        @NameInMap("BgpStatus")
        public String bgpStatus;

        @NameInMap("LocalAsn")
        public String localAsn;

        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        @NameInMap("PeerAsn")
        public String peerAsn;

        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig self = new DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setBgpStatus(String bgpStatus) {
            this.bgpStatus = bgpStatus;
            return this;
        }
        public String getBgpStatus() {
            return this.bgpStatus;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig extends TeaModel {
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        @NameInMap("IkeLifetime")
        public String ikeLifetime;

        @NameInMap("IkeMode")
        public String ikeMode;

        @NameInMap("IkePfs")
        public String ikePfs;

        @NameInMap("IkeVersion")
        public String ikeVersion;

        @NameInMap("LocalId")
        public String localId;

        @NameInMap("Psk")
        public String psk;

        @NameInMap("RemoteId")
        public String remoteId;

        public static DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig self = new DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeLifetime(String ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public String getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig extends TeaModel {
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        public String ipsecLifetime;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig self = new DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecLifetime(String ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public String getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions extends TeaModel {
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        @NameInMap("EnableDpd")
        public String enableDpd;

        @NameInMap("EnableNatTraversal")
        public String enableNatTraversal;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        @NameInMap("TunnelBgpConfig")
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig tunnelBgpConfig;

        @NameInMap("TunnelId")
        public String tunnelId;

        @NameInMap("TunnelIkeConfig")
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig tunnelIkeConfig;

        @NameInMap("TunnelIpsecConfig")
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig tunnelIpsecConfig;

        @NameInMap("ZoneNo")
        public String zoneNo;

        public static DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions self = new DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setEnableDpd(String enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public String getEnableDpd() {
            return this.enableDpd;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setEnableNatTraversal(String enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public String getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setTunnelBgpConfig(DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setTunnelIkeConfig(DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setTunnelIpsecConfig(DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions setZoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }
        public String getZoneNo() {
            return this.zoneNo;
        }

    }

    public static class DescribeVpnConnectionResponseBodyTunnelOptionsSpecification extends TeaModel {
        @NameInMap("TunnelOptions")
        public java.util.List<DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions> tunnelOptions;

        public static DescribeVpnConnectionResponseBodyTunnelOptionsSpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyTunnelOptionsSpecification self = new DescribeVpnConnectionResponseBodyTunnelOptionsSpecification();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecification setTunnelOptions(java.util.List<DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions> tunnelOptions) {
            this.tunnelOptions = tunnelOptions;
            return this;
        }
        public java.util.List<DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptions> getTunnelOptions() {
            return this.tunnelOptions;
        }

    }

    public static class DescribeVpnConnectionResponseBodyVcoHealthCheck extends TeaModel {
        /**
         * <p>The destination IP address.</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>Indicates whether health checks are enabled.</p>
         * <br>
         * <p>*   **false**: disabled</p>
         * <p>*   **true**: enabled</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The interval of health check retries. Unit: seconds.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Indicates whether advertised routes are withdrawn when the health check fails.</p>
         * <br>
         * <p>*   **revoke_route**: published routes are withdrawn.</p>
         * <p>*   **reserve_route**: published routes are not withdrawn.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The maximum number of health check retries.</p>
         */
        @NameInMap("Retry")
        public Integer retry;

        /**
         * <p>The source IP address.</p>
         */
        @NameInMap("Sip")
        public String sip;

        /**
         * <p>The status of the health check.</p>
         * <br>
         * <p>*   **failed**: abnormal</p>
         * <p>*   **success**: normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeVpnConnectionResponseBodyVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyVcoHealthCheck self = new DescribeVpnConnectionResponseBodyVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeVpnConnectionResponseBodyVcoHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnConnectionResponseBodyVpnBgpConfig extends TeaModel {
        /**
         * <p>The authentication key of the BGP routing protocol.</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The status of the BGP routing protocol. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
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
         * <p>The autonomous system number (ASN) of the peer.</p>
         */
        @NameInMap("PeerAsn")
        public Long peerAsn;

        /**
         * <p>The BGP IP address of the peer.</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The negotiation status of the BGP routing protocol.</p>
         * <br>
         * <p>*   **success**: normal</p>
         * <p>*   **failed**: abnormal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The CIDR block of the IPsec tunnel. The CIDR block belongs to 169.254.0.0/16. The mask of the CIDR block is 30 bits in length.</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static DescribeVpnConnectionResponseBodyVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseBodyVpnBgpConfig self = new DescribeVpnConnectionResponseBodyVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setPeerAsn(Long peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionResponseBodyVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

}
