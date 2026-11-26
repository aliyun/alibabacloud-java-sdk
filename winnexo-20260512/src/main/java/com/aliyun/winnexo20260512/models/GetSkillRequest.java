// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>Specifies whether to return the complete file tree. Default value: false. This prevents large response payloads.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeSkillFiles")
    public Boolean includeSkillFiles;

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
     * <p>The skill code. This parameter has a value when type is set to skill.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    /**
     * <p>The name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>The ID of the tenant to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The view mode. Valid values: draft (draft or edit view) and published (published view, default).</p>
     * 
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("viewMode")
    public String viewMode;

    public static GetSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillRequest self = new GetSkillRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public GetSkillRequest setIncludeSkillFiles(Boolean includeSkillFiles) {
        this.includeSkillFiles = includeSkillFiles;
        return this;
    }
    public Boolean getIncludeSkillFiles() {
        return this.includeSkillFiles;
    }

    public GetSkillRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public GetSkillRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public GetSkillRequest setSkillCode(String skillCode) {
        this.skillCode = skillCode;
        return this;
    }
    public String getSkillCode() {
        return this.skillCode;
    }

    public GetSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public GetSkillRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetSkillRequest setViewMode(String viewMode) {
        this.viewMode = viewMode;
        return this;
    }
    public String getViewMode() {
        return this.viewMode;
    }

}
