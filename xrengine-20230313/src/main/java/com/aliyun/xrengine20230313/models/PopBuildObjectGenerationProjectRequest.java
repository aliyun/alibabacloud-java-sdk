// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildObjectGenerationProjectRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    public static PopBuildObjectGenerationProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopBuildObjectGenerationProjectRequest self = new PopBuildObjectGenerationProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopBuildObjectGenerationProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopBuildObjectGenerationProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
