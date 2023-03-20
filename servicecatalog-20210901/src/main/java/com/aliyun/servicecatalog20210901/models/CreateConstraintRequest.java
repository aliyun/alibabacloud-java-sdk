// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateConstraintRequest extends TeaModel {
    /**
     * <p>The configuration of the constraint.</p>
     * <br>
     * <p>Format: { "LocalRoleName": "\<role_name>" }.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The type of the constraint.</p>
     * <br>
     * <p>The value is fixed as Launch, which specifies the launch constraint.</p>
     */
    @NameInMap("ConstraintType")
    public String constraintType;

    /**
     * <p>The description of the constraint.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the product portfolio to which the constraint belongs.</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the product for which the constraint is created.</p>
     */
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
