// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceManualMemoryRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The complete content of profile.md. An empty string indicates that the memory is cleared. This field must be provided, but an empty value is allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prefers concise answers</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The workspace ID. This parameter is required when ownerType is set to group.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_12345</p>
     */
    @NameInMap("groupId")
    public String groupId;

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
     * <p>The owner type. Valid values:</p>
     * <ul>
     * <li>user: the personal memory of the authenticated user.</li>
     * <li>group: the memory of the specified workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("ownerType")
    public String ownerType;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplaceManualMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceManualMemoryRequest self = new ReplaceManualMemoryRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceManualMemoryRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ReplaceManualMemoryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplaceManualMemoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ReplaceManualMemoryRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ReplaceManualMemoryRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ReplaceManualMemoryRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public ReplaceManualMemoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
