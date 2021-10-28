// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class EnableGatewayLoggingRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static EnableGatewayLoggingRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableGatewayLoggingRequest self = new EnableGatewayLoggingRequest();
        return TeaModel.build(map, self);
    }

    public EnableGatewayLoggingRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public EnableGatewayLoggingRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
