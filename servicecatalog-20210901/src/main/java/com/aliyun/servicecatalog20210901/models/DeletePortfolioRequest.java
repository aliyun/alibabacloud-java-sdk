// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeletePortfolioRequest extends TeaModel {
    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    @NameInMap("RegionId")
    public String regionId;

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

    public DeletePortfolioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
