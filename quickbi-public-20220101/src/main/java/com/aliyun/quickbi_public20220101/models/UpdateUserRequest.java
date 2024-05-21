// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>Indicates whether the organization administrator. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("AdminUser")
    public Boolean adminUser;

    /**
     * <p>Indicate whether the RAM user is a permission administrator. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("AuthAdminUser")
    public Boolean authAdminUser;

    /**
     * <p>The nickname of the account.</p>
     * <br>
     * <p>*   Format check: The value can be up to 50 characters in length.</p>
     * <p>*   Special format verification: Chinese and English digits_ \\ / | () ] [</p>
     */
    @NameInMap("NickName")
    public String nickName;

    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The ID of the user to be updated. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The role type of the organization member. Valid values:</p>
     * <br>
     * <p>*   1 : developer</p>
     * <p>*   2 : visitors</p>
     * <p>*   3 : Analyst</p>
     */
    @NameInMap("UserType")
    public Integer userType;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setAdminUser(Boolean adminUser) {
        this.adminUser = adminUser;
        return this;
    }
    public Boolean getAdminUser() {
        return this.adminUser;
    }

    public UpdateUserRequest setAuthAdminUser(Boolean authAdminUser) {
        this.authAdminUser = authAdminUser;
        return this;
    }
    public Boolean getAuthAdminUser() {
        return this.authAdminUser;
    }

    public UpdateUserRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public UpdateUserRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

    public UpdateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

}
