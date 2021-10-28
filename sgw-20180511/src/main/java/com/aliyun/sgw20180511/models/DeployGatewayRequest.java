// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeployGatewayRequest extends TeaModel {
    @NameInMap("GatewayClass")
    public String gatewayClass;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeployGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployGatewayRequest self = new DeployGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeployGatewayRequest setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public DeployGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeployGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
