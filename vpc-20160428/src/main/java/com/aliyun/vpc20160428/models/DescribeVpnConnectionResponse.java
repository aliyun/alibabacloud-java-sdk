// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionResponse extends TeaModel {
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

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("EnableDpd")
    @Validation(required = true)
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    @Validation(required = true)
    public Boolean enableNatTraversal;

    @NameInMap("IkeConfig")
    @Validation(required = true)
    public DescribeVpnConnectionResponseIkeConfig ikeConfig;

    @NameInMap("IpsecConfig")
    @Validation(required = true)
    public DescribeVpnConnectionResponseIpsecConfig ipsecConfig;

    @NameInMap("VcoHealthCheck")
    @Validation(required = true)
    public DescribeVpnConnectionResponseVcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnBgpConfig")
    @Validation(required = true)
    public DescribeVpnConnectionResponseVpnBgpConfig vpnBgpConfig;

    public static DescribeVpnConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionResponse self = new DescribeVpnConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnConnectionResponse setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public DescribeVpnConnectionResponse setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public DescribeVpnConnectionResponse setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DescribeVpnConnectionResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpnConnectionResponse setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public DescribeVpnConnectionResponse setRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    public DescribeVpnConnectionResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeVpnConnectionResponse setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public DescribeVpnConnectionResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpnConnectionResponse setEnableDpd(Boolean enableDpd) {
        this.enableDpd = enableDpd;
        return this;
    }
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    public DescribeVpnConnectionResponse setEnableNatTraversal(Boolean enableNatTraversal) {
        this.enableNatTraversal = enableNatTraversal;
        return this;
    }
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    public DescribeVpnConnectionResponse setIkeConfig(DescribeVpnConnectionResponseIkeConfig ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public DescribeVpnConnectionResponseIkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    public DescribeVpnConnectionResponse setIpsecConfig(DescribeVpnConnectionResponseIpsecConfig ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public DescribeVpnConnectionResponseIpsecConfig getIpsecConfig() {
        return this.ipsecConfig;
    }

    public DescribeVpnConnectionResponse setVcoHealthCheck(DescribeVpnConnectionResponseVcoHealthCheck vcoHealthCheck) {
        this.vcoHealthCheck = vcoHealthCheck;
        return this;
    }
    public DescribeVpnConnectionResponseVcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    public DescribeVpnConnectionResponse setVpnBgpConfig(DescribeVpnConnectionResponseVpnBgpConfig vpnBgpConfig) {
        this.vpnBgpConfig = vpnBgpConfig;
        return this;
    }
    public DescribeVpnConnectionResponseVpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    public static class DescribeVpnConnectionResponseIkeConfig extends TeaModel {
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

        public static DescribeVpnConnectionResponseIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseIkeConfig self = new DescribeVpnConnectionResponseIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionResponseIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionResponseIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionResponseIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionResponseIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DescribeVpnConnectionResponseIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionResponseIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionResponseIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionResponseIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DescribeVpnConnectionResponseIpsecConfig extends TeaModel {
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

        public static DescribeVpnConnectionResponseIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseIpsecConfig self = new DescribeVpnConnectionResponseIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionResponseIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DescribeVpnConnectionResponseIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public DescribeVpnConnectionResponseIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

    }

    public static class DescribeVpnConnectionResponseVcoHealthCheck extends TeaModel {
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

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeVpnConnectionResponseVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseVcoHealthCheck self = new DescribeVpnConnectionResponseVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeVpnConnectionResponseVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeVpnConnectionResponseVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeVpnConnectionResponseVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeVpnConnectionResponseVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public DescribeVpnConnectionResponseVcoHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnConnectionResponseVpnBgpConfig extends TeaModel {
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
        public String localAsn;

        @NameInMap("PeerAsn")
        @Validation(required = true)
        public String peerAsn;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeVpnConnectionResponseVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseVpnBgpConfig self = new DescribeVpnConnectionResponseVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionResponseVpnBgpConfig setEnableBgp(String enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public String getEnableBgp() {
            return this.enableBgp;
        }

        public DescribeVpnConnectionResponseVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public DescribeVpnConnectionResponseVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionResponseVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionResponseVpnBgpConfig setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeVpnConnectionResponseVpnBgpConfig setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionResponseVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
