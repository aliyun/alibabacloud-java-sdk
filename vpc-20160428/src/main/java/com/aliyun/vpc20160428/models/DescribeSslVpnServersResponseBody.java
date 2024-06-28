// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnServersResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D350187B-EA41-4577-950B-95434C8302E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed information about the SSL-VPN server.</p>
     */
    @NameInMap("SslVpnServers")
    public DescribeSslVpnServersResponseBodySslVpnServers sslVpnServers;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSslVpnServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnServersResponseBody self = new DescribeSslVpnServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnServersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeSslVpnServersResponseBody setSslVpnServers(DescribeSslVpnServersResponseBodySslVpnServers sslVpnServers) {
        this.sslVpnServers = sslVpnServers;
        return this;
    }
    public DescribeSslVpnServersResponseBodySslVpnServers getSslVpnServers() {
        return this.sslVpnServers;
    }

    public DescribeSslVpnServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer extends TeaModel {
        /**
         * <p>The encryption algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>AES-128-CBC</p>
         */
        @NameInMap("Cipher")
        public String cipher;

        /**
         * <p>The client CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.1.0/24</p>
         */
        @NameInMap("ClientIpPool")
        public String clientIpPool;

        /**
         * <p>Indicates whether data compression is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Compress")
        public Boolean compress;

        /**
         * <p>The total number of current connections.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Connections")
        public Integer connections;

        /**
         * <p>The timestamp generated when the SSL-VPN server was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1613800884000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether two-factor authentication is enabled.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableMultiFactorAuth")
        public Boolean enableMultiFactorAuth;

        /**
         * <strong>example:</strong>
         * <p>app_my6g4qmvnwxzj2f****</p>
         */
        @NameInMap("IDaaSApplicationId")
        public String IDaaSApplicationId;

        /**
         * <p>The ID of the IDaaS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-cn-hangzhou-****</p>
         */
        @NameInMap("IDaaSInstanceId")
        public String IDaaSInstanceId;

        /**
         * <strong>example:</strong>
         * <p>EIAM 2.0</p>
         */
        @NameInMap("IDaaSInstanceVersion")
        public String IDaaSInstanceVersion;

        /**
         * <p>The region ID of the IDaaS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("IDaaSRegionId")
        public String IDaaSRegionId;

        /**
         * <p>The public IP address of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>47.5.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The local CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("LocalSubnet")
        public String localSubnet;

        /**
         * <p>The maximum number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The name of the SSL-VPN server.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port that is used by the SSL-VPN server.</p>
         * 
         * <strong>example:</strong>
         * <p>1194</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol that is used by the SSL-VPN server.</p>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The region ID of the SSL-VPN server.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID of the SSL-VPN server.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the SSL-VPN server.</p>
         * 
         * <strong>example:</strong>
         * <p>vss-bp15j3du13gq1dgey****</p>
         */
        @NameInMap("SslVpnServerId")
        public String sslVpnServerId;

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1on0xae9d771ggi****</p>
         */
        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        public static DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer self = new DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setCipher(String cipher) {
            this.cipher = cipher;
            return this;
        }
        public String getCipher() {
            return this.cipher;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setClientIpPool(String clientIpPool) {
            this.clientIpPool = clientIpPool;
            return this;
        }
        public String getClientIpPool() {
            return this.clientIpPool;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setCompress(Boolean compress) {
            this.compress = compress;
            return this;
        }
        public Boolean getCompress() {
            return this.compress;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setConnections(Integer connections) {
            this.connections = connections;
            return this;
        }
        public Integer getConnections() {
            return this.connections;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
            this.enableMultiFactorAuth = enableMultiFactorAuth;
            return this;
        }
        public Boolean getEnableMultiFactorAuth() {
            return this.enableMultiFactorAuth;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setIDaaSApplicationId(String IDaaSApplicationId) {
            this.IDaaSApplicationId = IDaaSApplicationId;
            return this;
        }
        public String getIDaaSApplicationId() {
            return this.IDaaSApplicationId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setIDaaSInstanceId(String IDaaSInstanceId) {
            this.IDaaSInstanceId = IDaaSInstanceId;
            return this;
        }
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setIDaaSInstanceVersion(String IDaaSInstanceVersion) {
            this.IDaaSInstanceVersion = IDaaSInstanceVersion;
            return this;
        }
        public String getIDaaSInstanceVersion() {
            return this.IDaaSInstanceVersion;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setIDaaSRegionId(String IDaaSRegionId) {
            this.IDaaSRegionId = IDaaSRegionId;
            return this;
        }
        public String getIDaaSRegionId() {
            return this.IDaaSRegionId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
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

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setSslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        public DescribeSslVpnServersResponseBodySslVpnServersSslVpnServer setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
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
