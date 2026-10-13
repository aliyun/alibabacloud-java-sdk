// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncConnectionCredentialRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;appKey&quot;:&quot;dingas1llqmkol****&quot;,&quot;appSecret&quot;:&quot;******&quot;}</p>
     */
    @NameInMap("Credentials")
    public java.util.Map<String, ?> credentials;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateContextDatabaseSyncConnectionCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncConnectionCredentialRequest self = new UpdateContextDatabaseSyncConnectionCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncConnectionCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContextDatabaseSyncConnectionCredentialRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public UpdateContextDatabaseSyncConnectionCredentialRequest setCredentials(java.util.Map<String, ?> credentials) {
        this.credentials = credentials;
        return this;
    }
    public java.util.Map<String, ?> getCredentials() {
        return this.credentials;
    }

    public UpdateContextDatabaseSyncConnectionCredentialRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
