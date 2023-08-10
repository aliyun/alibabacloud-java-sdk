// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyTunnelAttributeResponseBody extends TeaModel {
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    @NameInMap("InternetIp")
    public String internetIp;

    @NameInMap("RemoteCaCertificate")
    public String remoteCaCertificate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Role")
    public String role;

    @NameInMap("State")
    public String state;

    @NameInMap("TunnelBgpConfig")
    public ModifyTunnelAttributeResponseBodyTunnelBgpConfig tunnelBgpConfig;

    @NameInMap("TunnelId")
    public String tunnelId;

    @NameInMap("TunnelIkeConfig")
    public ModifyTunnelAttributeResponseBodyTunnelIkeConfig tunnelIkeConfig;

    @NameInMap("TunnelIpsecConfig")
    public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig tunnelIpsecConfig;

    @NameInMap("ZoneNo")
    public String zoneNo;

    public static ModifyTunnelAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTunnelAttributeResponseBody self = new ModifyTunnelAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTunnelAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyTunnelAttributeResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyTunnelAttributeResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyTunnelAttributeResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifyTunnelAttributeResponseBody setRemoteCaCertificate(String remoteCaCertificate) {
        this.remoteCaCertificate = remoteCaCertificate;
        return this;
    }
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    public ModifyTunnelAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTunnelAttributeResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ModifyTunnelAttributeResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ModifyTunnelAttributeResponseBody setTunnelBgpConfig(ModifyTunnelAttributeResponseBodyTunnelBgpConfig tunnelBgpConfig) {
        this.tunnelBgpConfig = tunnelBgpConfig;
        return this;
    }
    public ModifyTunnelAttributeResponseBodyTunnelBgpConfig getTunnelBgpConfig() {
        return this.tunnelBgpConfig;
    }

    public ModifyTunnelAttributeResponseBody setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public ModifyTunnelAttributeResponseBody setTunnelIkeConfig(ModifyTunnelAttributeResponseBodyTunnelIkeConfig tunnelIkeConfig) {
        this.tunnelIkeConfig = tunnelIkeConfig;
        return this;
    }
    public ModifyTunnelAttributeResponseBodyTunnelIkeConfig getTunnelIkeConfig() {
        return this.tunnelIkeConfig;
    }

    public ModifyTunnelAttributeResponseBody setTunnelIpsecConfig(ModifyTunnelAttributeResponseBodyTunnelIpsecConfig tunnelIpsecConfig) {
        this.tunnelIpsecConfig = tunnelIpsecConfig;
        return this;
    }
    public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig getTunnelIpsecConfig() {
        return this.tunnelIpsecConfig;
    }

    public ModifyTunnelAttributeResponseBody setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo;
        return this;
    }
    public String getZoneNo() {
        return this.zoneNo;
    }

    public static class ModifyTunnelAttributeResponseBodyTunnelBgpConfig extends TeaModel {
        @NameInMap("EnableBgp")
        public Boolean enableBgp;

        @NameInMap("LocalAsn")
        public Long localAsn;

        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        @NameInMap("PeerAsn")
        public Long peerAsn;

        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static ModifyTunnelAttributeResponseBodyTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeResponseBodyTunnelBgpConfig self = new ModifyTunnelAttributeResponseBodyTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setEnableBgp(Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Boolean getEnableBgp() {
            return this.enableBgp;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setPeerAsn(Long peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public ModifyTunnelAttributeResponseBodyTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class ModifyTunnelAttributeResponseBodyTunnelIkeConfig extends TeaModel {
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

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

        public static ModifyTunnelAttributeResponseBodyTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeResponseBodyTunnelIkeConfig self = new ModifyTunnelAttributeResponseBodyTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyTunnelAttributeResponseBodyTunnelIpsecConfig extends TeaModel {
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyTunnelAttributeResponseBodyTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeResponseBodyTunnelIpsecConfig self = new ModifyTunnelAttributeResponseBodyTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyTunnelAttributeResponseBodyTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

}
