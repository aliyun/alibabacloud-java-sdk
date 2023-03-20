// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>The content of the template.</p>
     * <br>
     * <p>For more information about the template syntax, see [Structure of Terraform templates](~~184397~~).</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The type of the template.</p>
     * <br>
     * <p>The value is fixed as RosTerraformTemplate, which specifies that the Terraform template is supported by Resource Orchestration Service (ROS).</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

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
        @NameInMap("Description")
        public String description;

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
