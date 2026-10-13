// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseSyncSourceRequest extends TeaModel {
    /**
     * <p>The idempotence token.</p>
     * 
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection ID, a system-generated UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D team document scope</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The datasource config. The structure varies depending on the plug-in.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;folderIds&quot;:[&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%22%5D,%22pageSize%22:50,%22maxDepth%22:5%7D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****&quot;],&quot;pageSize&quot;:50,&quot;maxDepth&quot;:5}</a></p>
     */
    @NameInMap("SourceConfig")
    public java.util.Map<String, ?> sourceConfig;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateContextDatabaseSyncSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseSyncSourceRequest self = new CreateContextDatabaseSyncSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseSyncSourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateContextDatabaseSyncSourceRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public CreateContextDatabaseSyncSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContextDatabaseSyncSourceRequest setSourceConfig(java.util.Map<String, ?> sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public java.util.Map<String, ?> getSourceConfig() {
        return this.sourceConfig;
    }

    public CreateContextDatabaseSyncSourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
