// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSkillShrinkRequest extends TeaModel {
    /**
     * <p>The content of the skill.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The list of database engines.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dbtypes")
    public String dbtypesShrink;

    /**
     * <p>The description of the skill. It can be up to 1000 characters in length.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the skill, which can contain only lowercase letters, numbers, and hyphens.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>query-optimization</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillShrinkRequest self = new CreateSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public CreateSkillShrinkRequest setDbtypesShrink(String dbtypesShrink) {
        this.dbtypesShrink = dbtypesShrink;
        return this;
    }
    public String getDbtypesShrink() {
        return this.dbtypesShrink;
    }

    public CreateSkillShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
