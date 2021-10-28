// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteElasticGatewayPrivateZoneRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteElasticGatewayPrivateZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticGatewayPrivateZoneRequest self = new DeleteElasticGatewayPrivateZoneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteElasticGatewayPrivateZoneRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteElasticGatewayPrivateZoneRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
