// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class FeedbackPbcReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcReview body;

    public static FeedbackPbcReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        FeedbackPbcReviewResponse self = new FeedbackPbcReviewResponse();
        return TeaModel.build(map, self);
    }

    public FeedbackPbcReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FeedbackPbcReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FeedbackPbcReviewResponse setBody(PbcReview body) {
        this.body = body;
        return this;
    }
    public PbcReview getBody() {
        return this.body;
    }

}
