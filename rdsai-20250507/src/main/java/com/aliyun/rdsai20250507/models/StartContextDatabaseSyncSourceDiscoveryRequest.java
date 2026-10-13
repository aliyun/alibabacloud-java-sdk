// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class StartContextDatabaseSyncSourceDiscoveryRequest extends TeaModel {
    /**
     * <p>The idempotence token.</p>
     * 
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The data source ID, which is a system-generated UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static StartContextDatabaseSyncSourceDiscoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        StartContextDatabaseSyncSourceDiscoveryRequest self = new StartContextDatabaseSyncSourceDiscoveryRequest();
        return TeaModel.build(map, self);
    }

    public StartContextDatabaseSyncSourceDiscoveryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartContextDatabaseSyncSourceDiscoveryRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public StartContextDatabaseSyncSourceDiscoveryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
