// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DownloadVpnConnectionConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration of the IPsec-VPN connection.</p>
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
         * <p>The IKE authentication algorithm. Valid values: **sha1** and **MD5**.</p>
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
         * <p>The IKE mode. Valid values: **main** and **aggressive**. The **main** mode offers higher security. If NAT traversal is enabled, we recommend that you use the **aggressive** mode.</p>
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
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The local ID. The default value is the IP address of the VPN gateway. You can specify the value as an IP address or in the FQDN format.</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The pre-shared key.</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>The peer ID. The default value is the IP address of the customer gateway. You can specify the value as an IP address or in the fully qualified domain name (FQDN) format.</p>
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
         * <p>The IPsec authentication algorithm. Valid values: **sha1** and **md5**.</p>
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

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig extends TeaModel {
        /**
         * <p>The IKE configuration.</p>
         */
        @NameInMap("IkeConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig ikeConfig;

        /**
         * <p>The configuration of the IPsec-VPN connection.</p>
         */
        @NameInMap("IpsecConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig ipsecConfig;

        /**
         * <p>The identifier of the VPN gateway.</p>
         */
        @NameInMap("Local")
        public String local;

        /**
         * <p>The CIDR block on the virtual private cloud (VPC) side.</p>
         */
        @NameInMap("LocalSubnet")
        public String localSubnet;

        /**
         * <p>The identifier of the customer gateway.</p>
         */
        @NameInMap("Remote")
        public String remote;

        /**
         * <p>The CIDR block on the data center side.</p>
         */
        @NameInMap("RemoteSubnet")
        public String remoteSubnet;

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

    }

}
