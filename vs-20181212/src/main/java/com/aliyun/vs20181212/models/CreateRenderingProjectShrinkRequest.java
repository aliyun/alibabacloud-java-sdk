// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingProjectShrinkRequest extends TeaModel {
    /**
     * <p>The description of the project. The description can be 0 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>项目概述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The custom name of the project. This name is the unique identifier for the project.
     * The name must meet the following requirements:</p>
     * <ol>
     * <li><p>Be 1 to 128 characters in length.</p>
     * </li>
     * <li><p>Contain only lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * </li>
     * <li><p>Start and end with a letter or a digit.</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>du_merchant_d</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The session properties.</p>
     */
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
