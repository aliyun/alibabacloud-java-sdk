// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>Specifies whether to assign the organization administrator role. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
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
    public Boolean adminUser;

    /**
     * <p>Specifies whether to assign the organization permission management administrator role. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     * <p><notice>This parameter has expired and is not recommended. When RoleIds is specified, this parameter does not take effect.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthAdminUser")
    public Boolean authAdminUser;

    /**
     * <p>The intelligent module quota modification information.</p>
     * <p>Pass the parameter as a JSON array. Each array element contains the following fields:</p>
     * <p>moduleType -- The intelligent module.</p>
     * <ul>
     * <li>smartQAskNum -- Smart Q questions.</li>
     * <li>smartQDevNum -- Smart Q building.</li>
     * <li>qreport -- Smart Q reports.</li>
     * <li>qExploreNum -- Smart Q exploration edition.</li>
     * </ul>
     * <p>status -- Specifies whether to enable the module.</p>
     * <ul>
     * <li>0 -- Revoke authorization.</li>
     * <li>1 -- Grant authorization.</li>
     * </ul>
     * 
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
     * <p>The user status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Activated.</li>
     * <li><strong>true</strong>: Deactivated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDeleted")
    public Boolean isDeleted;

    /**
     * <p>The nickname.</p>
     * <ul>
     * <li>Format check: The maximum length is 50 characters.</li>
     * <li>Special format check: Chinese characters, English characters, digits, _ \ / | () ] [</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
     * <p>The ID of the user to update. This user ID is the Quick BI UserID, not the Alibaba Cloud UID.</p>
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
     * <li>1: Developer.</li>
     * <li>2: Visitor.</li>
     * <li>3: Analyst.</li>
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
