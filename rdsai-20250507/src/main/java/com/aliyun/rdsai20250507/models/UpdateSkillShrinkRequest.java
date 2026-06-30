// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateSkillShrinkRequest extends TeaModel {
    /**
     * <p>The content of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MySQL&quot;: &quot;MySQL 优化指南...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL 优化指南...&quot;}</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The list of database engines.</p>
     */
    @NameInMap("Dbtypes")
    public String dbtypesShrink;

    /**
     * <p>The description of the Skill. It can be up to 1000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL审查专家：全面审核SQL的安全性、性能与规范性，识别风险并提供优化建议。用户提交SQL或询问“SQL审核”“SQL Review”“有风险吗”“如何优化”时，立即启用。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the skill, which can contain only lowercase letters, numbers, and hyphens.</p>
     * 
     * <strong>example:</strong>
     * <p>sql-optimization</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique identifier of the skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8f6a2111-3828-4a9f-a3ce-51ce73c6****</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static UpdateSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillShrinkRequest self = new UpdateSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public UpdateSkillShrinkRequest setDbtypesShrink(String dbtypesShrink) {
        this.dbtypesShrink = dbtypesShrink;
        return this;
    }
    public String getDbtypesShrink() {
        return this.dbtypesShrink;
    }

    public UpdateSkillShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSkillShrinkRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
