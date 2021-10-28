// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class RemoveSharesFromExpressSyncRequest extends TeaModel {
    @NameInMap("ExpressSyncId")
    public String expressSyncId;

    @NameInMap("GatewayShares")
    public String gatewayShares;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RemoveSharesFromExpressSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSharesFromExpressSyncRequest self = new RemoveSharesFromExpressSyncRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSharesFromExpressSyncRequest setExpressSyncId(String expressSyncId) {
        this.expressSyncId = expressSyncId;
        return this;
    }
    public String getExpressSyncId() {
        return this.expressSyncId;
    }

    public RemoveSharesFromExpressSyncRequest setGatewayShares(String gatewayShares) {
        this.gatewayShares = gatewayShares;
        return this;
    }
    public String getGatewayShares() {
        return this.gatewayShares;
    }

    public RemoveSharesFromExpressSyncRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
