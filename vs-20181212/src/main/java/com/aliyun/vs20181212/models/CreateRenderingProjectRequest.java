// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingProjectRequest extends TeaModel {
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
