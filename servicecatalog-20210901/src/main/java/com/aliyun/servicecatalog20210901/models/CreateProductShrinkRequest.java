// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProductShrinkRequest extends TeaModel {
    // 产品描述
    @NameInMap("Description")
    public String description;

    // 产品名称
    @NameInMap("ProductName")
    public String productName;

    // 产品类型
    @NameInMap("ProductType")
    public String productType;

    // 产品版本相关的参数
    @NameInMap("ProductVersionParameters")
    public String productVersionParametersShrink;

    // 提供者名称
    @NameInMap("ProviderName")
    public String providerName;

    @NameInMap("RegionId")
    public String regionId;

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

    public CreateProductShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
