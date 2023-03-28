// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the IPsec-VPN connection.</p>
     */
    @NameInMap("VpnConnections")
    public DescribeVpnConnectionsResponseBodyVpnConnections vpnConnections;

    public static DescribeVpnConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionsResponseBody self = new DescribeVpnConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnConnectionsResponseBody setVpnConnections(DescribeVpnConnectionsResponseBodyVpnConnections vpnConnections) {
        this.vpnConnections = vpnConnections;
        return this;
    }
    public DescribeVpnConnectionsResponseBodyVpnConnections getVpnConnections() {
        return this.vpnConnections;
    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag extends TeaModel {
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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag> tag;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag setTag(java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTagTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck extends TeaModel {
        /**
         * <p>The destination IP address.</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>Indicates whether health checks are enabled.</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Indicates whether advertised routes are withdrawn when the health check fails.</p>
         * <br>
         * <p>*   **revoke_route**: yes</p>
         * <p>*   **reserve_route**: no</p>
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
         * <p>*   **success**: normal</p>
         * <p>*   **failed**: abnormal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig extends TeaModel {
        /**
         * <p>The authentication key of the BGP routing protocol.</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

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
         * <p>The negotiation status of the BGP routing protocol. Valid values:</p>
         * <br>
         * <p>*   **success**: normal</p>
         * <p>*   **false**: abnormal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The CIDR block of the IPsec tunnel. The CIDR block falls within 169.254.0.0/16. The mask of the CIDR block is 30 bits in length.</p>
         */
        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setPeerAsn(Long peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection extends TeaModel {
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
         * <p>The timestamp that indicates the time when the IPsec-VPN connection was established. Unit: milliseconds.</p>
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
         * <p>*   **true**: Negotiations are re-initiated after the configuration is changed.</p>
         * <p>*   **false**: Negotiations are re-initiated when traffic is detected.</p>
         */
        @NameInMap("EffectImmediately")
        public Boolean effectImmediately;

        /**
         * <p>Indicates whether dead peer detection (DPD) is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled.</p>
         * <br>
         * <p>    The initiator of the IPsec-VPN connection sends DPD packets to verify the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SA and IPsec SA are deleted. The security tunnel is also deleted.</p>
         * <br>
         * <p>*   **false**: disabled. The IPsec initiator does not send DPD packets.</p>
         */
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        /**
         * <p>Indicates whether NAT traversal is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <br>
         * <p>    After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.</p>
         * <br>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>The configurations of phase 1 negotiations.</p>
         */
        @NameInMap("IkeConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig ikeConfig;

        /**
         * <p>The gateway IP address of the IPsec-VPN connection.</p>
         * <br>
         * <p>>  This parameter is returned only when the IPsec-VPN connection is associated with a transit router.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The configuration of phase 2 negotiations.</p>
         */
        @NameInMap("IpsecConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig ipsecConfig;

        /**
         * <p>The CIDR block on the Alibaba Cloud side.</p>
         * <br>
         * <p>CIDR blocks are separated by commas (,).</p>
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
         * <p>CIDR blocks are separated by commas (,).</p>
         */
        @NameInMap("RemoteSubnet")
        public String remoteSubnet;

        /**
         * <p>The bandwidth specification of the IPsec-VPN connection. Unit: **Mbit/s**.</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the IPsec-VPN connection. Valid values:</p>
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
         * <p>*   **ike_sa_established**: Phase 1 negotiations succeeded.</p>
         * <p>*   **ipsec_sa_not_established**: Phase 2 negotiations failed.</p>
         * <p>*   **ipsec_sa_established**: Phase 2 negotiations succeeded.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags added to the IPsec-VPN connection.</p>
         */
        @NameInMap("Tag")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag tag;

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

        /**
         * <p>The health check configurations.</p>
         */
        @NameInMap("VcoHealthCheck")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck;

        /**
         * <p>The configurations of the BGP routing protocol.</p>
         */
        @NameInMap("VpnBgpConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig;

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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setAttachInstanceId(String attachInstanceId) {
            this.attachInstanceId = attachInstanceId;
            return this;
        }
        public String getAttachInstanceId() {
            return this.attachInstanceId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setAttachType(String attachType) {
            this.attachType = attachType;
            return this;
        }
        public String getAttachType() {
            return this.attachType;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setCrossAccountAuthorized(Boolean crossAccountAuthorized) {
            this.crossAccountAuthorized = crossAccountAuthorized;
            return this;
        }
        public Boolean getCrossAccountAuthorized() {
            return this.crossAccountAuthorized;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setEffectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }
        public Boolean getEffectImmediately() {
            return this.effectImmediately;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setIkeConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setIpsecConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setRemoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }
        public String getRemoteSubnet() {
            return this.remoteSubnet;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setTag(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag tag) {
            this.tag = tag;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag getTag() {
            return this.tag;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setTransitRouterName(String transitRouterName) {
            this.transitRouterName = transitRouterName;
            return this;
        }
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVcoHealthCheck(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck) {
            this.vcoHealthCheck = vcoHealthCheck;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck getVcoHealthCheck() {
            return this.vcoHealthCheck;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVpnBgpConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig) {
            this.vpnBgpConfig = vpnBgpConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig getVpnBgpConfig() {
            return this.vpnBgpConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnections extends TeaModel {
        @NameInMap("VpnConnection")
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection> vpnConnection;

        public static DescribeVpnConnectionsResponseBodyVpnConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnections self = new DescribeVpnConnectionsResponseBodyVpnConnections();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnections setVpnConnection(java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection> vpnConnection) {
            this.vpnConnection = vpnConnection;
            return this;
        }
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection> getVpnConnection() {
            return this.vpnConnection;
        }

    }

}
