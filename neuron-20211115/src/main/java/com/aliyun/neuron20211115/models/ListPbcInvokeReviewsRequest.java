// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcInvokeReviewsRequest extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("orderDirection")
    public Integer orderDirection;

    @NameInMap("orderby")
    public Integer orderby;

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

    public ListPbcInvokeReviewsRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ListPbcInvokeReviewsRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public ListPbcInvokeReviewsRequest setOrderDirection(Integer orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public Integer getOrderDirection() {
        return this.orderDirection;
    }

    public ListPbcInvokeReviewsRequest setOrderby(Integer orderby) {
        this.orderby = orderby;
        return this;
    }
    public Integer getOrderby() {
        return this.orderby;
    }

    public ListPbcInvokeReviewsRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

}
