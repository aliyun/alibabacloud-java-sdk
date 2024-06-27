// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupRequest extends TeaModel {
    /**
     * <p>The ID of the user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f5eeb52e-d9c2-4a8b-80e3-47ab55c2****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DeleteUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupRequest self = new DeleteUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
