// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DownloadVpnConnectionConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnConnectionConfig")
    @Validation(required = true)
    public DownloadVpnConnectionConfigResponseVpnConnectionConfig vpnConnectionConfig;

    public static DownloadVpnConnectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadVpnConnectionConfigResponse self = new DownloadVpnConnectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DownloadVpnConnectionConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadVpnConnectionConfigResponse setVpnConnectionConfig(DownloadVpnConnectionConfigResponseVpnConnectionConfig vpnConnectionConfig) {
        this.vpnConnectionConfig = vpnConnectionConfig;
        return this;
    }
    public DownloadVpnConnectionConfigResponseVpnConnectionConfig getVpnConnectionConfig() {
        return this.vpnConnectionConfig;
    }

    public static class DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig extends TeaModel {
        @NameInMap("Psk")
        @Validation(required = true)
        public String psk;

        @NameInMap("IkeVersion")
        @Validation(required = true)
        public String ikeVersion;

        @NameInMap("IkeMode")
        @Validation(required = true)
        public String ikeMode;

        @NameInMap("IkeEncAlg")
        @Validation(required = true)
        public String ikeEncAlg;

        @NameInMap("IkeAuthAlg")
        @Validation(required = true)
        public String ikeAuthAlg;

        @NameInMap("IkePfs")
        @Validation(required = true)
        public String ikePfs;

        @NameInMap("IkeLifetime")
        @Validation(required = true)
        public Long ikeLifetime;

        @NameInMap("LocalId")
        @Validation(required = true)
        public String localId;

        @NameInMap("RemoteId")
        @Validation(required = true)
        public String remoteId;

        public static DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig self = new DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig extends TeaModel {
        @NameInMap("IpsecEncAlg")
        @Validation(required = true)
        public String ipsecEncAlg;

        @NameInMap("IpsecAuthAlg")
        @Validation(required = true)
        public String ipsecAuthAlg;

        @NameInMap("IpsecPfs")
        @Validation(required = true)
        public String ipsecPfs;

        @NameInMap("IpsecLifetime")
        @Validation(required = true)
        public Long ipsecLifetime;

        public static DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig self = new DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

    }

    public static class DownloadVpnConnectionConfigResponseVpnConnectionConfig extends TeaModel {
        @NameInMap("LocalSubnet")
        @Validation(required = true)
        public String localSubnet;

        @NameInMap("RemoteSubnet")
        @Validation(required = true)
        public String remoteSubnet;

        @NameInMap("Local")
        @Validation(required = true)
        public String local;

        @NameInMap("Remote")
        @Validation(required = true)
        public String remote;

        @NameInMap("IkeConfig")
        @Validation(required = true)
        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig ikeConfig;

        @NameInMap("IpsecConfig")
        @Validation(required = true)
        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig ipsecConfig;

        public static DownloadVpnConnectionConfigResponseVpnConnectionConfig build(java.util.Map<String, ?> map) throws Exception {
            DownloadVpnConnectionConfigResponseVpnConnectionConfig self = new DownloadVpnConnectionConfigResponseVpnConnectionConfig();
            return TeaModel.build(map, self);
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfig setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfig setRemoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }
        public String getRemoteSubnet() {
            return this.remoteSubnet;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfig setLocal(String local) {
            this.local = local;
            return this;
        }
        public String getLocal() {
            return this.local;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfig setRemote(String remote) {
            this.remote = remote;
            return this;
        }
        public String getRemote() {
            return this.remote;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfig setIkeConfig(DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public DownloadVpnConnectionConfigResponseVpnConnectionConfig setIpsecConfig(DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public DownloadVpnConnectionConfigResponseVpnConnectionConfigIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

    }

}
