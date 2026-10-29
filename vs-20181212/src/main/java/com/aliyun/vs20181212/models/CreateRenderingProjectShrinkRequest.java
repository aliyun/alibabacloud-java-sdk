// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingProjectShrinkRequest extends TeaModel {
    /**
     * <p>The description of the project. The description must be 0 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Project overview</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The custom project name, which serves as the unique identifier for the project.
     * Naming conventions:</p>
     * <ol>
     * <li>The length must be 1 to 128 characters.</li>
     * <li>The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
     * <li>The first and last characters must be letters or digits.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>du_merchant_d</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The session attributes.</p>
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
