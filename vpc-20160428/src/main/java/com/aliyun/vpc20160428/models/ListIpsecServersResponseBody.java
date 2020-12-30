// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("IpsecServers")
    public java.util.List<ListIpsecServersResponseBodyIpsecServers> ipsecServers;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListIpsecServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServersResponseBody self = new ListIpsecServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpsecServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListIpsecServersResponseBody setIpsecServers(java.util.List<ListIpsecServersResponseBodyIpsecServers> ipsecServers) {
        this.ipsecServers = ipsecServers;
        return this;
    }
    public java.util.List<ListIpsecServersResponseBodyIpsecServers> getIpsecServers() {
        return this.ipsecServers;
    }

    public ListIpsecServersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpsecServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpsecServersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListIpsecServersResponseBodyIpsecServersIkeConfig extends TeaModel {
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

        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        public static ListIpsecServersResponseBodyIpsecServersIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListIpsecServersResponseBodyIpsecServersIkeConfig self = new ListIpsecServersResponseBodyIpsecServersIkeConfig();
            return TeaModel.build(map, self);
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

    }

    public static class ListIpsecServersResponseBodyIpsecServersIpsecConfig extends TeaModel {
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        public static ListIpsecServersResponseBodyIpsecServersIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ListIpsecServersResponseBodyIpsecServersIpsecConfig self = new ListIpsecServersResponseBodyIpsecServersIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

    }

    public static class ListIpsecServersResponseBodyIpsecServers extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("OnlineClientCount")
        public Integer onlineClientCount;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IDaaSInstanceId")
        public String IDaaSInstanceId;

        @NameInMap("IpsecServerName")
        public String ipsecServerName;

        @NameInMap("EffectImmediately")
        public Boolean effectImmediately;

        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        @NameInMap("IkeConfig")
        public ListIpsecServersResponseBodyIpsecServersIkeConfig ikeConfig;

        @NameInMap("IpsecConfig")
        public ListIpsecServersResponseBodyIpsecServersIpsecConfig ipsecConfig;

        @NameInMap("Psk")
        public String psk;

        @NameInMap("LocalSubnet")
        public String localSubnet;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("PskEnabled")
        public Boolean pskEnabled;

        @NameInMap("IpsecServerId")
        public String ipsecServerId;

        @NameInMap("MultiFactorAuthEnabled")
        public Boolean multiFactorAuthEnabled;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("ClientIpPool")
        public String clientIpPool;

        public static ListIpsecServersResponseBodyIpsecServers build(java.util.Map<String, ?> map) throws Exception {
            ListIpsecServersResponseBodyIpsecServers self = new ListIpsecServersResponseBodyIpsecServers();
            return TeaModel.build(map, self);
        }

        public ListIpsecServersResponseBodyIpsecServers setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListIpsecServersResponseBodyIpsecServers setOnlineClientCount(Integer onlineClientCount) {
            this.onlineClientCount = onlineClientCount;
            return this;
        }
        public Integer getOnlineClientCount() {
            return this.onlineClientCount;
        }

        public ListIpsecServersResponseBodyIpsecServers setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListIpsecServersResponseBodyIpsecServers setIDaaSInstanceId(String IDaaSInstanceId) {
            this.IDaaSInstanceId = IDaaSInstanceId;
            return this;
        }
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
        }

        public ListIpsecServersResponseBodyIpsecServers setIpsecServerName(String ipsecServerName) {
            this.ipsecServerName = ipsecServerName;
            return this;
        }
        public String getIpsecServerName() {
            return this.ipsecServerName;
        }

        public ListIpsecServersResponseBodyIpsecServers setEffectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }
        public Boolean getEffectImmediately() {
            return this.effectImmediately;
        }

        public ListIpsecServersResponseBodyIpsecServers setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public ListIpsecServersResponseBodyIpsecServers setIkeConfig(ListIpsecServersResponseBodyIpsecServersIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public ListIpsecServersResponseBodyIpsecServersIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public ListIpsecServersResponseBodyIpsecServers setIpsecConfig(ListIpsecServersResponseBodyIpsecServersIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public ListIpsecServersResponseBodyIpsecServersIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public ListIpsecServersResponseBodyIpsecServers setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ListIpsecServersResponseBodyIpsecServers setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public ListIpsecServersResponseBodyIpsecServers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpsecServersResponseBodyIpsecServers setPskEnabled(Boolean pskEnabled) {
            this.pskEnabled = pskEnabled;
            return this;
        }
        public Boolean getPskEnabled() {
            return this.pskEnabled;
        }

        public ListIpsecServersResponseBodyIpsecServers setIpsecServerId(String ipsecServerId) {
            this.ipsecServerId = ipsecServerId;
            return this;
        }
        public String getIpsecServerId() {
            return this.ipsecServerId;
        }

        public ListIpsecServersResponseBodyIpsecServers setMultiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
            this.multiFactorAuthEnabled = multiFactorAuthEnabled;
            return this;
        }
        public Boolean getMultiFactorAuthEnabled() {
            return this.multiFactorAuthEnabled;
        }

        public ListIpsecServersResponseBodyIpsecServers setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public ListIpsecServersResponseBodyIpsecServers setClientIpPool(String clientIpPool) {
            this.clientIpPool = clientIpPool;
            return this;
        }
        public String getClientIpPool() {
            return this.clientIpPool;
        }

    }

}
