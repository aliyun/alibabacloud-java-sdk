// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateAgentAuthModeRequest extends TeaModel {
    /**
     * <p>使用权限授权模式：SPECIFIED_USERS=指定用户（需显式授权），ALL_USERS=所有用户（无需授权即可使用）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPECIFIED_USERS</p>
     */
    @NameInMap("authMode")
    public String authMode;

    /**
     * <p>数字员工名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateAgentAuthModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentAuthModeRequest self = new UpdateAgentAuthModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentAuthModeRequest setAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }
    public String getAuthMode() {
        return this.authMode;
    }

    public UpdateAgentAuthModeRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public UpdateAgentAuthModeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
