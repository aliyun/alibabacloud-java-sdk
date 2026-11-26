// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateUserGroupRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The description of the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales organization</p>
     */
    @NameInMap("description")
    public String description;

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
     * <p>The ID of the parent user group. If this parameter is not specified, the user group is created under the root node.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>The tenant ID. This is a common parameter that can be explicitly passed by using the <code>--tenant-id</code> option in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The name of the user group. The name must be unique under the same parent node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>East China Sales</p>
     */
    @NameInMap("userGroupName")
    public String userGroupName;

    public static CreateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupRequest self = new CreateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreateUserGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserGroupRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateUserGroupRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreateUserGroupRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateUserGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
