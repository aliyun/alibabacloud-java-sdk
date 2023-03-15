// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcReview body;

    public static CreatePbcReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcReviewResponse self = new CreatePbcReviewResponse();
        return TeaModel.build(map, self);
    }

    public CreatePbcReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePbcReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePbcReviewResponse setBody(PbcReview body) {
        this.body = body;
        return this;
    }
    public PbcReview getBody() {
        return this.body;
    }

}
