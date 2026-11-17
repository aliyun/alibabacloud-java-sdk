// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunWorkflowNodeRequest extends TeaModel {
    /**
     * <p>The collaboration workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The key of the starting node for the rerun, which includes fixed planning nodes and business execution nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeKey")
    public String nodeKey;

    /**
     * <p>The current physical plan ID after the rerun. Rerunning a fixed planning node may generate a new plan. Use this value for subsequent queries.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_v3</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RerunWorkflowNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunWorkflowNodeRequest self = new RerunWorkflowNodeRequest();
        return TeaModel.build(map, self);
    }

    public RerunWorkflowNodeRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public RerunWorkflowNodeRequest setNodeKey(String nodeKey) {
        this.nodeKey = nodeKey;
        return this;
    }
    public String getNodeKey() {
        return this.nodeKey;
    }

    public RerunWorkflowNodeRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public RerunWorkflowNodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
