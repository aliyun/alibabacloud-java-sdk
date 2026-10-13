// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class RemoveContextDatabaseSyncJobExclusionRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The document ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-as1llqmkol****</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>The job ID, which is a system-generated UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RemoveContextDatabaseSyncJobExclusionRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveContextDatabaseSyncJobExclusionRequest self = new RemoveContextDatabaseSyncJobExclusionRequest();
        return TeaModel.build(map, self);
    }

    public RemoveContextDatabaseSyncJobExclusionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveContextDatabaseSyncJobExclusionRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public RemoveContextDatabaseSyncJobExclusionRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RemoveContextDatabaseSyncJobExclusionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
