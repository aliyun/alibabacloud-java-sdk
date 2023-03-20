// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPrincipalsRequest extends TeaModel {
    /**
     * <p>The ID of the product portfolio.</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    public static ListPrincipalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrincipalsRequest self = new ListPrincipalsRequest();
        return TeaModel.build(map, self);
    }

    public ListPrincipalsRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

}
