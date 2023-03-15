// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ReviewerListResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("reviewers")
    public java.util.List<Reviewer> reviewers;

    public static ReviewerListResult build(java.util.Map<String, ?> map) throws Exception {
        ReviewerListResult self = new ReviewerListResult();
        return TeaModel.build(map, self);
    }

    public ReviewerListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReviewerListResult setReviewers(java.util.List<Reviewer> reviewers) {
        this.reviewers = reviewers;
        return this;
    }
    public java.util.List<Reviewer> getReviewers() {
        return this.reviewers;
    }

}
