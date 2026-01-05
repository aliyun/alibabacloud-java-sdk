// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdatePortfolioRequest extends TeaModel {
    /**
     * <p>产品组合描述</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>代表资源名称的资源属性字段</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PortfolioName")
    public String portfolioName;

    /**
     * <p>产品组合提供方</p>
     * <p>This parameter is required.</p>
     */
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
