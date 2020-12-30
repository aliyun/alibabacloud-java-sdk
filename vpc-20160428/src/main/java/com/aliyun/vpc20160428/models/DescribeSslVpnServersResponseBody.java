// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnServersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SslVpnServers")
    public DescribeSslVpnServersResponseBodySslVpnServers sslVpnServers;

    public static DescribeSslVpnServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnServersResponseBody self = new DescribeSslVpnServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSslVpnServersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSslVpnServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSslVpnServersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSslVpnServersResponseBody setSslVpnServers(DescribeSslVpnServersResponseBodySslVpnServers sslVpnServers) {
        this.sslVpnServers = sslVpnServers;
        return this;
    }
    public DescribeSslVpnServersResponseBodySslVpnServers getSslVpnServers() {
        return this.sslVpnServers;
    }

    public static class DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer extends TeaModel {
        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IDaaSInstanceId")
        public String IDaaSInstanceId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        @NameInMap("Compress")
        public Boolean compress;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("LocalSubnet")
        public String localSubnet;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Cipher")
        public String cipher;

        @NameInMap("Connections")
        public Integer connections;

        @NameInMap("SslVpnServerId")
        public String sslVpnServerId;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnableMultiFactorAuth")
        public Boolean enableMultiFactorAuth;

        @NameInMap("ClientIpPool")
        public String clientIpPool;

        @NameInMap("Proto")
        public String proto;

        public static DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer self = new DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setIDaaSInstanceId(String IDaaSInstanceId) {
            this.IDaaSInstanceId = IDaaSInstanceId;
            return this;
        }
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setCompress(Boolean compress) {
            this.compress = compress;
            return this;
        }
        public Boolean getCompress() {
            return this.compress;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setCipher(String cipher) {
            this.cipher = cipher;
            return this;
        }
        public String getCipher() {
            return this.cipher;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setConnections(Integer connections) {
            this.connections = connections;
            return this;
        }
        public Integer getConnections() {
            return this.connections;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setSslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
            this.enableMultiFactorAuth = enableMultiFactorAuth;
            return this;
        }
        public Boolean getEnableMultiFactorAuth() {
            return this.enableMultiFactorAuth;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setClientIpPool(String clientIpPool) {
            this.clientIpPool = clientIpPool;
            return this;
        }
        public String getClientIpPool() {
            return this.clientIpPool;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

    }

    public static class DescribeSslVpnServersResponseBodySslVpnServers extends TeaModel {
        @NameInMap("SslVpnServer")
        public java.util.List<DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer> sslVpnServer;

        public static DescribeSslVpnServersResponseBodySslVpnServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnServersResponseBodySslVpnServers self = new DescribeSslVpnServersResponseBodySslVpnServers();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnServersResponseBodySslVpnServers setSslVpnServer(java.util.List<DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer> sslVpnServer) {
            this.sslVpnServer = sslVpnServer;
            return this;
        }
        public java.util.List<DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer> getSslVpnServer() {
            return this.sslVpnServer;
        }

    }

}
