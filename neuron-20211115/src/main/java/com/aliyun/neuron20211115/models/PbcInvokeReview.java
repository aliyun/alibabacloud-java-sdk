// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInvokeReview extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("id")
    public Long id;

    @NameInMap("invokeId")
    public Long invokeId;

    @NameInMap("invokePbcId")
    public Long invokePbcId;

    @NameInMap("invokePbcName")
    public String invokePbcName;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("reviewer")
    public String reviewer;

    @NameInMap("reviewerId")
    public String reviewerId;

    @NameInMap("status")
    public String status;

    @NameInMap("usage")
    public String usage;

    public static PbcInvokeReview build(java.util.Map<String, ?> map) throws Exception {
        PbcInvokeReview self = new PbcInvokeReview();
        return TeaModel.build(map, self);
    }

    public PbcInvokeReview setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public PbcInvokeReview setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PbcInvokeReview setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcInvokeReview setInvokeId(Long invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public Long getInvokeId() {
        return this.invokeId;
    }

    public PbcInvokeReview setInvokePbcId(Long invokePbcId) {
        this.invokePbcId = invokePbcId;
        return this;
    }
    public Long getInvokePbcId() {
        return this.invokePbcId;
    }

    public PbcInvokeReview setInvokePbcName(String invokePbcName) {
        this.invokePbcName = invokePbcName;
        return this;
    }
    public String getInvokePbcName() {
        return this.invokePbcName;
    }

    public PbcInvokeReview setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PbcInvokeReview setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcInvokeReview setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PbcInvokeReview setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

    public PbcInvokeReview setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public String getReviewerId() {
        return this.reviewerId;
    }

    public PbcInvokeReview setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PbcInvokeReview setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
