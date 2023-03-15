// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryReview extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("artificatId")
    public String artificatId;

    @NameInMap("developerName")
    public String developerName;

    @NameInMap("feedbackLibraryInstruction")
    public String feedbackLibraryInstruction;

    @NameInMap("feedbackLibrarySchema")
    public String feedbackLibrarySchema;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("id")
    public Long id;

    @NameInMap("libraryName")
    public String libraryName;

    @NameInMap("libraryUrl")
    public String libraryUrl;

    @NameInMap("marketId")
    public String marketId;

    @NameInMap("marketName")
    public String marketName;

    @NameInMap("remainTime")
    public String remainTime;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("reviewerId")
    public String reviewerId;

    @NameInMap("status")
    public String status;

    public static LibraryReview build(java.util.Map<String, ?> map) throws Exception {
        LibraryReview self = new LibraryReview();
        return TeaModel.build(map, self);
    }

    public LibraryReview setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public LibraryReview setArtificatId(String artificatId) {
        this.artificatId = artificatId;
        return this;
    }
    public String getArtificatId() {
        return this.artificatId;
    }

    public LibraryReview setDeveloperName(String developerName) {
        this.developerName = developerName;
        return this;
    }
    public String getDeveloperName() {
        return this.developerName;
    }

    public LibraryReview setFeedbackLibraryInstruction(String feedbackLibraryInstruction) {
        this.feedbackLibraryInstruction = feedbackLibraryInstruction;
        return this;
    }
    public String getFeedbackLibraryInstruction() {
        return this.feedbackLibraryInstruction;
    }

    public LibraryReview setFeedbackLibrarySchema(String feedbackLibrarySchema) {
        this.feedbackLibrarySchema = feedbackLibrarySchema;
        return this;
    }
    public String getFeedbackLibrarySchema() {
        return this.feedbackLibrarySchema;
    }

    public LibraryReview setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public LibraryReview setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public LibraryReview setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public LibraryReview setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public LibraryReview setLibraryUrl(String libraryUrl) {
        this.libraryUrl = libraryUrl;
        return this;
    }
    public String getLibraryUrl() {
        return this.libraryUrl;
    }

    public LibraryReview setMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }
    public String getMarketId() {
        return this.marketId;
    }

    public LibraryReview setMarketName(String marketName) {
        this.marketName = marketName;
        return this;
    }
    public String getMarketName() {
        return this.marketName;
    }

    public LibraryReview setRemainTime(String remainTime) {
        this.remainTime = remainTime;
        return this;
    }
    public String getRemainTime() {
        return this.remainTime;
    }

    public LibraryReview setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LibraryReview setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public String getReviewerId() {
        return this.reviewerId;
    }

    public LibraryReview setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
