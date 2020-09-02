// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    public static ModifySslVpnServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnServerResponse self = new ModifySslVpnServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifySslVpnServerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySslVpnServerResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySslVpnServerResponse setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public ModifySslVpnServerResponse setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ModifySslVpnServerResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySslVpnServerResponse setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifySslVpnServerResponse setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public ModifySslVpnServerResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifySslVpnServerResponse setCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }
    public String getCipher() {
        return this.cipher;
    }

    public ModifySslVpnServerResponse setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public ModifySslVpnServerResponse setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifySslVpnServerResponse setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public ModifySslVpnServerResponse setConnections(Integer connections) {
        this.connections = connections;
        return this;
    }
    public Integer getConnections() {
        return this.connections;
    }

    public ModifySslVpnServerResponse setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public ModifySslVpnServerResponse setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifySslVpnServerResponse setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
        this.enableMultiFactorAuth = enableMultiFactorAuth;
        return this;
    }
    public Boolean getEnableMultiFactorAuth() {
        return this.enableMultiFactorAuth;
    }

    public ModifySslVpnServerResponse setIDaaSInstanceId(String IDaaSInstanceId) {
        this.IDaaSInstanceId = IDaaSInstanceId;
        return this;
    }
    public String getIDaaSInstanceId() {
        return this.IDaaSInstanceId;
    }

}
