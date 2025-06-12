// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM user group.</p>
     * 
     * <strong>example:</strong>
     * <p>Dev-Team</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The new description of the RAM user group.</p>
     * <p>The new description must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>NewDev-Team</p>
     */
    @NameInMap("NewComments")
    public String newComments;

    /**
     * <p>The new name of the RAM user group.</p>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>NewDev-Team</p>
     */
    @NameInMap("NewGroupName")
    public String newGroupName;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateGroupRequest setNewComments(String newComments) {
        this.newComments = newComments;
        return this;
    }
    public String getNewComments() {
        return this.newComments;
    }

    public UpdateGroupRequest setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
        return this;
    }
    public String getNewGroupName() {
        return this.newGroupName;
    }

}
