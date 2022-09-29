// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchPbcAssetsRequest extends TeaModel {
    @NameInMap("industry")
    public String industry;

    @NameInMap("keyword")
    public String keyword;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("type")
    public String type;

    public static SearchPbcAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPbcAssetsRequest self = new SearchPbcAssetsRequest();
        return TeaModel.build(map, self);
    }

    public SearchPbcAssetsRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public SearchPbcAssetsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchPbcAssetsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchPbcAssetsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public SearchPbcAssetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchPbcAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchPbcAssetsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
