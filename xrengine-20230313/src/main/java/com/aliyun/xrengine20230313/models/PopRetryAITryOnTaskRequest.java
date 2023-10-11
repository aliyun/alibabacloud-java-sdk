// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopRetryAITryOnTaskRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    public static PopRetryAITryOnTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PopRetryAITryOnTaskRequest self = new PopRetryAITryOnTaskRequest();
        return TeaModel.build(map, self);
    }

    public PopRetryAITryOnTaskRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopRetryAITryOnTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
