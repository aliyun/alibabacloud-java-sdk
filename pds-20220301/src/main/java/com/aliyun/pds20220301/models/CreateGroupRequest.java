// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>The description of the group. The maximum length is 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>test group description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The group name. The name must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test group</p>
     */
    @NameInMap("group_name")
    public String groupName;

    /**
     * <p>Specifies whether to create a root group. A root group cannot be added to any other group and is typically used as the top-level entity in an organizational structure.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_root")
    public Boolean isRoot;

    /**
     * <p>The ID of the parent group. If specified, the new group is added to this parent group on creation.</p>
     * 
     * <strong>example:</strong>
     * <p>2e43ec8427dd45f19431b7504649a1b3</p>
     */
    @NameInMap("parent_group_id")
    public String parentGroupId;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateGroupRequest setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
        return this;
    }
    public Boolean getIsRoot() {
        return this.isRoot;
    }

    public CreateGroupRequest setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }
    public String getParentGroupId() {
        return this.parentGroupId;
    }

}
