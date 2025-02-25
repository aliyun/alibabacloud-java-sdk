// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class AddCustomAuthPermissionRequest extends TeaModel {
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
     * <p>The username or client ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Identity")
    public String identity;

    /**
     * <p>The identity type. Valid values: USER and CLIENT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp12gl****</p>
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
     * <p>The topics on which you want to grant permissions. Multi-level topics and wildcard characters are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test/t1</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static AddCustomAuthPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAuthPermissionRequest self = new AddCustomAuthPermissionRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomAuthPermissionRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public AddCustomAuthPermissionRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public AddCustomAuthPermissionRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public AddCustomAuthPermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddCustomAuthPermissionRequest setPermitAction(String permitAction) {
        this.permitAction = permitAction;
        return this;
    }
    public String getPermitAction() {
        return this.permitAction;
    }

    public AddCustomAuthPermissionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
