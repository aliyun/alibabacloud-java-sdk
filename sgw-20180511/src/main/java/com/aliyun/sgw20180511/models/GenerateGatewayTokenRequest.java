// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class GenerateGatewayTokenRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static GenerateGatewayTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateGatewayTokenRequest self = new GenerateGatewayTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateGatewayTokenRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GenerateGatewayTokenRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
