// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnServersResponse extends TeaModel {
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

    @NameInMap("SslVpnServers")
    @Validation(required = true)
    public DescribeSslVpnServersResponseSslVpnServers sslVpnServers;

    public static DescribeSslVpnServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnServersResponse self = new DescribeSslVpnServersResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSslVpnServersResponseSslVpnServersSslVpnServer extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("SslVpnServerId")
        @Validation(required = true)
        public String sslVpnServerId;

        @NameInMap("VpnGatewayId")
        @Validation(required = true)
        public String vpnGatewayId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("LocalSubnet")
        @Validation(required = true)
        public String localSubnet;

        @NameInMap("ClientIpPool")
        @Validation(required = true)
        public String clientIpPool;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Cipher")
        @Validation(required = true)
        public String cipher;

        @NameInMap("Proto")
        @Validation(required = true)
        public String proto;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Compress")
        @Validation(required = true)
        public Boolean compress;

        @NameInMap("Connections")
        @Validation(required = true)
        public Integer connections;

        @NameInMap("MaxConnections")
        @Validation(required = true)
        public Integer maxConnections;

        @NameInMap("InternetIp")
        @Validation(required = true)
        public String internetIp;

        @NameInMap("EnableMultiFactorAuth")
        @Validation(required = true)
        public Boolean enableMultiFactorAuth;

        @NameInMap("IDaaSInstanceId")
        @Validation(required = true)
        public String IDaaSInstanceId;

        public static DescribeSslVpnServersResponseSslVpnServersSslVpnServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnServersResponseSslVpnServersSslVpnServer self = new DescribeSslVpnServersResponseSslVpnServersSslVpnServer();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSslVpnServersResponseSslVpnServers extends TeaModel {
        @NameInMap("SslVpnServer")
        @Validation(required = true)
        public java.util.List<DescribeSslVpnServersResponseSslVpnServersSslVpnServer> sslVpnServer;

        public static DescribeSslVpnServersResponseSslVpnServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnServersResponseSslVpnServers self = new DescribeSslVpnServersResponseSslVpnServers();
            return TeaModel.build(map, self);
        }

    }

}
