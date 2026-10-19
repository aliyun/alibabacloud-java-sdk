// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstanceShrinkRequest extends TeaModel {
    /**
     * <p>Workflow 必填验收标准</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>完成全部审批节点并产出报告</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>空间内唯一需求编号，重复请求幂等</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REQ-1001</p>
     */
    @NameInMap("businessId")
    public String businessId;

    /**
     * <p>协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_20261016_abc123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>外部发起人展示标签</p>
     * 
     * <strong>example:</strong>
     * <p>外部发起人张三</p>
     */
    @NameInMap("initiator")
    public String initiator;

    /**
     * <p>工作项优先级</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>工作流模板 ID，最多 64 字符</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wft_20261016_abc123</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>需求标题</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>季度经营分析报告</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>业务变量对象，tags 可为字符串标签列表</p>
     * 
     * <strong>example:</strong>
     * <p>tags=季度报告</p>
     */
    @NameInMap("variables")
    public String variablesShrink;

    public static CreateWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowInstanceShrinkRequest self = new CreateWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowInstanceShrinkRequest setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public CreateWorkflowInstanceShrinkRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CreateWorkflowInstanceShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateWorkflowInstanceShrinkRequest setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
    public String getInitiator() {
        return this.initiator;
    }

    public CreateWorkflowInstanceShrinkRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateWorkflowInstanceShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateWorkflowInstanceShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateWorkflowInstanceShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateWorkflowInstanceShrinkRequest setVariablesShrink(String variablesShrink) {
        this.variablesShrink = variablesShrink;
        return this;
    }
    public String getVariablesShrink() {
        return this.variablesShrink;
    }

}
