// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UpdateCustomAuthIdentityRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("SignMode")
    public String signMode;

    @NameInMap("Username")
    public String username;

    public static UpdateCustomAuthIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAuthIdentityRequest self = new UpdateCustomAuthIdentityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAuthIdentityRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UpdateCustomAuthIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public UpdateCustomAuthIdentityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCustomAuthIdentityRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public UpdateCustomAuthIdentityRequest setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public UpdateCustomAuthIdentityRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
