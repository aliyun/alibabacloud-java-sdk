// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResetWorkflowNodeConfigurationRequest extends TeaModel {
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
     * <p>读取接口返回的configVersion；非负整数；版本冲突须刷新</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

    /**
     * <p>当前物理计划ID（planId）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inst_2081</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>业务节点key（nodeKey）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>node_7f3a2c</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>租户ID；缺省使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ResetWorkflowNodeConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetWorkflowNodeConfigurationRequest self = new ResetWorkflowNodeConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ResetWorkflowNodeConfigurationRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ResetWorkflowNodeConfigurationRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public ResetWorkflowNodeConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetWorkflowNodeConfigurationRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ResetWorkflowNodeConfigurationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
