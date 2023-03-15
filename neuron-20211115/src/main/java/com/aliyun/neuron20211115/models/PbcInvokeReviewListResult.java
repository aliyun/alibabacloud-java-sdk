// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInvokeReviewListResult extends TeaModel {
    @NameInMap("pbcInvokeReviews")
    public java.util.List<PbcInvokeReview> pbcInvokeReviews;

    @NameInMap("requestId")
    public String requestId;

    public static PbcInvokeReviewListResult build(java.util.Map<String, ?> map) throws Exception {
        PbcInvokeReviewListResult self = new PbcInvokeReviewListResult();
        return TeaModel.build(map, self);
    }

    public PbcInvokeReviewListResult setPbcInvokeReviews(java.util.List<PbcInvokeReview> pbcInvokeReviews) {
        this.pbcInvokeReviews = pbcInvokeReviews;
        return this;
    }
    public java.util.List<PbcInvokeReview> getPbcInvokeReviews() {
        return this.pbcInvokeReviews;
    }

    public PbcInvokeReviewListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
