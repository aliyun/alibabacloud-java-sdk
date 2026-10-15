// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID.</p>
     * <blockquote>
     * <p>Warning: For Quick BI versions released after December 31, 2024, AccountId is a required parameter. Update your API calls before this date.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>191476xxxxx23754</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The Alibaba Cloud account name.</p>
     * <ul>
     * <li>Note: For a RAM user, the format is &quot;primary account:RAM user&quot;. Example: <a href="mailto:master_test@aliyun.com">master_test@aliyun.com</a>:subaccount</li>
     * <li>Format check: The maximum length is 50 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxxxx@163.com">xxxxxx@163.com</a></p>
     */
    @NameInMap("AccountName")
    @Deprecated
    public String accountName;

    /**
     * <p>Specifies whether to assign the organization administrator role. Valid values: </p>
     * <ul>
     * <li>true: Yes. </li>
     * <li>false: No.</li>
     * </ul>
     * <p><notice>This parameter is deprecated. When RoleIds is specified, this parameter does not take effect.</notice></p>
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
     * <p>Specifies whether to assign the organization permission management administrator role. Valid values: </p>
     * <ul>
     * <li>true: Yes. </li>
     * <li>false: No.</li>
     * </ul>
     * <p><notice>This parameter has expired and is no longer recommended. When RoleIds is specified, this parameter does not take effect.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthAdminUser")
    @Deprecated
    public Boolean authAdminUser;

    /**
     * <p>The intelligent module quotas of the user. Separate multiple modules with commas (,).</p>
     * <ul>
     * <li>qreport -- Small Q Report</li>
     * <li>qExploreNum -- Small Q Explorer</li>
     * <li>smartQAskNum -- Small Q Ask</li>
     * <li>smartQDevNum -- Small Q Builder</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>qreport,qExploreNum</p>
     */
    @NameInMap("CopilotModules")
    public String copilotModules;

    /**
     * <p>The nickname of the Alibaba Cloud account.</p>
     * <ul>
     * <li>Format check: The maximum length is 50 characters.</li>
     * <li>Special character validation: Chinese characters, English characters, digits, _ \ / | () ] [</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>John</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <p>The IDs of preset or custom organization roles to attach to the user, separated by commas (,). A maximum of three role IDs are supported. Valid values:</p>
     * <ul>
     * <li>Organization administrator (preset role): 111111111</li>
     * <li>Permission management administrator (preset role): 111111112</li>
     * <li>Common user (preset role): 111111113</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>111111111,456</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The user type of the organization member. Valid values:</p>
     * <ul>
     * <li>1: Developer.</li>
     * <li>2: Visitor.</li>
     * <li>3: Analyst.</li>
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
