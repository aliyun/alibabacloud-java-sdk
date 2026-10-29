// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingProjectRequest extends TeaModel {
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
    public UpdateRenderingProjectRequestSessionAttribs sessionAttribs;

    public static UpdateRenderingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingProjectRequest self = new UpdateRenderingProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRenderingProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateRenderingProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateRenderingProjectRequest setSessionAttribs(UpdateRenderingProjectRequestSessionAttribs sessionAttribs) {
        this.sessionAttribs = sessionAttribs;
        return this;
    }
    public UpdateRenderingProjectRequestSessionAttribs getSessionAttribs() {
        return this.sessionAttribs;
    }

    public static class UpdateRenderingProjectRequestSessionAttribs extends TeaModel {
        /**
         * <p>The mode in which the session starts the cloud application service. Valid values:</p>
         * <ul>
         * <li>Async: asynchronous.</li>
         * <li>Sync: synchronous.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Async</p>
         */
        @NameInMap("StartMode")
        public String startMode;

        public static UpdateRenderingProjectRequestSessionAttribs build(java.util.Map<String, ?> map) throws Exception {
            UpdateRenderingProjectRequestSessionAttribs self = new UpdateRenderingProjectRequestSessionAttribs();
            return TeaModel.build(map, self);
        }

        public UpdateRenderingProjectRequestSessionAttribs setStartMode(String startMode) {
            this.startMode = startMode;
            return this;
        }
        public String getStartMode() {
            return this.startMode;
        }

    }

}
