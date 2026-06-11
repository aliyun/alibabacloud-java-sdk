// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.&gt;Warning: The <code>AccountId</code> parameter will be required in Quick BI versions released after December 31, 2024. We recommend that you update your API calls to include this parameter before then.</p>
     * 
     * <strong>example:</strong>
     * <p>191476xxxxx23754</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The name of the Alibaba Cloud account.</p>
     * <ul>
     * <li><p>For a sub-account, use the format <code>master account:sub-account</code>. Example: <code>master_test@aliyun.com:subaccount</code>.</p>
     * </li>
     * <li><p>The maximum length is 50 characters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxxxx@163.com">xxxxxx@163.com</a></p>
     */
    @NameInMap("AccountName")
    @Deprecated
    public String accountName;

    /**
     * <p>Specifies whether to assign the organization administrator role. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated. It is ignored if <code>RoleIds</code> is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AdminUser")
    @Deprecated
    public Boolean adminUser;

    /**
     * <p>Specifies whether to assign the permission administrator role. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated. It is ignored if <code>RoleIds</code> is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthAdminUser")
    @Deprecated
    public Boolean authAdminUser;

    /**
     * <p>The Copilot modules to enable for the user. To enable multiple modules, specify their codes separated by a comma (,).</p>
     * <ul>
     * <li><p><code>qreport</code>: Q Report</p>
     * </li>
     * <li><p><code>qExploreNum</code>: Q Explore</p>
     * </li>
     * <li><p><code>smartQAskNum</code>: Q\&amp;A with Data</p>
     * </li>
     * <li><p><code>smartQDevNum</code>: Q-assisted Building</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>qreport,qExploreNum</p>
     */
    @NameInMap("CopilotModules")
    public String copilotModules;

    /**
     * <p>The user\&quot;s nickname.</p>
     * <ul>
     * <li><p>The maximum length is 50 characters.</p>
     * </li>
     * <li><p>The nickname can contain Chinese characters, letters, digits, and the following special characters: <code>_ \\ / | () []</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <p>The IDs of the predefined or custom organization roles to assign. You can specify up to three role IDs, separated by commas (,). Valid values for predefined roles:</p>
     * <ul>
     * <li><p><code>111111111</code>: organization administrator</p>
     * </li>
     * <li><p><code>111111112</code>: permission administrator</p>
     * </li>
     * <li><p><code>111111113</code>: regular user</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>111111111,456</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The type of the organization member. Valid values:</p>
     * <ul>
     * <li><p>1: developer</p>
     * </li>
     * <li><p>2: viewer</p>
     * </li>
     * <li><p>3: analyst</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserType")
    public Integer userType;

    public static AddUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserRequest self = new AddUserRequest();
        return TeaModel.build(map, self);
    }

    public AddUserRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    @Deprecated
    public AddUserRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    @Deprecated
    public AddUserRequest setAdminUser(Boolean adminUser) {
        this.adminUser = adminUser;
        return this;
    }
    public Boolean getAdminUser() {
        return this.adminUser;
    }

    @Deprecated
    public AddUserRequest setAuthAdminUser(Boolean authAdminUser) {
        this.authAdminUser = authAdminUser;
        return this;
    }
    public Boolean getAuthAdminUser() {
        return this.authAdminUser;
    }

    public AddUserRequest setCopilotModules(String copilotModules) {
        this.copilotModules = copilotModules;
        return this;
    }
    public String getCopilotModules() {
        return this.copilotModules;
    }

    public AddUserRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public AddUserRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

    public AddUserRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

}
