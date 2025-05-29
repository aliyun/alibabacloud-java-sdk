// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingProjectShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>du_merchant_d</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SessionAttribs")
    public String sessionAttribsShrink;

    public static CreateRenderingProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingProjectShrinkRequest self = new CreateRenderingProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRenderingProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRenderingProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateRenderingProjectShrinkRequest setSessionAttribsShrink(String sessionAttribsShrink) {
        this.sessionAttribsShrink = sessionAttribsShrink;
        return this;
    }
    public String getSessionAttribsShrink() {
        return this.sessionAttribsShrink;
    }

}
