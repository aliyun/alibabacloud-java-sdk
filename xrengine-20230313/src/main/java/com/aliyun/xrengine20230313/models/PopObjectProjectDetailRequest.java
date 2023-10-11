// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectProjectDetailRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    public static PopObjectProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PopObjectProjectDetailRequest self = new PopObjectProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public PopObjectProjectDetailRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopObjectProjectDetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
