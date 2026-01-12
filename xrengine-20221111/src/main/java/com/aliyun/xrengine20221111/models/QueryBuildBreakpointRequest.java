// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryBuildBreakpointRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryBuildBreakpointRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildBreakpointRequest self = new QueryBuildBreakpointRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildBreakpointRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public QueryBuildBreakpointRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
