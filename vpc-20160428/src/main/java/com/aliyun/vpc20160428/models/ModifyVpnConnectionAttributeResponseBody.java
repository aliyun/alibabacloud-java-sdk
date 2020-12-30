// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeResponseBody extends TeaModel {
    @NameInMap("LocalSubnet")
    public String localSubnet;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("VcoHealthCheck")
    public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("IpsecConfig")
    public ModifyVpnConnectionAttributeResponseBodyIpsecConfig ipsecConfig;

    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    @NameInMap("IkeConfig")
    public ModifyVpnConnectionAttributeResponseBodyIkeConfig ikeConfig;

    @NameInMap("VpnBgpConfig")
    public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig vpnBgpConfig;

    public static ModifyVpnConnectionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnConnectionAttributeResponseBody self = new ModifyVpnConnectionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpnConnectionAttributeResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifyVpnConnectionAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpnConnectionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVpnConnectionAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyVpnConnectionAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyVpnConnectionAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnConnectionAttributeResponseBody setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public ModifyVpnConnectionAttributeResponseBody setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public ModifyVpnConnectionAttributeResponseBody setVcoHealthCheck(ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public ModifyVpnConnectionAttributeResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ModifyVpnConnectionAttributeResponseBody setIpsecConfig(ModifyVpnConnectionAttributeResponseBodyIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public ModifyVpnConnectionAttributeResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public ModifyVpnConnectionAttributeResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyVpnConnectionAttributeResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyVpnConnectionAttributeResponseBody setIkeConfig(ModifyVpnConnectionAttributeResponseBodyIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public ModifyVpnConnectionAttributeResponseBody setVpnBgpConfig(ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public static class ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck extends TeaModel {
        @NameInMap("Dip")
        public String dip;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Retry")
        public Integer retry;

        @NameInMap("Sip")
        public String sip;

        @NameInMap("Enable")
        public String enable;

        public static ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck self = new ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public ModifyVpnConnectionAttributeResponseBodyVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseBodyIpsecConfig extends TeaModel {
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        public static ModifyVpnConnectionAttributeResponseBodyIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyIpsecConfig self = new ModifyVpnConnectionAttributeResponseBodyIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public ModifyVpnConnectionAttributeResponseBodyIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseBodyIkeConfig extends TeaModel {
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

        public static ModifyVpnConnectionAttributeResponseBodyIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyIkeConfig self = new ModifyVpnConnectionAttributeResponseBodyIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyVpnConnectionAttributeResponseBodyIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        @NameInMap("EnableBgp")
        public String enableBgp;

        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        @NameInMap("PeerAsn")
        public Integer peerAsn;

        @NameInMap("LocalAsn")
        public Integer localAsn;

        public static ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig self = new ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setPeerAsn(Integer peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Integer getPeerAsn() {
            return this.peerAsn;
        }

        public ModifyVpnConnectionAttributeResponseBodyVpnBgpConfig setLocalAsn(Integer localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Integer getLocalAsn() {
            return this.localAsn;
        }

    }

}
