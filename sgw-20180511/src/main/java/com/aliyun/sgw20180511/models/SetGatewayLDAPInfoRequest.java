// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SetGatewayLDAPInfoRequest extends TeaModel {
    @NameInMap("BaseDN")
    public String baseDN;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("IsTls")
    public Boolean isTls;

    @NameInMap("Password")
    public String password;

    @NameInMap("RootDN")
    public String rootDN;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerIp")
    public String serverIp;

    public static SetGatewayLDAPInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGatewayLDAPInfoRequest self = new SetGatewayLDAPInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetGatewayLDAPInfoRequest setBaseDN(String baseDN) {
        this.baseDN = baseDN;
        return this;
    }
    public String getBaseDN() {
        return this.baseDN;
    }

    public SetGatewayLDAPInfoRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public SetGatewayLDAPInfoRequest setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public SetGatewayLDAPInfoRequest setIsTls(Boolean isTls) {
        this.isTls = isTls;
        return this;
    }
    public Boolean getIsTls() {
        return this.isTls;
    }

    public SetGatewayLDAPInfoRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SetGatewayLDAPInfoRequest setRootDN(String rootDN) {
        this.rootDN = rootDN;
        return this;
    }
    public String getRootDN() {
        return this.rootDN;
    }

    public SetGatewayLDAPInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetGatewayLDAPInfoRequest setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

}
