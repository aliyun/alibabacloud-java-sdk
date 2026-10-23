// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowTemplateRequest extends TeaModel {
    /**
     * <p>The write action. Valid values: SAVE: Saves the template as a draft without taking effect. SUBMIT: Saves and submits the template and sets it as the only effective version. Default value: SUBMIT.</p>
     * 
     * <strong>example:</strong>
     * <p>SUBMIT</p>
     */
    @NameInMap("action")
    public String action;

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
     * <p>The complete JSON definition of the template, including name, description, and steps.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("definition")
    public java.util.Map<String, ?> definition;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateWorkflowTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowTemplateRequest self = new CreateWorkflowTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowTemplateRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateWorkflowTemplateRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateWorkflowTemplateRequest setDefinition(java.util.Map<String, ?> definition) {
        this.definition = definition;
        return this;
    }
    public java.util.Map<String, ?> getDefinition() {
        return this.definition;
    }

    public CreateWorkflowTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
