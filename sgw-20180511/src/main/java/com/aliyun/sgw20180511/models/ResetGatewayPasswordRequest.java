// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ResetGatewayPasswordRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Password")
    public String password;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Username")
    public String username;

    public static ResetGatewayPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetGatewayPasswordRequest self = new ResetGatewayPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetGatewayPasswordRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ResetGatewayPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetGatewayPasswordRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ResetGatewayPasswordRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
