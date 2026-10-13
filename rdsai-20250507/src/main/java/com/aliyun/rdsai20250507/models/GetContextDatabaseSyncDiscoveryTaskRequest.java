// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncDiscoveryTaskRequest extends TeaModel {
    /**
     * <p>The discovery task ID, which is a system-generated UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetContextDatabaseSyncDiscoveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncDiscoveryTaskRequest self = new GetContextDatabaseSyncDiscoveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncDiscoveryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetContextDatabaseSyncDiscoveryTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
