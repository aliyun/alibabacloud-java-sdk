// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcInvokeReviewsRequest extends TeaModel {
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

    public static ListPbcInvokeReviewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPbcInvokeReviewsRequest self = new ListPbcInvokeReviewsRequest();
        return TeaModel.build(map, self);
    }

    public ListPbcInvokeReviewsRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ListPbcInvokeReviewsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPbcInvokeReviewsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPbcInvokeReviewsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPbcInvokeReviewsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPbcInvokeReviewsRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

}
