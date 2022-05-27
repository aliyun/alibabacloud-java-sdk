// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateConstraintRequest extends TeaModel {
    // 约束配置
    @NameInMap("Config")
    public String config;

    // 约束类型
    @NameInMap("ConstraintType")
    public String constraintType;

    // 约束描述
    @NameInMap("Description")
    public String description;

    // 约束所属的产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // 约束对应的产品ID
    @NameInMap("ProductId")
    public String productId;

    public static CreateConstraintRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConstraintRequest self = new CreateConstraintRequest();
        return TeaModel.build(map, self);
    }

    public CreateConstraintRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateConstraintRequest setConstraintType(String constraintType) {
        this.constraintType = constraintType;
        return this;
    }
    public String getConstraintType() {
        return this.constraintType;
    }

    public CreateConstraintRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConstraintRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public CreateConstraintRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
