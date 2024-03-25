// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class AddCustomAuthIdentityRequest extends TeaModel {
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

    public static AddCustomAuthIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAuthIdentityRequest self = new AddCustomAuthIdentityRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomAuthIdentityRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AddCustomAuthIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public AddCustomAuthIdentityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddCustomAuthIdentityRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public AddCustomAuthIdentityRequest setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public AddCustomAuthIdentityRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
