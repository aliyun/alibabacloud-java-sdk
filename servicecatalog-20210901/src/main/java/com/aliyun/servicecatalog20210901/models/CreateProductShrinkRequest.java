// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductShrinkRequest extends TeaModel {
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
    public String productVersionParametersShrink;

    /**
     * <p>The provider of the product.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

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

}
