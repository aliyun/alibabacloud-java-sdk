// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductVersionRequest extends TeaModel {
    /**
     * <p>Specifies whether the product version is active. Valid values:</p>
     * <ul>
     * <li>true: The product version is active. This is the default value.</li>
     * <li>false: The product version is inactive.</li>
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
     * <p>The recommendation information. Valid values:</p>
     * <ul>
     * <li>Default: No recommendation information is provided. This is the default value.</li>
     * <li>Recommended: the recommendation version.</li>
     * <li>Latest: the latest version.</li>
     * <li>Deprecated: the version that is about to be discontinued.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Guidance")
    public String guidance;

    /**
     * <p>The ID of the product to which the product version belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-bp18r7q127****</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The name of the product version.</p>
     * <p>The value must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ProductVersionName")
    public String productVersionName;

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
     * <p>The URL of the template.</p>
     * <p>For more information about how to obtain the URL of a template, see <a href="~~CreateTemplate~~">CreateTemplate</a>.</p>
     * <p>This parameter is required.</p>
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
