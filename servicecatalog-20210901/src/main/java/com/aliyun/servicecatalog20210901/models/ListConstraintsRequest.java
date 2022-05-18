// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListConstraintsRequest extends TeaModel {
    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    public static ListConstraintsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConstraintsRequest self = new ListConstraintsRequest();
        return TeaModel.build(map, self);
    }

    public ListConstraintsRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

}
