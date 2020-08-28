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

    }

}
