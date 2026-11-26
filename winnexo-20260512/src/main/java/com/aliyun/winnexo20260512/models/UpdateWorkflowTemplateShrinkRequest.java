// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The write action. Valid values: SAVE (saves the template as a draft without taking effect, and allows node names and executors to be left empty) and SUBMIT (requires complete nodes, and saves and submits the template as the only effective version). Default value: SUBMIT.</p>
     * 
     * <strong>example:</strong>
     * <p>SUBMIT</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The platform application token issued by the console. If specified, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The collaboration workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The complete JSON definition of the template for full overwriting.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Customer Complaint Handling Process&quot;,&quot;schemaVersion&quot;:2,&quot;steps&quot;:[{&quot;stepId&quot;:&quot;collect&quot;,&quot;sortOrder&quot;:1,&quot;name&quot;:&quot;Collect Customer Information&quot;,&quot;specification&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;Collect Customer Information&quot;}],&quot;executorType&quot;:&quot;MEMBER&quot;,&quot;executorUserId&quot;:10086}],&quot;edges&quot;:[]}</p>
     */
    @NameInMap("definition")
    public String definitionShrink;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The submitted version number on which the new version is based. This parameter is mutually exclusive with version. If not specified, the current effective version is used as the fallback.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("sourceVersion")
    public String sourceVersion;

    /**
     * <p>The template ID.</p>
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
     * <p>The version number to which the returned content belongs.</p>
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
     * <p>Added review step</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    public static UpdateWorkflowTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowTemplateShrinkRequest self = new UpdateWorkflowTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowTemplateShrinkRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateWorkflowTemplateShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public UpdateWorkflowTemplateShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public UpdateWorkflowTemplateShrinkRequest setDefinitionShrink(String definitionShrink) {
        this.definitionShrink = definitionShrink;
        return this;
    }
    public String getDefinitionShrink() {
        return this.definitionShrink;
    }

    public UpdateWorkflowTemplateShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateWorkflowTemplateShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UpdateWorkflowTemplateShrinkRequest setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }
    public String getSourceVersion() {
        return this.sourceVersion;
    }

    public UpdateWorkflowTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateWorkflowTemplateShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateWorkflowTemplateShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateWorkflowTemplateShrinkRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

}
