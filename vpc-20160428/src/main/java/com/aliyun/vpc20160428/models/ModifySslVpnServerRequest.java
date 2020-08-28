// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnServerRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SslVpnServerId")
    @Validation(required = true)
    public String sslVpnServerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClientIpPool")
    public String clientIpPool;

    @NameInMap("LocalSubnet")
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

    public static ModifySslVpnServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnServerRequest self = new ModifySslVpnServerRequest();
        return TeaModel.build(map, self);
    }

}
