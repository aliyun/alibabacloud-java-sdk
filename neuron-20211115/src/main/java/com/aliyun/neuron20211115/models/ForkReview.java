// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ForkReview extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("forkId")
    public Long forkId;

    @NameInMap("gitGroup")
    public String gitGroup;

    @NameInMap("id")
    public Long id;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("repoUrls")
    public java.util.List<String> repoUrls;

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

    public static ForkReview build(java.util.Map<String, ?> map) throws Exception {
        ForkReview self = new ForkReview();
        return TeaModel.build(map, self);
    }

    public ForkReview setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ForkReview setForkId(Long forkId) {
        this.forkId = forkId;
        return this;
    }
    public Long getForkId() {
        return this.forkId;
    }

    public ForkReview setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public ForkReview setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ForkReview setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public ForkReview setRepoUrls(java.util.List<String> repoUrls) {
        this.repoUrls = repoUrls;
        return this;
    }
    public java.util.List<String> getRepoUrls() {
        return this.repoUrls;
    }

    public ForkReview setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ForkReview setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

    public ForkReview setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public String getReviewerId() {
        return this.reviewerId;
    }

    public ForkReview setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ForkReview setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
