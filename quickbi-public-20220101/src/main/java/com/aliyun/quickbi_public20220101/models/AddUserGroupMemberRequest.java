// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>555c4cd****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The ID of the Quick BI user. Separate multiple IDs with commas (,). Example: abc,efg. You can enter a maximum of 1000 entries.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>46e537a5****,3dadsu****</p>
     */
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
