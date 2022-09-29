// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackReviewCmd extends TeaModel {
    @NameInMap("feedbackPbcAPI")
    public String feedbackPbcAPI;

    @NameInMap("feedbackPbcInstruction")
    public String feedbackPbcInstruction;

    @NameInMap("feedbackPbcSchema")
    public String feedbackPbcSchema;

    @NameInMap("feedbackSecurity")
    public String feedbackSecurity;

    @NameInMap("feedbackServiceAvailable")
    public String feedbackServiceAvailable;

    @NameInMap("reviewId")
    public Long reviewId;

    @NameInMap("status")
    public String status;

    public static FeedbackReviewCmd build(java.util.Map<String, ?> map) throws Exception {
        FeedbackReviewCmd self = new FeedbackReviewCmd();
        return TeaModel.build(map, self);
    }

    public FeedbackReviewCmd setFeedbackPbcAPI(String feedbackPbcAPI) {
        this.feedbackPbcAPI = feedbackPbcAPI;
        return this;
    }
    public String getFeedbackPbcAPI() {
        return this.feedbackPbcAPI;
    }

    public FeedbackReviewCmd setFeedbackPbcInstruction(String feedbackPbcInstruction) {
        this.feedbackPbcInstruction = feedbackPbcInstruction;
        return this;
    }
    public String getFeedbackPbcInstruction() {
        return this.feedbackPbcInstruction;
    }

    public FeedbackReviewCmd setFeedbackPbcSchema(String feedbackPbcSchema) {
        this.feedbackPbcSchema = feedbackPbcSchema;
        return this;
    }
    public String getFeedbackPbcSchema() {
        return this.feedbackPbcSchema;
    }

    public FeedbackReviewCmd setFeedbackSecurity(String feedbackSecurity) {
        this.feedbackSecurity = feedbackSecurity;
        return this;
    }
    public String getFeedbackSecurity() {
        return this.feedbackSecurity;
    }

    public FeedbackReviewCmd setFeedbackServiceAvailable(String feedbackServiceAvailable) {
        this.feedbackServiceAvailable = feedbackServiceAvailable;
        return this;
    }
    public String getFeedbackServiceAvailable() {
        return this.feedbackServiceAvailable;
    }

    public FeedbackReviewCmd setReviewId(Long reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public Long getReviewId() {
        return this.reviewId;
    }

    public FeedbackReviewCmd setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
