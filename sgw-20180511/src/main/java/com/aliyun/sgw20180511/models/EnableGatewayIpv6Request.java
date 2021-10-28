// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class EnableGatewayIpv6Request extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static EnableGatewayIpv6Request build(java.util.Map<String, ?> map) throws Exception {
        EnableGatewayIpv6Request self = new EnableGatewayIpv6Request();
        return TeaModel.build(map, self);
    }

    public EnableGatewayIpv6Request setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public EnableGatewayIpv6Request setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
