// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeletePortfolioRequest extends TeaModel {
    /**
     * <p>The ID of the product portfolio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    public static DeletePortfolioRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePortfolioRequest self = new DeletePortfolioRequest();
        return TeaModel.build(map, self);
    }

    public DeletePortfolioRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

}
