// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class HandleGatewayAutoPlanRequest extends TeaModel {
    @NameInMap("Cancel")
    public Boolean cancel;

    @NameInMap("DelayHours")
    public Integer delayHours;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static HandleGatewayAutoPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleGatewayAutoPlanRequest self = new HandleGatewayAutoPlanRequest();
        return TeaModel.build(map, self);
    }

    public HandleGatewayAutoPlanRequest setCancel(Boolean cancel) {
        this.cancel = cancel;
        return this;
    }
    public Boolean getCancel() {
        return this.cancel;
    }

    public HandleGatewayAutoPlanRequest setDelayHours(Integer delayHours) {
        this.delayHours = delayHours;
        return this;
    }
    public Integer getDelayHours() {
        return this.delayHours;
    }

    public HandleGatewayAutoPlanRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public HandleGatewayAutoPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public HandleGatewayAutoPlanRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
