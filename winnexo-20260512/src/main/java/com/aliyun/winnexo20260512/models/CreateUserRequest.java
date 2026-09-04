// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The cluster name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The base64-encoded password ciphertext encrypted by using RSA-OAEP-SHA256 (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("passwordEncrypted")
    public String passwordEncrypted;

    /**
     * <p>The list of new system role codes (full replacement, must contain at least one role). Valid values: SUPER_ADMIN, SYSTEM_ADMIN, SEMANTIC_ADMIN, SKILL_ADMIN, KB_ADMIN, AGENT_ADMIN, and APPLICATION_USER.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("roleCodes")
    public java.util.List<String> roleCodes;

    /**
     * <p>The SSO provider type. This parameter is optional if the tenant has only one external logon method. This parameter is required if the tenant has multiple external logon methods. Currently, createUser supports BUILD_IN and AGENT_ONE.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT_ONE</p>
     */
    @NameInMap("ssoProvider")
    public String ssoProvider;

    /**
     * <p>The ID of the tenant on which the operation takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The WINNEXO logon account (unique identifier, required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleAccountId</p>
     */
    @NameInMap("wnAccountId")
    public String wnAccountId;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
        return this;
    }
    public String getPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    public CreateUserRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    public CreateUserRequest setSsoProvider(String ssoProvider) {
        this.ssoProvider = ssoProvider;
        return this;
    }
    public String getSsoProvider() {
        return this.ssoProvider;
    }

    public CreateUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateUserRequest setWnAccountId(String wnAccountId) {
        this.wnAccountId = wnAccountId;
        return this;
    }
    public String getWnAccountId() {
        return this.wnAccountId;
    }

}
