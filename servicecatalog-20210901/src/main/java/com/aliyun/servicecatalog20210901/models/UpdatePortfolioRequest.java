// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdatePortfolioRequest extends TeaModel {
    // 产品组合描述
    @NameInMap("Description")
    public String description;

    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // 产品组合名称
    @NameInMap("PortfolioName")
    public String portfolioName;

    // 提供者名称
    @NameInMap("ProviderName")
    public String providerName;

    public static UpdatePortfolioRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortfolioRequest self = new UpdatePortfolioRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePortfolioRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePortfolioRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public UpdatePortfolioRequest setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
        return this;
    }
    public String getPortfolioName() {
        return this.portfolioName;
    }

    public UpdatePortfolioRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

}
