// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncSourceSelectionShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of selected node identifiers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;doc:1234567890&quot;]</p>
     */
    @NameInMap("SelectedNodeKeys")
    public String selectedNodeKeysShrink;

    /**
     * <p>The selection policy.</p>
     * 
     * <strong>example:</strong>
     * <p>subtree</p>
     */
    @NameInMap("SelectionPolicy")
    public String selectionPolicy;

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

    public static UpdateContextDatabaseSyncSourceSelectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncSourceSelectionShrinkRequest self = new UpdateContextDatabaseSyncSourceSelectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncSourceSelectionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContextDatabaseSyncSourceSelectionShrinkRequest setSelectedNodeKeysShrink(String selectedNodeKeysShrink) {
        this.selectedNodeKeysShrink = selectedNodeKeysShrink;
        return this;
    }
    public String getSelectedNodeKeysShrink() {
        return this.selectedNodeKeysShrink;
    }

    public UpdateContextDatabaseSyncSourceSelectionShrinkRequest setSelectionPolicy(String selectionPolicy) {
        this.selectionPolicy = selectionPolicy;
        return this;
    }
    public String getSelectionPolicy() {
        return this.selectionPolicy;
    }

    public UpdateContextDatabaseSyncSourceSelectionShrinkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UpdateContextDatabaseSyncSourceSelectionShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
