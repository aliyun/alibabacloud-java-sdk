// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CloseWorkflowTodosRequest extends TeaModel {
    /**
     * <p>协作空间 ID（命中范围限定该空间内）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>工作流 ID（run 粒度）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wf-1</p>
     */
    @NameInMap("sourceWorkflowId")
    public String sourceWorkflowId;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CloseWorkflowTodosRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseWorkflowTodosRequest self = new CloseWorkflowTodosRequest();
        return TeaModel.build(map, self);
    }

    public CloseWorkflowTodosRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CloseWorkflowTodosRequest setSourceWorkflowId(String sourceWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
        return this;
    }
    public String getSourceWorkflowId() {
        return this.sourceWorkflowId;
    }

    public CloseWorkflowTodosRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
