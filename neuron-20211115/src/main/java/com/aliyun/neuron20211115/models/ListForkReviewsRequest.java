// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListForkReviewsRequest extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("reviewer")
    public String reviewer;

    public static ListForkReviewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListForkReviewsRequest self = new ListForkReviewsRequest();
        return TeaModel.build(map, self);
    }

    public ListForkReviewsRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ListForkReviewsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListForkReviewsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListForkReviewsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListForkReviewsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListForkReviewsRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

}
