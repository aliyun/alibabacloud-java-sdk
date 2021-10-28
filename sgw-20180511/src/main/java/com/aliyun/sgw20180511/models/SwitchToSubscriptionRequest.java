// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SwitchToSubscriptionRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SwitchToSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchToSubscriptionRequest self = new SwitchToSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public SwitchToSubscriptionRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public SwitchToSubscriptionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
