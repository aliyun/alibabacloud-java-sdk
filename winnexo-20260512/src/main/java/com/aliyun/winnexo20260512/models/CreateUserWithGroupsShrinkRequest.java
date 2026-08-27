// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateUserWithGroupsShrinkRequest extends TeaModel {
    /**
     * <p>The display name of the user (unique within the tenant, required, up to 100 characters).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The Base64-encoded password ciphertext encrypted by RSA-OAEP-SHA256 (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("passwordEncrypted")
    public String passwordEncrypted;

    /**
     * <p>The list of system role codes. Valid values: SUPER_ADMIN, SYSTEM_ADMIN, SEMANTIC_ADMIN, SKILL_ADMIN, KB_ADMIN, AGENT_ADMIN, and APPLICATION_USER. Default value: APPLICATION_USER.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("roleCodes")
    public String roleCodesShrink;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The list of initial user group IDs. This parameter is optional. All user groups must belong to the current tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userGroupIds")
    public String userGroupIdsShrink;

    /**
     * <p>The WINNEXO logon account (unique identifier, required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleAccountId</p>
     */
    @NameInMap("wnAccountId")
    public String wnAccountId;

    public static CreateUserWithGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWithGroupsShrinkRequest self = new CreateUserWithGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserWithGroupsShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserWithGroupsShrinkRequest setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
        return this;
    }
    public String getPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    public CreateUserWithGroupsShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public CreateUserWithGroupsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateUserWithGroupsShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

    public CreateUserWithGroupsShrinkRequest setWnAccountId(String wnAccountId) {
        this.wnAccountId = wnAccountId;
        return this;
    }
    public String getWnAccountId() {
        return this.wnAccountId;
    }

}
