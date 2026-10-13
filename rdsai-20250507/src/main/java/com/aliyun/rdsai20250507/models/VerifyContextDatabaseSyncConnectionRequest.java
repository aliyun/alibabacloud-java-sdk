// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class VerifyContextDatabaseSyncConnectionRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection ID, which is a system-generated UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static VerifyContextDatabaseSyncConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyContextDatabaseSyncConnectionRequest self = new VerifyContextDatabaseSyncConnectionRequest();
        return TeaModel.build(map, self);
    }

    public VerifyContextDatabaseSyncConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public VerifyContextDatabaseSyncConnectionRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public VerifyContextDatabaseSyncConnectionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
