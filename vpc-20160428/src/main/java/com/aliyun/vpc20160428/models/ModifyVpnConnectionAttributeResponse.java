// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    public String vpnConnectionId;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("LocalSubnet")
    @Validation(required = true)
    public String localSubnet;

    @NameInMap("RemoteSubnet")
    @Validation(required = true)
    public String remoteSubnet;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("EffectImmediately")
    @Validation(required = true)
    public Boolean effectImmediately;

    @NameInMap("EnableDpd")
    @Validation(required = true)
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    @Validation(required = true)
    public Boolean enableNatTraversal;

    @NameInMap("IkeConfig")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseIkeConfig ikeConfig;

    @NameInMap("IpsecConfig")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseIpsecConfig ipsecConfig;

    @NameInMap("VcoHealthCheck")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseVcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnBgpConfig")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseVpnBgpConfig vpnBgpConfig;

    public static ModifyVpnConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnConnectionAttributeResponse self = new ModifyVpnConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnConnectionAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVpnConnectionAttributeResponse setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public ModifyVpnConnectionAttributeResponse setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyVpnConnectionAttributeResponse setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ModifyVpnConnectionAttributeResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnConnectionAttributeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpnConnectionAttributeResponse setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifyVpnConnectionAttributeResponse setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public ModifyVpnConnectionAttributeResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyVpnConnectionAttributeResponse setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public ModifyVpnConnectionAttributeResponse setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyVpnConnectionAttributeResponse setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyVpnConnectionAttributeResponse setIkeConfig(ModifyVpnConnectionAttributeResponseIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public ModifyVpnConnectionAttributeResponse setIpsecConfig(ModifyVpnConnectionAttributeResponseIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public ModifyVpnConnectionAttributeResponse setVcoHealthCheck(ModifyVpnConnectionAttributeResponseVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public ModifyVpnConnectionAttributeResponse setVpnBgpConfig(ModifyVpnConnectionAttributeResponseVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public static class ModifyVpnConnectionAttributeResponseIkeConfig extends TeaModel {
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

        public static ModifyVpnConnectionAttributeResponseIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseIkeConfig self = new ModifyVpnConnectionAttributeResponseIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyVpnConnectionAttributeResponseIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseIpsecConfig extends TeaModel {
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

        public static ModifyVpnConnectionAttributeResponseIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseIpsecConfig self = new ModifyVpnConnectionAttributeResponseIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyVpnConnectionAttributeResponseIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyVpnConnectionAttributeResponseIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public ModifyVpnConnectionAttributeResponseIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseVcoHealthCheck extends TeaModel {
        @NameInMap("Enable")
        @Validation(required = true)
        public String enable;

        @NameInMap("Sip")
        @Validation(required = true)
        public String sip;

        @NameInMap("Dip")
        @Validation(required = true)
        public String dip;

        @NameInMap("Interval")
        @Validation(required = true)
        public Integer interval;

        @NameInMap("Retry")
        @Validation(required = true)
        public Integer retry;

        public static ModifyVpnConnectionAttributeResponseVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseVcoHealthCheck self = new ModifyVpnConnectionAttributeResponseVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ModifyVpnConnectionAttributeResponseVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public ModifyVpnConnectionAttributeResponseVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public ModifyVpnConnectionAttributeResponseVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyVpnConnectionAttributeResponseVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

    }

    public static class ModifyVpnConnectionAttributeResponseVpnBgpConfig extends TeaModel {
        @NameInMap("EnableBgp")
        @Validation(required = true)
        public String enableBgp;

        @NameInMap("TunnelCidr")
        @Validation(required = true)
        public String tunnelCidr;

        @NameInMap("LocalBgpIp")
        @Validation(required = true)
        public String localBgpIp;

        @NameInMap("PeerBgpIp")
        @Validation(required = true)
        public String peerBgpIp;

        @NameInMap("LocalAsn")
        @Validation(required = true)
        public Integer localAsn;

        @NameInMap("PeerAsn")
        @Validation(required = true)
        public Integer peerAsn;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ModifyVpnConnectionAttributeResponseVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseVpnBgpConfig self = new ModifyVpnConnectionAttributeResponseVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnConnectionAttributeResponseVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public ModifyVpnConnectionAttributeResponseVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public ModifyVpnConnectionAttributeResponseVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyVpnConnectionAttributeResponseVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public ModifyVpnConnectionAttributeResponseVpnBgpConfig setLocalAsn(Integer localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Integer getLocalAsn() {
            return this.localAsn;
        }

        public ModifyVpnConnectionAttributeResponseVpnBgpConfig setPeerAsn(Integer peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Integer getPeerAsn() {
            return this.peerAsn;
        }

        public ModifyVpnConnectionAttributeResponseVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
