// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewaySMBUserRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Password")
    public String password;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Username")
    public String username;

    public static CreateGatewaySMBUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewaySMBUserRequest self = new CreateGatewaySMBUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewaySMBUserRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewaySMBUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateGatewaySMBUserRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateGatewaySMBUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
