// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunNodeAIRequest extends TeaModel {
    /**
     * <p>The collaboration workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The physical workflow instance ID (planId).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_example</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The key of the failed node (nodeKey).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RerunNodeAIRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunNodeAIRequest self = new RerunNodeAIRequest();
        return TeaModel.build(map, self);
    }

    public RerunNodeAIRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public RerunNodeAIRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RerunNodeAIRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public RerunNodeAIRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
