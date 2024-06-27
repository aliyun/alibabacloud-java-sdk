// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>46e537****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The user ID of the Quick BI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2fe4fbd8****</p>
     */
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
