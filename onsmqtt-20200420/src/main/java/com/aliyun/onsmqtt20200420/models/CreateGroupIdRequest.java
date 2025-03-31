// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class CreateGroupIdRequest extends TeaModel {
    /**
     * <p>The ID of the group that you want to create. The group ID must meet the following conventions:</p>
     * <ul>
     * <li>The ID must be 7 to 64 characters in length. It must start with GID_ or GID- and can contain only letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The ID cannot be changed after the group is created. For more information, see <a href="https://help.aliyun.com/document_detail/42420.html">Terms</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance to which the group belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp1ldu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Tags")
    public String tags;

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

    public CreateGroupIdRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
