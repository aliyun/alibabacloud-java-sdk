// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetNodeDetailRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration workspace.</p>
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
     * <p>The ID of the node (nodeKey).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>step_1</p>
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

    public static GetNodeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeDetailRequest self = new GetNodeDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeDetailRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetNodeDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNodeDetailRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetNodeDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
