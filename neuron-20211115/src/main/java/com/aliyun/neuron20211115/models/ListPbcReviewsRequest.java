// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcReviewsRequest extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("orderBy")
    public Integer orderBy;

    @NameInMap("orderDirection")
    public Integer orderDirection;

    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("reviewer")
    public String reviewer;

    public static ListPbcReviewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPbcReviewsRequest self = new ListPbcReviewsRequest();
        return TeaModel.build(map, self);
    }

    public ListPbcReviewsRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ListPbcReviewsRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public ListPbcReviewsRequest setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public Integer getOrderBy() {
        return this.orderBy;
    }

    public ListPbcReviewsRequest setOrderDirection(Integer orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public Integer getOrderDirection() {
        return this.orderDirection;
    }

    public ListPbcReviewsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListPbcReviewsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListPbcReviewsRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

}
