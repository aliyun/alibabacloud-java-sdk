// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetForkReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ForkReview body;

    public static GetForkReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetForkReviewResponse self = new GetForkReviewResponse();
        return TeaModel.build(map, self);
    }

    public GetForkReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetForkReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetForkReviewResponse setBody(ForkReview body) {
        this.body = body;
        return this;
    }
    public ForkReview getBody() {
        return this.body;
    }

}
