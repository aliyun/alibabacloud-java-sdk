// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DownloadVpnConnectionConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig extends TeaModel {
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig extends TeaModel {
        @NameInMap("RemoteId")
        public String remoteId;

        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        @NameInMap("LocalId")
        public String localId;

        @NameInMap("IkeMode")
        public String ikeMode;

        @NameInMap("IkeVersion")
        public String ikeVersion;

        @NameInMap("IkePfs")
        public String ikePfs;

        @NameInMap("Psk")
        public String psk;

        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

    }

    public static class DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig extends TeaModel {
        @NameInMap("Remote")
        public String remote;

        @NameInMap("Local")
        public String local;

        @NameInMap("RemoteSubnet")
        public String remoteSubnet;

        @NameInMap("IpsecConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig ipsecConfig;

        @NameInMap("IkeConfig")
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig ikeConfig;

        @NameInMap("LocalSubnet")
        public String localSubnet;

        public static DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig self = new DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setRemote(String remote) {
            this.remote = remote;
            return this;
        }
        public String getRemote() {
            return this.remote;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setLocal(String local) {
            this.local = local;
            return this;
        }
        public String getLocal() {
            return this.local;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setRemoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }
        public String getRemoteSubnet() {
            return this.remoteSubnet;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setIpsecConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setIkeConfig(DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfigIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public DownloadVpnConnectionConfigResponseBodyVpnConnectionConfig setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

    }

}
