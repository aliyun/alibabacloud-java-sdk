// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClientIpPool")
    @Validation(required = true)
    public String clientIpPool;

    @NameInMap("LocalSubnet")
    @Validation(required = true)
    public String localSubnet;

    @NameInMap("Proto")
    public String proto;

    @NameInMap("Cipher")
    public String cipher;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Compress")
    public Boolean compress;

    @NameInMap("EnableMultiFactorAuth")
    public Boolean enableMultiFactorAuth;

    @NameInMap("IDaaSInstanceId")
    public String IDaaSInstanceId;

    public static CreateSslVpnServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnServerRequest self = new CreateSslVpnServerRequest();
        return TeaModel.build(map, self);
    }

}
