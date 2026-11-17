// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemRunSummariesRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The node key.</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeKey")
    public String nodeKey;

    /**
     * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the work item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wi_0123456789ab4cde</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static GetWorkItemRunSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemRunSummariesRequest self = new GetWorkItemRunSummariesRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkItemRunSummariesRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetWorkItemRunSummariesRequest setNodeKey(String nodeKey) {
        this.nodeKey = nodeKey;
        return this;
    }
    public String getNodeKey() {
        return this.nodeKey;
    }

    public GetWorkItemRunSummariesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetWorkItemRunSummariesRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
