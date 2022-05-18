// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreatePortfolioResponseBody extends TeaModel {
    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // 请求ID
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
