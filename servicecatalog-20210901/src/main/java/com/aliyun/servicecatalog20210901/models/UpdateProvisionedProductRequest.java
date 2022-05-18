// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductRequest extends TeaModel {
    // 用户输入
    @NameInMap("Inputs")
    public String inputs;

    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // 产品ID
    @NameInMap("ProductId")
    public String productId;

    // 产品版本ID
    @NameInMap("ProductVersionId")
    public String productVersionId;

    // 实例ID
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateProvisionedProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProvisionedProductRequest self = new UpdateProvisionedProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProvisionedProductRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public UpdateProvisionedProductRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public UpdateProvisionedProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateProvisionedProductRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public UpdateProvisionedProductRequest setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public UpdateProvisionedProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
