// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SyncOrgStructureShrinkRequest extends TeaModel {
    /**
     * <p>企业标识（必须与 listAvailableConfigs 返回的 corpId 一致）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>部门列表（至少包含一个根部门）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("departments")
    public String departmentsShrink;

    /**
     * <p>成员列表（syncMembers=true 时必须提供）</p>
     */
    @NameInMap("members")
    public String membersShrink;

    /**
     * <p>平台类型: saml / oauth2 / custom</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saml</p>
     */
    @NameInMap("platformType")
    public String platformType;

    /**
     * <p>SSO 配置 ID（SAML/OAuth2 可选：不传时按 corpId 自动推导；若存在多个 IdP 使用相同 corpId 则必须显式传入，否则报 AMBIGUOUS 错误；custom 不需要）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSsoSettingsId</p>
     */
    @NameInMap("ssoSettingsId")
    public String ssoSettingsId;

    /**
     * <p>是否同步成员关系（custom 模式强制为 false）</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("syncMembers")
    public Boolean syncMembers;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
