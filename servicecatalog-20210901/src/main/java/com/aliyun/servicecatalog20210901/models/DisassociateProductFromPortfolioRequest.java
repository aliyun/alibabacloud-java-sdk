// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociateProductFromPortfolioRequest extends TeaModel {
    /**
     * <p>The ID of the product portfolio.</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the product.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    public static DisassociateProductFromPortfolioRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateProductFromPortfolioRequest self = new DisassociateProductFromPortfolioRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateProductFromPortfolioRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public DisassociateProductFromPortfolioRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
