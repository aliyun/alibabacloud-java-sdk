// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociateProductFromPortfolioRequest extends TeaModel {
    /**
     * <p>The ID of the product portfolio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-bp18r7q127****</p>
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
