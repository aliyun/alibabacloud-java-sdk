// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class BuildProjectRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VideoName")
    public String videoName;

    public static BuildProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildProjectRequest self = new BuildProjectRequest();
        return TeaModel.build(map, self);
    }

    public BuildProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public BuildProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public BuildProjectRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }
    public String getVideoName() {
        return this.videoName;
    }

}
