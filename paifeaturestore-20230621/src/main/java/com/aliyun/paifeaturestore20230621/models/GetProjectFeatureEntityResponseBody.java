// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectFeatureEntityResponseBody extends TeaModel {
    /**
     * <p>Feature entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    /**
     * <p>Join ID used to associate with feature views.</p>
     * 
     * <strong>example:</strong>
     * <p>user_id</p>
     */
    @NameInMap("JoinId")
    public String joinId;

    /**
     * <p>Feature entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_entity_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Project name.</p>
     * 
     * <strong>example:</strong>
     * <p>project_1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>37D19490-AB69-567D-A852-407C94E510E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34245</p>
     */
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
