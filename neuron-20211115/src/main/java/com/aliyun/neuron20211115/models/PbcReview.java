// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcReview extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("developerId")
    public Long developerId;

    @NameInMap("developerName")
    public String developerName;

    /**
     * <strong>example:</strong>
     * <p>符合规范</p>
     */
    @NameInMap("feedbackPbcApi")
    public String feedbackPbcApi;

    /**
     * <strong>example:</strong>
     * <p>符合规范</p>
     */
    @NameInMap("feedbackPbcInstruction")
    public String feedbackPbcInstruction;

    /**
     * <strong>example:</strong>
     * <p>符合pbc规格规范</p>
     */
    @NameInMap("feedbackPbcSchema")
    public String feedbackPbcSchema;

    /**
     * <strong>example:</strong>
     * <p>服务安全</p>
     */
    @NameInMap("feedbackSecurity")
    public String feedbackSecurity;

    /**
     * <strong>example:</strong>
     * <p>服务可用</p>
     */
    @NameInMap("feedbackServiceAvailable")
    public String feedbackServiceAvailable;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("marketName")
    public String marketName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>基础商品</p>
     */
    @NameInMap("pbcName")
    public String pbcName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://catalog.e2.aliyun.com/pbc/product">https://catalog.e2.aliyun.com/pbc/product</a></p>
     */
    @NameInMap("pbcUrl")
    public String pbcUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-01T00:00:00.000Z</p>
     */
    @NameInMap("pbcVersion")
    public String pbcVersion;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("remainTime")
    public String remainTime;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("reviewerId")
    public Long reviewerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REVIEWING</p>
     */
    @NameInMap("status")
    public String status;

    public static PbcReview build(java.util.Map<String, ?> map) throws Exception {
        PbcReview self = new PbcReview();
        return TeaModel.build(map, self);
    }

    public PbcReview setDeveloperId(Long developerId) {
        this.developerId = developerId;
        return this;
    }
    public Long getDeveloperId() {
        return this.developerId;
    }

    public PbcReview setDeveloperName(String developerName) {
        this.developerName = developerName;
        return this;
    }
    public String getDeveloperName() {
        return this.developerName;
    }

    public PbcReview setFeedbackPbcApi(String feedbackPbcApi) {
        this.feedbackPbcApi = feedbackPbcApi;
        return this;
    }
    public String getFeedbackPbcApi() {
        return this.feedbackPbcApi;
    }

    public PbcReview setFeedbackPbcInstruction(String feedbackPbcInstruction) {
        this.feedbackPbcInstruction = feedbackPbcInstruction;
        return this;
    }
    public String getFeedbackPbcInstruction() {
        return this.feedbackPbcInstruction;
    }

    public PbcReview setFeedbackPbcSchema(String feedbackPbcSchema) {
        this.feedbackPbcSchema = feedbackPbcSchema;
        return this;
    }
    public String getFeedbackPbcSchema() {
        return this.feedbackPbcSchema;
    }

    public PbcReview setFeedbackSecurity(String feedbackSecurity) {
        this.feedbackSecurity = feedbackSecurity;
        return this;
    }
    public String getFeedbackSecurity() {
        return this.feedbackSecurity;
    }

    public PbcReview setFeedbackServiceAvailable(String feedbackServiceAvailable) {
        this.feedbackServiceAvailable = feedbackServiceAvailable;
        return this;
    }
    public String getFeedbackServiceAvailable() {
        return this.feedbackServiceAvailable;
    }

    public PbcReview setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcReview setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcReview setMarketName(String marketName) {
        this.marketName = marketName;
        return this;
    }
    public String getMarketName() {
        return this.marketName;
    }

    public PbcReview setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcReview setPbcUrl(String pbcUrl) {
        this.pbcUrl = pbcUrl;
        return this;
    }
    public String getPbcUrl() {
        return this.pbcUrl;
    }

    public PbcReview setPbcVersion(String pbcVersion) {
        this.pbcVersion = pbcVersion;
        return this;
    }
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    public PbcReview setRemainTime(String remainTime) {
        this.remainTime = remainTime;
        return this;
    }
    public String getRemainTime() {
        return this.remainTime;
    }

    public PbcReview setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PbcReview setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public Long getReviewerId() {
        return this.reviewerId;
    }

    public PbcReview setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
