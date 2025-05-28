// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserRequest extends TeaModel {
    /**
     * <p>Aliyun account ID.</p>
     * <blockquote>
     * <p>Warning: For versions of Quick BI released after December 31, 2024, AccountId will be a required parameter. Please modify your API before this date.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;Published only on the China site</p>
     * 
     * <strong>example:</strong>
     * <p>191476xxxxx23754</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>Aliyun account name.</p>
     * <ul>
     * <li>Note: If it is a sub-account, the format should be \&quot;primary account: sub-account\&quot;. For example: <a href="mailto:master_test@aliyun.com">master_test@aliyun.com</a>:subaccount</li>
     * <li>Format check: Maximum length of 50 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxxxx@163.com">xxxxxx@163.com</a></p>
     */
    @NameInMap("AccountName")
    @Deprecated
    public String accountName;

    /**
     * <p>Whether to assign the organization administrator role. Value range: </p>
     * <ul>
     * <li>true: Yes </li>
     * <li>false: No</li>
     * </ul>
     * <p><notice>This parameter is deprecated and not recommended for use. It is invalid when RoleIds is provided.</notice></p>
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
     * <p>Whether to assign the organization permission administrator role. Value range: </p>
     * <ul>
     * <li>true: Yes </li>
     * <li>false: No</li>
     * </ul>
     * <p><notice>This parameter is deprecated and not recommended for use. It is invalid when RoleIds is provided.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthAdminUser")
    @Deprecated
    public Boolean authAdminUser;

    /**
     * <p>Aliyun account nickname.</p>
     * <ul>
     * <li>Format check: Maximum length of 50 characters.</li>
     * <li>Special format validation: Chinese and English characters, numbers, _ \ / | () ] [</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddd</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <p>Preset or custom organization role IDs bound to the user, separated by commas, with a maximum of 3. Value range:</p>
     * <ul>
     * <li>Organization Administrator (preset role): 111111111</li>
     * <li>Permission Administrator (preset role): 111111112</li>
     * <li>Regular User (preset role): 111111113</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>111111111,456</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The user type of the organization member. Value range:</p>
     * <ul>
     * <li>1: Developer</li>
     * <li>2: Visitor</li>
     * <li>3: Analyst</li>
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
