// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("VpnConnections")
    @Validation(required = true)
    public DescribeVpnConnectionsResponseVpnConnections vpnConnections;

    public static DescribeVpnConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionsResponse self = new DescribeVpnConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnConnectionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnConnectionsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnConnectionsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnConnectionsResponse setVpnConnections(DescribeVpnConnectionsResponseVpnConnections vpnConnections) {
        this.vpnConnections = vpnConnections;
        return this;
    }
    public DescribeVpnConnectionsResponseVpnConnections getVpnConnections() {
        return this.vpnConnections;
    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck setRetry(Integer retry) {
            this.retry = retry;
            return this;
        }
        public Integer getRetry() {
            return this.retry;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig setPeerBgpIp(String peerBgpIp) {
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnection extends TeaModel {
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
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig ikeConfig;

        @NameInMap("IpsecConfig")
        @Validation(required = true)
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig ipsecConfig;

        @NameInMap("VcoHealthCheck")
        @Validation(required = true)
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck;

        @NameInMap("VpnBgpConfig")
        @Validation(required = true)
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig;

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnection self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnection();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setVpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setRemoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }
        public String getRemoteSubnet() {
            return this.remoteSubnet;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setEffectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }
        public Boolean getEffectImmediately() {
            return this.effectImmediately;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setIkeConfig(DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setIpsecConfig(DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setVcoHealthCheck(DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck) {
            this.vcoHealthCheck = vcoHealthCheck;
            return this;
        }
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck getVcoHealthCheck() {
            return this.vcoHealthCheck;
        }

        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnection setVpnBgpConfig(DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig) {
            this.vpnBgpConfig = vpnBgpConfig;
            return this;
        }
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig getVpnBgpConfig() {
            return this.vpnBgpConfig;
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnections extends TeaModel {
        @NameInMap("VpnConnection")
        @Validation(required = true)
        public java.util.List<DescribeVpnConnectionsResponseVpnConnectionsVpnConnection> vpnConnection;

        public static DescribeVpnConnectionsResponseVpnConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnections self = new DescribeVpnConnectionsResponseVpnConnections();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionsResponseVpnConnections setVpnConnection(java.util.List<DescribeVpnConnectionsResponseVpnConnectionsVpnConnection> vpnConnection) {
            this.vpnConnection = vpnConnection;
            return this;
        }
        public java.util.List<DescribeVpnConnectionsResponseVpnConnectionsVpnConnection> getVpnConnection() {
            return this.vpnConnection;
        }

    }

}
