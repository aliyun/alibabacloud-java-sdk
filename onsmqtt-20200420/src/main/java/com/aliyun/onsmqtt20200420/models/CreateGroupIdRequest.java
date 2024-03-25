// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class CreateGroupIdRequest extends TeaModel {
    /**
     * <p>The ID of the group that you want to create. The group ID must meet the following conventions:</p>
     * <br>
     * <p>*   The ID must be 7 to 64 characters in length. It must start with GID\_ or GID- and can contain only letters, digits, hyphens (-), and underscores (\_).</p>
     * <p>*   The ID cannot be changed after the group is created. For more information, see [Terms](~~42420~~).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance to which the group belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIdRequest self = new CreateGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
