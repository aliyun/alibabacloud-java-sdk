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

}
