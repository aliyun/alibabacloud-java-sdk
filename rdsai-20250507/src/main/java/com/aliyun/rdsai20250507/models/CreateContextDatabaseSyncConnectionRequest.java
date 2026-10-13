// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseSyncConnectionRequest extends TeaModel {
    /**
     * <p>The authorization method. Valid values: app, pasted-url, static-secret, and none.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AuthKind")
    public String authKind;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The display name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D team DingTalk data source</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The plugin ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateContextDatabaseSyncConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseSyncConnectionRequest self = new CreateContextDatabaseSyncConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseSyncConnectionRequest setAuthKind(String authKind) {
        this.authKind = authKind;
        return this;
    }
    public String getAuthKind() {
        return this.authKind;
    }

    public CreateContextDatabaseSyncConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateContextDatabaseSyncConnectionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateContextDatabaseSyncConnectionRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public CreateContextDatabaseSyncConnectionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
