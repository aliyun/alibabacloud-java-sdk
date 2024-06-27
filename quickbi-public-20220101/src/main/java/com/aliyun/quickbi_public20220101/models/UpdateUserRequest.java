// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>Indicates whether the organization administrator. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AdminUser")
    public Boolean adminUser;

    /**
     * <p>Indicate whether the RAM user is a permission administrator. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthAdminUser")
    public Boolean authAdminUser;

    @NameInMap("IsDeleted")
    public Boolean isDeleted;

    /**
     * <p>The nickname of the account.</p>
     * <ul>
     * <li>Format check: The value can be up to 50 characters in length.</li>
     * <li>Special format verification: Chinese and English digits_ \ / | () ] [</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Xiao Zhang</p>
     */
    @NameInMap("NickName")
    public String nickName;

    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The ID of the user to be updated. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe67f61a35a94b7da1a34ba174a7****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The role type of the organization member. Valid values:</p>
     * <ul>
     * <li>1 : developer</li>
     * <li>2 : visitors</li>
     * <li>3 : Analyst</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public UpdateUserRequest setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Boolean getIsDeleted() {
        return this.isDeleted;
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
