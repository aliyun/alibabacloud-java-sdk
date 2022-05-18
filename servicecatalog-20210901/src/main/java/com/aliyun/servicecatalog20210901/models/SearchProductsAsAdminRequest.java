// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class SearchProductsAsAdminRequest extends TeaModel {
    @NameInMap("Filters")
    public String filters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PortfolioId")
    public String portfolioId;

    public static SearchProductsAsAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchProductsAsAdminRequest self = new SearchProductsAsAdminRequest();
        return TeaModel.build(map, self);
    }

    public SearchProductsAsAdminRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public SearchProductsAsAdminRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchProductsAsAdminRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchProductsAsAdminRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

}
