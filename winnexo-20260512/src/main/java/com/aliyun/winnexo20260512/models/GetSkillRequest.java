// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRequest extends TeaModel {
    /**
     * <p>是否返回完整文件树（默认 False，避免大体积响应）</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeSkillFiles")
    public Boolean includeSkillFiles;

    /**
     * <p>技能编码（全局唯一），优先级高于 skillName</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    /**
     * <p>技能名称，未传 skillCode 时使用；租户范围内必须唯一</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>视角：draft（草稿/编辑视角）或 published（已发布视角，默认）</p>
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

    public GetSkillRequest setIncludeSkillFiles(Boolean includeSkillFiles) {
        this.includeSkillFiles = includeSkillFiles;
        return this;
    }
    public Boolean getIncludeSkillFiles() {
        return this.includeSkillFiles;
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
