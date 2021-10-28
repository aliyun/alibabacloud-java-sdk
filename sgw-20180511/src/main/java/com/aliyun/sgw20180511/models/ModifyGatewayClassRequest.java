// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayClassRequest extends TeaModel {
    @NameInMap("GatewayClass")
    public String gatewayClass;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyGatewayClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayClassRequest self = new ModifyGatewayClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayClassRequest setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public ModifyGatewayClassRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModifyGatewayClassRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
