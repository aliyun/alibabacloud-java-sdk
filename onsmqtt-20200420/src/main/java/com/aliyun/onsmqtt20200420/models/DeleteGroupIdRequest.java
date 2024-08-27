// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteGroupIdRequest extends TeaModel {
    /**
     * <p>The ID of the group that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance from which you want to delete a group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp1ldu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupIdRequest self = new DeleteGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
