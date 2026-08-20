// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the complete file tree. Default value: False. This avoids large response payloads.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeSkillFiles")
    public Boolean includeSkillFiles;

    /**
     * <p>The skill code. This parameter has a value when type is set to skill.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>The tenant ID to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The view mode. Valid values: draft (draft/editing view) or published (published view, default).</p>
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
