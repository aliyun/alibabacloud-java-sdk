// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    /**
     * <p>The description of the product.</p>
     * <p>The value must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the product.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the product.</p>
     * <p>The value must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEMO-Create an ECS instance</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The type of the product.</p>
     * <p>Set the value to Ros, which specifies Resource Orchestration Service (ROS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ros</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The information about the product version.</p>
     */
    @NameInMap("ProductVersionParameters")
    public CreateProductRequestProductVersionParameters productVersionParameters;

    /**
     * <p>The provider of the product.</p>
     * <p>The value must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IT team</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    /**
     * <p>The type of the product template. Valid values:</p>
     * <ul>
     * <li>RosTerraformTemplate: the Terraform template that is supported by ROS.</li>
     * <li>RosStandardTemplate: the standard ROS template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RosTerraformTemplate</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateProductRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateProductRequest setProductVersionParameters(CreateProductRequestProductVersionParameters productVersionParameters) {
        this.productVersionParameters = productVersionParameters;
        return this;
    }
    public CreateProductRequestProductVersionParameters getProductVersionParameters() {
        return this.productVersionParameters;
    }

    public CreateProductRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public CreateProductRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class CreateProductRequestProductVersionParameters extends TeaModel {
        /**
         * <p>Specifies whether to enable the product version. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The description of the product version.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the product version.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The recommended product version. Valid values:</p>
         * <ul>
         * <li>Default (default): No product version is recommended.</li>
         * <li>Recommended: the stable version.</li>
         * <li>Latest: the latest version.</li>
         * <li>Deprecated: the version that is about to be deprecated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Guidance")
        public String guidance;

        /**
         * <p>The name of the product version.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>The type of the template.</p>
         * <p>Set the value to RosTerraformTemplate, which indicates the Terraform template that is supported by Resource Orchestration Service (ROS).</p>
         * 
         * <strong>example:</strong>
         * <p>RosTerraformTemplate</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The URL of the template.</p>
         * <p>To obtain the URL of a template, you can call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation.</p>
         */
        @NameInMap("TemplateUrl")
        public String templateUrl;

        public static CreateProductRequestProductVersionParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateProductRequestProductVersionParameters self = new CreateProductRequestProductVersionParameters();
            return TeaModel.build(map, self);
        }

        public CreateProductRequestProductVersionParameters setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateProductRequestProductVersionParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProductRequestProductVersionParameters setGuidance(String guidance) {
            this.guidance = guidance;
            return this;
        }
        public String getGuidance() {
            return this.guidance;
        }

        public CreateProductRequestProductVersionParameters setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public CreateProductRequestProductVersionParameters setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public CreateProductRequestProductVersionParameters setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

    }

}
