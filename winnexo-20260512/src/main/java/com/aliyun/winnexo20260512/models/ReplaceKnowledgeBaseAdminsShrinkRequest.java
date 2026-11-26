// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceKnowledgeBaseAdminsShrinkRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>企业知识库或内置帮助知识库根目录业务 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb_001</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

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
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>管理员用户组 ID 列表；默认空列表表示清空用户组管理员</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group-1&quot;]</p>
     */
    @NameInMap("userGroupIds")
    public String userGroupIdsShrink;

    /**
     * <p>直接管理员的平台用户 ID 列表；默认空列表表示清空可变用户管理员，普通库创建者保留</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("userIds")
    public String userIdsShrink;

    public static ReplaceKnowledgeBaseAdminsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceKnowledgeBaseAdminsShrinkRequest self = new ReplaceKnowledgeBaseAdminsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceKnowledgeBaseAdminsShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ReplaceKnowledgeBaseAdminsShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ReplaceKnowledgeBaseAdminsShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ReplaceKnowledgeBaseAdminsShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ReplaceKnowledgeBaseAdminsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ReplaceKnowledgeBaseAdminsShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

    public ReplaceKnowledgeBaseAdminsShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

}
