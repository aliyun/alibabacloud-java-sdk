// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryProjectBuildDetailRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static QueryProjectBuildDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectBuildDetailRequest self = new QueryProjectBuildDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectBuildDetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
