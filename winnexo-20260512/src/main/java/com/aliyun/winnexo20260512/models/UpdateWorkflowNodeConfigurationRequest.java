// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowNodeConfigurationRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

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
     * <p>The executor of the node. If this parameter is omitted, the current value is retained. If this parameter is set to null, the default value is restored. You must modify at least one of the owner, model, or executor.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
     */
    @NameInMap("executor")
    public UpdateWorkflowNodeConfigurationRequestExecutor executor;

    /**
     * <p>The configuration version returned by the read operation. The value must be a non-negative integer. If a version conflict occurs, you must refresh the version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

    /**
     * <p>The ID of the current physical plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inst_2081</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The model mode. The quick value is normalized to standard. If this parameter is omitted, the current value is retained. If this parameter is set to null, the default value is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The key of the business node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>node_7f3a2c</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The list of user IDs for the node owners. The value must be a non-empty array of positive integers. If this parameter is omitted, the current value is retained. If this parameter is set to null, the default value is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("responsibleUserIds")
    public java.util.List<Long> responsibleUserIds;

    /**
     * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
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

    public UpdateWorkflowNodeConfigurationRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public UpdateWorkflowNodeConfigurationRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateWorkflowNodeConfigurationRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
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
         * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The executor type. Valid values: USER (a human user) and AGENT (a digital worker).</p>
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
