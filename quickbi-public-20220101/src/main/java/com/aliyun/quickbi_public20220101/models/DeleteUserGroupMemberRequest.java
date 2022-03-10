// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupMemberRequest extends TeaModel {
    @NameInMap("UserGroupId")
    public String userGroupId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteUserGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupMemberRequest self = new DeleteUserGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupMemberRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public DeleteUserGroupMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
