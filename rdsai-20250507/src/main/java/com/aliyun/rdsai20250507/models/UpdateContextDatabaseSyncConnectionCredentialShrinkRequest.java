// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncConnectionCredentialShrinkRequest extends TeaModel {
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
    public String credentialsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateContextDatabaseSyncConnectionCredentialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncConnectionCredentialShrinkRequest self = new UpdateContextDatabaseSyncConnectionCredentialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncConnectionCredentialShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContextDatabaseSyncConnectionCredentialShrinkRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public UpdateContextDatabaseSyncConnectionCredentialShrinkRequest setCredentialsShrink(String credentialsShrink) {
        this.credentialsShrink = credentialsShrink;
        return this;
    }
    public String getCredentialsShrink() {
        return this.credentialsShrink;
    }

    public UpdateContextDatabaseSyncConnectionCredentialShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
