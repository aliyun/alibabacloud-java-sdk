// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class GenerateStsTokenRequest extends TeaModel {
    @NameInMap("ExpireInSeconds")
    public Long expireInSeconds;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TokenType")
    public String tokenType;

    public static GenerateStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateStsTokenRequest self = new GenerateStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateStsTokenRequest setExpireInSeconds(Long expireInSeconds) {
        this.expireInSeconds = expireInSeconds;
        return this;
    }
    public Long getExpireInSeconds() {
        return this.expireInSeconds;
    }

    public GenerateStsTokenRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GenerateStsTokenRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GenerateStsTokenRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
