// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>The description of the group. The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the group. The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("group_name")
    public String groupName;

    /**
     * <p>Specifies whether the group is a root group. A root group cannot be added to any other group. In most cases, a root group is the top-level organization in the organizational structure.</p>
     */
    @NameInMap("is_root")
    public Boolean isRoot;

    /**
     * <p>The ID of the parent group to which the group is added. If this parameter is specified, the system automatically adds the group to the specified parent group after the group is created.</p>
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
