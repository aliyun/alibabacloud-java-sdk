// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    @NameInMap("AutoBuild")
    public Boolean autoBuild;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Title")
    public String title;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setAutoBuild(Boolean autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    public UpdateProjectRequest setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public UpdateProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public UpdateProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public UpdateProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
