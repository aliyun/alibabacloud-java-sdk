// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackLibraryReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LibraryReview body;

    public static FeedbackLibraryReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        FeedbackLibraryReviewResponse self = new FeedbackLibraryReviewResponse();
        return TeaModel.build(map, self);
    }

    public FeedbackLibraryReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FeedbackLibraryReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FeedbackLibraryReviewResponse setBody(LibraryReview body) {
        this.body = body;
        return this;
    }
    public LibraryReview getBody() {
        return this.body;
    }

}
