// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMembersRequest extends TeaModel {
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    @NameInMap("UserId")
    public String userId;

    public static AddUserGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMembersRequest self = new AddUserGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMembersRequest setUserGroupIds(String userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    public AddUserGroupMembersRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
