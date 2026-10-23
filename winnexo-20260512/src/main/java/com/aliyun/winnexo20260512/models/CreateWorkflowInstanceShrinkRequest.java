// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The required acceptance criteria for the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Complete all approval nodes and generate the report</p>
     */
    @NameInMap("acceptanceCriteria")
    public String acceptanceCriteria;

    /**
     * <p>The unique requirement ID in the workspace. Repeated requests are idempotent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REQ-1001</p>
     */
    @NameInMap("businessId")
    public String businessId;

    /**
     * <p>The collaboration workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_20261016_abc123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The display label of the external initiator.</p>
     * 
     * <strong>example:</strong>
     * <p>External Initiator Zhang San</p>
     */
    @NameInMap("initiator")
    public String initiator;

    /**
     * <p>The work item priority.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>The workflow template ID. Maximum length: 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wft_20261016_abc123</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>The tenant ID. This is a common parameter explicitly passed by using --tenant-id in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The requirement title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly Business Analysis Report</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The business variable object. The tags field can be a list of string tags.</p>
     * 
     * <strong>example:</strong>
     * <p>tags=Quarterly Report</p>
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
