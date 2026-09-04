// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateUserWithGroupsRequest extends TeaModel {
    /**
     * <p>The display name of the user. The name must be unique within the tenant and cannot exceed 100 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The Base64-encoded password ciphertext encrypted by using the RSA-OAEP-SHA256 algorithm.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("passwordEncrypted")
    public String passwordEncrypted;

    /**
     * <p>The list of initial system role codes. If this parameter is not specified, the <code>APPLICATION_USER</code> role is assigned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("roleCodes")
    public java.util.List<String> roleCodes;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this parameter explicitly by using <code>--tenant-id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The list of initial user group IDs. A maximum of 100 user group IDs can be specified. All user groups must belong to the current tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The WINNEXO logon account. This parameter is a unique identifier and cannot be empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleAccountId</p>
     */
    @NameInMap("wnAccountId")
    public String wnAccountId;

    public static CreateUserWithGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWithGroupsRequest self = new CreateUserWithGroupsRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserWithGroupsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserWithGroupsRequest setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
        return this;
    }
    public String getPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    public CreateUserWithGroupsRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    public CreateUserWithGroupsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateUserWithGroupsRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateUserWithGroupsRequest setWnAccountId(String wnAccountId) {
        this.wnAccountId = wnAccountId;
        return this;
    }
    public String getWnAccountId() {
        return this.wnAccountId;
    }

}
