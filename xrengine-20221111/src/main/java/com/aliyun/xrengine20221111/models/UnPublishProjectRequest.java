// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UnPublishProjectRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static UnPublishProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UnPublishProjectRequest self = new UnPublishProjectRequest();
        return TeaModel.build(map, self);
    }

    public UnPublishProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public UnPublishProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
