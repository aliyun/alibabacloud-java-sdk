// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the CEN instance to which the transit router belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-lxxpbpalc776qz****</p>
     */
    @NameInMap("AttachInstanceId")
    public String attachInstanceId;

    /**
     * <p>The type of the resource that is associated with the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>CEN</strong>: indicates that the IPsec-VPN connection is associated with a transit router of a Cloud Enterprise Network (CEN) instance.</li>
     * <li><strong>NO_ASSOCIATED</strong>: indicates that the IPsec-VPN connection is not associated with any resource.</li>
     * <li><strong>VPNGW</strong>: indicates that the IPsec-VPN connection is associated with a VPN gateway.</li>
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
     * <p>1492753817000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether the IPsec-VPN connection is associated with a transit router that belongs to another Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossAccountAuthorized")
    public Boolean crossAccountAuthorized;

    /**
     * <p>The ID of the customer gateway associated with the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>cgw-bp1mvj4g9kogwwcxk****</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>Indicates whether IPsec negotiations immediately start after the configuration takes effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Negotiations are reinitiated after the configuration is changed.</li>
     * <li><strong>false</strong>: Negotiations are reinitiated after traffic is detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>Indicates whether the dead peer detection (DPD) feature is enabled for the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * <p>After you enable the DPD feature, the initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no response is received from the peer within a specified period of time, the connection fails. Then, the ISAKMP security association (SA), IPsec SA, and IPsec tunnel are deleted.</p>
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
     * <p>After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    /**
     * <p>Indicates whether BGP is enabled for the tunnel. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTunnelsBgp")
    public Boolean enableTunnelsBgp;

    /**
     * <p>The configuration of Phase 1 negotiations.</p>
     */
    @NameInMap("IkeConfig")
    public DescribeVpnConnectionResponseBodyIkeConfig ikeConfig;

    /**
     * <p>The gateway IP address of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>47.XX.XX.162</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The configuration of Phase 2 negotiations.</p>
     */
    @NameInMap("IpsecConfig")
    public DescribeVpnConnectionResponseBodyIpsecConfig ipsecConfig;

    /**
     * <p>The CIDR block on the Alibaba Cloud side.</p>
     * <p>Multiple CIDR blocks are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>ipsec1</p>
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
     * <p>The certificate authority (CA) certificate of the peer.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW****</p>
     */
    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    /**
     * <p>The CIDR block on the data center side.</p>
     * <p>Multiple CIDR blocks are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2310D45-BCF6-4E2E-9082-B4503844BA4C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the IPsec-VPN connection belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the resource group information.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The bandwidth specification of the IPsec-VPN connection. Unit: <strong>Mbit/s</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1000M</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The association state of the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>active</strong>: The IPsec-VPN connection is associated with a VPN gateway.</li>
     * <li><strong>init</strong>: The IPsec-VPN connection is not associated with any resource and is being initialized.</li>
     * <li><strong>attaching</strong>: The IPsec-VPN connection is being associated with a transit router.</li>
     * <li><strong>attached</strong>: The IPsec-VPN connection is associated with a transit router.</li>
     * <li><strong>detaching</strong>: The IPsec-VPN connection is being disassociated from a transit router.</li>
     * <li><strong>financialLocked</strong>: The IPsec-VPN connection is locked due to overdue payments.</li>
     * <li><strong>provisioning</strong>: The IPsec-VPN connection is being prepared.</li>
     * <li><strong>updating</strong>: The IPsec-VPN connection is being updated.</li>
     * <li><strong>Upgrading</strong>: The IPsec-VPN connection is being upgraded.</li>
     * <li><strong>deleted</strong>: The IPsec-VPN connection is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>attached</p>
     */
    @NameInMap("State")
    public String state;

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
     * <p>The list of tags added to the IPsec-VPN connection.</p>
     */
    @NameInMap("Tags")
    public DescribeVpnConnectionResponseBodyTags tags;

    /**
     * <p>The ID of the transit router with which the IPsec-VPN connection is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-p0we2edef9qr44a85****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The name of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouterName")
    public String transitRouterName;

    /**
     * <p>The tunnel configuration of the IPsec-VPN connection.</p>
     * <p>Parameters in <strong>TunnelOptionsSpecification</strong> are returned only if you query IPsec-VPN connections in dual-tunnel mode.</p>
     */
    @NameInMap("TunnelOptionsSpecification")
    public DescribeVpnConnectionResponseBodyTunnelOptionsSpecification tunnelOptionsSpecification;

    /**
     * <p>The health check information about the IPsec-VPN connection.</p>
     */
    @NameInMap("VcoHealthCheck")
    public DescribeVpnConnectionResponseBodyVcoHealthCheck vcoHealthCheck;

    /**
     * <p>The Border Gateway Protocol (BGP) configuration of the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnBgpConfig")
    public DescribeVpnConnectionResponseBodyVpnBgpConfig vpnBgpConfig;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-bp1bbi27hojx80nck****</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>The ID of the zone where the IPsec-VPN connection is deployed.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> to query zone IDs and mapping between zone IDs and zone names.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
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

    public DescribeVpnConnectionResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <p>The authentication algorithm in the IKE phase.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm in the IKE phase.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The lifetime in the IKE phase. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The IKE negotiation mode.</p>
         * <ul>
         * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
         * <li><strong>aggressive</strong>: This mode is faster and has a higher success rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman (DH) group in the IKE phase.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The version of the IKE protocol.</p>
         * <ul>
         * <li><strong>ikev1</strong></li>
         * <li><strong>ikev2</strong></li>
         * </ul>
         * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.</p>
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
         * <p>116.28.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>pgw6dy****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the IPsec-VPN connection on the data center side.</p>
         * 
         * <strong>example:</strong>
         * <p>139.34.XX.XX</p>
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
         * <p>The authentication algorithm in the IPsec phase.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm in the IPsec phase.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The lifetime in the IPsec phase. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The DH group in the IPsec phase.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
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
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
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
        /**
         * <p>The negotiation state of BGP. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("BgpStatus")
        public String bgpStatus;

        /**
         * <p>The ASN on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("LocalAsn")
        public String localAsn;

        /**
         * <p>The BGP address on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.1</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The ASN of the tunnel peer.</p>
         * 
         * <strong>example:</strong>
         * <p>65531</p>
         */
        @NameInMap("PeerAsn")
        public String peerAsn;

        /**
         * <p>The BGP IP address of the tunnel peer.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.2</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The BGP CIDR block of the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.0/30</p>
         */
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
        /**
         * <p>The authentication algorithm in the IKE phase.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The encryption algorithm in the IKE phase.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The lifetime in the IKE phase. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public String ikeLifetime;

        /**
         * <p>The IKE negotiation mode.</p>
         * <ul>
         * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
         * <li><strong>aggressive</strong>: This mode is faster and has a higher success rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman (DH) group in the IKE phase.</p>
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
         * <p>The identifier of the tunnel on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>47.21.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the tunnel peer.</p>
         * 
         * <strong>example:</strong>
         * <p>47.42.XX.XX</p>
         */
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
        /**
         * <p>The authentication algorithm in the IPsec phase.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The encryption algorithm in the IPsec phase.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The lifetime in the IPsec phase. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public String ipsecLifetime;

        /**
         * <p>The DH group in the IPsec phase.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
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
        /**
         * <p>The ID of the customer gateway associated with the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-p0wy363lucf1uyae8****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>Indicates whether the DPD feature is enabled for the tunnel. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDpd")
        public String enableDpd;

        /**
         * <p>Indicates whether NAT traversal is enabled for the tunnel. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public String enableNatTraversal;

        /**
         * <p>The tunnel IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.21.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The CA certificate of the tunnel peer.</p>
         * <p>This parameter is returned only if the VPN gateway is of the ShangMi (SM) type.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The tunnel role. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: The tunnel is an active tunnel.</li>
         * <li><strong>slave</strong>: The tunnel is a standby tunnel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The tunnel status. Valid values:</p>
         * <ul>
         * <li><strong>active</strong></li>
         * <li><strong>updating</strong></li>
         * <li><strong>deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

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
         * <p>ipsec_sa_established</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The BGP configurations.</p>
         */
        @NameInMap("TunnelBgpConfig")
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>The tunnel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tun-opsqc4d97wni27****</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <p>The configuration of Phase 1 negotiations.</p>
         */
        @NameInMap("TunnelIkeConfig")
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("TunnelIpsecConfig")
        public DescribeVpnConnectionResponseBodyTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig tunnelIpsecConfig;

        /**
         * <p>The zone where the tunnel is deployed.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> to query zone IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>Indicates whether the health check feature is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
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
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("Sip")
        public String sip;

        /**
         * <p>The state of the health check. Valid values:</p>
         * <ul>
         * <li><strong>failed</strong></li>
         * <li><strong>success</strong>: normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
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
         * 
         * <strong>example:</strong>
         * <p>AuthKey****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>Indicates whether BGP is enabled. Valid values:</p>
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
         * <p>65531</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>The BGP IP address on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.2</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The autonomous system number (ASN) of the peer.</p>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("PeerAsn")
        public Long peerAsn;

        /**
         * <p>The BGP IP address of the peer.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.1</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The negotiation state of the BGP routing protocol. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: normal</li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The BGP CIDR block of the IPsec-VPN connection. The CIDR block falls within 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.11.0/30</p>
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
