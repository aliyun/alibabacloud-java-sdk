// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The filter type. Valid values:</p>
     * <ul>
     * <li>USER</li>
     * <li>USER_GROUP</li>
     * </ul>
     * <p>If this parameter is not specified, all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("granteeType")
    public String granteeType;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleKeyword</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The name of the digital employee.</p>
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
     * <p>Permission</p>
     * 
     * <strong>example:</strong>
     * <p>USE</p>
     */
    @NameInMap("permission")
    public String permission;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAuthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersRequest self = new ListAuthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListAuthorizedUsersRequest setGranteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }
    public String getGranteeType() {
        return this.granteeType;
    }

    public ListAuthorizedUsersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAuthorizedUsersRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListAuthorizedUsersRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListAuthorizedUsersRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListAuthorizedUsersRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public ListAuthorizedUsersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
