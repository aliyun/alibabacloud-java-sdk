// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DownloadVpnConnectionConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C68048B-0F70-40DA-B8AE-1B79B5CF62E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of the peer gateway device.</p>
     */
    @NameInMap("VpnConnectionConfig")
    public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig vpnConnectionConfig;

    public static DownloadVpnConnectionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadVpnConnectionConfigResponseBody self = new DownloadVpnConnectionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadVpnConnectionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadVpnConnectionConfigResponseBody setVpnConnectionConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig vpnConnectionConfig) {
        this.vpnConnectionConfig = vpnConnectionConfig;
        return this;
    }
    public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig getVpnConnectionConfig() {
        return this.vpnConnectionConfig;
    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig extends TeaModel {
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
         * <p>The IKE negotiation mode. Valid values:</p>
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
         * <p>The IKE version.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier of the customer gateway. FQDN and IP formats are supported. The default value is the IP address of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>pgw6dy7d1i8i****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the VPN gateway. FQDN and IP formats are supported. The default value is the IP address of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>139.196.XX.XX</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig extends TeaModel {
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

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig extends TeaModel {
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
         * <p>The IKE negotiation mode. Valid values:</p>
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
         * <p>The IKE version.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev1</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The identifier of the tunnel on the data center side.</p>
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
         * <p>pgw6dy7d1i8i****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The identifier of the tunnel on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>47.24.XX.XX</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig extends TeaModel {
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

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig extends TeaModel {
        /**
         * <p>The configurations of Phase 1 negotiations.</p>
         */
        @NameInMap("IkeConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig ikeConfig;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("IpsecConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig ipsecConfig;

        /**
         * <p>The identifier of the tunnel on the data center side.</p>
         * 
         * <strong>example:</strong>
         * <p>47.21.XX.XX</p>
         */
        @NameInMap("Local")
        public String local;

        /**
         * <p>The identifier of the tunnel on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>47.24.XX.XX</p>
         */
        @NameInMap("Remote")
        public String remote;

        /**
         * <p>The tunnel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tun-opsqc4d97wni27****</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig setIkeConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig setIpsecConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfigIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig setLocal(String local) {
            this.local = local;
            return this;
        }
        public String getLocal() {
            return this.local;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig setRemote(String remote) {
            this.remote = remote;
            return this;
        }
        public String getRemote() {
            return this.remote;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig extends TeaModel {
        @NameInMap("TunnelConfig")
        public java.util.List<DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig> tunnelConfig;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig setTunnelConfig(java.util.List<DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig> tunnelConfig) {
            this.tunnelConfig = tunnelConfig;
            return this;
        }
        public java.util.List<DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfigTunnelConfig> getTunnelConfig() {
            return this.tunnelConfig;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig extends TeaModel {
        /**
         * <p>The configurations of Phase 1 negotiations.</p>
         */
        @NameInMap("IkeConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig ikeConfig;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("IpsecConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig ipsecConfig;

        /**
         * <p>The identifier of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>139.196.XX.XX</p>
         */
        @NameInMap("Local")
        public String local;

        /**
         * <p>The CIDR block on the data center side.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("LocalSubnet")
        public String localSubnet;

        /**
         * <p>The identifier of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        @NameInMap("Remote")
        public String remote;

        /**
         * <p>The CIDR block on the virtual private cloud (VPC) side.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("RemoteSubnet")
        public String remoteSubnet;

        /**
         * <p>The tunnel configurations of the peer gateway device.</p>
         * <p>The parameters in <strong>TunnelsConfig</strong> are returned only when the IPsec-VPN connection supports the dual-tunnel mode.</p>
         */
        @NameInMap("TunnelsConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig tunnelsConfig;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setIkeConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setIpsecConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setLocal(String local) {
            this.local = local;
            return this;
        }
        public String getLocal() {
            return this.local;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setRemote(String remote) {
            this.remote = remote;
            return this;
        }
        public String getRemote() {
            return this.remote;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setRemoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }
        public String getRemoteSubnet() {
            return this.remoteSubnet;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setTunnelsConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig tunnelsConfig) {
            this.tunnelsConfig = tunnelsConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigTunnelsConfig getTunnelsConfig() {
            return this.tunnelsConfig;
        }

    }

}
