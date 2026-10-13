// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CancelContextDatabaseSyncRunRequest extends TeaModel {
    /**
     * <p>The idempotence token.</p>
     * 
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The run ID, a system-generated UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CancelContextDatabaseSyncRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelContextDatabaseSyncRunRequest self = new CancelContextDatabaseSyncRunRequest();
        return TeaModel.build(map, self);
    }

    public CancelContextDatabaseSyncRunRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelContextDatabaseSyncRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public CancelContextDatabaseSyncRunRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
