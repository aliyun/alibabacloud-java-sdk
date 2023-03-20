// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    /**
     * <p>The description of the product.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the product.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The type of the product.</p>
     * <br>
     * <p>The value is fixed as Ros, which specifies Resource Orchestration Service (ROS).</p>
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
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

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

    public static class CreateProductRequestProductVersionParameters extends TeaModel {
        /**
         * <p>Specifies whether the product version is visible to end users. Valid values:</p>
         * <br>
         * <p>*   true: The product version is visible to end users. This is the default value.</p>
         * <p>*   false: The product version is invisible to end users.</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The description of the product version.</p>
         * <br>
         * <p>The value must be 1 to 128 characters in length.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The recommendation information. Valid values:</p>
         * <br>
         * <p>*   Default: No recommendation information is provided. This is the default value.</p>
         * <p>*   Recommended: the recommendation version.</p>
         * <p>*   Latest: the latest version.</p>
         * <p>*   Deprecated: the version that is about to be deprecated.</p>
         */
        @NameInMap("Guidance")
        public String guidance;

        /**
         * <p>The name of the product version.</p>
         * <br>
         * <p>The value must be 1 to 128 characters in length.</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>The type of the template.</p>
         * <br>
         * <p>The value is fixed as RosTerraformTemplate, which specifies that the Terraform template is supported by ROS.</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The URL of the template.</p>
         * <br>
         * <p>For more information about how to obtain the URL of a template, see [CreateTemplate](~~CreateTemplate~~).</p>
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
