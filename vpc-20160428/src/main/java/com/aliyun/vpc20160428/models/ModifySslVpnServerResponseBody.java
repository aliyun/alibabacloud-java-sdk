// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnServerResponseBody extends TeaModel {
    /**
     * <p>The encryption algorithm.</p>
     */
    @NameInMap("Cipher")
    public String cipher;

    /**
     * <p>The client IP address pool.</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>Indicates whether data compression is enabled.</p>
     */
    @NameInMap("Compress")
    public Boolean compress;

    /**
     * <p>The total number of current connections.</p>
     */
    @NameInMap("Connections")
    public Integer connections;

    /**
     * <p>The time when the SSL server was created.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether two-factor authentication is enabled.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("EnableMultiFactorAuth")
    public Boolean enableMultiFactorAuth;

    /**
     * <p>The ID of the IDaaS instance.</p>
     */
    @NameInMap("IDaaSInstanceId")
    public String IDaaSInstanceId;

    /**
     * <p>The public IP address.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The CIDR block of the client.</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The maximum number of connections.</p>
     */
    @NameInMap("MaxConnections")
    public Integer maxConnections;

    /**
     * <p>The name of the SSL server.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port that is used by the SSL server.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The protocol that is used by the SSL server.</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The ID of the region where the SSL server is created.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the SSL server.</p>
     */
    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static ModifySslVpnServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnServerResponseBody self = new ModifySslVpnServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySslVpnServerResponseBody setCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }
    public String getCipher() {
        return this.cipher;
    }

    public ModifySslVpnServerResponseBody setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public ModifySslVpnServerResponseBody setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public ModifySslVpnServerResponseBody setConnections(Integer connections) {
        this.connections = connections;
        return this;
    }
    public Integer getConnections() {
        return this.connections;
    }

    public ModifySslVpnServerResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifySslVpnServerResponseBody setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
        this.enableMultiFactorAuth = enableMultiFactorAuth;
        return this;
    }
    public Boolean getEnableMultiFactorAuth() {
        return this.enableMultiFactorAuth;
    }

    public ModifySslVpnServerResponseBody setIDaaSInstanceId(String IDaaSInstanceId) {
        this.IDaaSInstanceId = IDaaSInstanceId;
        return this;
    }
    public String getIDaaSInstanceId() {
        return this.IDaaSInstanceId;
    }

    public ModifySslVpnServerResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifySslVpnServerResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifySslVpnServerResponseBody setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public ModifySslVpnServerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySslVpnServerResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifySslVpnServerResponseBody setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public ModifySslVpnServerResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySslVpnServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySslVpnServerResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifySslVpnServerResponseBody setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public ModifySslVpnServerResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
