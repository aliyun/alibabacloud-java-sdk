// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdatePortfolioResponseBody extends TeaModel {
    @NameInMap("PortfolioId")
    public String portfolioId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePortfolioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortfolioResponseBody self = new UpdatePortfolioResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePortfolioResponseBody setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public UpdatePortfolioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
