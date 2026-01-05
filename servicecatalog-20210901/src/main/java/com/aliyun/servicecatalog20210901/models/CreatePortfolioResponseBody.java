// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreatePortfolioResponseBody extends TeaModel {
    /**
     * <p>The ID of the product portfolio.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePortfolioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePortfolioResponseBody self = new CreatePortfolioResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePortfolioResponseBody setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public CreatePortfolioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
