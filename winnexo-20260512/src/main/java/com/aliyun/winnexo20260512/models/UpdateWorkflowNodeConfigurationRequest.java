// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowNodeConfigurationRequest extends TeaModel {
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
    public UpdateWorkflowNodeConfigurationRequestExecutor executor;

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
    public java.util.List<Long> responsibleUserIds;

    /**
     * <p>租户ID；缺省使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateWorkflowNodeConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowNodeConfigurationRequest self = new UpdateWorkflowNodeConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowNodeConfigurationRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public UpdateWorkflowNodeConfigurationRequest setExecutor(UpdateWorkflowNodeConfigurationRequestExecutor executor) {
        this.executor = executor;
        return this;
    }
    public UpdateWorkflowNodeConfigurationRequestExecutor getExecutor() {
        return this.executor;
    }

    public UpdateWorkflowNodeConfigurationRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateWorkflowNodeConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWorkflowNodeConfigurationRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateWorkflowNodeConfigurationRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateWorkflowNodeConfigurationRequest setResponsibleUserIds(java.util.List<Long> responsibleUserIds) {
        this.responsibleUserIds = responsibleUserIds;
        return this;
    }
    public java.util.List<Long> getResponsibleUserIds() {
        return this.responsibleUserIds;
    }

    public UpdateWorkflowNodeConfigurationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class UpdateWorkflowNodeConfigurationRequestExecutor extends TeaModel {
        /**
         * <p>USER 为正整数平台用户ID字符串；AGENT 为空间数字员工技术名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>USER 真人或 AGENT 数字员工</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateWorkflowNodeConfigurationRequestExecutor build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowNodeConfigurationRequestExecutor self = new UpdateWorkflowNodeConfigurationRequestExecutor();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowNodeConfigurationRequestExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWorkflowNodeConfigurationRequestExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
