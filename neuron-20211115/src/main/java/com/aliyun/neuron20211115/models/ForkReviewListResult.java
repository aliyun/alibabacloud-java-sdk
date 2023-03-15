// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ForkReviewListResult extends TeaModel {
    @NameInMap("forkReviews")
    public java.util.List<ForkReview> forkReviews;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static ForkReviewListResult build(java.util.Map<String, ?> map) throws Exception {
        ForkReviewListResult self = new ForkReviewListResult();
        return TeaModel.build(map, self);
    }

    public ForkReviewListResult setForkReviews(java.util.List<ForkReview> forkReviews) {
        this.forkReviews = forkReviews;
        return this;
    }
    public java.util.List<ForkReview> getForkReviews() {
        return this.forkReviews;
    }

    public ForkReviewListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ForkReviewListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
