// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SetGatewayADInfoRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("Password")
    public String password;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("Username")
    public String username;

    public static SetGatewayADInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGatewayADInfoRequest self = new SetGatewayADInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetGatewayADInfoRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public SetGatewayADInfoRequest setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public SetGatewayADInfoRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SetGatewayADInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetGatewayADInfoRequest setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public SetGatewayADInfoRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
