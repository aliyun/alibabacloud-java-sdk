// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResetPasswordRequest extends TeaModel {
    /**
     * <p>RSA-OAEP-SHA256 加密后的新密码 base64 密文（必填，不可为空）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("passwordEncrypted")
    public String passwordEncrypted;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>21577</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>目标用户ID（WINNEXO 平台用户ID）</p>
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
