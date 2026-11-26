// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAuthorizedAgentsRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The userId of the responsible user.</p>
     * 
     * <strong>example:</strong>
     * <p>USE</p>
     */
    @NameInMap("permission")
    public String permission;

    /**
     * <p>The target user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("targetUserId")
    public Long targetUserId;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAuthorizedAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAgentsRequest self = new ListAuthorizedAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAgentsRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListAuthorizedAgentsRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListAuthorizedAgentsRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListAuthorizedAgentsRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public ListAuthorizedAgentsRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public ListAuthorizedAgentsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
