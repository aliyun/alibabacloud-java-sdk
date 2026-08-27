// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class AddUserGroupMembersRequest extends TeaModel {
    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this parameter explicitly by using <code>--tenant-id</code>.</p>
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
     * <p>The list of platform user IDs to add. Supports single or batch input. Duplicate relationships are idempotent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    public static AddUserGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMembersRequest self = new AddUserGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMembersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddUserGroupMembersRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public AddUserGroupMembersRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}
