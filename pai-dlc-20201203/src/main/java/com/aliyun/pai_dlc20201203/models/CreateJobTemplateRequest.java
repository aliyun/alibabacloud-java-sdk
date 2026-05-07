// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateJobTemplateRequest extends TeaModel {
    /**
     * <p>字段约束规则。Key 为 JSONPath 表达式，Value 为约束类型：locked（锁定不可覆盖）、overridable（可覆盖）、required（必填）。</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;JobSpecs[0].Image\&quot;:\&quot;locked\&quot;,\&quot;UserCommand\&quot;:\&quot;locked\&quot;,\&quot;JobType\&quot;:\&quot;locked\&quot;}</p>
     */
    @NameInMap("Constraints")
    public java.util.Map<String, ?> constraints;

    /**
     * <p>任务模板的配置内容，包含作业配置参数，以 JSON 格式传入。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;WorkspaceId\&quot;:\&quot;15****05\&quot;,\&quot;JobType\&quot;:\&quot;PyTorchJob\&quot;,\&quot;UserCommand\&quot;:\&quot;echo hello\&quot;,\&quot;JobSpecs\&quot;:[{\&quot;Type\&quot;:\&quot;Worker\&quot;,\&quot;PodCount\&quot;:1,\&quot;Image\&quot;:\&quot;dsw-registry-vpc.cn-hangzhou.cr.aliyuncs.com/pai/pytorch:2.8.0-gpu-py313-cu129-ubuntu22.04-3995b779-1764361782\&quot;,\&quot;EcsSpec\&quot;:\&quot;ecs.gn7i-c8g1.2xlarge\&quot;}],\&quot;ResourceType\&quot;:\&quot;ECS\&quot;,\&quot;_ResourcePaymentType\&quot;:\&quot;PostPaid\&quot;,\&quot;CredentialConfig\&quot;:{\&quot;EnableCredentialInject\&quot;:false},\&quot;Accessibility\&quot;:\&quot;PRIVATE\&quot;,\&quot;Settings\&quot;:{\&quot;JobReservedMinutes\&quot;:0,\&quot;Tags\&quot;:{}}}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>Template description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>用户自定义的键值对元数据，用于存储模板的附加信息。</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-template-example-1778047****</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>工作空间 ID。如何获取工作空间 ID，请参见 ListWorkspaces。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15****05</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateRequest self = new CreateJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateRequest setConstraints(java.util.Map<String, ?> constraints) {
        this.constraints = constraints;
        return this;
    }
    public java.util.Map<String, ?> getConstraints() {
        return this.constraints;
    }

    public CreateJobTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateJobTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobTemplateRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateJobTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateJobTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
