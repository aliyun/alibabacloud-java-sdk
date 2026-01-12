// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UpdateProjectShrinkRequest extends TeaModel {
    @NameInMap("AutoBuild")
    public Boolean autoBuild;

    @NameInMap("Ext")
    public String extShrink;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Title")
    public String title;

    public static UpdateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectShrinkRequest self = new UpdateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectShrinkRequest setAutoBuild(Boolean autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    public UpdateProjectShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public UpdateProjectShrinkRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public UpdateProjectShrinkRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public UpdateProjectShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateProjectShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
