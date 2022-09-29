// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackLibraryReviewResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resule")
    public LibraryReview resule;

    public static FeedbackLibraryReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FeedbackLibraryReviewResponseBody self = new FeedbackLibraryReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public FeedbackLibraryReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FeedbackLibraryReviewResponseBody setResule(LibraryReview resule) {
        this.resule = resule;
        return this;
    }
    public LibraryReview getResule() {
        return this.resule;
    }

}
