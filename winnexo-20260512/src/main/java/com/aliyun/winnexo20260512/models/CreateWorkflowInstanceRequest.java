// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstanceRequest extends TeaModel {
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
    public java.util.Map<String, ?> variables;

    public static CreateWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowInstanceRequest self = new CreateWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowInstanceRequest setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public CreateWorkflowInstanceRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CreateWorkflowInstanceRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateWorkflowInstanceRequest setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
    public String getInitiator() {
        return this.initiator;
    }

    public CreateWorkflowInstanceRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateWorkflowInstanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateWorkflowInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateWorkflowInstanceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateWorkflowInstanceRequest setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

}
