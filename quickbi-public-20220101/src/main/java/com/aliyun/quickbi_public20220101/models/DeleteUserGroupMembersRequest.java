// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupMembersRequest extends TeaModel {
    /**
     * <p>The ID of the user group(s) to exit.</p>
     * <ul>
     * <li>Supports batch parameters, separate IDs with a comma (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34fd141d-4598-4093-8c33-8e066dcb****,3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
     */
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    /**
     * <p>The UserID of the user to be removed from the user group. Note that this UserID refers to the Quick BI UserID, not the Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>204627493484****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteUserGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupMembersRequest self = new DeleteUserGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupMembersRequest setUserGroupIds(String userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    public DeleteUserGroupMembersRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
