// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchAssetsShrinkRequest extends TeaModel {
    @NameInMap("assetIndustrys")
    public String assetIndustrysShrink;

    @NameInMap("assetName")
    public String assetName;

    @NameInMap("assetTypes")
    public String assetTypesShrink;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static SearchAssetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetsShrinkRequest self = new SearchAssetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchAssetsShrinkRequest setAssetIndustrysShrink(String assetIndustrysShrink) {
        this.assetIndustrysShrink = assetIndustrysShrink;
        return this;
    }
    public String getAssetIndustrysShrink() {
        return this.assetIndustrysShrink;
    }

    public SearchAssetsShrinkRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public SearchAssetsShrinkRequest setAssetTypesShrink(String assetTypesShrink) {
        this.assetTypesShrink = assetTypesShrink;
        return this;
    }
    public String getAssetTypesShrink() {
        return this.assetTypesShrink;
    }

    public SearchAssetsShrinkRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public SearchAssetsShrinkRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public SearchAssetsShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchAssetsShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public SearchAssetsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchAssetsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
