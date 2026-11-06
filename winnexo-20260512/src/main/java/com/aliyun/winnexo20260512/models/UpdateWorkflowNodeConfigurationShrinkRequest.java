// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowNodeConfigurationShrinkRequest extends TeaModel {
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
     * <p>节点执行人；省略保持，null恢复默认；与负责人、模型至少修改一项</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
     */
    @NameInMap("executor")
    public String executorShrink;

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
     * <p>模型模式；quick归一化standard；省略保持，null恢复默认</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("model")
    public String model;

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
     * <p>节点负责人用户ID列表，非空正整数数组；省略保持，null恢复默认</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("responsibleUserIds")
    public String responsibleUserIdsShrink;

    /**
     * <p>租户ID；缺省使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateWorkflowNodeConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowNodeConfigurationShrinkRequest self = new UpdateWorkflowNodeConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setExecutorShrink(String executorShrink) {
        this.executorShrink = executorShrink;
        return this;
    }
    public String getExecutorShrink() {
        return this.executorShrink;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setResponsibleUserIdsShrink(String responsibleUserIdsShrink) {
        this.responsibleUserIdsShrink = responsibleUserIdsShrink;
        return this;
    }
    public String getResponsibleUserIdsShrink() {
        return this.responsibleUserIdsShrink;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
