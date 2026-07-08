// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingProjectRequest extends TeaModel {
    /**
     * <p>Project description</p>
     * 
     * <strong>example:</strong>
     * <p>目录1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Project ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Default naming rules:</p>
     * <ol>
     * <li><p>Length 1-128</p>
     * </li>
     * <li><p>Lowercase letters, numbers, underscores (_), hyphens (-), and periods (.).</p>
     * </li>
     * <li><p>The first and last characters must be letters or digits. At least one of ProjectName, SessionAttribs, or Description must be specified.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>idata_content</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Session attributes</p>
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
         * <p>The mode used to start cloud application services for the session. Valid values:</p>
         * <ol>
         * <li><p>Async: asynchronous</p>
         * </li>
         * <li><p>Sync: synchronization</p>
         * </li>
         * </ol>
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
