// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UpdateCustomAuthPermissionRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow or deny access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALLOW</p>
     */
    @NameInMap("Effect")
    public String effect;

    /**
     * <p>Username or Client ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Identity")
    public String identity;

    /**
     * <p>The identity type. Valid values:</p>
     * <ul>
     * <li>USER</li>
     * <li>CLIENT</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>ID of the Cloud Message Queue MQTT version instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The permissions that you want to grant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUB_SUB</p>
     */
    @NameInMap("PermitAction")
    public String permitAction;

    /**
     * <p>Authorized Topic, supporting multi-level MQTT topics and wildcards.</p>
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
