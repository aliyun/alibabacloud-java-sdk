// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>The content of the template.</p>
     * <p>For more information about the template syntax, see <a href="https://help.aliyun.com/document_detail/184397.html">Structure of Terraform templates</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
     *   &quot;Transform&quot;: &quot;Aliyun::Terraform-v1.1&quot;,
     *   &quot;Workspace&quot;: {
     *     &quot;main.tf&quot;: &quot;variable  \&quot;name\&quot; {  default = \&quot;auto_provisioning_group\&quot;}&quot;
     *   },
     *   &quot;Outputs&quot;: {}
     * }</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The type of the product template. Valid values:</p>
     * <ul>
     * <li>RosTerraformTemplate: the Terraform template that is supported by Resource Orchestration Service (ROS).</li>
     * <li>RosStandardTemplate: the standard ROS template.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RosTerraformTemplate</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The variable settings of the Terraform template. You can configure the variables in a structured manner. Service Catalog applies the variable settings to the template.</p>
     * <blockquote>
     * <p> The variables must be defined in the Terraform template.</p>
     * </blockquote>
     */
    @NameInMap("TerraformVariables")
    public java.util.List<CreateTemplateRequestTerraformVariables> terraformVariables;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateTemplateRequest setTerraformVariables(java.util.List<CreateTemplateRequestTerraformVariables> terraformVariables) {
        this.terraformVariables = terraformVariables;
        return this;
    }
    public java.util.List<CreateTemplateRequestTerraformVariables> getTerraformVariables() {
        return this.terraformVariables;
    }

    public static class CreateTemplateRequestTerraformVariables extends TeaModel {
        /**
         * <p>The description of the variable.</p>
         * <p>For more information about the format of variable descriptions, see <a href="https://help.aliyun.com/document_detail/322216.html">Methods and suggestions for Terraform code development</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Label&quot;: { &quot;en&quot;: &quot;Instance Type&quot; }, &quot;AllowedValues&quot;: [ &quot;ecs.s6-c1m1.small&quot;, &quot;ecs.s6-c1m2.large&quot;, &quot;ecs.s6-c1m2.xlarge&quot; ] }</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_type</p>
         */
        @NameInMap("VariableName")
        public String variableName;

        public static CreateTemplateRequestTerraformVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestTerraformVariables self = new CreateTemplateRequestTerraformVariables();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestTerraformVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTemplateRequestTerraformVariables setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

    }

}
