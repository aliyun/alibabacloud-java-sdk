// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectFeatureEntityResponseBody extends TeaModel {
    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    @NameInMap("JoinId")
    public String joinId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetProjectFeatureEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectFeatureEntityResponseBody self = new GetProjectFeatureEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectFeatureEntityResponseBody setFeatureEntityId(String featureEntityId) {
        this.featureEntityId = featureEntityId;
        return this;
    }
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    public GetProjectFeatureEntityResponseBody setJoinId(String joinId) {
        this.joinId = joinId;
        return this;
    }
    public String getJoinId() {
        return this.joinId;
    }

    public GetProjectFeatureEntityResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProjectFeatureEntityResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetProjectFeatureEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectFeatureEntityResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
