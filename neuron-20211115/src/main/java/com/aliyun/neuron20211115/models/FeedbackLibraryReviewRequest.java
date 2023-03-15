// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackLibraryReviewRequest extends TeaModel {
    @NameInMap("approve")
    public String approve;

    @NameInMap("feedback")
    public String feedback;

    @NameInMap("reviewId")
    public Long reviewId;

    public static FeedbackLibraryReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackLibraryReviewRequest self = new FeedbackLibraryReviewRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackLibraryReviewRequest setApprove(String approve) {
        this.approve = approve;
        return this;
    }
    public String getApprove() {
        return this.approve;
    }

    public FeedbackLibraryReviewRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public FeedbackLibraryReviewRequest setReviewId(Long reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public Long getReviewId() {
        return this.reviewId;
    }

}
