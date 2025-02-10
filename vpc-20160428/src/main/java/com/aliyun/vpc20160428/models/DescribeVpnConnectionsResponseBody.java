// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>238752DC-0693-49BE-9C85-711D5691D3E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the IPsec-VPN connections.</p>
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
         * <p>The DH group in the IKE phase.</p>
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
         * <p>The identifier of the IPsec-VPN connection on the data center side.</p>
         * 
         * <strong>example:</strong>
         * <p>116.64.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>pgw6dy7****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the IPsec-VPN connection on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>139.17.XX.XX</p>
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
         * <p>The tag key of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
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

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setBgpStatus(String bgpStatus) {
            this.bgpStatus = bgpStatus;
            return this;
        }
        public String getBgpStatus() {
            return this.bgpStatus;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig extends TeaModel {
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
         * <p>The DH group in the IKE phase.</p>
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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeLifetime(String ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public String getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecLifetime(String ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public String getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions extends TeaModel {
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
         * <p>This parameter is returned only if the VPN gateway is of the SM type.</p>
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
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig tunnelBgpConfig;

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
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>The order in which the tunnel is created.</p>
         * <ul>
         * <li><strong>1</strong>: Tunnel 1.</li>
         * <li><strong>2</strong>: Tunnel 2.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the IPsec-VPN connection is associated with a transit router.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TunnelIndex")
        public Integer tunnelIndex;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("TunnelIpsecConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig tunnelIpsecConfig;

        /**
         * <p>The zone of the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-5a</p>
         */
        @NameInMap("ZoneNo")
        public String zoneNo;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setEnableDpd(String enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public String getEnableDpd() {
            return this.enableDpd;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setEnableNatTraversal(String enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public String getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setTunnelBgpConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setTunnelIkeConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setTunnelIndex(Integer tunnelIndex) {
            this.tunnelIndex = tunnelIndex;
            return this;
        }
        public Integer getTunnelIndex() {
            return this.tunnelIndex;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setTunnelIpsecConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions setZoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }
        public String getZoneNo() {
            return this.zoneNo;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification extends TeaModel {
        @NameInMap("TunnelOptions")
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions> tunnelOptions;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification setTunnelOptions(java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions> tunnelOptions) {
            this.tunnelOptions = tunnelOptions;
            return this;
        }
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptions> getTunnelOptions() {
            return this.tunnelOptions;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck extends TeaModel {
        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>Indicates whether the health check feature is enabled.</p>
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
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Indicates whether advertised routes are withdrawn when the health check fails.</p>
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
         * <p>192.168.0.50</p>
         */
        @NameInMap("Sip")
        public String sip;

        /**
         * <p>The state of the health check. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
         * 
         * <strong>example:</strong>
         * <p>AuthKey****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

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
         * <p>169.254.10.2</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>The ASN of the peer.</p>
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
         * <p>169.254.10.1</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>The negotiation state of the BGP routing protocol. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>169.254.10.0/30</p>
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
         * 
         * <strong>example:</strong>
         * <p>cen-lxxpbpalc776qz****</p>
         */
        @NameInMap("AttachInstanceId")
        public String attachInstanceId;

        /**
         * <p>The type of resource that is associated with the IPsec-VPN connection. Valid values:</p>
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
         * <p>cgw-bp1mvj4g9kogw****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>Indicates whether IPsec negotiations immediately start.</p>
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
         * <p>Indicates whether dead peer detection (DPD) is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * <p>The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specific period of time, the connection fails. Then, the ISAKMP security association (SA), IPsec SA, and IPsec tunnel are deleted.</p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        /**
         * <p>Indicates whether NAT traversal is enabled for the IPsec-VPN connection.</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * <p>After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.</p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
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
         * <p>The configurations of Phase 1 negotiations.</p>
         */
        @NameInMap("IkeConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig ikeConfig;

        /**
         * <p>The gateway IP address of the IPsec-VPN connection.</p>
         * <blockquote>
         * <p> This parameter is returned only if the IPsec-VPN connection is associated with a transit router.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.XX.XX.10</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("IpsecConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig ipsecConfig;

        /**
         * <p>The CIDR block on the Alibaba Cloud side.</p>
         * <p>Multiple CIDR blocks are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16,172.17.0.0/16</p>
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
         * <li><strong>public</strong></li>
         * <li><strong>private</strong></li>
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
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>The CIDR block of the data center.</p>
         * <p>Multiple CIDR blocks are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8,172.16.0.0/16</p>
         */
        @NameInMap("RemoteSubnet")
        public String remoteSubnet;

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
         * <p>The status of the IPsec-VPN connection. Valid values:</p>
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
         * <p>The list of tags to be added to the IPsec-VPN connection.</p>
         */
        @NameInMap("Tag")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag tag;

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
         * <p>The tunnel configurations of the IPsec-VPN connection.</p>
         * <p>Parameters in <strong>TunnelOptionsSpecification</strong> are returned only if you query an IPsec-VPN connection in dual-tunnel mode.</p>
         */
        @NameInMap("TunnelOptionsSpecification")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification tunnelOptionsSpecification;

        /**
         * <p>The health check configuration of the IPsec-VPN connection.</p>
         */
        @NameInMap("VcoHealthCheck")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck;

        /**
         * <p>The BGP configuration of the IPsec-VPN connection.</p>
         */
        @NameInMap("VpnBgpConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp10lz7aejumd****</p>
         */
        @NameInMap("VpnConnectionId")
        public String vpnConnectionId;

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1q8bgx4xnkm****</p>
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

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setEnableTunnelsBgp(Boolean enableTunnelsBgp) {
            this.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }
        public Boolean getEnableTunnelsBgp() {
            return this.enableTunnelsBgp;
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

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setTunnelOptionsSpecification(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification tunnelOptionsSpecification) {
            this.tunnelOptionsSpecification = tunnelOptionsSpecification;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification getTunnelOptionsSpecification() {
            return this.tunnelOptionsSpecification;
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
