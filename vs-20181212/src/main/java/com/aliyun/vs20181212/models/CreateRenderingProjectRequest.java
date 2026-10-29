// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingProjectRequest extends TeaModel {
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
    public CreateRenderingProjectRequestSessionAttribs sessionAttribs;

    public static CreateRenderingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingProjectRequest self = new CreateRenderingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateRenderingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRenderingProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateRenderingProjectRequest setSessionAttribs(CreateRenderingProjectRequestSessionAttribs sessionAttribs) {
        this.sessionAttribs = sessionAttribs;
        return this;
    }
    public CreateRenderingProjectRequestSessionAttribs getSessionAttribs() {
        return this.sessionAttribs;
    }

    public static class CreateRenderingProjectRequestSessionAttribs extends TeaModel {
        /**
         * <p>The mode in which the session starts the cloud application service. Valid values:</p>
         * <ul>
         * <li>Async: asynchronous mode.</li>
         * <li>Sync: synchronous mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Async</p>
         */
        @NameInMap("StartMode")
        public String startMode;

        public static CreateRenderingProjectRequestSessionAttribs build(java.util.Map<String, ?> map) throws Exception {
            CreateRenderingProjectRequestSessionAttribs self = new CreateRenderingProjectRequestSessionAttribs();
            return TeaModel.build(map, self);
        }

        public CreateRenderingProjectRequestSessionAttribs setStartMode(String startMode) {
            this.startMode = startMode;
            return this;
        }
        public String getStartMode() {
            return this.startMode;
        }

    }

}
