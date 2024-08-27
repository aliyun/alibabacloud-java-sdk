// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UpdateCustomAuthPermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALLOW</p>
     */
    @NameInMap("Effect")
    public String effect;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Identity")
    public String identity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUB_SUB</p>
     */
    @NameInMap("PermitAction")
    public String permitAction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test/t1</p>
     */
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
