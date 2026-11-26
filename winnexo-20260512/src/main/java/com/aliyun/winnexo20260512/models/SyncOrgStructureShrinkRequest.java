// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SyncOrgStructureShrinkRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The enterprise identifier. This value must match the corpId returned by listAvailableConfigs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>The department list. At least one root department must be included.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("departments")
    public String departmentsShrink;

    /**
     * <p>The member list. This parameter is required when syncMembers is set to true.</p>
     */
    @NameInMap("members")
    public String membersShrink;

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
     * <p>The platform type. Valid values: saml, oauth2, or custom.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saml</p>
     */
    @NameInMap("platformType")
    public String platformType;

    /**
     * <p>The SSO configuration ID. For SAML/OAuth2, this parameter is optional. If not specified, the value is automatically derived based on corpId. If multiple IdPs use the same corpId, you must explicitly specify this parameter. Otherwise, an AMBIGUOUS error is returned. This parameter is not required for custom.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSsoSettingsId</p>
     */
    @NameInMap("ssoSettingsId")
    public String ssoSettingsId;

    /**
     * <p>Specifies whether to synchronize member relationships. In custom mode, this parameter is forced to false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("syncMembers")
    public Boolean syncMembers;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static SyncOrgStructureShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncOrgStructureShrinkRequest self = new SyncOrgStructureShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncOrgStructureShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SyncOrgStructureShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SyncOrgStructureShrinkRequest setDepartmentsShrink(String departmentsShrink) {
        this.departmentsShrink = departmentsShrink;
        return this;
    }
    public String getDepartmentsShrink() {
        return this.departmentsShrink;
    }

    public SyncOrgStructureShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public SyncOrgStructureShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SyncOrgStructureShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public SyncOrgStructureShrinkRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public SyncOrgStructureShrinkRequest setSsoSettingsId(String ssoSettingsId) {
        this.ssoSettingsId = ssoSettingsId;
        return this;
    }
    public String getSsoSettingsId() {
        return this.ssoSettingsId;
    }

    public SyncOrgStructureShrinkRequest setSyncMembers(Boolean syncMembers) {
        this.syncMembers = syncMembers;
        return this;
    }
    public Boolean getSyncMembers() {
        return this.syncMembers;
    }

    public SyncOrgStructureShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
