// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableConversationShareRequest extends TeaModel {
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
     * <p>The unique identifier of the function session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The sharing scope. Valid values:</p>
     * <ul>
     * <li>PUBLIC: accessible to all users</li>
     * <li>SPECIFIED: accessible to specified users or user groups</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("shareAccessType")
    public String shareAccessType;

    /**
     * <p>The list of user group IDs for the specified scope. When shareAccessType is set to SPECIFIED, at least one of this list or the user list must not be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group-1&quot;]</p>
     */
    @NameInMap("shareUserGroupIds")
    public java.util.List<String> shareUserGroupIds;

    /**
     * <p>The list of platform user IDs for the specified scope. When shareAccessType is set to SPECIFIED, at least one of this list or the user group list must not be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("shareUserIds")
    public java.util.List<Long> shareUserIds;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static EnableConversationShareRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableConversationShareRequest self = new EnableConversationShareRequest();
        return TeaModel.build(map, self);
    }

    public EnableConversationShareRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public EnableConversationShareRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public EnableConversationShareRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public EnableConversationShareRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public EnableConversationShareRequest setShareAccessType(String shareAccessType) {
        this.shareAccessType = shareAccessType;
        return this;
    }
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    public EnableConversationShareRequest setShareUserGroupIds(java.util.List<String> shareUserGroupIds) {
        this.shareUserGroupIds = shareUserGroupIds;
        return this;
    }
    public java.util.List<String> getShareUserGroupIds() {
        return this.shareUserGroupIds;
    }

    public EnableConversationShareRequest setShareUserIds(java.util.List<Long> shareUserIds) {
        this.shareUserIds = shareUserIds;
        return this;
    }
    public java.util.List<Long> getShareUserIds() {
        return this.shareUserIds;
    }

    public EnableConversationShareRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
