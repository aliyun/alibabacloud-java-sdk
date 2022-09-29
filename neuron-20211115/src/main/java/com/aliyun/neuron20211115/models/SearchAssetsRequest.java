// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchAssetsRequest extends TeaModel {
    @NameInMap("asset_industrys")
    public java.util.List<String> assetIndustrys;

    @NameInMap("asset_name")
    public String assetName;

    @NameInMap("asset_types")
    public java.util.List<String> assetTypes;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
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
