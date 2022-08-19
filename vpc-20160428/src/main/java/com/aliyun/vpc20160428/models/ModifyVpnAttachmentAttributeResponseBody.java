// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnAttachmentAttributeResponseBody extends TeaModel {
    @NameInMap("AttachInstanceId")
    public String attachInstanceId;

    @NameInMap("AttachType")
    public String attachType;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    @NameInMap("IkeConfig")
    public ModifyVpnAttachmentAttributeResponseBodyIkeConfig ikeConfig;

    @NameInMap("IpsecConfig")
    public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig ipsecConfig;

    @NameInMap("LocalSubnet")
    public String localSubnet;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Status")
    public String status;

    @NameInMap("VcoHealthCheck")
    public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnBgpConfig")
    public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig vpnBgpConfig;

    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static ModifyVpnAttachmentAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnAttachmentAttributeResponseBody self = new ModifyVpnAttachmentAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpnAttachmentAttributeResponseBody setAttachInstanceId(String attachInstanceId) {
        this.attachInstanceId = attachInstanceId;
        return this;
    }
    public String getAttachInstanceId() {
        return this.attachInstanceId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setAttachType(String attachType) {
        this.attachType = attachType;
        return this;
    }
    public String getAttachType() {
        return this.attachType;
    }

    public ModifyVpnAttachmentAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyVpnAttachmentAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpnAttachmentAttributeResponseBody setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public ModifyVpnAttachmentAttributeResponseBody setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public ModifyVpnAttachmentAttributeResponseBody setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public ModifyVpnAttachmentAttributeResponseBody setIkeConfig(ModifyVpnAttachmentAttributeResponseBodyIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public ModifyVpnAttachmentAttributeResponseBody setIpsecConfig(ModifyVpnAttachmentAttributeResponseBodyIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public ModifyVpnAttachmentAttributeResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifyVpnAttachmentAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnAttachmentAttributeResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ModifyVpnAttachmentAttributeResponseBody setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public ModifyVpnAttachmentAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ModifyVpnAttachmentAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVcoHealthCheck(ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVpnBgpConfig(ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public ModifyVpnAttachmentAttributeResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class ModifyVpnAttachmentAttributeResponseBodyIkeConfig extends TeaModel {
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

        public static ModifyVpnAttachmentAttributeResponseBodyIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyIkeConfig self = new ModifyVpnAttachmentAttributeResponseBodyIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyVpnAttachmentAttributeResponseBodyIpsecConfig extends TeaModel {
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyVpnAttachmentAttributeResponseBodyIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyIpsecConfig self = new ModifyVpnAttachmentAttributeResponseBodyIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyVpnAttachmentAttributeResponseBodyIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck extends TeaModel {
        @NameInMap("Dip")
        public String dip;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Retry")
        public Integer retry;

        @NameInMap("Sip")
        public String sip;

        public static ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck self = new ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

    }

    public static class ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig extends TeaModel {
        @NameInMap("EnableBgp")
        public String enableBgp;

        @NameInMap("LocalAsn")
        public Long localAsn;

        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        @NameInMap("PeerAsn")
        public Long peerAsn;

        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        @NameInMap("Status")
        public String status;

        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig self = new ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setPeerAsn(Long peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyVpnAttachmentAttributeResponseBodyVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

}
