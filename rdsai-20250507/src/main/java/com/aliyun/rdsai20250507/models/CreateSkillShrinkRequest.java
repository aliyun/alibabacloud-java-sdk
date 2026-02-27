// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSkillShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dbtypes")
    public String dbtypesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
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
