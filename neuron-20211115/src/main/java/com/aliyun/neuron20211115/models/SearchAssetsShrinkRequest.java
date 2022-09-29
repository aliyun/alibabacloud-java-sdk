// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchAssetsShrinkRequest extends TeaModel {
    @NameInMap("asset_industrys")
    public String assetIndustrysShrink;

    @NameInMap("asset_name")
    public String assetName;

    @NameInMap("asset_types")
    public String assetTypesShrink;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
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
