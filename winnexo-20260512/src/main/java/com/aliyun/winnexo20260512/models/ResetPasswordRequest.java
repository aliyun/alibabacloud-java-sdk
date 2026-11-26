// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResetPasswordRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If this parameter is passed, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The Base64-encoded password ciphertext encrypted by using RSA-OAEP-SHA256. This parameter is required and cannot be empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("passwordEncrypted")
    public String passwordEncrypted;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21577</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The target user ID, which is the WINNEXO platform user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("wnUserId")
    public String wnUserId;

    public static ResetPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetPasswordRequest self = new ResetPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetPasswordRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ResetPasswordRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ResetPasswordRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ResetPasswordRequest setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
        return this;
    }
    public String getPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    public ResetPasswordRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ResetPasswordRequest setWnUserId(String wnUserId) {
        this.wnUserId = wnUserId;
        return this;
    }
    public String getWnUserId() {
        return this.wnUserId;
    }

}
