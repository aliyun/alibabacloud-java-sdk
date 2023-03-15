// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchAssetsRequest extends TeaModel {
    @NameInMap("assetIndustrys")
    public java.util.List<String> assetIndustrys;

    @NameInMap("assetName")
    public String assetName;

    @NameInMap("assetTypes")
    public java.util.List<String> assetTypes;

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

    public static SearchAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetsRequest self = new SearchAssetsRequest();
        return TeaModel.build(map, self);
    }

    public SearchAssetsRequest setAssetIndustrys(java.util.List<String> assetIndustrys) {
        this.assetIndustrys = assetIndustrys;
        return this;
    }
    public java.util.List<String> getAssetIndustrys() {
        return this.assetIndustrys;
    }

    public SearchAssetsRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public SearchAssetsRequest setAssetTypes(java.util.List<String> assetTypes) {
        this.assetTypes = assetTypes;
        return this;
    }
    public java.util.List<String> getAssetTypes() {
        return this.assetTypes;
    }

    public SearchAssetsRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public SearchAssetsRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public SearchAssetsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchAssetsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public SearchAssetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
