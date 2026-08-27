// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RemoveUserGroupMembersShrinkRequest extends TeaModel {
    /**
     * <p>The tenant ID. This is a common parameter. You can explicitly pass this parameter in winnexo-cli by using <code>--tenant-id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the target user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
     */
    @NameInMap("userGroupId")
    public String userGroupId;

    /**
     * <p>The list of platform user IDs to be removed. You can specify one or more IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userIds")
    public String userIdsShrink;

    public static RemoveUserGroupMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserGroupMembersShrinkRequest self = new RemoveUserGroupMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserGroupMembersShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RemoveUserGroupMembersShrinkRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public RemoveUserGroupMembersShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

}
