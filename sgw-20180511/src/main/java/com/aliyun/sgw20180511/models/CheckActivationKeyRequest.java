// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckActivationKeyRequest extends TeaModel {
    @NameInMap("CryptKey")
    public String cryptKey;

    @NameInMap("CryptText")
    public String cryptText;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Token")
    public String token;

    public static CheckActivationKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckActivationKeyRequest self = new CheckActivationKeyRequest();
        return TeaModel.build(map, self);
    }

    public CheckActivationKeyRequest setCryptKey(String cryptKey) {
        this.cryptKey = cryptKey;
        return this;
    }
    public String getCryptKey() {
        return this.cryptKey;
    }

    public CheckActivationKeyRequest setCryptText(String cryptText) {
        this.cryptText = cryptText;
        return this;
    }
    public String getCryptText() {
        return this.cryptText;
    }

    public CheckActivationKeyRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CheckActivationKeyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CheckActivationKeyRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
