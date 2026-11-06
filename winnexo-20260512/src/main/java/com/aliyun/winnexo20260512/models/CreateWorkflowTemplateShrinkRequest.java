// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The write action. Valid values:</p>
     * <ul>
     * <li>SAVE: Saves the template as a draft. The draft does not take effect. Node names and assignees can be left empty.</li>
     * <li>SUBMIT: Requires complete nodes. The template is saved and submitted as the only effective version.
     * Default value: SUBMIT.</li>
     * </ul>
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
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The complete JSON definition of the template, including name, description, and steps.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Customer Complaint Handling Process&quot;,&quot;schemaVersion&quot;:2,&quot;steps&quot;:[{&quot;stepId&quot;:&quot;collect&quot;,&quot;sortOrder&quot;:1,&quot;name&quot;:&quot;Collect Customer Information&quot;}]}</p>
     */
    @NameInMap("definition")
    public String definitionShrink;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateWorkflowTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowTemplateShrinkRequest self = new CreateWorkflowTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowTemplateShrinkRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateWorkflowTemplateShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateWorkflowTemplateShrinkRequest setDefinitionShrink(String definitionShrink) {
        this.definitionShrink = definitionShrink;
        return this;
    }
    public String getDefinitionShrink() {
        return this.definitionShrink;
    }

    public CreateWorkflowTemplateShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
