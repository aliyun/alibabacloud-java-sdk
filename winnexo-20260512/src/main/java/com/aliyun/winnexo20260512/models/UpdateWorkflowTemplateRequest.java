// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowTemplateRequest extends TeaModel {
    /**
     * <p>The write action. Valid values:</p>
     * <ul>
     * <li>SAVE: Saves the template as a draft. The changes do not take effect. Node names and assignees can be left empty.</li>
     * <li>SUBMIT: Requires complete nodes. Saves and submits the template as the only effective version.
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
     * <p>The complete JSON definition of the template. This overwrites the existing definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Customer Complaint Handling Process&quot;,&quot;schemaVersion&quot;:2,&quot;steps&quot;:[{&quot;stepId&quot;:&quot;collect&quot;,&quot;sortOrder&quot;:1,&quot;name&quot;:&quot;Collect Customer Information&quot;}]}</p>
     */
    @NameInMap("definition")
    public java.util.Map<String, ?> definition;

    /**
     * <p>The submitted version number on which the new version is based. This parameter is mutually exclusive with version. If you do not specify this parameter, the current effective version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("sourceVersion")
    public String sourceVersion;

    /**
     * <p>The ID of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl_9401</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The version number to which the content belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The change description for this version. An empty value indicates that no description is provided.</p>
     * 
     * <strong>example:</strong>
     * <p>Added a review step</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    public static UpdateWorkflowTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowTemplateRequest self = new UpdateWorkflowTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowTemplateRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateWorkflowTemplateRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public UpdateWorkflowTemplateRequest setDefinition(java.util.Map<String, ?> definition) {
        this.definition = definition;
        return this;
    }
    public java.util.Map<String, ?> getDefinition() {
        return this.definition;
    }

    public UpdateWorkflowTemplateRequest setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }
    public String getSourceVersion() {
        return this.sourceVersion;
    }

    public UpdateWorkflowTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateWorkflowTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateWorkflowTemplateRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateWorkflowTemplateRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

}
