// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateJobTemplateRequest extends TeaModel {
    /**
     * <p>The field constraint rules. The key is a JSONPath expression and the value is the constraint type: locked (cannot be overridden), overridable (can be overridden), or required (mandatory). Must be provided together with Content. You cannot update this field independently.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;JobSpecs[0].Image\&quot;:\&quot;locked\&quot;,\&quot;UserCommand\&quot;:\&quot;locked\&quot;,\&quot;JobType\&quot;:\&quot;locked\&quot;}</p>
     */
    @NameInMap("Constraints")
    public java.util.Map<String, ?> constraints;

    /**
     * <p>The configuration content of the task template. Supports all parameter fields of the CreateJob operation, passed in JSON format. Providing this field creates a new version.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;WorkspaceId\&quot;:\&quot;15****05\&quot;,\&quot;JobType\&quot;:\&quot;PyTorchJob\&quot;,\&quot;UserCommand\&quot;:\&quot;echo hello\&quot;,\&quot;JobSpecs\&quot;:[{\&quot;Type\&quot;:\&quot;Worker\&quot;,\&quot;PodCount\&quot;:1,\&quot;Image\&quot;:\&quot;dsw-registry-vpc.cn-hangzhou.cr.aliyuncs.com/pai/pytorch:2.8.0-gpu-py313-cu129-ubuntu22.04-3995b779-1764361782\&quot;,\&quot;EcsSpec\&quot;:\&quot;ecs.gn7i-c8g1.2xlarge\&quot;}],\&quot;ResourceType\&quot;:\&quot;ECS\&quot;,\&quot;_ResourcePaymentType\&quot;:\&quot;PostPaid\&quot;,\&quot;CredentialConfig\&quot;:{\&quot;EnableCredentialInject\&quot;:false},\&quot;Accessibility\&quot;:\&quot;PRIVATE\&quot;,\&quot;Settings\&quot;:{\&quot;JobReservedMinutes\&quot;:0,\&quot;Tags\&quot;:{}}}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description of the task template.</p>
     * 
     * <strong>example:</strong>
     * <p>Template description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The user-defined key-value pair metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>Specifies whether to set the new version as the default version when a new version is created.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SetAsDefault")
    public Boolean setAsDefault;

    /**
     * <p>The name of the task template.</p>
     * 
     * <strong>example:</strong>
     * <p>job-template-example-1778047****</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Invalid field.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid field</p>
     */
    @NameInMap("version")
    public Integer version;

    public static UpdateJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobTemplateRequest self = new UpdateJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobTemplateRequest setConstraints(java.util.Map<String, ?> constraints) {
        this.constraints = constraints;
        return this;
    }
    public java.util.Map<String, ?> getConstraints() {
        return this.constraints;
    }

    public UpdateJobTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateJobTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobTemplateRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public UpdateJobTemplateRequest setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
        return this;
    }
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    public UpdateJobTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateJobTemplateRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
