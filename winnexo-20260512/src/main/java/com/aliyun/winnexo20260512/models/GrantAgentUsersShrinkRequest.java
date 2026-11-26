// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GrantAgentUsersShrinkRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The authorization expiration timestamp in milliseconds. If this parameter is not specified, the authorization never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expireDate")
    public Long expireDate;

    /**
     * <p>The name of the digital human.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

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
     * <p>The permission items.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("permissions")
    public String permissionsShrink;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>676577544219585</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The list of user group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userGroupIds")
    public String userGroupIdsShrink;

    /**
     * <p>The list of user IDs to be authorized.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userIds")
    public String userIdsShrink;

    public static GrantAgentUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAgentUsersShrinkRequest self = new GrantAgentUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantAgentUsersShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public GrantAgentUsersShrinkRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public GrantAgentUsersShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public GrantAgentUsersShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public GrantAgentUsersShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public GrantAgentUsersShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

    public GrantAgentUsersShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GrantAgentUsersShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

    public GrantAgentUsersShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

}
