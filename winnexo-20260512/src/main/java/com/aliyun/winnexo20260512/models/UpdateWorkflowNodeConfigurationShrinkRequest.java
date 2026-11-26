// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowNodeConfigurationShrinkRequest extends TeaModel {
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
    public String executorShrink;

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
    public String responsibleUserIdsShrink;

    /**
     * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
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

    public UpdateWorkflowNodeConfigurationShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public UpdateWorkflowNodeConfigurationShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateWorkflowNodeConfigurationShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
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
