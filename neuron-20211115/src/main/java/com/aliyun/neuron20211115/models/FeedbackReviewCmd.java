// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackReviewCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>符合规范</p>
     */
    @NameInMap("feedbackPbcAPI")
    public String feedbackPbcAPI;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>符合规范</p>
     */
    @NameInMap("feedbackPbcInstruction")
    public String feedbackPbcInstruction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>符合规范</p>
     */
    @NameInMap("feedbackPbcSchema")
    public String feedbackPbcSchema;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>服务安全</p>
     */
    @NameInMap("feedbackSecurity")
    public String feedbackSecurity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>服务可运行</p>
     */
    @NameInMap("feedbackServiceAvailable")
    public String feedbackServiceAvailable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("reviewId")
    public Long reviewId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REVIEW_FAILED</p>
     */
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
