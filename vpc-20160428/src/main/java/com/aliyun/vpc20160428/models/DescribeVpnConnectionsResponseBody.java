// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("VpnConnections")
    public DescribeVpnConnectionsResponseBodyVpnConnections vpnConnections;

    public static DescribeVpnConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionsResponseBody self = new DescribeVpnConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnConnectionsResponseBody setVpnConnections(DescribeVpnConnectionsResponseBodyVpnConnections vpnConnections) {
        this.vpnConnections = vpnConnections;
        return this;
    }
    public DescribeVpnConnectionsResponseBodyVpnConnections getVpnConnections() {
        return this.vpnConnections;
    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PeerBgpIp")
        public String peerBgpIp;

        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        @NameInMap("PeerAsn")
        public String peerAsn;

        @NameInMap("LocalAsn")
        public String localAsn;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck extends TeaModel {
        @NameInMap("Status")
        public String status;

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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig extends TeaModel {
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpnBgpConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig;

        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        @NameInMap("EffectImmediately")
        public Boolean effectImmediately;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("VcoHealthCheck")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck;

        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        @NameInMap("IpsecConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig ipsecConfig;

        @NameInMap("IkeConfig")
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig ikeConfig;

        @NameInMap("LocalSubnet")
        public String localSubnet;

        @NameInMap("VpnConnectionId")
        public String vpnConnectionId;

        @NameInMap("RemoteSubnet")
        public String remoteSubnet;

        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        public static DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection self = new DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVpnBgpConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig) {
            this.vpnBgpConfig = vpnBgpConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVpnBgpConfig getVpnBgpConfig() {
            return this.vpnBgpConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setEffectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }
        public Boolean getEffectImmediately() {
            return this.effectImmediately;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVcoHealthCheck(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck) {
            this.vcoHealthCheck = vcoHealthCheck;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionVcoHealthCheck getVcoHealthCheck() {
            return this.vcoHealthCheck;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setIpsecConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setIkeConfig(DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnectionIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setVpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setRemoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }
        public String getRemoteSubnet() {
            return this.remoteSubnet;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

    }

    public static class DescribeVpnConnectionsResponseBodyVpnConnections extends TeaModel {
        @NameInMap("VpnConnection")
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection> vpnConnection;

        public static DescribeVpnConnectionsResponseBodyVpnConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseBodyVpnConnections self = new DescribeVpnConnectionsResponseBodyVpnConnections();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseBodyVpnConnections setVpnConnection(java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection> vpnConnection) {
            this.vpnConnection = vpnConnection;
            return this;
        }
        public java.util.List<DescribeVpnConnectionsResponseBodyVpnConnectionsVpnConnection> getVpnConnection() {
            return this.vpnConnection;
        }

    }

}
