// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCustomAuthIdentityRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Username")
    public String username;

    public static DeleteCustomAuthIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAuthIdentityRequest self = new DeleteCustomAuthIdentityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAuthIdentityRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DeleteCustomAuthIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public DeleteCustomAuthIdentityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteCustomAuthIdentityRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
