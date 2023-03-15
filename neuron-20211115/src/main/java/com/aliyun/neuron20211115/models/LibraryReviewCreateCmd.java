// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryReviewCreateCmd extends TeaModel {
    @NameInMap("libraryId")
    public Long libraryId;

    @NameInMap("libraryUrl")
    public String libraryUrl;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("reviewerId")
    public String reviewerId;

    public static LibraryReviewCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        LibraryReviewCreateCmd self = new LibraryReviewCreateCmd();
        return TeaModel.build(map, self);
    }

    public LibraryReviewCreateCmd setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

    public LibraryReviewCreateCmd setLibraryUrl(String libraryUrl) {
        this.libraryUrl = libraryUrl;
        return this;
    }
    public String getLibraryUrl() {
        return this.libraryUrl;
    }

    public LibraryReviewCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public LibraryReviewCreateCmd setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public String getReviewerId() {
        return this.reviewerId;
    }

}
