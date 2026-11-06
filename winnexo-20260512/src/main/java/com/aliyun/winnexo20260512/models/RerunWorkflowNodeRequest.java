// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunWorkflowNodeRequest extends TeaModel {
    /**
     * <p>协作空间ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>重跑起始节点 key，包含固定规划节点和业务执行节点</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeKey")
    public String nodeKey;

    /**
     * <p>工作项当前物理计划ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_v3</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>租户ID，缺省使用调用方默认租户</p>
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
