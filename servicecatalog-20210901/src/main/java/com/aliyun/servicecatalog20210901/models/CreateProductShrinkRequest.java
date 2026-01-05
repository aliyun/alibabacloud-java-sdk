// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductShrinkRequest extends TeaModel {
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
    public String productVersionParametersShrink;

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

    public static CreateProductShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductShrinkRequest self = new CreateProductShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateProductShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateProductShrinkRequest setProductVersionParametersShrink(String productVersionParametersShrink) {
        this.productVersionParametersShrink = productVersionParametersShrink;
        return this;
    }
    public String getProductVersionParametersShrink() {
        return this.productVersionParametersShrink;
    }

    public CreateProductShrinkRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public CreateProductShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
