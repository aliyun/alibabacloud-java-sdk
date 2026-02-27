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
         * <p>IKE阶段认证算法。</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>IKE阶段加密算法。</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>IKE阶段生存时间。单位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>IKE阶段协商模式。</p>
         * <ul>
         * <li><strong>main</strong>：主模式，协商过程安全性高。</li>
         * <li><strong>aggressive</strong>：野蛮模式，协商快速且协商成功率高。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>IKE阶段DH分组。</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>IKE协议版本。</p>
         * <ul>
         * <li><strong>ikev1</strong></li>
         * <li><strong>ikev2</strong></li>
         * </ul>
         * <p>相对于IKEv1版本，IKEv2版本简化了SA的协商过程并且对于多网段的场景提供了更好的支持。</p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>IPsec连接对端本地数据中心侧的标识。</p>
         * 
         * <strong>example:</strong>
         * <p>116.64.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>预共享密钥。</p>
         * 
         * <strong>example:</strong>
         * <p>pgw6dy7****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>IPsec连接阿里云侧的标识。</p>
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
         * <p>IPsec阶段认证算法。</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>IPsec阶段加密算法。</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>IPsec阶段生存时间。单位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>IPsec阶段DH分组。</p>
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
         * <p>标签键。</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
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
         * <p>BGP的协商状态。</p>
         * <ul>
         * <li><strong>success</strong>：正常。</li>
         * <li><strong>failed</strong>：异常。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("BgpStatus")
        public String bgpStatus;

        /**
         * <p>隧道本端（阿里云侧）的自治系统号。</p>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("LocalAsn")
        public String localAsn;

        /**
         * <p>隧道本端（阿里云侧）的BGP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.1</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>隧道对端的自治系统号。</p>
         * 
         * <strong>example:</strong>
         * <p>65531</p>
         */
        @NameInMap("PeerAsn")
        public String peerAsn;

        /**
         * <p>隧道对端的BGP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.2</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>隧道的BGP网段。</p>
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
         * <p>IKE阶段认证算法。</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>IKE阶段加密算法。</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>IKE阶段生存时间。单位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public String ikeLifetime;

        /**
         * <p>IKE协商模式。</p>
         * <ul>
         * <li><strong>main</strong>：主模式，协商过程安全性高。</li>
         * <li><strong>aggressive</strong>：野蛮模式，协商快速且协商成功率高。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>IKE阶段DH分组。</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>IKE协议版本。</p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>隧道本端（阿里云侧）的标识。</p>
         * 
         * <strong>example:</strong>
         * <p>47.21.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>预共享密钥。</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>隧道对端的标识。</p>
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
         * <p>IPsec阶段认证算法。</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>IPsec阶段加密算法。</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>IPsec阶段生存时间。单位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public String ipsecLifetime;

        /**
         * <p>IPsec阶段DH分组。</p>
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
         * <p>隧道关联的用户网关ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-p0wy363lucf1uyae8****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>隧道是否已开启DPD（对等体存活检测）功能。</p>
         * <ul>
         * <li><strong>false</strong>：未开启。</li>
         * <li><strong>true</strong>：已开启。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDpd")
        public String enableDpd;

        /**
         * <p>隧道是否已开启NAT穿越功能。</p>
         * <ul>
         * <li><strong>false</strong>：未开启。</li>
         * <li><strong>true</strong>：已开启。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public String enableNatTraversal;

        /**
         * <p>隧道的IP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>47.21.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>隧道对端的CA证书。</p>
         * <p>仅VPN网关实例的类型为国密型时才会返回当前参数。</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>隧道的角色。</p>
         * <ul>
         * <li><strong>master</strong>：表示当前隧道为主隧道。</li>
         * <li><strong>slave</strong>：表示当前隧道为备隧道。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>隧道的状态。</p>
         * <ul>
         * <li><strong>active</strong>：状态正常。</li>
         * <li><strong>updating</strong>：更新中。</li>
         * <li><strong>deleting</strong>：删除中。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>IPsec连接的状态。</p>
         * <ul>
         * <li><p><strong>ike_sa_not_established</strong>：第一阶段协商失败。</p>
         * </li>
         * <li><p><strong>ike_sa_established</strong>：第一阶段协商成功。</p>
         * </li>
         * <li><p><strong>ipsec_sa_not_established</strong>：第二阶段协商失败。</p>
         * </li>
         * <li><p><strong>ipsec_sa_established</strong>：第二阶段协商成功。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipsec_sa_established</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>隧道的BGP配置信息。</p>
         */
        @NameInMap("TunnelBgpConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelBgpConfig tunnelBgpConfig;

        /**
         * <p>隧道ID。</p>
         * 
         * <strong>example:</strong>
         * <p>tun-opsqc4d97wni27****</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <p>第一阶段协商的配置。</p>
         */
        @NameInMap("TunnelIkeConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIkeConfig tunnelIkeConfig;

        /**
         * <p>隧道的创建顺序。</p>
         * <ul>
         * <li><strong>1</strong>：第一条隧道。</li>
         * <li><strong>2</strong>：第二条隧道。</li>
         * </ul>
         * <blockquote>
         * <p>仅IPsec连接绑定转发路由器时会返回该参数。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TunnelIndex")
        public Integer tunnelIndex;

        /**
         * <p>第二阶段协商的配置。</p>
         */
        @NameInMap("TunnelIpsecConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecificationTunnelOptionsTunnelIpsecConfig tunnelIpsecConfig;

        /**
         * <p>隧道部署的可用区。</p>
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
         * <p>目的IP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Dip")
        public String dip;

        /**
         * <p>健康检查的开启状态。</p>
         * <ul>
         * <li><p><strong>true</strong>：已开启。</p>
         * </li>
         * <li><p><strong>false</strong>：未开启。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>健康检查的时间间隔。单位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>健康检查失败时是否撤销已发布的路由。</p>
         * <ul>
         * <li><strong>revoke_route</strong>：撤销路由。</li>
         * <li><strong>reserve_route</strong>：不撤销路由。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>revoke_route</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>健康检查的重试发包次数。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Retry")
        public Integer retry;

        /**
         * <p>源IP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.50</p>
         */
        @NameInMap("Sip")
        public String sip;

        /**
         * <p>健康检查状态。</p>
         * <ul>
         * <li><strong>success</strong>：正常。</li>
         * <li><strong>failed</strong>：异常。</li>
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
         * <p>BGP路由协议的认证密钥。</p>
         * 
         * <strong>example:</strong>
         * <p>AuthKey****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>阿里云侧自治系统号。</p>
         * 
         * <strong>example:</strong>
         * <p>65531</p>
         */
        @NameInMap("LocalAsn")
        public Long localAsn;

        /**
         * <p>阿里云侧BGP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.2</p>
         */
        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        /**
         * <p>对端自治系统号。</p>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("PeerAsn")
        public Long peerAsn;

        /**
         * <p>对端BGP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.10.1</p>
         */
        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        /**
         * <p>BGP路由协议的协商状态。</p>
         * <ul>
         * <li><p><strong>success</strong>：正常。</p>
         * </li>
         * <li><p><strong>false</strong>：异常。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>IPsec连接BGP网段。该网段是一个在169.254.0.0/16内的子网掩码长度为30的网段。</p>
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
         * <p>转发路由器实例所属的云企业网实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cen-lxxpbpalc776qz****</p>
         */
        @NameInMap("AttachInstanceId")
        public String attachInstanceId;

        /**
         * <p>IPsec连接绑定的资源类型。</p>
         * <ul>
         * <li><strong>CEN</strong>：表示IPsec连接已绑定云企业网实例下的转发路由器实例。</li>
         * <li><strong>NO_ASSOCIATED</strong>：表示IPsec连接未绑定任何资源。</li>
         * <li><strong>VPNGW</strong>：表示IPsec连接绑定了VPN网关实例。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CEN</p>
         */
        @NameInMap("AttachType")
        public String attachType;

        /**
         * <p>创建IPsec连接的时间戳。单位：毫秒。</p>
         * <p>时间戳的格式采用Unix时间戳，表示从格林威治时间1970年01月01日00时00分00秒至创建IPsec连接时的总时长。</p>
         * 
         * <strong>example:</strong>
         * <p>1492753817000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>IPsec连接是否绑定了跨账号的转发路由器实例。</p>
         * <ul>
         * <li><strong>true</strong>：是。</li>
         * <li><strong>false</strong>：否。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CrossAccountAuthorized")
        public Boolean crossAccountAuthorized;

        /**
         * <p>IPsec连接关联的用户网关的实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-bp1mvj4g9kogw****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>IPsec连接的配置是否立即生效。</p>
         * <ul>
         * <li><strong>true</strong>：是，配置变更完成后触发重连。</li>
         * <li><strong>false</strong>：否，有流量时触发重连。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EffectImmediately")
        public Boolean effectImmediately;

        /**
         * <p>IPsec连接是否已开启DPD（对等体存活检测）功能。</p>
         * <ul>
         * <li><p><strong>true</strong>：开启DPD功能。</p>
         * <p>  IPsec发起端会发送DPD报文用来检测对端的设备是否存活，如果在设定时间内未收到正确回应则认为对端已经断线，IPsec将删除ISAKMP SA和相应的IPsec SA，安全隧道同样也会被删除。</p>
         * </li>
         * <li><p><strong>false</strong>：不开启DPD功能，IPsec发起端不会发送DPD探测报文。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        /**
         * <p>IPsec连接是否已开启NAT穿越功能。</p>
         * <ul>
         * <li><p><strong>true</strong>：开启NAT穿越功能。</p>
         * <p> 开启后，IKE协商过程会删除对UDP端口号的验证过程，同时实现对VPN隧道中NAT网关设备的发现功能。</p>
         * </li>
         * <li><p><strong>false</strong>：不开启NAT穿越功能。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        /**
         * <p>隧道BGP的开启状态。</p>
         * <ul>
         * <li><strong>true</strong>：已开启。</li>
         * <li><strong>false</strong>：未开启。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTunnelsBgp")
        public Boolean enableTunnelsBgp;

        /**
         * <p>第一阶段协商的配置。</p>
         */
        @NameInMap("IkeConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig ikeConfig;

        /**
         * <p>IPsec连接的网关IP地址。</p>
         * <blockquote>
         * <p>仅IPsec连接绑定转发路由器实例时会返回当前参数。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.XX.XX.10</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>第二阶段协商的配置。</p>
         */
        @NameInMap("IpsecConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig ipsecConfig;

        /**
         * <p>IPsec连接阿里云侧的网段。</p>
         * <p>在多个网段的情况下，网段之间使用半角逗号（,）分隔。</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16,172.17.0.0/16</p>
         */
        @NameInMap("LocalSubnet")
        public String localSubnet;

        /**
         * <p>IPsec连接的名称。</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>IPsec连接的网络类型。</p>
         * <ul>
         * <li><strong>public</strong>：公网，表示IPsec连接通过公网建立加密通信通道。</li>
         * <li><strong>private</strong>：私网，表示IPsec连接通过私网建立加密通信通道。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>对端的CA证书。</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        /**
         * <p>本地数据中心侧的网段。</p>
         * <p>在多个网段的情况下，网段之间使用半角逗号（,）分隔。</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8,172.16.0.0/16</p>
         */
        @NameInMap("RemoteSubnet")
        public String remoteSubnet;

        /**
         * <p>IPsec连接所属的资源组ID。</p>
         * <p>您可以调用<a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>接口查询资源组信息。</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>IPsec连接的带宽规格。单位：<strong>Mbps</strong>。</p>
         * 
         * <strong>example:</strong>
         * <p>1000M</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>IPsec连接与转发路由器实例的绑定状态。</p>
         * <ul>
         * <li><strong>active</strong>：IPsec连接已与VPN网关实例绑定，状态正常。</li>
         * <li><strong>init</strong>：IPsec连接未绑定任何资源，IPsec连接初始化。</li>
         * <li><strong>attaching</strong>：IPsec连接与转发路由器实例绑定中。</li>
         * <li><strong>attached</strong>：IPsec连接已与转发路由器实例绑定。</li>
         * <li><strong>detaching</strong>：IPsec连接与转发路由器实例解绑中。</li>
         * <li><strong>financialLocked</strong>：欠费锁定。</li>
         * <li><strong>provisioning</strong>：资源准备中。</li>
         * <li><strong>updating</strong>：更新中。</li>
         * <li><strong>upgrading</strong>：升级中。</li>
         * <li><strong>deleted</strong>：已删除。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>attached</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>IPsec连接的状态。</p>
         * <ul>
         * <li><p><strong>ike_sa_not_established</strong>：第一阶段协商失败。</p>
         * </li>
         * <li><p><strong>ike_sa_established</strong>：第一阶段协商成功。</p>
         * </li>
         * <li><p><strong>ipsec_sa_not_established</strong>：第二阶段协商失败。</p>
         * </li>
         * <li><p><strong>ipsec_sa_established</strong>：第二阶段协商成功。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipsec_sa_established</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>IPsec连接绑定的标签列表。</p>
         */
        @NameInMap("Tag")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTag tag;

        /**
         * <p>IPsec连接绑定的转发路由器实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0we2edef9qr44a85****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>转发路由器实例的名称。</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TransitRouterName")
        public String transitRouterName;

        /**
         * <p>用于说明VPN单条隧道的带宽规格，取值：
         * Standard（默认值）：标准型，默认带宽1Gbps
         * Large（大型）：大型，默认带宽3Gbps</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TunnelBandwidth")
        public String tunnelBandwidth;

        /**
         * <p>IPsec连接的隧道配置信息。</p>
         * <p>仅查询双隧道模式的IPsec连接会返回<strong>TunnelOptionsSpecification</strong>数组下的参数。</p>
         */
        @NameInMap("TunnelOptionsSpecification")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionTunnelOptionsSpecification tunnelOptionsSpecification;

        /**
         * <p>IPsec连接的健康检查配置。</p>
         */
        @NameInMap("VcoHealthCheck")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck;

        /**
         * <p>IPsec连接BGP路由协议的配置。</p>
         */
        @NameInMap("VpnBgpConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig;

        /**
         * <p>IPsec连接的ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp10lz7aejumd****</p>
         */
        @NameInMap("VpnConnectionId")
        public String vpnConnectionId;

        /**
         * <p>VPN网关的实例ID。</p>
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

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setTunnelBandwidth(String tunnelBandwidth) {
            this.tunnelBandwidth = tunnelBandwidth;
            return this;
        }
        public String getTunnelBandwidth() {
            return this.tunnelBandwidth;
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
