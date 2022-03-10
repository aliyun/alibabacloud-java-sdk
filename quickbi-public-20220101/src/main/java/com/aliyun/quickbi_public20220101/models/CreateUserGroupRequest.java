// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateUserGroupRequest extends TeaModel {
    @NameInMap("ParentUserGroupId")
    public String parentUserGroupId;

    @NameInMap("UserGroupDescription")
    public String userGroupDescription;

    @NameInMap("UserGroupId")
    public String userGroupId;

    @NameInMap("UserGroupName")
    public String userGroupName;

    public static CreateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupRequest self = new CreateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupRequest setParentUserGroupId(String parentUserGroupId) {
        this.parentUserGroupId = parentUserGroupId;
        return this;
    }
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

    public CreateUserGroupRequest setUserGroupDescription(String userGroupDescription) {
        this.userGroupDescription = userGroupDescription;
        return this;
    }
    public String getUserGroupDescription() {
        return this.userGroupDescription;
    }

    public CreateUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public CreateUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
