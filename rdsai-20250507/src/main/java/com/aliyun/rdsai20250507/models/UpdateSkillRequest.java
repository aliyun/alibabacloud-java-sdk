// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateSkillRequest extends TeaModel {
    /**
     * <p>The content of the skill.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The list of database engines.</p>
     */
    @NameInMap("Dbtypes")
    public java.util.List<String> dbtypes;

    /**
     * <p>The description of the Skill. It can be up to 1000 characters in length.</p>
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

    public static UpdateSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillRequest self = new UpdateSkillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public UpdateSkillRequest setDbtypes(java.util.List<String> dbtypes) {
        this.dbtypes = dbtypes;
        return this;
    }
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
    }

    public UpdateSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSkillRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
