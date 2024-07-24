// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
    /**
     * <p>The description of the group after modification.</p>
     * 
     * <strong>example:</strong>
     * <p>test group description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the group that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e43ec8427dd45f19431b7504649a1b4</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The name of the group after modification.</p>
     * 
     * <strong>example:</strong>
     * <p>test group</p>
     */
    @NameInMap("group_name")
    public String groupName;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
