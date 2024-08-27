// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCustomAuthPermissionRequest extends TeaModel {
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
     * <p>The ID of the ApsaraMQ for MQTT instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp1ldu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The topic on which you want to grant permissions. Multi-level topics and Wildcard characters are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test/t1</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static DeleteCustomAuthPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAuthPermissionRequest self = new DeleteCustomAuthPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAuthPermissionRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public DeleteCustomAuthPermissionRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public DeleteCustomAuthPermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteCustomAuthPermissionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
