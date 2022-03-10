// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMemberRequest extends TeaModel {
    @NameInMap("UserGroupId")
    public String userGroupId;

    @NameInMap("UserIdList")
    public String userIdList;

    public static AddUserGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMemberRequest self = new AddUserGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMemberRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public AddUserGroupMemberRequest setUserIdList(String userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public String getUserIdList() {
        return this.userIdList;
    }

}
