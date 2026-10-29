// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingProjectShrinkRequest extends TeaModel {
    /**
     * <p>The project description.</p>
     * 
     * <strong>example:</strong>
     * <p>Directory 1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The custom project name, which serves as the unique identifier of the project. Default naming conventions: 1. The length must be 1 to 128 characters. 2. The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). 3. The first and last characters must be letters or digits. At least one of ProjectName, SessionAttribs, or Description must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>idata_content</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The session attributes.</p>
     */
    @NameInMap("SessionAttribs")
    public String sessionAttribsShrink;

    public static UpdateRenderingProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingProjectShrinkRequest self = new UpdateRenderingProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRenderingProjectShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateRenderingProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateRenderingProjectShrinkRequest setSessionAttribsShrink(String sessionAttribsShrink) {
        this.sessionAttribsShrink = sessionAttribsShrink;
        return this;
    }
    public String getSessionAttribsShrink() {
        return this.sessionAttribsShrink;
    }

}
