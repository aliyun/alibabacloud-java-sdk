// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnServerResponseBody extends TeaModel {
    @NameInMap("Compress")
    public Boolean compress;

    @NameInMap("LocalSubnet")
    public String localSubnet;

    @NameInMap("Connections")
    public Integer connections;

    @NameInMap("ClientIpPool")
    public String clientIpPool;

    @NameInMap("IDaaSInstanceId")
    public String IDaaSInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxConnections")
    public Integer maxConnections;

    @NameInMap("EnableMultiFactorAuth")
    public Boolean enableMultiFactorAuth;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("InternetIp")
    public String internetIp;

    @NameInMap("Proto")
    public String proto;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Cipher")
    public String cipher;

    public static ModifySslVpnServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnServerResponseBody self = new ModifySslVpnServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySslVpnServerResponseBody setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public ModifySslVpnServerResponseBody setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifySslVpnServerResponseBody setConnections(Integer connections) {
        this.connections = connections;
        return this;
    }
    public Integer getConnections() {
        return this.connections;
    }

    public ModifySslVpnServerResponseBody setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public ModifySslVpnServerResponseBody setIDaaSInstanceId(String IDaaSInstanceId) {
        this.IDaaSInstanceId = IDaaSInstanceId;
        return this;
    }
    public String getIDaaSInstanceId() {
        return this.IDaaSInstanceId;
    }

    public ModifySslVpnServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySslVpnServerResponseBody setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public ModifySslVpnServerResponseBody setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
        this.enableMultiFactorAuth = enableMultiFactorAuth;
        return this;
    }
    public Boolean getEnableMultiFactorAuth() {
        return this.enableMultiFactorAuth;
    }

    public ModifySslVpnServerResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifySslVpnServerResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifySslVpnServerResponseBody setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public ModifySslVpnServerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySslVpnServerResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifySslVpnServerResponseBody setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public ModifySslVpnServerResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ModifySslVpnServerResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySslVpnServerResponseBody setCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }
    public String getCipher() {
        return this.cipher;
    }

}
