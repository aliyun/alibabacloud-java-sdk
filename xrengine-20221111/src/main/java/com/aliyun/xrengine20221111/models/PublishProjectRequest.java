// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class PublishProjectRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static PublishProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishProjectRequest self = new PublishProjectRequest();
        return TeaModel.build(map, self);
    }

    public PublishProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PublishProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
