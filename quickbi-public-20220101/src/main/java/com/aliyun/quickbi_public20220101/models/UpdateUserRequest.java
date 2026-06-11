// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>Whether to assign the organization administrator role to the user. Valid values:</p>
     * <ul>
     * <li><p><code>true</code></p>
     * </li>
     * <li><p><code>false</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated and is ignored if RoleIds is also specified.</p>
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
     * <p>Whether to assign the permission administrator role to the user. Valid values:</p>
     * <ul>
     * <li><p><code>true</code></p>
     * </li>
     * <li><p><code>false</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated and is ignored if RoleIds is also specified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthAdminUser")
    public Boolean authAdminUser;

    /**
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;moduleType&quot;: &quot;smartQAskNum&quot;,
     *         &quot;status&quot;: 1
     *     },
     *     {
     *         &quot;moduleType&quot;: &quot;smartQDevNum&quot;,
     *         &quot;status&quot;: 0
     *     }
     * ]</p>
     */
    @NameInMap("CopilotModules")
    public String copilotModules;

    /**
     * <p>The user status:</p>
     * <ul>
     * <li><p><strong><code>false</code></strong>: active</p>
     * </li>
     * <li><p><strong><code>true</code></strong>: inactive</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDeleted")
    public Boolean isDeleted;

    /**
     * <p>The nickname of the user.</p>
     * <ul>
     * <li><p>The nickname can be up to 50 characters in length.</p>
     * </li>
     * <li><p>The nickname can contain Chinese characters, letters, digits, and the following special characters: <code>_ \\ / | () ] [</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <p>The IDs of the built-in or custom organization roles to assign to the user. Specify up to three comma-separated role IDs.</p>
     * <ul>
     * <li><p>organization administrator (built-in role): 111111111</p>
     * </li>
     * <li><p>permission administrator (built-in role): 111111112</p>
     * </li>
     * <li><p>standard user (built-in role): 111111113</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>111111111,456</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The ID of the Quick BI user to update. This is not an Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe67f61a35a94b7da1a34ba174a7****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The user type of the organization member. Valid values:</p>
     * <ul>
     * <li><p><code>1</code>: developer</p>
     * </li>
     * <li><p><code>2</code>: viewer</p>
     * </li>
     * <li><p><code>3</code>: analyst</p>
     * </li>
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

    public UpdateUserRequest setCopilotModules(String copilotModules) {
        this.copilotModules = copilotModules;
        return this;
    }
    public String getCopilotModules() {
        return this.copilotModules;
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
