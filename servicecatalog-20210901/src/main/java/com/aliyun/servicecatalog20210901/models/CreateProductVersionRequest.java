// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductVersionRequest extends TeaModel {
    /**
     * <p>Specifies whether the product version is active. Valid values:</p>
     * <br>
     * <p>*   true: The product version is active. This is the default value.</p>
     * <p>*   false: The product version is inactive.</p>
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
     * <p>*   Deprecated: the version that is about to be discontinued.</p>
     */
    @NameInMap("Guidance")
    public String guidance;

    /**
     * <p>The ID of the product to which the product version belongs.</p>
     */
    @NameInMap("ProductId")
    public String productId;

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
     * <p>The value is fixed as RosTerraformTemplate, which specifies the Terraform template that is supported by Resource Orchestration Service (ROS).</p>
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

    public static CreateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionRequest self = new CreateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public CreateProductVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductVersionRequest setGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }
    public String getGuidance() {
        return this.guidance;
    }

    public CreateProductVersionRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateProductVersionRequest setProductVersionName(String productVersionName) {
        this.productVersionName = productVersionName;
        return this;
    }
    public String getProductVersionName() {
        return this.productVersionName;
    }

    public CreateProductVersionRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateProductVersionRequest setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }
    public String getTemplateUrl() {
        return this.templateUrl;
    }

}
