// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryReviewListResult extends TeaModel {
    @NameInMap("libraryReviews")
    public java.util.List<LibraryReview> libraryReviews;

    @NameInMap("requestId")
    public String requestId;

    public static LibraryReviewListResult build(java.util.Map<String, ?> map) throws Exception {
        LibraryReviewListResult self = new LibraryReviewListResult();
        return TeaModel.build(map, self);
    }

    public LibraryReviewListResult setLibraryReviews(java.util.List<LibraryReview> libraryReviews) {
        this.libraryReviews = libraryReviews;
        return this;
    }
    public java.util.List<LibraryReview> getLibraryReviews() {
        return this.libraryReviews;
    }

    public LibraryReviewListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
