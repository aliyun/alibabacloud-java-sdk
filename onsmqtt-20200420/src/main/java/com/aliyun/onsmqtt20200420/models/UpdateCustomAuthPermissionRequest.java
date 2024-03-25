// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UpdateCustomAuthPermissionRequest extends TeaModel {
    @NameInMap("Effect")
    public String effect;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PermitAction")
    public String permitAction;

    @NameInMap("Topic")
    public String topic;

    public static UpdateCustomAuthPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAuthPermissionRequest self = new UpdateCustomAuthPermissionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAuthPermissionRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public UpdateCustomAuthPermissionRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public UpdateCustomAuthPermissionRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public UpdateCustomAuthPermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCustomAuthPermissionRequest setPermitAction(String permitAction) {
        this.permitAction = permitAction;
        return this;
    }
    public String getPermitAction() {
        return this.permitAction;
    }

    public UpdateCustomAuthPermissionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
