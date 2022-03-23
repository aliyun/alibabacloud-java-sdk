// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchItemRequest extends TeaModel {
    @NameInMap("ItemImageData")
    public String itemImageData;

    @NameInMap("ItemImageUrl")
    public String itemImageUrl;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchTableIds")
    public String searchTableIds;

    @NameInMap("SimilarityThreshold")
    public Double similarityThreshold;

    public static SearchItemRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchItemRequest self = new SearchItemRequest();
        return TeaModel.build(map, self);
    }

    public SearchItemRequest setItemImageData(String itemImageData) {
        this.itemImageData = itemImageData;
        return this;
    }
    public String getItemImageData() {
        return this.itemImageData;
    }

    public SearchItemRequest setItemImageUrl(String itemImageUrl) {
        this.itemImageUrl = itemImageUrl;
        return this;
    }
    public String getItemImageUrl() {
        return this.itemImageUrl;
    }

    public SearchItemRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchItemRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchItemRequest setSearchTableIds(String searchTableIds) {
        this.searchTableIds = searchTableIds;
        return this;
    }
    public String getSearchTableIds() {
        return this.searchTableIds;
    }

    public SearchItemRequest setSimilarityThreshold(Double similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        return this;
    }
    public Double getSimilarityThreshold() {
        return this.similarityThreshold;
    }

}
